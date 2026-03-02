package no.hvl.dat102;

public class Student implements Comparable<Student> {

    private String navn;
    private int studentnr;

    public Student(String navn, int studentnr) {
        this.navn = navn;
        this.studentnr = studentnr;
    }

    public String getNavn() {
        return navn;
    }

    public int getStudentnr() {
        return studentnr;
    }

    @Override
    public int compareTo(Student annen) {
        return this.studentnr - annen.studentnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student annen = (Student) o;
        return this.studentnr == annen.studentnr;
    }

    @Override
    public String toString() {
        return navn + " (" + studentnr + ")";
    }
}
