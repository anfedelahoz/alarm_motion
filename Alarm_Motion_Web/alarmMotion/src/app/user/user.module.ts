import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserLandingComponent } from './user-landing/user-landing.component';



@NgModule({
  
  imports: [CommonModule],
  declarations: [
    UserLandingComponent
  ],
  exports: [UserLandingComponent]
})
export class UserModule { }
