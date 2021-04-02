import { Component, OnInit } from '@angular/core';
import{ FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Parent } from '../models/user';
@Component({
  selector: 'app-formvalid',
  templateUrl: './formvalid.component.html',
  styleUrls: ['./formvalid.component.scss']
})
export class FormvalidComponent implements OnInit {
   register:any="";
  reactiveForm: FormGroup;
  Details = new Parent();
  regform=true;
  edu=false;
  details=false;
  constructor(private _fb: FormBuilder) {}
  
  
  ngOnInit(): void {
    this.reactiveForm = this._fb.group({
      fname : ['',Validators.required],
      femail : ['',Validators.required],
      fphoneno : ['',Validators.required],
      faddress : ['',Validators.required]
    });
  }
 
   onsubmit() {
    
     this.Details=this.reactiveForm.value;
    console.log(this.reactiveForm.value);
    this.regform=false;
    this.edu=true;

  }
  getValue(data:Parent)
  {
   this.Details= data;
   console.log(data);
   this.details=true;
   this.edu=false;
  }
}

