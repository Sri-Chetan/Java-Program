// HumanSpeaker class implementing Speaker interface
class HumanSpeaker implements Speaker {
    private String name;

    public HumanSpeaker(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " is speaking like a human.");
    }


    public void announce(String str) {
        System.out.println(name + " announces: " + str);
    }
}

// RobotSpeaker class implementing Speaker interface
class RobotSpeaker implements Speaker {
    private String model;

    public RobotSpeaker(String model) {
        this.model = model;
    }

    public void speak() {
        System.out.println(model + " is speaking like a robot.");
    }

    public void announce(String str) {
        System.out.println(model + " announces: " + str);
    }
}

// AnimalSpeaker class implementing Speaker interface
class AnimalSpeaker implements Speaker {
    private String species;

    public AnimalSpeaker(String species) {
        this.species = species;
    }

    public void speak() {
        System.out.println(species + " is making animal sounds.");
    }

    public void announce(String str) {
        System.out.println(species + " announces: " + str);
    }
}

// Driver class to test the abilities of Speaker objects
public class Driver {
    public static void main(String[] args) {
        // Creating instances of the three Speaker classes
        HumanSpeaker human = new HumanSpeaker("John");
        RobotSpeaker robot = new RobotSpeaker("R2-D2");
        AnimalSpeaker animal = new AnimalSpeaker("Dog");

        // Testing the abilities of the Speaker objects
        human.speak();
        human.announce("I love programming!");

        robot.speak();
        robot.announce("Beep boop. I am a robot.");

        animal.speak();
        animal.announce("Woof! I'm excited.");

        // You can add more tests or create additional Speaker implementations as needed.
    }
}