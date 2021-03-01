package lesson4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

}

class StudentTest {

    double sredArifmOcenka(Student st){
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Srednyaya arifmeticheskaya ocenka studenta " + st.name + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nikolay";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreignLanguageAverageGrade = 8.8;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Viktor";
        st2.surname = "Ivasenko";
        st2.course = 2;
        st2.mathAverageGrade = 7.2;
        st2.economicsAverageGrade = 8.2;
        st2.foreignLanguageAverageGrade = 9.8;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Roman";
        st3.surname = "Petrov";
        st3.course = 4;
        st3.mathAverageGrade = 9.8;
        st3.economicsAverageGrade = 8.2;
        st3.foreignLanguageAverageGrade = 8.1;

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }
}
