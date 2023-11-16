package university.hogw;
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
