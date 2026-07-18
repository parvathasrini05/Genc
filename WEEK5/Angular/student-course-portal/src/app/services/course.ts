import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Course {

  constructor() {}

  getCourses() {

    return [

      {
        id: 1,
        name: 'Angular',
        code: 'ANG101',
        credits: 4
      },

      {
        id: 2,
        name: 'Java',
        code: 'JAVA102',
        credits: 3
      },

      {
        id: 3,
        name: 'Spring Boot',
        code: 'SPR103',
        credits: 4
      },

      {
        id: 4,
        name: 'SQL',
        code: 'SQL104',
        credits: 2
      },

      {
        id: 5,
        name: 'MongoDB',
        code: 'MONGO105',
        credits: 3
      }

    ];

  }

}