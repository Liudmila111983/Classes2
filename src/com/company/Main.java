package com.company;

import com.company.animals.Animal;
import com.company.animals.Dog;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal tom = new Cat();
        //tom.sound();
        Animal rex = new Dog();
        //rex.sound();

        //Создаем коллекцию
        List<Animal> animals = new LinkedList<>();
        animals.add(tom);
        animals.add(rex);
        animals.add(rex);


        // Полиморфизм - изменчивость поведения объектов, унаследованных от одного
        // родителя (Теперь просим каждого по очереди издать звук)
        for (Animal animal: animals)
            animal.sound();


    }
}
