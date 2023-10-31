import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Course
{
private String code;
private String title;
private String description;
private int capacity;
private List<String> schedule;
private List<Student> enrolledStudents;
public Course(String code, String title, String description, int capacity, List<String> schedule) {
this.code = code;
this.title = title;
this.description = description;
this.capacity = capacity;
this.schedule = schedule;
this.enrolledStudents = new ArrayList<>();
}
public String getCode()
{
return code;
}

public String getTitle() 
{
return title;
}

public String getDescription()
{
return description;
}
public int getCapacity() 
{
return capacity;
}

public List<String> getSchedule() 
{
return schedule;
}

public List<Student> getEnrolledStudents() 
{
return enrolledStudents;
}
public boolean isFull() 
{
return enrolledStudents.size() >= capacity;
}
public void enrollStudent(Student student)
{
if (!isFull()) 
{
enrolledStudents.add(student);
}
else 
{
System.out.println("Course is already full. Cannot enroll student.");
}
}
public void removeStudent(Student student) 
{
enrolledStudents.remove(student);
}
}
class Student 
{
private int studentID;
private String name;
private List<Course> registeredCourses;
public Student(int studentID, String name)
{
this.studentID = studentID;
this.name = name;
this.registeredCourses = new ArrayList<>();
}
public int getStudentID() 
{
return studentID;
}
public String getName()
{
return name;
}
public List<Course> getRegisteredCourses() 
{
return registeredCourses;
}
public void registerCourse(Course course)
{
registeredCourses.add(course);
course.enrollStudent(this);
}
public void dropCourse(Course course) 
{
registeredCourses.remove(course);
course.removeStudent(this);
}
}

class CourseList 
{
private List<Course> courses;
public CourseList() 
{
this.courses = new ArrayList<>();
}
public void addCourse(Course course) 
{
courses.add(course);
}
public List<Course> getCourses()
{
return courses;
}
public void displayCourses() 
{
System.out.println("Available Courses:");
for (Course course : courses) 
{         
System.out.println("Course Code: " + course.getCode());         
System.out.println("Title: " + course.getTitle());            
System.out.println("Description: " + course.getDescription());           
System.out.println("Capacity: " + course.getCapacity());            
System.out.println("Schedule: " + course.getSchedule());           
System.out.println("Enrolled Students: " + course.getEnrolledStudents().size());            
System.out.println();
}
}
}

class StudentReg
{
public static void main(String[] args) 
{        
CourseList courseList = new CourseList();        
Course course1 = new Course("CS101", "Introduction to Programming", "Learn Java programming basics", 30,                
List.of("Mon, Wed 10:00 AM - 11:30 AM"));
Course course2 = new Course("CS201", "Data Structures", "Advanced data structures and algorithms", 25,
List.of("Tue, Thu 1:00 PM - 2:30 PM"));
courseList.addCourse(course1);
courseList.addCourse(course2);

Student student1 = new Student(101, "John Doe");
Student student2 = new Student(102, "Jane Smith");
      
student1.registerCourse(course1);       
student2.registerCourse(course1);        
student2.registerCourse(course2);
        
courseList.displayCourses();    
}
}
