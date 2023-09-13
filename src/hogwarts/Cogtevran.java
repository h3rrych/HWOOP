package hogwarts;

public class Cogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int witty;
    private int creation;

    public Cogtevran(String fullname, String faculty, int magicPower, int transgress, int mind, int wisdom, int witty, int creation) {
        super(fullname, faculty, magicPower, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ".\nСвойства, присущие Когтеврановцам" +
                ". Ум: " + mind +
                ". Мудрость : " + wisdom +
                ". Остроумность: " + witty +
                ". Творчество: " + creation;
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

