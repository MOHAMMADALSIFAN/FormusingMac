import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormSubmitComponent } from "./form-submit/form-submit.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormSubmitComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
}
