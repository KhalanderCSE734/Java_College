import java.util.*;
 class Subject {
 int subjectMarks;
 int credits;
 int grade;
 void calculateGrade() {
 if (subjectMarks >= 90) {
 grade = 10;
 } else if (subjectMarks >= 80) {
 grade = 9;
 } else if (subjectMarks >= 70) {
 8
grade = 8;
 } else if (subjectMarks >= 60) {
 grade = 7;
 } else if (subjectMarks >= 50) {
 grade = 6;
 } else if (subjectMarks >= 40) {
 grade = 5;
 } else {
 grade = 0; // Fail
 }
 }
 }
 class Student {
 String name;
 String usn;
 double SGPA;
 Scanner s;
 Subject subject[];
 Student() {
 subject = new Subject[8]; // Array of 9 subjects
 for (int i = 0; i < 8; i++) {
 subject[i] = new Subject(); // Create an array of Subject objects
 }
 s = new Scanner(System.in);
 }
 }
 void getStudentDetails() {
 System.out.print("Enter Name: ");
 name = s.nextLine();
 System.out.print("Enter USN: ");
 usn = s.nextLine();
 void getMarks() {
 for (int i = 0; i < 8; i++) {
 System.out.print("Enter marks for Subject " + (i + 1) + ": ");
 subject[i].subjectMarks = s.nextInt();
 System.out.print("Enter credits for Subject " + (i + 1) + ": ");
 subject[i].credits = s.nextInt();
 subject[i].calculateGrade();
 9
if (subject[i].subjectMarks > 100) {
 System.out.println("Invalid marks. Marks should not exceed 100.");
 subject[i].subjectMarks = 100;
 } else if (subject[i].subjectMarks < 0) {
 System.out.println("Invalid marks. Marks should not be negative.");
 subject[i].subjectMarks = 0;
 }
 }
 }
 }
 void computeSGPA() {
 double totalCredits = 0;
 double totalGradePoints = 0;
 for (int i = 0; i < 8; i++) {
 totalCredits += subject[i].credits;
 totalGradePoints += subject[i].credits * subject[i].grade;
 }
 if (totalCredits > 0) {
 SGPA =totalGradePoints / totalCredits;
 } else {
 SGPA =0; // Handle case with zero credits
 }
 void displayResults() {
 System.out.println("Name: " + name);
 System.out.println("USN: " + usn);
 System.out.println("SGPA:"+ SGPA);
 }
 public static void main(String[] args) {
 Student s1 = new Student();
 s1.getStudentDetails();
 s1.getMarks();
 s1.computeSGPA();
 s1.displayResults();
 }
 }
