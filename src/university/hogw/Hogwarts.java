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

