package university.hogw;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor(90, 20, 95, 85);
        Gryffindor ron = new Gryffindor(85, 15, 90, 80);
        harry.description();
        ron.description();
        harry.compare(ron);

        System.out.println();

        Hufflepuff Cedric = new Hufflepuff(70, 30, 89, 72);
        Hufflepuff Justin = new Hufflepuff(69, 35, 86, 89);
        Cedric.description();
        Justin.description();
        Cedric.compare(Justin);

        System.out.println();

        Ravenclaw Markus = new Ravenclaw(60, 25, 70, 55);
        Ravenclaw Zhou = new Ravenclaw(55, 30, 66, 80);
        Markus.description();
        Zhou.description();
        Markus.compare(Zhou);

        System.out.println();

        Slytherin Draco = new Slytherin(90, 40, 60, 80);
        Slytherin Gregory = new Slytherin(80, 15, 36, 58);
        Draco.description();
        Gregory.description();
        Draco.compare(Gregory);
    }
}