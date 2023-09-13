package hogwarts;

import hogwarts.Hogwarts;

public class Slyzzerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfPower;

    public Slyzzerin(String fullname, String faculty, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstOfPower) {
        super(fullname, faculty, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public String toString() {
        return super.toString() + ". \nСвойства, присущие ученикам Слизорена:" +
                        " Хитрость: " + cunning +
                        ". Решительность: " + determination +
                        ". Амбициозность: " + ambition +
                        ". Находчивость: " + resourcefulness +
                        ". Жажда власти: " + thirstOfPower;
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

