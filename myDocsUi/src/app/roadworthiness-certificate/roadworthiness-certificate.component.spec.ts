import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoadworthinessCertificateComponent } from './roadworthiness-certificate.component';

describe('RoadworthinessCertificateComponent', () => {
  let component: RoadworthinessCertificateComponent;
  let fixture: ComponentFixture<RoadworthinessCertificateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoadworthinessCertificateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RoadworthinessCertificateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
