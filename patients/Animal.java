package patients;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Owner;
import support.Vaccination;

public class Animal {

    protected Long id;
    
    protected String name;

    protected String breed;

    protected LocalDate birthDate;

    protected Owner owner;

    protected List<Vaccination> vaccinations = new ArrayList<>();


    // создаем конструктор, в котором определяем все аргументы
    public Animal(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.owner = owner;
    }


    // создаем конструктор, в котором предварительно заполняем аргументы
    public Animal () {
        this.id = -1L;
        this.name = "Barbos";
        this.breed = "street";
        this.birthDate = LocalDate.now();
        this.owner = new Owner(-2L, "Test");

    }


    //сеттер - который говорит, что поле которое мы передаем в метод, будет равно name экземпляра класса 
    public void setName(String name) {
        this.name = name;
    }


    //создаем геттер, который возвращает name
    public String getName() {
        return name;
    }

    //геттер, который просто возвращает строку которую передали в метод
    public String getName(String template) {
        return template;
    }

    //фактически это геттер, который возвращает name
    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    //фактически это сеттер, который записывает
    public void inject(Vaccination v) {
        this.vaccinations.add(v);
    }

    



    @Override
    public String toString() {
        return name + " " + breed;
    }
    

}
