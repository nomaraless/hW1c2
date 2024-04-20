public class Ravenclaw extends Hogwarts {
    private int mind;
    private int sapience;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String surName, int spellPower, int apparition, int mind, int sapience, int wit, int creation) {
        super(name, surName, spellPower, apparition);
        this.mind = mind;
        this.sapience = sapience;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getSapience() {
        return sapience;
    }

    public void setSapience(int sapience) {
        this.sapience = sapience;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    // сравнение по факультету
    public void compareRavenclaw(Ravenclaw first, Ravenclaw second) {
        int sumFirst = first.getCreation() + first.getMind() + first.getSapience() + first.getWit();
        int sumSecond = second.getCreation() + second.getMind() + second.getSapience() + second.getWit();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший Когтевранец чем " + second.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println(second.getName() + " лучший Когтевранец чем " + first.getName());
        } else {
            System.out.println("Они равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "mind=" + mind +
                ", sapience=" + sapience +
                ", wit=" + wit +
                ", creation=" + creation;
    }
}