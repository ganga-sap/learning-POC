import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComComponent } from './com/com.component';
import { FormvalidComponent } from './formvalid/formvalid.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

 
 
@NgModule({
  declarations: [
    AppComponent,
    ComComponent,
    FormvalidComponent
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
