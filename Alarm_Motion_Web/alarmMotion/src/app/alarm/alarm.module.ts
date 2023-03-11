import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlarmCreateComponent } from './alarm-create/alarm-create.component';
import { AlarmListComponent } from './alarm-list/alarm-list.component';
import { AlarmEditComponent } from './alarm-edit/alarm-edit.component';



@NgModule({
  imports: [CommonModule],
  declarations: [AlarmCreateComponent, AlarmListComponent, AlarmEditComponent],
  exports: [AlarmCreateComponent, AlarmListComponent, AlarmEditComponent]
})
export class AlarmModule { }
