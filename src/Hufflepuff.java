public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, String surName, int spellPower, int apparition, int hardWork, int loyalty, int honest) {
        super(name, surName, spellPower, apparition);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    // сравнение по факультету
    public void compareHufflepuff(Hufflepuff first, Hufflepuff second) {
        int sumFirst = first.getHonest() + first.getHardWork() + first.getLoyalty();
        int sumSecond = second.getHonest() + second.getHardWork() + second.getLoyalty();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший Пуффендуец чем " + second.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println(second.getName() + " лучший Пуффендуец чем " + first.getName());
        } else {
            System.out.println("Они равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honest=" + honest;
    }
}