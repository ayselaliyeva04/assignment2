# assignment2
# BookStore Management System

This is a simple BookStore Management System implemented in Java with PostgreSQL as the backend database. The system allows you to connect to the bookstore database, perform basic operations such as creating, reading, updating, and deleting books, as well as displaying metadata about tables, columns, primary keys, and foreign keys.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- PostgreSQL Database

### Setting Up the Database

1. Create a PostgreSQL database named `assignment2`.
2. Modify the connection parameters (username, password, and database name) in the `connectToBookStore` method of the `BookStore` class in the `BookStore.java` file.

### Running the Application

1. Open a terminal and navigate to the project directory.
2. Compile the Java files:

   ```bash
   javac -classpath .:postgresql-42.7.0.jar Main.java org/example/BookStore.java
   ```

3. Run the Main class:

   ```bash
   java -classpath .:postgresql-42.7.0.jar Main
   ```

## Usage

1. **Connect to the BookStore Database:**
   - Uncomment the connection code in the `Main.java` file.
   - Provide the correct database credentials.

2. **Create a Book:**
   - Uncomment the `createBook` method call in the `Main.java` file.
   - Provide the book details as method arguments (book_id, title, genre, publishDate, stockQuantity, authorId).

3. **Read Books:**
   - Uncomment the `readBooks` method call in the `Main.java` file.
   - This will display a list of all books in the database.

4. **Update Book Stock:**
   - Uncomment the `updateBookStock` method call in the `Main.java` file.
   - Provide the book ID and the new stock quantity as method arguments.

5. **Delete a Book:**
   - Uncomment the `deleteBook` method call in the `Main.java` file.
   - Provide the book ID as a method argument.

6. **Display Metadata:**
   - Uncomment any of the metadata methods (e.g., `Primary_Key`, `Foreign_Key`) in the `BookStore.java` file.
   - Run the `main` method in the `BookStore.java` file to see metadata about tables, columns, primary keys, or foreign keys.

## Additional Notes

- Make sure to adjust the classpath and file paths based on your project structure.
- You may need to download the PostgreSQL JDBC driver (`postgresql-42.7.0.jar`) and place it in the project directory or update the classpath accordingly.

Feel free to explore and modify the code according to your requirements. Enjoy managing your BookStore!
