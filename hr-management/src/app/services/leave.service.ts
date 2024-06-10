import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Leave } from '../models/leave.model';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {
  private apiUrl = 'http://localhost:8000/api/leaves';

  constructor(private http: HttpClient) { }

  createLeave(leave: Leave): Observable<Leave> {
    return this.http.post<Leave>(this.apiUrl, leave);
  }

  getLeavesByEmployeeAndDateRange(employeeId: number, fromDate: Date, toDate: Date): Observable<Leave[]> {
    return this.http.get<Leave[]>(`${this.apiUrl}/employee/${employeeId}?fromDate=${fromDate}&toDate=${toDate}`);
  }
}
