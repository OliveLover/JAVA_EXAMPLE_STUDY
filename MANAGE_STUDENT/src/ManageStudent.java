public class ManageStudent {

    public static void main(String[] args) {
        //Student[] student = null;

        ManageStudent manageStudent = new ManageStudent();

        //student = manageStudent.addStudent();
        //manageStudent.printStudents(student);
        manageStudent.checkEquals();

    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");

        return student;
    }

    public void printStudents(Student[] student) {
        int studentLength = student.length;
        for (int i = 0; i < studentLength; i++) {
            System.out.println(student[i].toString());
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        System.out.println(a.equals(b));
    }
}