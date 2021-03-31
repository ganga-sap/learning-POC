import { Component, OnInit } from '@angular/core';
import{ FormBuilder, FormGroup } from '@angular/forms';
@Component({
  selector: 'app-formvalid',
  templateUrl: './formvalid.component.html',
  styleUrls: ['./formvalid.component.scss']
})
export class FormvalidComponent implements OnInit {
   
  reactiveForm: FormGroup;
  constructor(private _fb: FormBuilder) { }
  
  ngOnInit(): void {
    this.reactiveForm = this._fb.group({
      fname : [],
      femail : [],
      fphoneno : [],
      faddress : [],
    });
  }
  
  onsubmit() {
    console.log(this.reactiveForm);
  }
}

