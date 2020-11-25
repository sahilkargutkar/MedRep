Task of Creating a project on a Medical Representative with multiple drugs assigned.

A)Creation 

1.Created a Interface in Employee package which Extends JPA Repository.
2.Created an Entity Class of Employee and Number of Drugs Assigned to him.(Which includes his ID,Name and No of Drugs Assigned).
3.Created an Annotation Based Controller class which uses Annotation based Request Mapping to create,update,delete and find Employees.
4.Then Atlast Using Dependency Injection and Configuiring Application.properties file to Connect to the Database of MySQL.


B)Excecution:
1.Configured the following Database and Project on RESTApi's PostMan(Api)to generate and test the code in JSON format.
2.To Create an Employee you need to go to the described path and add (/add) to Create new Employee.
3.To Update any Employee you need to go to the described path and edit (/edit) to Update new Employee.
4. Using the similar mapping you can find Employees by his id with(/getid) command and to get every Employees with their id you need to use(/get/all).
5.Finally using Delete mapping (/delete) to delete the Employee using his ID.


C)Applications Used
1.Spring Tool Suite 4(IDE).
2.MySQL v8 Database.
3.PostMan(Api).       