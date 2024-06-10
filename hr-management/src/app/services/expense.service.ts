import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ExpenseClaim } from '../models/expense-claim.model';

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {
  private apiUrl = 'http://localhost:8000/api/expenses';

  constructor(private http: HttpClient) { }

  createExpenseClaim(expenseClaim: ExpenseClaim): Observable<ExpenseClaim> {
    return this.http.post<ExpenseClaim>(this.apiUrl, expenseClaim);
  }

  getExpenseClaimsByEmployee(employeeId: number): Observable<ExpenseClaim[]> {
    return this.http.get<ExpenseClaim[]>(`${this.apiUrl}/employee/${employeeId}`);
  }
}
