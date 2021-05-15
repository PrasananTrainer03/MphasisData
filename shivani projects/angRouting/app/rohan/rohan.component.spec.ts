import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RohanComponent } from './rohan.component';

describe('RohanComponent', () => {
  let component: RohanComponent;
  let fixture: ComponentFixture<RohanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RohanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RohanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
