# OnlineBookApp

An OnlineBookApp application that displays the book the user is searching for.
This project is a Java-based application that demonstrates the Collections Framework.
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
