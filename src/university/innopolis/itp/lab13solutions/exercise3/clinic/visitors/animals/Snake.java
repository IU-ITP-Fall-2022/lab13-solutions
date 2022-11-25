package university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals;

import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.Owner;

public class Snake extends Animal {

    protected int venomDanger;

    public Snake(String id, String nickname, Owner owner, int venomDanger) {
        super(id, nickname, owner);
        this.venomDanger = venomDanger;
    }
}
