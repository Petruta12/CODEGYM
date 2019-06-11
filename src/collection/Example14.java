package collection;

import java.util.HashSet;
import java.util.Set;

public class Example14 {

    /*1. Inside the Solution class, create public static classes Cat and Dog.
2. Implement the createCats method, which should return a set with 4 cats.
3. Implement the createDogs method, which should return a set with 3 dogs.
4. Implement the join method, which should return a combined set of all the animals (all the cats and dogs).
5. Implement the removeCats method, which should remove from the set pets all cats in the set cats.
6. Implement the printPets method, which should display all the animals in the set pets.
Each animal should be on a new line.*/

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        result.add(new Cat("Garfield", "Tabby Cat"));
        result.add(new Cat("Heathcliff", "Alley Cat"));
        result.add(new Cat("Hobbs", "Tiger"));
        result.add(new Cat("Tigger", "Teddy Tiger"));

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<>();

        result.add(new Dog("Spike", "Bulldog"));
        result.add(new Dog("Killa", "Rotweiller"));
        result.add(new Dog("Spot", "Dalmation"));

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> catsAndDogs = new HashSet<>();

        catsAndDogs.addAll(cats);
        catsAndDogs.addAll(dogs);

        return catsAndDogs;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        for(Cat cat : cats) {
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object pet : pets){
            System.out.println(pet);
        }
    }

    //write your code here
    public static class Cat{
        private String name;
        private String breed;

        public Cat(){}

        public Cat(String name, String breed){
            this.name = name;
            this.breed = breed;
        }

        public String getName(){
            return name;
        }

        public String getBreed(){
            return breed;
        }

        //  public String toString(){
        //     return name + " is a " + breed;
        // }
    }

    public static class Dog{
        private String name;
        private String breed;

        public Dog(){}

        public Dog(String name, String breed){
            this.name = name;
            this.breed = breed;
        }

        public String getName(){
            return name;
        }

        public String getBreed(){
            return breed;
        }


    }
}

