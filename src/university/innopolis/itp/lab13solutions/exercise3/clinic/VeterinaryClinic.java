package university.innopolis.itp.lab13solutions.exercise3.clinic;

import university.innopolis.itp.lab13solutions.exercise3.clinic.visitors.animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class VeterinaryClinic {

    private Map<Integer, Animal> animals;

    public VeterinaryClinic() {
        this.animals = new HashMap<>();
    }

    public void addPets(Animal[] animals) {
        for (Animal animal : animals) {
            int animal_id = animal.hashCode();
            // Uncomment the following lines to enable unique animal IDs
//            if(this.animals.containsKey(animal_id)) {
//                throw new UniqueIdException("Animal with id " + animal_id + " already exists");
//            }
            this.animals.put(animal_id, animal);
        }
    }

    public void displayPets() {
        for (Animal animal : animals.values()) {
            System.out.println(animal);
        }
    }

}

class UniqueIdException extends Exception {

    public UniqueIdException(String message) {
        super(message);
    }
}