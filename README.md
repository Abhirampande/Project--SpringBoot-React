Steps and procedures:-

1 - Spring boot 3
2 - Spring Data Jpa
3- mySql Database
4 - Intellij Idea
5 - Maven
6 - Postman Client

Build Crud Rest Api (Employee Management Modeule)
1- Add Employee
2- Get Employee
3- Get all Employee
4- Update Employee
5- Delete Employee

Spring Boot React Full Strack Architecture
React Frontend App
Router--- Components ---Services(Consumes Rest Api)
              |
(Axios Http Controller)
              |
Spring Rest Controller
model-- service-- Repository -- mysql(exposes rest api)

Development Steps:-
1. Create service layer -- user service and user Service Impl
2. Build Add Employee Rest Api
3. test Add Employee Rest api using Postman client
                                   
								   Flow chart
postman -- dto -- controller -- service -- repository -- database

- create model class
- add connection in application properties
- create dto class
- create repository interface
- create mapper class
- create Service interface
- create Serviceimpl class
- create controller class
- add post api (http://localhost:8080/api/user)
- create custom exception 
- create get by id api(http://localhost:8080/api/user/1)
- create get All Rest Api(http://localhost:8080/api/user/all)
- create update Rest api (http://localhost:8080/api/user/2)
- create delete Rest Api(http://localhost:8080/api/user/2)
