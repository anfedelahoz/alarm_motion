import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlarmConfirmationComponent } from './alarm/alarm-confirmation/alarm-confirmation.component';
import { AlarmCreateComponent } from './alarm/alarm-create/alarm-create.component';
import { AlarmEditComponent } from './alarm/alarm-edit/alarm-edit.component';
import { AlarmListComponent } from './alarm/alarm-list/alarm-list.component';
import { UserLandingComponent } from './user/user-landing/user-landing.component';
import { UserLoginComponent } from './user/user-login/user-login.component';
import { UserRegisterComponent } from './user/user-register/user-register.component';

const routes: Routes = [
  {path: '', component: UserLandingComponent, pathMatch: 'full'},
  {path: 'register', component: UserRegisterComponent, pathMatch: 'full'},
  {path: 'login', component: UserLoginComponent, pathMatch: 'full'},
  {path: 'alarms', component: AlarmListComponent, pathMatch: 'full'},
  {path: 'create', component: AlarmCreateComponent, pathMatch: 'full'},
  {path: 'edit', component: AlarmEditComponent, pathMatch: 'full'},
  {path: 'succes', component: AlarmConfirmationComponent, pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
