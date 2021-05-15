import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-raghav',
  templateUrl: './raghav.component.html',
  styleUrls: ['./raghav.component.css']
})
export class RaghavComponent implements OnInit {

  emp = new Employ(1,"Brahma","Java","Programmer",882344);
  constructor() { 
    alert(this.emp.basic);
    localStorage.setItem("emp",JSON.stringify(this.emp));
  }

  ngOnInit() {
  }

}
