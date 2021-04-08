# Spring Boot

### Spring @Bean

1. In the `beans.calc` package, there is a `Calculator` class.  The `Calculator` has dependencies on 4 math operations.  The implementation of `Add` is already complete.  
  - Complete the implementations of `Subtract`, `Multiply`, `Divide` classes
  - Remove the explicit instantiation of each math operation from the `Calculator` class.  Utilize the Spring IoC Container to directly inject the dependencies into the `Calculator`. 
  - There is a `CalculatorTest` in the `test/` directory.  The test for the add method has already been set up.  After finishing the above steps, the `add()` test should be successfully passing.  
  - Implement a test case for each of the remaining math operations on the `Calculator` class. **(Optional Task)**

2. In `beans.beanstalk` package, there are two classes, `Jack` and `Beanstalk`.  `Jack` requires a couple of dependencies that should be injected by the Spring Container.  Use the `Beanstalk` to add those required dependencies to the Spring Container, so `Jack` can utilize them in its class.  Implement the `pairTmWithStudents()` method in `Jack`.


___
### Controller

A basic Spring Boot Web App has been set up.  If you navigate to http://localhost:8080/greeting/, you will see a greeting on the page.
- Implement at least 3 additional GET endpoints that will greet in 3 other ways.
some examples : 

  * http://localhost:8080/greeting/spanish => "¡Saludos! de TEKcamp"
  * http://localhost:8080/greeting/french=> "Salut! depuis TEKcamp"
  * http://localhost:8080/greeting/arabic => "أهلا و سهلا من تك كامب "
  * http://localhost:8080/greeting/indonesian => "Salam pembuka! dari TEKcamp"
  * http://localhost:8080/greeting/italian => "Saluti! da TEKcamp"
  * http://localhost:8080/greeting/filipino => "Pagbati po! mula sa TEKcamp"

- Start with the `controllers` package as a starting point.  Follow the structure adhered to with the `@GetMapping helloSpring()` in `GreetingController`, using an appropriate `@Service` and `@Repository`.  

___
### REST API
___
#### Book
- A `Book @Component` has already been created with the following properties : 
  - isbn
  - title
  - author (String is okay at this point)
  - course (String is okay at this point)

-Following the `@RestController-@Service-@Repository` pattern, set up RESTful endpoints for `Book`.
  - `@GetMapping`
    - retrieve all books
    - retrieve one book by isbn number
    - retrieve a book by title
  - `@PostMapping`
    - create a new book
  - `@PutMapping`
    - modify an existing book by isbn number
    - modify an existing book by title
  - `@DeleteMapping`
    - delete a book by isbn number
    - delete a book by title

___
#### Author
- Create a `Author @Component` with the following properties : 
  - author_id
  - firstName
  - lastName
  - books (String List is okay at this point)

-Following the `@RestController-@Service-@Repository` pattern, set up RESTful endpoints for `Author`.
- `@GetMapping`
    - retrieve all authors
    - retrieve one author by id
- `@PostMapping`
  - create a new author
- `@PutMapping`
  - modify an existing author
- `@DeleteMapping`
  - delete an author

___
#### Student
- Create a `Student @Component` with the following properties : 
  - studentID
  - firstName
  - lastName
  - courses (String List is okay at this point)

-Following the `@RestController-@Service-@Repository` pattern, set up RESTful endpoints for `Student`.
- `@GetMapping`
    - retrieve all students
    - retrieve one student by id
- `@PostMapping`
  - create a new student
- `@PutMapping`
  - modify an existing student
- `@DeleteMapping`
  - delete a student

___
#### Course
- Create a `Course @Component` with the following properties : 
  - courseID
  - name
  - credits
  - instructor (String is okay at this point)

-Following the `@RestController-@Service-@Repository` pattern, set up RESTful endpoints for `Course`.
- `@GetMapping`
    - retrieve all courses
    - retrieve one course by id
- `@PostMapping`
  - create a new course
- `@PutMapping`
  - modify an existing course
- `@DeleteMapping`
  - delete a course

-Add Error Handling for bad requessts (404, 400, 500), etc. (Optional)

___
### Data Persistence
`SpringTEK` is currently wired up to an `H2` in-memory database.  If you navigate to http://localhost:8080/h2-console, you can access the H2 DB management console while the Spring App is running.

- Change the persistence layer of `SpringTEK` to use MySQL instead of H2.  You can use either a local instance or a cloud managed instance, such as [AWS-RDS](https://aws.amazon.com/rds/) or [Azure SQL](https://azure.microsoft.com/en-us/services/sql-database/)

Wtih adding a Data Persistence layer, you will most likely utilize a spring-data repository, such as [CrudRepository](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html).  Implement a `@Repository` from spring-data to perform your data persistence operations

- With data persistence comes the consideration of relationship cardinality between the database tables.   
For the Entities created in the REST API, Set up appropriate relationships (`@OneToMany, @ManyToMany, @OneToOne`) between each @Entity. 

  - An Author writes multiple Books, but only one Book is written by an Author
  - A Student can take multiple Courses, and each Course has multiple Students

 **Note that you will have to refactor each @Entity to set up your Cardinalities properly. (Simple Strings => Reference Objects)

___
### Security (Optional)

- Using `spring-boot-starter-security` : 
  - Implement Basic Login Authentication
  - Implement New User Registration
  - Persist the username / password information using any common method
    - In-Memory
    - H2 / MySQL
    - LDAP
  - Create two roles for the users, 
    - `ADMIN` - this role should have access to all the endpoints.  
    - `STUDENT` - this role should only have authorized access to the Course endpoints.
    - `AUTHOR` - this role should only have authroized access to the Course endpoints.  
- Implement a login page to Authenticate users into your Spring Boot App.  You can use the default login page provided by `spring-boot-starter-security` to login to the app, or you can implement a custom login page using React.

___
### Documentation (Optional)
-Use an REST API documentation tool to document the usage of your API.  
  - [Spring REST Docs](https://spring.io/projects/spring-restdocs)
  - [OpenAPI](https://springdoc.org/)
  - [Postman API Docs](https://www.postman.com/api-documentation-tool/)


## ********************************************************
## Git Instructions

- [ ] Create a template copy of this repository by clicking : "Use this template"
- [ ] Name the repository the same name as the master template repository.  
- [ ] Select Private Access for your template copy.
- [ ] Add your TM as collaborator
- [ ] Clone YOUR repo to your local computer
- [ ] Create a new branch: <code>git checkout -b `<firstName-lastName>`</code>.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push all of your commits: <code>git push origin `<firstName-lastName>`</code>.
- [ ] When ready for your TM to review, open a Pull Request (PR) and add your TM as a collaborator.
  
## ********************************************************