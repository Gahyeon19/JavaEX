package interface_;

public class InterfaceDemo4 {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cuckcoo = new Cuckoo();

    makeSound(dog);
    makeSound(cuckcoo);
  }

  public static void makeSound(Animal animal){
    animal.sound();
  }
}
