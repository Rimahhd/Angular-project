import { Component, Input, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  @Input() employeeId: number;

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
  }

  deleteEmployee() {
    this.apiService.deleteEmployee(this.employeeId).subscribe(() => {
      // Close modal and refresh employee list
    });
  }
}
