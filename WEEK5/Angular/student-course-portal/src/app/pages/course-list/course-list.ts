import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';
import { Course } from '../../services/course';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [
    CommonModule,
    CourseCard
  ],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  courses: any[] = [];

  selectedCourseId: number = 0;

  constructor(private courseService: Course) {}

  ngOnInit(): void {
    this.courses = this.courseService.getCourses();
  }

  onEnroll(courseId: number): void {
    console.log("Enrolling in course: " + courseId);
    this.selectedCourseId = courseId;
  }

}