package university.innopolis.itp.lab13solutions.exercise3;

import university.innopolis.itp.lab13solutions.exercise3.clinic.VeterinaryClinic;
import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.Owner;
import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals.Animal;
import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals.Cat;
import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals.Rabbit;
import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals.Snake;

public class Solution {

    public static void main(String[] args) {
        Owner alice = new Owner("Alice", "", 22);
        Owner bob = new Owner("Bob", "", 20);
        Owner charlie = new Owner("Charlie", "", 24);

        Cat cat1 = new Cat("unique_cat_1", "Tom", alice, 10);
        Cat cat2 = new Cat("unique_cat_2", "Jerry", bob, 5);
        Cat cat3 = new Cat("unique_cat_3", "Garfield", charlie, 15);
        Animal[] cats = {cat1, cat2, cat3};

        Rabbit rabbit1 = new Rabbit("unique_rabbit_4", "Bugs", alice, 10);
        Rabbit rabbit2 = new Rabbit("unique_rabbit_5", "Daffy", bob, 5);
        Animal[] rabbits = {rabbit1, rabbit2};

        Snake snake1 = new Snake("unique_snake_6", "Kaa", alice, 10);
        Snake snake2 = new Snake("unique_snake_7", "Venom", bob, 5);
        Snake[] snakes = {snake1, snake2};

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPets(cats);
        clinic.displayPets();

        clinic.addPets(cats);
        clinic.displayPets();

        clinic.addPets(rabbits);
        clinic.addPets(snakes);
        clinic.displayPets();
    }

}
