package Polymorphism;

public  class Dog extends Animals {


    @Override
    public void speak() {
        age = 4;
        System.out.println(age);
        System.out.println("bark");
    }
}
