package QST.day8;

//抽象类表示的是对象符合的一种规则，而不是具体的对象。
//抽象类不能实例化，只能被继承，不能创建对象。
//抽象类中可以包含抽象方法和具体方法。
//抽象类中可以包含属性。
//抽象类中可以包含构造方法。
//抽象类中可以包含静态方法。
//抽象类中可以包含私有方法。
//抽象类中可以包含内部类。
//抽象类中可以包含接口。
//抽象类中可以包含嵌套类。
//抽象类中可以包含枚举。
//抽象类中可以包含注解。

public class abstraction extends  Animal{

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();
    }
    @Override
    public void eat() {
        System.out.println("animal eat");
    }
     public static class Dog extends Animal {
        public void eat() {
            System.out.println("Dog is eating");
        }
    }
     public static class Cat extends Animal {
        public void eat() {
            System.out.println("Cat is eating");
        }
    }

}

