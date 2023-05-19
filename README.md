# Todo List App

The Todo List App is a simple web application that allows users to manage their tasks and stay organized. It provides a RESTful API backend for creating, updating, retrieving, and deleting tasks.

## Features

- Create new tasks with a title, description, due date, and completion status.
- Update existing tasks by modifying their properties.
- Retrieve a list of all tasks or fetch a specific task by its ID.
- Delete tasks that are no longer needed.

## Technologies Used

- Backend:
    - Java with Spring Boot framework for building the RESTful API.
    - H2 in-memory database for storing task data.
    - JPA (Java Persistence API) for object-relational mapping.
    - Maven for dependency management.

## Getting Started

To get started with the Todo List App, follow these steps:

1. Clone the repository: `git clone https://github.com/your/repository.git`
2. Navigate to the project directory: `cd todo-list-app`
3. Build the project: `mvn clean install`
4. Run the application: `java -jar target/todo-list-app.jar`
5. The application will start running on http://localhost:8080.

## API Endpoints

The following API endpoints are available:

- `GET /tasks`: Retrieves a list of all tasks.
- `GET /tasks/{taskId}`: Retrieves a specific task by its ID.
- `POST /tasks`: Creates a new task.
- `PUT /tasks/{taskId}`: Updates an existing task.
- `DELETE /tasks/{taskId}`: Deletes a task.

For detailed information on request and response formats, please refer to the API documentation.

## Contributor

- Obin Gold

