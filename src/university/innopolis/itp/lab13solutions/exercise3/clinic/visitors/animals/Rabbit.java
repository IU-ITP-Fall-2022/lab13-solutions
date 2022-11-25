package university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals;

import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.Owner;

public class Rabbit extends Animal {

    protected int earLength;

    public Rabbit(String id, String nickname, Owner owner, int earLength) {
        super(id, nickname, owner);
        this.earLength = earLength;
    }
}
