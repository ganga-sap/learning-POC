import { Component, OnInit } from '@angular/core';
import{ FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-formvalid',
  templateUrl: './formvalid.component.html',
  styleUrls: ['./formvalid.component.scss']
})
export class FormvalidComponent implements OnInit {
   register:any="";
  reactiveForm: FormGroup;
  constructor(private _fb: FormBuilder) { }
  
  ngOnInit(): void {
    this.reactiveForm = this._fb.group({
      fname : ["",Validators.required],
      femail : ["",Validators.required],
      fphoneno : ["",Validators.required],
      faddress : ["",Validators.required],
    });
  }
  
  onsubmit(reactiveForm) {
    console.log(this.reactiveForm.value);

  }
}

