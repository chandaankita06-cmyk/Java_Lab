import java.util.Scanner;

interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Sharma";
    
    void printDepartment();
}

abstract class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    
    void getHostelData(String name, String location, int rooms) {
        hostelName = name;
        hostelLocation = location;
        numberOfRooms = rooms;
    }
    
    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int registrationNumber;
    String electiveSubject;
    float avgMarks;
    
    void getData(String sName, int regNo, String subject, float marks) {
        studentName = sName;
        registrationNumber = regNo;
        electiveSubject = subject;
        avgMarks = marks;
    }
    
    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelData();
        printDepartment();
    }
    
    @Override
    public void printDepartment() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[50];
        int count = 0;
        int choice;
        
        do {
            System.out.println("\n1. Admit New Student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    students[count] = new Student();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Registration Number: ");
                    int regNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Elective Subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter Average Marks: ");
                    float marks = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter Hostel Name: ");
                    String hName = sc.nextLine();
                    System.out.print("Enter Hostel Location: ");
                    String hLoc = sc.nextLine();
                    System.out.print("Enter Number of Rooms: ");
                    int rooms = sc.nextInt();
                    
                    students[count].getData(name, regNo, subject, marks);
                    students[count].getHostelData(hName, hLoc, rooms);
                    count++;
                    System.out.println("Student admitted successfully!");
                    break;
                    
                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    int searchReg = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].registrationNumber == searchReg) {
                            sc.nextLine();
                            System.out.print("Enter new Hostel Name: ");
                            String newHName = sc.nextLine();
                            System.out.print("Enter new Hostel Location: ");
                            String newHLoc = sc.nextLine();
                            System.out.print("Enter new Number of Rooms: ");
                            int newRooms = sc.nextInt();
                            students[i].getHostelData(newHName, newHLoc, newRooms);
                            System.out.println("Student migrated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Reg No " + searchReg + " not found!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Registration Number to display: ");
                    int displayReg = sc.nextInt();
                    boolean foundDisplay = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].registrationNumber == displayReg) {
                            students[i].printData();
                            foundDisplay = true;
                            break;
                        }
                    }
                    if (!foundDisplay) {
                        System.out.println("Student with Reg No " + displayReg + " not found!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice!= 4);
        
        sc.close();
    }
}