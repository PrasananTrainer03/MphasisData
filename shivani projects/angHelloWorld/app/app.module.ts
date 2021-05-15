import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {RouterModule, Routes} from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { CalcComponent } from './calc/calc.component';
import { LoginComponent } from './login/login.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { MenuComponent } from './menu/menu.component';


// const appRoutes : Routes =
//  [
//    {path:'first', component : FirstComponent},
//    {path:'second', component : SecondComponent},
//    {path:'third', component : ThirdComponent},
//    {path:'employ', component : EmployComponent},
//    {path:'calc', component : CalcComponent},
//    {path:'employ', component : EmployComponent},
//    {path:'employDropDown',component:EmployDropDownComponent},
//    {path:'menu',component:MenuComponent},
//    {path:'', component : LoginComponent},
//   //  {path:'**', component : ErrorComponent},
//  ]
const appRoutes : Routes =
 [
  {path:'menu',component:MenuComponent,
  children : 
  [
    {path:'first', component : FirstComponent, outlet:'data'},
    {path:'second', component : SecondComponent, outlet:'data'},
    {path:'third', component : ThirdComponent,outlet:'data'},
    {path:'employ', component : EmployComponent,outlet:'data'},
    {path:'calc', component : CalcComponent,outlet:'data'},
    {path:'employ', component : EmployComponent,outlet:'data'},
    {path:'employDropDown',component:EmployDropDownComponent,outlet:'data'}, 
  ]
},
   
   {path:'', component : LoginComponent},
  //  {path:'**', component : ErrorComponent},
 ]
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    CalcComponent,
    LoginComponent,
    EmployComponent,
    EmployDropDownComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
