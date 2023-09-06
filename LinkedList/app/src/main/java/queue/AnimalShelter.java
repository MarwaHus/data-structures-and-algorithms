package queue;

import java.util.LinkedList;
import java.util.Queue;

import animalshelter.Animal;

public class AnimalShelter {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;

    public AnimalShelter() {
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal.getSpecies().equals("dog")) {
            dogs.add(animal);
        } else if (animal.getSpecies().equals("cat")) {
            cats.add(animal);
        }
    }

    public Animal dequeue(String pref) {
        if (!pref.equals("dog") && !pref.equals("cat")) {
            return null;
        }
        if (pref.equals("dog") && !dogs.isEmpty()) {
            return dogs.poll();
        } else if (pref.equals("cat") && !cats.isEmpty()) {
            return cats.poll();
        } else if (!dogs.isEmpty()) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }



}