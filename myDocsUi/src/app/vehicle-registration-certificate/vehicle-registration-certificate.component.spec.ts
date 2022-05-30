import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleRegistrationCertificateComponent } from './vehicle-registration-certificate.component';

describe('VehicleRegistrationCertificateComponent', () => {
  let component: VehicleRegistrationCertificateComponent;
  let fixture: ComponentFixture<VehicleRegistrationCertificateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehicleRegistrationCertificateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleRegistrationCertificateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
