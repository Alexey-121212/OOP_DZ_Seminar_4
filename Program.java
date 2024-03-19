
public class Program {

    public static void main(String[] args) {

        Box<Apple> AppleBox1 = new Box<>();
        Box<Apple> AppleBox2 = new Box<>();
        AppleBox1.addFruit(new Apple());
        AppleBox2.addFruit(new Apple());

        System.out.println(AppleBox1);
        System.out.println(AppleBox2);

    }

}
