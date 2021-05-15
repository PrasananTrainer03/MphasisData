import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  company : string;
  greet() {
    alert("Welcome to Angular Programming...");
  }

  topic() {
    alert("Angular 11 Training Going ON...");
  }

  trainer() {
    alert("Trainer Name is Prasanna...");
  }
  constructor() { 
    this.company = localStorage.getItem("company");
  }

  ngOnInit() {
  }

}
