package hogwarts;

public class Cogtevran extends Hogwarts {
    int mind;
    int wisdom;
    int witty;
    int creation;

    public Cogtevran(String fullname, String faculty, int magicPower, int transgress, int mind, int wisdom, int witty, int creation) {
        super(fullname, faculty, magicPower, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creation = creation;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Свойства, присущие Когтеврановцам");
        System.out.println("Ум: " + mind);
        System.out.println("Мудрость : " + wisdom);
        System.out.println("Остроумность: " + witty);
        System.out.println("Творчество: " + creation);
    }
    public int getTotalScore() {
        return mind + wisdom + witty + creation;
    }

    public void compare(Cogtevran student) {
        int thisTotalScore = this.getTotalScore();
        int cogtevranTotalScore = student.getTotalScore();
        if (thisTotalScore > cogtevranTotalScore) {
            System.out.println(this.getFullname() + " является лучшим Когтеврановцем, чем " + student.getFullname());
        } else if (thisTotalScore < cogtevranTotalScore) {
            System.out.println(student.getFullname() + " является лучшим Когтеврановцем, чем " + this.getFullname());
        } else
            System.out.println(getFullname() + " и " + student + " равны");
    }
}

