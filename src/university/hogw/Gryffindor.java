package university.hogw;

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
