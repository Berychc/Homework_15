package university.hogw;

public class Hogwarts {
    private int magic;
    private int transgression;

    public Hogwarts(int magic, int transgression) {
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void description() {
        System.out.println("Свойства ученика: Магия - " + magic
                + ", Трансгрессия - " + transgression);
    }
}

class Gryffindor extends Hogwarts {
    private int bravery;
    private int honor;
    public Gryffindor(int magic, int transgression, int bravery, int honor) {
        super(magic, transgression);
        this.bravery = bravery;
        this.honor = honor;
    }

    public void compare(Gryffindor gryffindor) {
        int studentAmount1 = this.getMagic()
                + this.getTransgression()
                + this.bravery
                + this.honor;

        int studentAmount2 = gryffindor.getMagic()
                + gryffindor.getTransgression()
                + gryffindor.bravery
                + gryffindor.honor;

        if (studentAmount1 > studentAmount2) {
            System.out.println("Гарри превосходит Рона");
        } else if (studentAmount1 < studentAmount2) {
            System.out.println("Рон превосходит Гарри");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;

    public Hufflepuff(int magic, int transgression, int hardWork, int loyalty) {
        super(magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
    }

    public void compare(Hufflepuff hufflepuff) {
        int studentAmount1 = this.getMagic()
                + this.getTransgression()
                + this.hardWork
                + this.loyalty;

        int studentAmount2 = hufflepuff.getMagic()
                + hufflepuff.getTransgression()
                + hufflepuff.hardWork
                + hufflepuff.loyalty;

        if (studentAmount1 > studentAmount2) {
            System.out.println("Седрик превосходит Джастина");
        } else if (studentAmount1 < studentAmount2) {
            System.out.println("Джастин превосходит Седрика");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

class Ravenclaw extends Hogwarts {
    private int mind;
    private int wise;

    public Ravenclaw(int magic, int transgression, int mind, int wise) {
        super(magic, transgression);
        this.mind = mind;
        this.wise = wise;
    }

    public void compare (Ravenclaw ravenclaw) {
            int studentAmount1 = this.getMagic()
                    + this.getTransgression()
                    + this.mind
                    + this.wise;

            int studentAmount2 = ravenclaw.getMagic()
                    + ravenclaw.getTransgression()
                    + ravenclaw.mind
                    + ravenclaw.wise;

            if (studentAmount1 > studentAmount2) {
                System.out.println("Маркус превосходит Чжоуа");
            } else if (studentAmount1 < studentAmount2) {
                System.out.println("Чжоу превосходит Маркуса");
            } else {
                System.out.println("Ученики равны");
            }
    }
}

class Slytherin extends Hogwarts {
    private int cunning;
    private int ambition;

    public Slytherin(int magic, int transgression, int cunning, int ambition) {
        super(magic, transgression);
        this.cunning = cunning;
        this.ambition = ambition;
    }
    public void compare (Slytherin slytherin) {
        int studentAmount1 = this.getMagic()
                + this.getTransgression()
                + this.cunning
                + this.ambition;

        int studentAmount2 = slytherin.getMagic()
                + slytherin.getTransgression()
                + slytherin.cunning
                + slytherin.ambition;

        if (studentAmount1 > studentAmount2) {
            System.out.println("Драко превосходит Грегория");
        } else if (studentAmount1 < studentAmount2) {
            System.out.println("Грегори превосходит Драку");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
