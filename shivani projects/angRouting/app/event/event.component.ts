import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {

  constructor() { }

  rohan() {
    alert("Hi I am Rohan...");
  }
  raghav() {
    alert("HI i am Raghav...");
  }

  ngOnInit() {
  }

}
