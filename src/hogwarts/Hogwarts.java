package hogwarts;

public class Hogwarts {
    protected String fullname;
    protected String faculty;
    protected int magicPower;
    protected int transgress;


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public Hogwarts(String fullname, String faculty, int magicPower, int transgress) {
        this.fullname = fullname;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgress = transgress;


    }

    public void printDescription() {
        System.out.println("Студент " + fullname + ":");
        System.out.println("Свойства, присущие всем ученикам:");
        System.out.println("Мощность магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgress);
    }

    public int getTotalScore() {
        return magicPower + transgress;
    }

    public void compare(Hogwarts student) {
        int thisTotalScore = this.getTotalScore();
        int studentTotalScore = student.getTotalScore();

        if (thisTotalScore > studentTotalScore) {
            System.out.println(this.getFullname() + " является лучше учеником, чем " + student.fullname);
        } else if (thisTotalScore < studentTotalScore) {
            System.out.println(student.fullname + " является лучше учеником, чем " + this.getFullname());
        } else {
            System.out.println(this.getFullname() + student.fullname + " равны");
        }
    }
}





