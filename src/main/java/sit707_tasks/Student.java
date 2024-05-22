package sit707_tasks;

//Student class
public class Student {
 private String studentId;
 private String name;
 private int age;
 // Other fields as needed

 public Student(String studentId, String name, int age) {
     this.studentId = studentId;
     this.name = name;
     this.age = age;
     // Initialize other fields as needed
 }

 public String getStudentId() {
     return studentId;
 }

 public void setStudentId(String studentId) {
     this.studentId = studentId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }
 
}
