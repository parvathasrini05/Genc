import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { User } from '../../services/user';
import { ChangeDetectorRef } from '@angular/core';
@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user-list.html',
  styleUrl: './user-list.css'
})
export class UserList implements OnInit {

  users: any[] = [];

  constructor(
  private userService: User,
  private cdr: ChangeDetectorRef
) {}
  
ngOnInit(): void {

  console.log("ngOnInit called");

  this.userService.getUsers().subscribe({
    next: (data: any) => {
      console.log("API Success", data);

      this.users = data;

      console.log("Users Length:", this.users.length);

      this.cdr.detectChanges();
    },
    error: (err) => {
      console.error("API Error", err);
    }
  });

}
}