import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login-reactive',
  templateUrl: './login-reactive.component.html',
  styleUrls: ['./login-reactive.component.css']
})
export class LoginReactiveComponent implements OnInit {

  isValidFormSubmitted: boolean;
  msg :string;
  loginForm = new FormGroup({
    userName : new FormControl('',Validators.required),
    passWord : new FormControl('',Validators.required)
  });
  constructor() { 
    this.isValidFormSubmitted=false;
  }

  onFormSubmit() {
    // alert("Hi");
	   this.isValidFormSubmitted = false;
	   if(this.loginForm.invalid){
		  return;	
	   } 	
	   this.isValidFormSubmitted = true;	
     this.msg="Login Form Submitted...";
	   console.log(this.loginForm.valid);
	
  }

  ngOnInit(): void {
  }

}
