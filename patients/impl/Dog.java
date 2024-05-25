package patients.impl;

import patients.Animal;
import java.time.LocalDate;
import clients.Owner;

public class Dog extends Animal {
    
    public Dog() {
        super();
    }

    public Dog(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        super(id, name, breed, birthDate, owner);
    }
}
