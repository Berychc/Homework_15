package university.hogw;

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