package hogwarts;

import hogwarts.Hogwarts;

public class Slyzzerin extends Hogwarts {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstOfPower;

    public Slyzzerin(String fullname, String faculty, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstOfPower) {
        super(fullname, faculty, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Свойства, присущие ученикам Слизорена:");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstOfPower);
    }
    public int getTotalScore() {
        return cunning + determination + ambition + resourcefulness + thirstOfPower;
    }

    public void compare(Slyzzerin student) {
        int thisTotalScore = this.getTotalScore();
        int slizzerinTotalScore = student.getTotalScore();
        if (thisTotalScore > slizzerinTotalScore) {
            System.out.println(this.getFullname() + " является лучшим учеником Слизерина, чем " + student.getFullname());
        } else if (thisTotalScore < slizzerinTotalScore) {
            System.out.println(student.getFullname() + " является лучшим Слизерина, чем " + this.getFullname());
        } else
            System.out.println(getFullname() + " и " + student + " равны");
    }
}

