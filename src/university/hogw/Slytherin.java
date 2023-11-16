package university.hogw;

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
