import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ReversePipe } from '../../pipes/reverse-pipe';
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule, CommonModule,ReversePipe],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home implements OnInit {

  portalName = 'Student Course Portal';
  isPortalActive = true;
  isLoggedIn = true;
  highlightCard = true;
  fontColor = 'blue';
  technologies = [
  'Angular',
  'Java',
  'Spring Boot',
  'SQL',
  'MongoDB'
];
  message = '';
  searchTerm = '';
  studentName = 'parvatha srini';

courseFee = 25000;

today = new Date();

attendance = 0.92;

  ngOnInit(): void {
    console.log('Home Component Initialized');
  }

  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }
}