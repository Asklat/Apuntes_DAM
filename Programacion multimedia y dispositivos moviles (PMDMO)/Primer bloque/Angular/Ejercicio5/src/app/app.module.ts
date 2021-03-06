import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

//Componentes
import { PadreComponent } from './components/padre/padre.component';
import { MouseHoverDirective } from './directivas/mouse-hover.directive';

@NgModule({
  declarations: [
    PadreComponent,
    MouseHoverDirective
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [PadreComponent]
})
export class AppModule { }
