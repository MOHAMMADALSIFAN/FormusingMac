import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-form-submit',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './form-submit.component.html'
})
export class FormSubmitComponent {
  formData: any = {
    dateOpened: '',
    fileName: '',
    workEffort: '',
    reviewerName: '',
    lineCodeNumber: '',
    complexity: 'Low',
    comment: '',
    actionTaken: '',
    lastDateUpdated: '',
    developerName: ''
  };

  constructor(private http: HttpClient) {}

  onSubmit() {
    const apiUrl = 'http://localhost:8080/api/submit';
    this.http.post(apiUrl, this.formData).subscribe({
      next: () => alert('✅ Form submitted successfully!'),
      error: (err) => alert('❌ Error submitting form: ' + err.message)
    });
  }
}
