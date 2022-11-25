package university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals;

import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.Owner;

public class Cat extends Animal {

    protected int purLoudness;

    public Cat(String id, String nickname, Owner owner, int purLoudness) {
        super(id, nickname, owner);
        this.purLoudness = purLoudness;
    }
}
