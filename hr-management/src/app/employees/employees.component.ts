import { Component } from '@angular/core';
import {AddEmployeeModalComponent} from "../add-employee-modal/add-employee-modal.component";
import {DeleteEmployeeComponent} from "../delete-employee/delete-employee.component";

@Component({
  selector: 'app-employees',
  standalone: true,
  imports: [
    AddEmployeeModalComponent,
    DeleteEmployeeComponent
  ],
  templateUrl: './employees.component.html',
  styleUrl: './employees.component.css'
})
export class EmployeesComponent {
  filteredEmployees: any;

}
