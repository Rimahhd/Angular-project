import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
// @ts-ignore
import { Department } from '../models/department.model';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {
  private apiUrl = 'http://localhost:8000/api/departments';

  constructor(private http: HttpClient) { }

  getAllDepartments(): Observable<Department[]> {
    return this.http.get<Department[]>(this.apiUrl);
  }

  createDepartment(department: Department): Observable<Department> {
    return this.http.post<Department>(this.apiUrl, department);
  }
}
