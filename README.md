## Object Oriented Programming with Java (21IS4C03) 
## Sem- 4 AY: 2022-2023 
## Programming Assignment-1 
Develop a Java program that represents a student system for a university, adhering to the 
specifications provided in the class diagram. 
- system should have three classes: Student, UGStudent, and PGStudent. 
- program that allows the user to create an array of objects. 
- array should have a minimum capacity of 10 students. 
- program should prohibit any modifications to the PGDegree attribute as defined in the PGStudent class. 
## Write the Java program to implement the above requirements. You can include any additional methods or functionalities you think are necessary. 

```
  Student
-----------------------------------
- USN: String 
- name: String 
-----------------------------------
+ Student(USN: String, name: String) 
+ getUSN(): String 
+ setUSN(USN: String): void 
+ getName():  String 
+ setName(name: String): void 
```

```
UGStudent extends Student
-----------------------------------
- semester: int 
- branch: String
-----------------------------------
+ UGStudent(USN: String, name: String, 
semester: int, branch: String) 
 + getSemester(): int 
 + setSemester(semester: int): void 
 + getBranch(): String 
 + setBranch(branch: String): void
```

```
PGStudent extends Student
-----------------------------------
- specialization: String 
- UGDegree: String
-----------------------------------
+ PGStudent(USN: String, name: String, 
specialization: String, UGDegree: String) 
 + getSpecialization(): String 
 + setSpecialization(specialization: String): void 
 + getUGDegree (): String 
 + setUGDegree (UGDegree: String): void
```
