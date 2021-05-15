import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  trainer : string;
  topic : string;
  company : string;
  constructor() {
    this.topic="Angular 11";
    this.trainer="Prasanna...";
    this.company = "Intelligroup";
    localStorage.setItem("company",this.company);
   }

  ngOnInit() {
  }

}
