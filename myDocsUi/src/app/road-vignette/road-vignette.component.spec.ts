import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoadVignetteComponent } from './road-vignette.component';

describe('RoadVignetteComponent', () => {
  let component: RoadVignetteComponent;
  let fixture: ComponentFixture<RoadVignetteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoadVignetteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RoadVignetteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
