import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


import { Parent } from '../models/user';
@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.scss']
})
export class EducationComponent implements OnInit {
  register:any="";
  eduForm: FormGroup;
  @Input() stuValue:Parent;
  @Output() objValue=new EventEmitter();
  constructor(private _fb: FormBuilder) {}        
  ngOnInit(): void {
    this.eduForm = this._fb.group({
      cname : ["",Validators.required],
      pout : ["",Validators.required],
      perc : ["",Validators.required]
      });
  }
  onsubmit() {
    console.log(this.eduForm.value);
    this.stuValue.child = this.eduForm.value;
    this.objValue.emit(this.stuValue);
    console.log(this.stuValue);
    

}
}