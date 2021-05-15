import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployDropDownComponent } from './employ-drop-down.component';

describe('EmployDropDownComponent', () => {
  let component: EmployDropDownComponent;
  let fixture: ComponentFixture<EmployDropDownComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployDropDownComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployDropDownComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
