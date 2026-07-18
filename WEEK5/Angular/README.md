# Student Course Portal - Angular Hands-On Documentation

This document summarizes the implementation details of the Angular Hands-On exercises completed as part of the Cognizant Digital Nurture Program.

---

# Hands-On 1 – Component Creation

## Objective

Create an Angular application using standalone components and organize the application into reusable UI components.

## Implementation

- Created the Angular project using standalone components.
- Developed reusable components:
  - Header
  - Home
  - Course List
  - Student Profile
- Added basic HTML and CSS for each component.
- Displayed the Header and Home components in the root component.

## Files Modified

- app.ts
- app.html
- components/header/
- pages/home/
- pages/course-list/
- pages/student-profile/

## Learning Outcome

- Understood Angular standalone component architecture.
- Learned how to create and organize components.
- Built a simple component-based application structure.

---

# Hands-On 2 – Data Binding and Component Communication

## Objective

Implement different types of data binding and establish communication between parent and child components.

## Implementation

- Implemented Interpolation.
- Implemented Property Binding.
- Implemented Event Binding.
- Implemented Two-Way Data Binding using FormsModule.
- Used Lifecycle Hooks (`ngOnInit()` and `ngOnDestroy()`).
- Implemented Parent to Child communication using `@Input()`.
- Implemented Child to Parent communication using `@Output()` and `EventEmitter`.

## Files Modified

- pages/home/
- components/course-card/
- pages/course-list/

## Learning Outcome

- Learned different types of Angular data binding.
- Understood component lifecycle.
- Implemented communication between parent and child components.

---

# Hands-On 3 – Angular Directives

## Objective

Use Angular structural and attribute directives to dynamically control the UI.

## Implementation

- Implemented `*ngIf`.
- Implemented `*ngFor`.
- Applied `ngClass` for dynamic CSS classes.
- Applied `ngStyle` for dynamic styling.

## Files Modified

- pages/home/home.ts
- pages/home/home.html

## Learning Outcome

- Learned how structural directives modify the DOM.
- Used attribute directives for dynamic styling.
- Displayed data conditionally and iteratively.

---

# Hands-On 4 – Pipes

## Objective

Format and transform displayed data using Angular built-in pipes and a custom pipe.

## Implementation

- Used Uppercase Pipe.
- Used Lowercase Pipe.
- Used Titlecase Pipe.
- Used Currency Pipe.
- Used Date Pipe.
- Used Percent Pipe.
- Created a custom Reverse Pipe to reverse text.

## Files Modified

- pages/home/home.html
- pipes/reverse-pipe.ts

## Learning Outcome

- Learned to format data using Angular pipes.
- Created and used a custom pipe.
- Improved UI readability using data transformation.

---

# Hands-On 5 – Services and Dependency Injection

## Objective

Create an Angular service and use Dependency Injection to manage application data.

## Implementation

- Created a Course service.
- Moved course data from the component into the service.
- Injected the service into the Course List component.
- Loaded course data using the service during component initialization.

## Files Modified

- services/course.ts
- pages/course-list/course-list.ts

## Learning Outcome

- Understood Angular Services.
- Learned Dependency Injection.
- Separated business logic from UI components.

---

# Hands-On 6 – HTTP Client Integration

## Objective

Configure Angular HttpClient and consume data from a REST API.

## Implementation

- Configured `provideHttpClient()` in `app.config.ts`.
- Injected `HttpClient` into the service.
- Implemented `getCourses()` to fetch data from an API.
- Used `subscribe()` in the component to receive the response.
- Displayed the fetched data in the template.

## Files Modified

- app.config.ts
- services/course.ts
- pages/course-list/course-list.ts
- pages/course-list/course-list.html

## Learning Outcome

- Understood how Angular communicates with REST APIs.
- Learned dependency injection with `HttpClient`.
- Used Observables and `subscribe()` to handle asynchronous data.

---

# Technologies Used

- Angular 20
- TypeScript
- HTML5
- CSS3
- Angular Standalone Components
- Angular Forms
- Angular Common Module
- Angular HttpClient

---

# Author

**Parvatha Srini**

Cognizant Digital Nurture Program – Angular Hands-On Exercises