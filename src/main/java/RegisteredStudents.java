public class RegisteredStudents extends UnRegisteredStudents{
    /****
     *Setting Attributes For Registered Students
     **************** **************************/
    protected long regStudentId;
    protected String regStudentFName;
    protected String regStudentLName;
    protected String regStudentNationality;
    protected String regStudentGender;
    /****
     *Implementing Loaded Constructors for unregistered and registered students
     **************************************************************************/
    public RegisteredStudents(
            /*Attributes from extended superclass or parent class */
            long unRegStudentId, String unRegStudentFName,
            String unRegStudentLName, String unRegStudentNationality,
            String unRegStudentGender,
            /* RegisteredStudents Attribute (subclass or child class) */
            long regStudentId, String regStudentFName,
            String regStudentLName, String regStudentNationality,
            String regStudentGender)
    {
        /****
         *It is more intuitive to use super() to reference parent attributes here
         * to avoid confusion with "this.attribute = attribute" used below
         *********************************************************************/
        super (unRegStudentId,unRegStudentFName,unRegStudentLName,
                unRegStudentNationality,unRegStudentGender);
        /****
         * referencing RegisteredStudents Attributes
         *********************************************/
        this.regStudentId = regStudentId;
        this.regStudentFName = regStudentFName;
        this.regStudentLName = regStudentLName;
        this.regStudentNationality = regStudentNationality;
        this.regStudentGender = regStudentGender;
    }

    /****
     *Implementing Getter and Setter
     ************************************/
    public long getRegStudentId() {
        return regStudentId;
    }

    public void setRegStudentId(long regStudentId) {
        this.regStudentId = regStudentId;
    }

    public String getRegStudentFName() {
        return regStudentFName;
    }

    public void setRegStudentFName(String regStudentFName) {
        this.regStudentFName = regStudentFName;
    }

    public String getRegStudentLName() {
        return regStudentLName;
    }

    public void setRegStudentLName(String regStudentLName) {
        this.regStudentLName = regStudentLName;
    }

    public String getRegStudentNationality() {
        return regStudentNationality;
    }

    public void setRegStudentNationality(String regStudentNationality) {
        this.regStudentNationality = regStudentNationality;
    }

    public String getRegStudentGender() {
        return regStudentGender;
    }

    public void setRegStudentGender(String regStudentGender) {
        this.regStudentGender = regStudentGender;
    }
    /****
     *Implementing toString for registered and unregistered students
     ************************************/
    @Override
    public String toString() {
        return "RegisteredStudents{" +
                "regStudentId=" + regStudentId +
                ", regStudentFName='" + regStudentFName + '\'' +
                ", regStudentLName='" + regStudentLName + '\'' +
                ", regStudentNationality='" + regStudentNationality + '\'' +
                ", regStudentGender='" + regStudentGender + '\'' +
                ", unRegStudentId=" + unRegStudentId +
                ", unRegStudentFName='" + unRegStudentFName + '\'' +
                ", unRegStudentLName='" + unRegStudentLName + '\'' +
                ", unRegStudentNationality='" + unRegStudentNationality + '\'' +
                ", unRegStudentGender='" + unRegStudentGender + '\'' +
                '}';
    }
}
