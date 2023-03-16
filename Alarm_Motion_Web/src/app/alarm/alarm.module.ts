import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlarmCreateComponent } from './alarm-create/alarm-create.component';
import { AlarmListComponent } from './alarm-list/alarm-list.component';
import { AlarmEditComponent } from './alarm-edit/alarm-edit.component';
import { AlarmConfirmationComponent } from './alarm-confirmation/alarm-confirmation.component';
import { RouterModule } from '@angular/router';



@NgModule({
  imports: [CommonModule, RouterModule ],
  declarations: [AlarmCreateComponent, AlarmListComponent, AlarmEditComponent, AlarmConfirmationComponent],
  exports: [AlarmCreateComponent, AlarmListComponent, AlarmEditComponent, AlarmConfirmationComponent]
})
export class AlarmModule { }
