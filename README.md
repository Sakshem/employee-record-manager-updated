# Employee-Record-Manager-Updated
* A Web Spring Boot Application that performs all the CRUD operations on employee records with mySQL integration
* Added Spring Security with JDBC Authentication
* Used Thymeleaf for view template or dynamic content of the web page
* Used HTML, CSS and Bootstrap for designing static content of the web page

Here's a glimpse of how the application looks like.

![image](https://user-images.githubusercontent.com/61968230/155683517-faa72b8a-8785-41aa-939f-3155b47e7386.png)

**Created a Custom Login Page**

![image](https://user-images.githubusercontent.com/61968230/155683754-bfe966d4-0e2a-4a19-84cd-e5b0c1c3a646.png)

**Provided 3 different roles to access different content of this web page**
1) Role 1: Employee
2) Role 2: Manager
3) Role 3: Admin

**1) Role 1: Employee**

Users with this role can only access the list of employee registered in the database but cannot add an employee
or edit their records. When logged in with the employee role, one cannot see the update or delete button to edit the records.
This role can only search employees using the search filter.

![image](https://user-images.githubusercontent.com/61968230/155684312-3b4c7f5d-b8e0-4bd3-b836-3f77b0cbf177.png)

**2) Role 2: Manager**

As a manager of the company this role can access the list of employees and can add new employees to the database.
Also can edit the data of pre-existing employee records. User when logged in with this role can now see the 
update button on each record.

![image](https://user-images.githubusercontent.com/61968230/155685265-6cf88900-c51d-496d-ab66-f062caa80420.png)

**a) Update button**

When user clicks on update button the form is pre populated with the previously entered record data, which now user can change to something
else or can keep it as it is.

![image](https://user-images.githubusercontent.com/61968230/155690151-5f787039-74fe-4f8f-a2e9-824bd2311098.png)


**b) Add Employee Button**

![image](https://user-images.githubusercontent.com/61968230/155685416-e4a42c8e-88fa-45dd-9ea0-61a9323af371.png)

**3) Role 3: Admin**

As an admin of the company this role can access the list of employees, add new employees, update an employee record or even can 
delete the record of any employee. So can perform all the CRUD operations.

![image](https://user-images.githubusercontent.com/61968230/155685762-2b575585-0bde-42f8-bdbe-0bf9e1f5f72d.png)

**a) Delete Button**

When User with Admin role clicks on delete, it prompts an alert asking are you sure you want to delete
the employee, if clicked yes, it deletes the record of employee from the database as well.

![image](https://user-images.githubusercontent.com/61968230/155687877-e9ae8fea-8d3a-49f9-8e1f-9e18ef958f08.png)

**Logout Support**

Users after logging in can easily logout by clicking on the logout button on the web page to go back to the login page.

![image](https://user-images.githubusercontent.com/61968230/155688849-5fb3ac14-13f2-440b-8504-fc30e0909bda.png)

**Search Filter**

When user clicks on the search filter and types letters that matches to any name in the database name column and then click on search button.
It shows all of the users that are present in the database with that matching name.

![image](https://user-images.githubusercontent.com/61968230/155689347-0fae506a-1987-45c0-9650-495e0c5f05d6.png)

**Security**

* As using Spring Security to prevent unauthorized access to the website, without proper authentication one
cannot login or cannot access any web URL directly.
* One must authorize themselves to gain access to the content of the web page.
* Encrypted passwords are stored in the database using BCryptPasswordEncoder

When Invalid username or password is entered

![image](https://user-images.githubusercontent.com/61968230/155686299-b11bc7f6-7bde-404a-816e-867ea75ba12b.png)

