Features:

- Product insertion screen
  [] Insert products manually
  [] Insert products via file (csv or excel?)
  [] View product list
  [] Edit product
  [] Delete product

- Order screen
  [] Create new order page with a list of products (if product inventory is low <5 then the app will suggest to add in order)
  [] Monitor all order steps
  [] Cancel an order

- Sell product screen (maybe with meeting time)
  [] create a list of products that will be sold
  [] when sold successfully create a pdf invoice and remove from inventory



* Spring Initialzr Dependencies *
Spring Web
Spring Data JPA
MySQL Driver
Spring Boot DevTools
Lombok

* MySql notes*
- allowPublicKeyRetrieval=true
- useSSL=false


*Spring notes*
Fundamentally the Java Persistence API was renamed to Jakarta












Release plan v1

[] - Create projects (back-front-mysqldb) configure the connection and sync to github
[] - Define sql entities
[] - connect backend with db and pass dummy data
[] - define api endpoints
[] - test CRUD with postman





---

# Entities:

- #### User
  - id
  - firstName
  - lastName
  - username
  - password
  - role
  - active
  - deleted
  - dateAdded
  - dateUpdated

- #### Product
  - id
  - name
  - serialNo
  - description
  - active
  - deleted
  - companyId (FK)
  - supplierId (FK)
  - dateAdded
  - dateUpdated

- #### company
  - id 
  - companyName
  - productId

- #### Supplier
  - id 
  - supplierName

- #### OrderCart
  - id
  - productId (FK)
  - quantity

- #### Order
  - id
  - orderNo
  - product
  - quantity

  
Users

- User
- Admin

Products

- Insert new product
- Delete product
- Update product
- Product status
  Stock
- Get product/s
- Insert product
- Delete product (admin)
- Offer
- Create new offer
- Discount
  Order
- Create new order
- Get orders
- Order Status
