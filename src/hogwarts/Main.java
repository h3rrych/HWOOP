package hogwarts;

public class Main {

    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри Потер", "Гриффендор", 99, 90, 95,70,90);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", "Гриффендор", 90, 85, 70, 75, 90);
        Griffindor ron = new Griffindor("Рон Уизли", "Гриффендор", 70, 50, 60, 50, 100);
        Slyzzerin drako = new Slyzzerin("Драко Малфой", "Слизерин", 80,80,69,75,65,80,90);
        Slyzzerin grehem = new Slyzzerin("Грэхэм Монтегю", "Слизерин", 67,90,59,60,65,90,70);
        Slyzzerin gojl = new Slyzzerin("Грегори Гойл", "Слизерин", 70,65,80,70,50,86,80);
        Puffenduj smith = new Puffenduj("Захария Смит", "Пуффендуй", 80, 70, 65, 90, 50);
        Puffenduj sedrik = new Puffenduj("Седрик Диггори", "Пуффендуй", 85, 80, 65, 50, 70);
        Puffenduj jastin = new Puffenduj("Джастин Финч-Флетчли. ", "Пуффендуй", 70, 90, 56, 76, 72);
        Cogtevran chang = new Cogtevran("Чжоу Чанг", "Когтевран", 80, 50, 60, 70, 65, 60);
        Cogtevran padma = new Cogtevran("Падма Патил", "Когтевран", 70, 60, 80, 60, 50, 76);
        Cogtevran markus = new Cogtevran("Маркус Белби", "Когтевран", 70, 55, 90, 56, 77, 80);
        System.out.println(harry);
        System.out.println();
        System.out.println(drako);
        System.out.println();
        System.out.println(smith);
        System.out.println();
        System.out.println(chang);
        System.out.println();
        harry.compare(ron);
        germiona.compare(ron);
        harry.compare(drako);
        drako.compare(germiona);
        chang.compare(padma);
        chang.compare(ron);
        smith.compare(sedrik);
        smith.compare(harry);
        drako.compare(grehem);
        drako.compare(ron);
   }
}

