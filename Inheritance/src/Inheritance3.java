
class PersonDemo
{
 private String name;
 private String dob;
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getDob() {
  return dob;
 }
 public void setDob(String dob) {
  this.dob = dob;
 }
 
}
class Teacher extends PersonDemo
{
 private double salary;
 public String subject;
 public double getSalary() {
  return salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }
 public String getSubject() {
  return subject;
 }
 public void setSubject(String subject) {
  this.subject = subject;
 }
 
}
class Student extends PersonDemo
{
 int sid;

 public int getSid() {
  return sid;
 }

 public void setSid(int sid) {
  this.sid = sid;
 }
 
}
class CollegeStudent extends Student
{
 public String getClg_name() {
  return clg_name;
 }
 public void setClg_name(String clg_name) {
  this.clg_name = clg_name;
 }
 public String getYear() {
  return year;
 }
 public void setYear(String year) {
  this.year = year;
 }
 String clg_name;
 String year;
}
public class Inheritance3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  PersonDemo p=new PersonDemo();
  p.setName("XYZ");
  p.setDob("26-Mar-2001");
  System.out.println("Person Details");
  System.out.println("Person Name : "+p.getName());
  System.out.println("Person dob : "+p.getDob());
  
  System.out.println();
  
 }
}
