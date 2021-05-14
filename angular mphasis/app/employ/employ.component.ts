import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employ : Employ;
  isValid : boolean;
  msg : string;
  insert(employForm : NgForm) {
    if(employForm.invalid){
      return;
    }
    this.isValid=true;
    if (this.isValid==true) {
      this.msg="Form Submitted Successfully...";
    }
  }
  constructor() {
    this.isValid=false;
    this.employ=new Employ();
   }

  ngOnInit(): void {
  }

}
