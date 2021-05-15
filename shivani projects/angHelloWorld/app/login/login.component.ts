import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName : string;
  passCode : string;
  flag : number;

  login() {
    if (this.userName=="Mahesh" && this.passCode=="Mahesh") {
      // alert("Correct Credentials...");
      this._router.navigate(["/menu"]);
    } else {
     this.flag=1;
    }
  }
  constructor(private _router : Router) {
    this.flag=0;
   }

  ngOnInit() {
  }

}
