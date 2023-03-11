import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppHeaderModule } from './app-header/app-header.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserModule } from "./user/user.module";

@NgModule({
    declarations: [AppComponent],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        AppHeaderModule,
        UserModule
    ]
})
export class AppModule { }
