public class CourseLists {

    /*Setting CourseLists Attributes*/
    protected long courseId;
    protected String coursePlace, courseName, courseLectureTime,
            courseDuration,courseInstructor, courseFee;
    /*Unloaded Constructor*/
    public CourseLists(){}
    /*Loaded Constructor*/
    public CourseLists(long courseId, String coursePlace, String courseName,
                       String courseLectureTime, String courseDuration,
                       String courseInstructor, String courseFee
    )
    {
        this.courseId = courseId;
        this.coursePlace = coursePlace;
        this.courseName = courseName;
        this.courseLectureTime = courseLectureTime;
        this.courseDuration = courseDuration;
        this.courseInstructor = courseInstructor;
        this.courseFee = courseFee;
    }
    /*Implementing Getter and Setter*/
    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCoursePlace() {
        return coursePlace;
    }

    public void setCoursePlace(String coursePlace) {
        this.coursePlace = coursePlace;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLectureTime() {
        return courseLectureTime;
    }

    public void setCourseLectureTime(String courseLectureTime) {
        this.courseLectureTime = courseLectureTime;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }
    /*Implementing toString*/
    @Override
    public String toString() {
        return "CourseLists{" +
                "courseId=" + courseId +
                ", coursePlace='" + coursePlace + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseLectureTime='" + courseLectureTime + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseInstructor='" + courseInstructor + '\'' +
                ", courseFee='" + courseFee + '\'' +
                '}';
    }

}