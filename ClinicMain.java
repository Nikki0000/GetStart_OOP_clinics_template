import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Owner;
import patients.Animal;
import patients.impl.Cat;
import patients.impl.Dog;
import support.Vaccination;;


public class ClinicMain {
    public static void main(String[] args) {

        //Owner boris = new Owner(1L, "Boris");// Экземпляр класса Owner - представитель шаблона Owner

        //обрааемся к конктруктору у которого нет аргуметров, но внутри конструктора, они предопределены
        Animal barbos = new Animal();
        
        Animal tom = new Animal(
            1L,
            "Tom",
            "siam",
            LocalDate.of(2023, 9, 12),
            new Owner(2L, "Elena")
        );// Экземпляр класса Animal - конкретный представитель шаблона

        //используем getName из класса, который возвращает name экземпляра класса
        System.out.println(tom.getName());//Tom

        //используем getName из класса, который возвращает name экземпляра класса
        System.out.println(barbos.getName());//Barbos

        //используем getName из класса, который возвращает переданную строку
        System.out.println(barbos.getName("Jerry"));//Jerry

        //вызываем сеттер, в котором переопределяем name, на значение которое передаем в метод
        tom.setName("Tom_name");
        //вызываем геттер, которые вернет новое значение
        System.out.println(tom.getName());


        //Создаем экземпляр класса Cat
        Cat murka = new Cat(1L, "murka", "cheshir", LocalDate.now(), new Owner(3L, "Nikita"), 13);
        //выводим name через метод getName который наследуется от Animal
        System.out.println(murka.getName());
        //вызываем метод переопределения name
        //murka.foo();
        //выводим еще раз переопределенный name через метод getName который наследуется от Animal
        //System.out.println(murka.getName());

        //Мы можем обрабиться к классу Cat, но внутри класса, он будет наследоваться он Animal, и из за super
        //возьмет конструкор из Animal, и определит его как Cat
        Cat testkot = new Cat(13);
        System.out.println(testkot.getName());

        // Создаем экзепляр класса Dog
        Dog taksa = new Dog();

        //Создаем list, где будут храниться все животные
        //экзепляры класса Animal
        List<Animal> patients = new ArrayList<>(List.of(barbos, tom, murka, testkot, taksa));
        System.out.println(patients);


        //Выводим прививки
        System.out.println(barbos.getVaccinations());
        //вызываем метод inject, который добавляет в list значение которое мы передаем в аругемнтах
        barbos.inject(new Vaccination("прививка 1"));
        System.out.println(barbos.getVaccinations());
        barbos.inject(new Vaccination("прививка 2"));
        System.out.println(barbos.getVaccinations());

        //Создаем экеземпляр класса Vaccination, перелаем ему name
        Vaccination v = new Vaccination("прививка 3");
        //присваиваем переменной name экземпляра класса
        String s = v.name;

        System.out.println(s);

        //Вызываем метод inject, в который передаем значение нового экземпляра класса
        barbos.inject(v);
        System.out.println(barbos.getVaccinations());
    }
}
