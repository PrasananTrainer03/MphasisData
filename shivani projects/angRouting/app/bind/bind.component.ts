import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bind',
  templateUrl: './bind.component.html',
  styleUrls: ['./bind.component.css']
})
export class BindComponent implements OnInit {

  trainer : string;
  topic : string;
  stud1 : string;
  stud2 : string;
  constructor() { 
    this.trainer="Prasanna...";
    this.topic="Angular 11";
    this.stud1="Raghav";
    this.stud2="Rohan";
  }

  ngOnInit() {
  }

}
