import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-add-employee-modal',
  templateUrl: './add-employee-modal.component.html',
  styleUrls: ['./add-employee-modal.component.css']
})
export class AddEmployeeModalComponent implements OnInit {
  @Input() isEdit: boolean = false;
  @Input() employee: any = {};
  departments: any[] = [];  // Replace with actual department data

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.apiService.getDepartments().subscribe(data => {
      this.departments = data;
    });
  }

  saveEmployee() {
    if (this.isEdit) {
      this.apiService.updateEmployee(this.employee).subscribe(() => {
        // Close modal and refresh employee list
      });
    } else {
      this.apiService.createEmployee(this.employee).subscribe(() => {
        // Close modal and refresh employee list
      });
    }
  }
}
