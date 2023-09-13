package hogwarts;

import hogwarts.Hogwarts;

public class Puffenduj extends Hogwarts {
    int hardWork;
    int honesty;
    int loyality;

    public Puffenduj(String fullname, String faculty, int magicPower, int transgress, int hardWork, int honesty, int loyality) {
        super(fullname, faculty, magicPower, transgress);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyality = loyality;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Свойства, присущие ученикам Пуффендуя:");
        System.out.println("Трудолюбие: " + hardWork);
        System.out.println("Верность: " + honesty);
        System.out.println("Честность: " + loyality);
    }
    public int getTotalScore() {
        return hardWork + honesty +loyality;
    }

    public void compare(Puffenduj student) {
        int thisTotalScore = this.getTotalScore();
        int puffendujTotalScore = student.getTotalScore();
        if (thisTotalScore > puffendujTotalScore) {
            System.out.println(this.getFullname() + " является лучшим учеником Пуффендуя, чем " + student.getFullname());
        } else if (thisTotalScore < puffendujTotalScore) {
            System.out.println(student.getFullname() + " является лучшим учеником Пуффендуя, чем " + this.getFullname());
        } else
            System.out.println(getFullname() + " и " + student + " равны");
    }
}
