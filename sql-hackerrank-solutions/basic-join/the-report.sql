/*
Enter your query here.
*/
select IF(Grades.grade > 7, Students.name, "NULL"), Grades.grade, marks From Students 
JOIN Grades ON Students.marks between Grades.Min_Mark AND Grades.Max_Mark 
ORDER BY Grades.grade DESC, Students.name, Students.marks;