import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import {RouterModule,Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { RaghavComponent } from './raghav/raghav.component';
import { RohanComponent } from './rohan/rohan.component';
import { BindComponent } from './bind/bind.component';
import { EventComponent } from './event/event.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { EmployComponent } from './employ/employ.component';
import { MenuComponent } from './menu/menu.component';

const appRoutes : Routes = [
  {path:'raghav', component:RaghavComponent},
  {path:'rohan', component:RohanComponent},
  {path:'bind',component:BindComponent},
  {path:'event',component:EventComponent},
  {path:'twoway',component:TwoWayComponent},
  {path:'calc',component:CalcComponent},
  {path:'employ',component:EmployComponent},
  {path:'',component:MenuComponent},
  
]

@NgModule({
  declarations: [
    AppComponent,
    RaghavComponent,
    RohanComponent,
    BindComponent,
    EventComponent,
    TwoWayComponent,
    CalcComponent,
    EmployComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule, FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
