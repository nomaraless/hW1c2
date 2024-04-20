public class Hogwarts {
    protected String name;
    protected String surName;
    protected int spellPower;
    protected int apparition;

    public Hogwarts(String name, String surName, int spellPower, int apparition) {
        this.name = name;
        this.surName = surName;
        this.spellPower = spellPower;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", spellPower=" + spellPower +
                ", apparition=" + apparition;
    }

    // сравнение по факультету
    public void compareHogwarts(Hogwarts first, Hogwarts second) {
        int sumFirst = first.getApparition() + first.getSpellPower();
        int sumSecond = second.getApparition() + second.getSpellPower();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " обладает бОльшей мощностью магии, чем " + second.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println(second.getName() + " обладает бОльшей мощностью магии, чем " + first.getName());
        } else {
            System.out.println("Они равны");
        }
    }
}