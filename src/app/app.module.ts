import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComComponent } from './com/com.component';
import { FormvalidComponent } from './formvalid/formvalid.component';
import { FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { EducationComponent } from './education/education.component';

 
 
@NgModule({
  declarations: [
    AppComponent,
    ComComponent,
    FormvalidComponent,
    EducationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
