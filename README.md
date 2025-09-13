E-commerce API Project
This is a RESTful API for a modern e-commerce application, built with Spring Boot. The project provides a complete set of API endpoints for managing products, including creating, reading, updating, and deleting product information.

Key Features
Product Management: Comprehensive CRUD (Create, Read, Update, Delete) operations for managing products.

Image Upload: The ability to upload and store product images directly within the database.

Advanced Search: A dedicated endpoint for searching products by name, description, brand, or category.

In-Memory Database: Utilizes an H2 in-memory database for simplified development and testing.

Technologies Used
Backend Framework: Spring Boot

Data Persistence: Spring Data JPA

Database: H2 (In-Memory Database)

Version Control: Git

How to Run the Project
Clone the Repository:

git clone [https://github.com/your-username/your-repository-name.git](https://github.com/your-username/your-repository-name.git)

(Make sure to replace the link with your actual repository link)

Open in IntelliJ IDEA:

Open the project in IntelliJ IDEA.

Ensure your application.properties file has the correct H2 database settings.

Run the main class EcomprojApplication.java.

Test the Endpoints:

Use a tool like Postman or cURL to test the API endpoints.

API Endpoints
Method

Endpoint

Description

GET

/api/products

Retrieves a list of all products.

GET

/api/product/{id}

Retrieves a single product by its ID.

POST

/api/product

Adds a new product with an image.

GET

/api/product/{id}/image

Retrieves a product's image by its ID.

PUT

/api/product/{id}

Updates an existing product by its ID.

DELETE

/api/product/{id}

Deletes a product by its ID.

GET

/api/products/search?keyword={keyword}

Searches for products by a keyword.

Contribution
If you'd like to contribute, please follow these steps:

Fork the repository.

Create a new branch for your changes (git checkout -b feature/your-feature-name).

Commit your changes (git commit -m 'feat: Add a new feature').

Push to the branch (git push origin feature/your-feature-name).

Open a Pull Request.

Author
[Your Name Here]
