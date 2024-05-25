package patients.impl;

import patients.Animal;
import java.time.LocalDate;
import clients.Owner;

public class Cat extends Animal {

    //из общей массы Animal, Cat отличается передачей этого параметра (высота)
    public float height;

    //пустой конструкор
    public Cat(float height) {
        super();
        this.height = height;
    }

    //конструктор с заполением данных
    public Cat(Long id, String name, String breed, LocalDate birthDate, Owner owner, float height) {
        super(id, name, breed, birthDate, owner);
        this.height = height;
    }

    //тестовый метод на переопределение name
    public void foo() {
        this.name = "foo_name";
    }

}
