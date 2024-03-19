
public class Program {

    public static void main(String[] args) {

        Box<Apple> AppleBox1 = new Box<>();
        Box<Apple> AppleBox2 = new Box<>();

        Apple apple = new Apple();

        AppleBox1.addFruit(apple);
        AppleBox2.addFruit(apple);

        System.out.println(AppleBox1);
        System.out.println(AppleBox2);

    }

}
