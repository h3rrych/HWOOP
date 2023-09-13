package hogwarts;

public class Griffindor extends Hogwarts {
    public int nobility;
    protected int honour;
    protected int bravery;

    public Griffindor(String fullname, String faculty, int magicPower, int transgress, int nobility, int honour, int bravery) {
        super(fullname, faculty, magicPower, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Свойства, присущие Гриффиндорцам:");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honour);
        System.out.println("Храбрость: " + bravery);
    }

    public int getTotalScore() {
        return nobility + honour + bravery;
    }

    public void compare(Griffindor student) {
        int thisTotalScore = this.getTotalScore();
        int griffindorTotalScore = student.getTotalScore();
        if (thisTotalScore > griffindorTotalScore) {
            System.out.println(this.getFullname() + " является лучшим Гриффендоровцем, чем " + student.getFullname());
        } else if (thisTotalScore < griffindorTotalScore) {
            System.out.println(student.getFullname() + " является лучшим Гриффендоровцем, чем " + this.getFullname());
        } else
            System.out.println(getFullname() + " и " + student + " равны");
        }
    }



