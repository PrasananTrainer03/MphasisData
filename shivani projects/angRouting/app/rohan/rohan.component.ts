import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-rohan',
  templateUrl: './rohan.component.html',
  styleUrls: ['./rohan.component.css']
})
export class RohanComponent implements OnInit {

  constructor() { 
    this.emp = localStorage.getItem('emp')? JSON.parse(localStorage.getItem('emp')):[];
    alert(this.emp.empno + " " +this.emp.name);

  }
  emp : Employ;
  ngOnInit() {

  }

}
