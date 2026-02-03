# BookAppStreams

Following the similar blueprint as that of [OnlinBookApp](https://github.com/Navaneeth423/javaFSProjects/tree/main/OnlineBookApp/src), with a new updation of usage of
Streams API.

This project is a Java-based application that demonstrates the Collections Framework and Streams API.
It allows users to find any books they are looking for based on specific criteria.

---

## Features
- Gives the User options to select from
- If a book based on a condition exists, the book will be displayed
- If not, a custom exception will be displayed.
- Since no database has been implemented, a static list of books has been used.
- Clean object-oriented design

---

## Technologies Used
- Java
- Eclipse IDE
- Collections Framework
- Streams API

---

## Project Structure
``` bash
com.bookapp
├── main
│ └── Client.java (main class)
├── service
│ └── BookServiceImpl.java
│ └── IBookService.java
├── exception
│ └── BookNotFoundException.java
├── model
 └── Book.java
```
