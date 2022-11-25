package university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals;

import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.Owner;

import java.util.Objects;

public class Animal {

    protected String id;
    protected String nickname;
    protected Owner owner;

    public Animal(String id, String nickname, Owner owner) {
        this.id = id;
        this.nickname = nickname;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id.equals(animal.id) && nickname.equals(animal.nickname) && owner.equals(animal.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
