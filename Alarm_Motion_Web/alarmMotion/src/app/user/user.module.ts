import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserLandingComponent } from './user-landing/user-landing.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { RouterModule } from '@angular/router';


@NgModule({
  
  imports: [CommonModule, RouterModule],
  declarations: [
    UserLandingComponent,
    UserRegisterComponent,
    UserLoginComponent,
  ],
  exports: [UserLandingComponent, UserRegisterComponent, UserLoginComponent]
})


export class UserModule { }
