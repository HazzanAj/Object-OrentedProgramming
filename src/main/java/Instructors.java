public class Instructors extends CourseLists{//Inheritance : inherited CourseLists Attributes
    /*Setting Instructor class attributes*/
    private long instructorId;
    private String instructorName, instructorCourse,
            instructorAvailability, instructorHourlyRate;
    /*Combining the extended CourseLists Attributes and Instructors' Attributes Together In this Constructor*/
    public Instructors(long courseId, String coursePlace, String courseName,
                       String courseLectureTime, String courseDuration,
                       String courseInstructor, String courseFee,
            /*Instructor attributes Loaded here in this constructor  */
                       long instructorId, String instructorName, String instructorCourse,
                       String instructorAvailability, String instructorHourlyRate) {
        /*Super () is for invoking or calling immediate superclass constructor.
         * is a method for accessing superclass instance variable (declared variables) or
         * declared super class attributes
         * */
        super( courseId, coursePlace, courseName,
                courseLectureTime,courseDuration,
                courseInstructor, courseFee);


        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorCourse = instructorCourse;
        this.instructorAvailability = instructorAvailability;
        this.instructorHourlyRate = instructorHourlyRate;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorCourse() {
        return instructorCourse;
    }

    public void setInstructorCourse(String instructorCourse) {
        this.instructorCourse = instructorCourse;
    }

    public String getInstructorAvailability() {
        return instructorAvailability;
    }

    public void setInstructorAvailability(String instructorAvailability) {
        this.instructorAvailability = instructorAvailability;
    }

    public String getInstructorHourlyRate() {
        return instructorHourlyRate;
    }

    public void setInstructorHourlyRate(String instructorHourlyRate) {
        this.instructorHourlyRate = instructorHourlyRate;
    }
    @Override
    public String toString() {
        return "Instructors{" +
                "courseId=" + courseId +
                ", coursePlace='" + coursePlace + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseLectureTime='" + courseLectureTime + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseInstructor='" + courseInstructor + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", instructorId=" + instructorId +
                ", instructorName='" + instructorName + '\'' +
                ", instructorCourse='" + instructorCourse + '\'' +
                ", instructorAvailability='" + instructorAvailability + '\'' +
                ", instructorHourlyRate='" + instructorHourlyRate + '\'' +
                '}';
    }

}
