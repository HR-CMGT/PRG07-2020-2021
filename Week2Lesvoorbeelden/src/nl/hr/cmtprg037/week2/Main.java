package nl.hr.cmtprg037.week2;

public class Main {

    public static void main(String[] args) {
	    // interface
        HelloWorld h = new HelloWorld();
        RandomWord r = new RandomWord();

        Utils.printWord(r);

        // abstract class

        Dog d = new Dog();
        d.setWeight(10);
        d.showWeight();
        d.makeSound();
//        d.swim(); KAN NIET

        Fish f = new Fish();
        f.makeSound();
        f.walk();
        f.swim();

    }
}
