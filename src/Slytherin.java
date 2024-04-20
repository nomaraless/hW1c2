public class Slytherin extends Hogwarts {
    private int trick;
    private int decisively;
    private int ambition;
    private int ingenuity;
    private int needForAuthority;

    public Slytherin(String name, String surName, int spellPower, int apparition, int trick, int decisively, int ambition, int ingenuity, int needForAuthority) {
        super(name, surName, spellPower, apparition);
        this.trick = trick;
        this.decisively = decisively;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.needForAuthority = needForAuthority;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDecisively() {
        return decisively;
    }

    public void setDecisively(int decisively) {
        this.decisively = decisively;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getNeedForAuthority() {
        return needForAuthority;
    }

    public void setNeedForAuthority(int needForAuthority) {
        this.needForAuthority = needForAuthority;
    }

    // сравнение по факультету
    public void compareSlytherin(Slytherin first, Slytherin second) {
        int sumFirst = first.getAmbition() + first.getNeedForAuthority() + first.getIngenuity() + first.getTrick() + first.getDecisively();
        int sumSecond = second.getAmbition() + second.getNeedForAuthority() + second.getIngenuity() + second.getTrick() + second.getDecisively();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший Слизеринец чем " + second.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println(second.getName() + " лучший Слизеринец чем " + first.getName());
        } else {
            System.out.println("Они равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "trick=" + trick +
                ", decisively=" + decisively +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", needForAuthority=" + needForAuthority;
    }
}