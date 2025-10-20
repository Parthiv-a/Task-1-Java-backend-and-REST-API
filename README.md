
## Description
A simple Java Spring Boot + MongoDB REST API for creating, searching, deleting, and executing shell tasks.

## API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | /api/tasks | Get all tasks |
| GET | /api/tasks?id={id} | Get task by ID |
| PUT | /api/tasks | Create/Update a task |
| DELETE | /api/tasks/{id} | Delete a task |
| GET | /api/tasks/search?name={text} | Find tasks by name |
| PUT | /api/tasks/{id}/execute | Execute the command and save output |

---

## Setup & Run

1. Start MongoDB (use Docker or local install)
   ```bash
   docker run -d -p 27017:27017 mongo:6.0

2. Build and run:
   
mvn spring-boot:run
