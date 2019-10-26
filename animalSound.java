class Animal {
    public void animalSound(){
        System.out.println("The animal make sound");
    }
}
class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pigs says : week week");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says : woof woof");
    }
}
class MyMainClass{
    public static void main(String[]args){
        Animal myAnimal=new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
