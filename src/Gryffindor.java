public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int brave;

    public Gryffindor(String name, String surName, int spellPower, int apparition, int nobility, int honor, int brave) {
        super(name, surName, spellPower, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void compare(Object object) {

    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", brave=" + brave;
    }

    // сравнение по факультету
    public void compareGryffindor(Gryffindor first, Gryffindor second) {
        int sumFirst = first.getBrave() + first.getHonor() + first.getNobility();
        int sumSecond = second.getBrave() + second.getNobility() + second.getHonor();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший Гриффиндорец чем " + second.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println(second.getName() + " лучший Гриффиндорец чем " + first.getName());
        } else {
            System.out.println("Они равны");
        }
    }
}