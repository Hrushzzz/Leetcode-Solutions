-- Problem Link ::: https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/

SELECT EmployeeUNI.unique_id , Employees.name FROM Employees LEFT JOIN EmployeeUNI
ON  Employees.id = EmployeeUNI.id;