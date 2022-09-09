CREATE TABLE Mark
value NUMBER, subject_id NUMBER, 
student id NUMBER, 
PRIMARY KEY(subject_id, student_id), 
FOREIGN KEY (subject_id) references Subject(subject_id),
FOREIGN KEY (student_id) references Student(student_id) );
