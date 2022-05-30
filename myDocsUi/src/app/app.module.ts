import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CategoryComponent } from './category/category.component';
import { CarComponent } from './car/car.component';
import { CheckComponent } from './check/check.component';
import { CivilAutoLiabilityComponent } from './civil-auto-liability/civil-auto-liability.component';
import { DefectsComponent } from './defects/defects.component';
import { DriverComponent } from './driver/driver.component';
import { DrivingLicenseComponent } from './driving-license/driving-license.component';
import { FineComponent } from './fine/fine.component';
import { IdentityCardComponent } from './identity-card/identity-card.component';
import { PoliceComponent } from './police/police.component';
import { RoadVignetteComponent } from './road-vignette/road-vignette.component';
import { RoadworthinessCertificateComponent } from './roadworthiness-certificate/roadworthiness-certificate.component';
import { VehicleRegistrationCertificateComponent } from './vehicle-registration-certificate/vehicle-registration-certificate.component';
import { VehicleIdentityCardComponent } from './vehicle-identity-card/vehicle-identity-card.component';

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    CarComponent,
    CheckComponent,
    CivilAutoLiabilityComponent,
    DefectsComponent,
    DriverComponent,
    DrivingLicenseComponent,
    FineComponent,
    IdentityCardComponent,
    PoliceComponent,
    RoadVignetteComponent,
    RoadworthinessCertificateComponent,
    VehicleRegistrationCertificateComponent,
    VehicleIdentityCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
