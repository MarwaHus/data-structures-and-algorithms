package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import animalshelter.Animal;

class AnimalShelterTest {
    AnimalShelter animalShelter = new AnimalShelter();
    @Test
    void testEnqueue() {
        animalShelter.enqueue(new Animal("dog", "Rover"));
        assertEquals("Rover", animalShelter.dequeue("dog").getName());
    }
    @Test
    void testEnqueueMultiple() {
        animalShelter.enqueue(new Animal("dog", "Rover"));
        animalShelter.enqueue(new Animal("cat", "Fluffy"));
        animalShelter.enqueue(new Animal("dog", "Fido"));
        assertEquals("Rover", animalShelter.dequeue("dog").getName());
        assertEquals("Fluffy", animalShelter.dequeue("cat").getName());
        assertEquals("Fido", animalShelter.dequeue("dog").getName());
    }
    @Test
    void testDequeue() {
        animalShelter.enqueue(new Animal("dog", "Rover"));
        animalShelter.enqueue(new Animal("cat", "Fluffy"));
        assertEquals("Rover", animalShelter.dequeue("dog").getName());
        assertEquals("Fluffy", animalShelter.dequeue("cat").getName());
    }
    @Test
    void testDequeueInvalidPreference() {
        animalShelter.enqueue(new Animal("dog", "Rover"));
        animalShelter.enqueue(new Animal("cat", "Fluffy"));
        animalShelter.enqueue(new Animal("dog", "Fido"));
        assertEquals(null, animalShelter.dequeue("rabbit"));
    }
    @Test
    void testEnqueueAnimalOfInvalidSpecies() {
        animalShelter.enqueue(new Animal("penguin", "Tux"));
        assertEquals(null, animalShelter.dequeue("penguin"));
    }

    @Test
    void testEnqueueAndDequeueInDifferentOrders() {
        animalShelter.enqueue(new Animal("dog", "Rover"));
        animalShelter.enqueue(new Animal("cat", "Fluffy"));
        animalShelter.enqueue(new Animal("dog", "Fido"));
        assertEquals("Rover", animalShelter.dequeue("dog").getName());
        animalShelter.enqueue(new Animal("cat", "Mittens"));
        assertEquals("Fido", animalShelter.dequeue("dog").getName());
        assertEquals("Fluffy", animalShelter.dequeue("cat").getName());
        assertEquals("Mittens", animalShelter.dequeue("cat").getName());
        assertEquals(null, animalShelter.dequeue("dog"));
        assertEquals(null, animalShelter.dequeue("cat"));
    }
}