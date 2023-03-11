import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlarmCreateComponent } from './alarm-create/alarm-create.component';
import { AlarmListComponent } from './alarm-list/alarm-list.component';



@NgModule({
  imports: [CommonModule],
  declarations: [AlarmCreateComponent, AlarmListComponent],
  exports: [AlarmCreateComponent, AlarmListComponent]
})
export class AlarmModule { }
