/****
 * Author: Ajao Hazzan
 * Project Started Date 18-09-2021
 * Project Title : Application of Object-Oriented Programming In Java
 *
 ***************************************************************************************************************/

import java.util.Scanner;

public class Main { public static  void main(String []  args){
    /****
     * Since we can access all the attributes of "CourseList Class" from "Instructors Class", is more efficient
     * and optimized to populate two CLASSES this way by creation one object called instructor where we can access
     * the assigned Parameters or Data
     ***************************************************************************************************************/
    CourseLists instructor = new Instructors(01,"OnlinePlatform","Java Programming",
            "7:00 - 15:00pm","8 hours","Mr JavaPro","4000€",01,
            "Mr JavaPro","Java Programming", "Weekends","55 €");

    UnRegisteredStudents registeredStudents = new RegisteredStudents( 02,"Victoria",
            "Smith","England","Female",03,
            "Paul","Bright","Finland","Female");

    System.out.println(instructor);
    System.out.println(registeredStudents);


    /****
     * 1. For simplicity, we can dynamically all the CLASSES' attribute's values
     * data using java scanner method and if-else statements.
     ***************************************************************************************************************/

    Instructors instructors = new Instructors(01,"OnlinePlatform","Java Programming",
            "7:00 - 15:00pm","8 hours","Mr JavaPro","4000€",01,
            "Mr JavaPro","Java Programming", "Weekends","55 €");

    /* Gives opportunity to access the data individually*/
    long _CourseId = instructors.courseId;
    String _CoursePlace = instructors.coursePlace;
    String _CourseName = instructors.courseName;
    String _CourseLectureTime = instructors.courseLectureTime;
    String _CourseDuration = instructors.courseDuration;
    String _CourseInstructor = instructors.courseInstructor;
    String _CourseFee = instructors.courseFee;

    RegisteredStudents registeredStudents1 = new RegisteredStudents(02,"Victoria",
            "Smith","England","Female",03,
            "Paul","Bright","Finland","Male");


    /* Gives opportunity to access the data individually*/
    long _unRegStudentId = registeredStudents1.unRegStudentId;
    String _unRegStudentFName = registeredStudents1.unRegStudentFName;
    String _unRegStudentLName = registeredStudents1.unRegStudentLName;
    String _unRegStudentNationality = registeredStudents1.unRegStudentNationality;
    String _unRegStudentGender = registeredStudents1.unRegStudentGender;
    long _regStudentId = registeredStudents1.regStudentId;
    String _regStudentFName = registeredStudents1.regStudentFName;
    String _regStudentLName = registeredStudents1.regStudentLName;
    String _regStudentNationality = registeredStudents1.regStudentNationality;
    String _regStudentGender = registeredStudents1.regStudentGender;
    System.out.println( _unRegStudentId);
    Scanner ConsoleInput = new Scanner(System.in);
    System.out.println("Enter 1 or 2   to view list of unregistered and registered students");
    int enteredValue = ConsoleInput.nextInt();

    if (enteredValue == 1){

        System.out.println(" Unregistered student Id number:" + _unRegStudentId);
        System.out.println(" Unregistered student first name:" +  _unRegStudentFName);
        System.out.println(" Unregistered student last name:" +  _unRegStudentLName);
        System.out.println(" Unregistered student nationality:" +  _unRegStudentNationality);
        System.out.println(" Unregistered student gender:" +  _unRegStudentGender );
    }

    else if (enteredValue == 2){
        System.out.println(" Registered student Id number:" +  _regStudentId);
        System.out.println(" Registered student first name:" + _regStudentFName);
        System.out.println(" Registered student last name:" +  _regStudentLName);
        System.out.println(" Registered student nationality:" +  _regStudentNationality);
        System.out.println(" Registered student gender:" +  _regStudentGender );
    }
}
}
