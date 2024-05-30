import { Component } from '@angular/core';
import {AddEmployeeModalComponent} from "../add-employee-modal/add-employee-modal.component";

@Component({
  selector: 'app-employees',
  standalone: true,
  imports: [
    AddEmployeeModalComponent
  ],
  templateUrl: './employees.component.html',
  styleUrl: './employees.component.css'
})
export class EmployeesComponent {

}
