import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleIdentityCardComponent } from './vehicle-identity-card.component';

describe('VehicleIdentityCardComponent', () => {
  let component: VehicleIdentityCardComponent;
  let fixture: ComponentFixture<VehicleIdentityCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehicleIdentityCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleIdentityCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
