import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CivilAutoLiabilityComponent } from './civil-auto-liability.component';

describe('CivilAutoLiabilityComponent', () => {
  let component: CivilAutoLiabilityComponent;
  let fixture: ComponentFixture<CivilAutoLiabilityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CivilAutoLiabilityComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CivilAutoLiabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
