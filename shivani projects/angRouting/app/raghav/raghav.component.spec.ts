import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RaghavComponent } from './raghav.component';

describe('RaghavComponent', () => {
  let component: RaghavComponent;
  let fixture: ComponentFixture<RaghavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RaghavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RaghavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
