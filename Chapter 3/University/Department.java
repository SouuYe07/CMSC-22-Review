public class Department{
    private String name;
    private String college;
    private String subject;
    private String offeredCourses;
    private Professor professors;
    private Student students;

    public Department(){
        this.name = null;
        this.college = null;
        this.subject = null;
        this.offeredCourses = null;
        this.professors = null;
        this.students = null;
    }

    public Department(String name, String college, String subject){
        this.name = name;
        this.college = college;
        this.subject = subject;
    }


    public String getName(){
        return this.name;
    }

    public String getCollege(){
        return this.college;
    }

    public String getSubject(){
        return this.subject;
    }

    public String getOfferedCourses(){
        return this.offeredCourses;
    }

    public Professor getProfessors(){
        return this.professors;
    }

    public Student getStudents(){
        return this.students;
    }
}
