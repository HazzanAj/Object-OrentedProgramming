public class UnRegisteredStudents {
    /*Setting attributes for Unregistered */
    protected long unRegStudentId;
    protected String unRegStudentFName;
    protected String unRegStudentLName;
    protected String unRegStudentNationality;
    protected String unRegStudentGender;

    /*Unloaded Constructor*/
    public UnRegisteredStudents(){}


    /*Loaded Constructor*/
    public UnRegisteredStudents(long unRegStudentId, String unRegStudentFName,
                                String unRegStudentLName, String unRegStudentNationality,
                                String unRegStudentGender)
    {
        this.unRegStudentId = unRegStudentId;
        this.unRegStudentFName = unRegStudentFName;
        this.unRegStudentLName = unRegStudentLName;
        this.unRegStudentNationality = unRegStudentNationality;
        this.unRegStudentGender = unRegStudentGender;
    }

    /*Implementing Getters and Setters*/
    public long getUnRegStudentId() {
        return unRegStudentId;
    }

    public void setUnRegStudentId(long unRegStudentId) {
        this.unRegStudentId = unRegStudentId;
    }

    public String getUnRegStudentFName() {
        return unRegStudentFName;
    }

    public void setUnRegStudentFName(String unRegStudentFName) {
        this.unRegStudentFName = unRegStudentFName;
    }

    public String getUnRegStudentLName() {
        return unRegStudentLName;
    }

    public void setUnRegStudentLName(String unRegStudentLName) {
        this.unRegStudentLName = unRegStudentLName;
    }

    public String getUnRegStudentNationality() {
        return unRegStudentNationality;
    }

    public void setUnRegStudentNationality(String unRegStudentNationality) {
        this.unRegStudentNationality = unRegStudentNationality;
    }

    public String getUnRegStudentGender() {
        return unRegStudentGender;
    }

    public void setUnRegStudentGender(String unRegStudentGender) {
        this.unRegStudentGender = unRegStudentGender;
    }
    /*Implementing toString*/
    @Override
    public String toString() {
        return "UnRegisteredStudents{" +
                "unRegStudentId=" + unRegStudentId +
                ", unRegStudentFName='" + unRegStudentFName + '\'' +
                ", unRegStudentLName='" + unRegStudentLName + '\'' +
                ", unRegStudentNationality='" + unRegStudentNationality + '\'' +
                ", unRegStudentGender='" + unRegStudentGender + '\'' +
                '}';
    }
}
