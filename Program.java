
public class Program {

    public static void main(String[] args) {

        System.out.println("Создаем 2 коробки с яблоками. В одну кладем 5 яблок, в другую 50 яблок");
        Box<Apple> AppleBox1 = new Box<>();
        Box<Apple> AppleBox2 = new Box<>();
        for (int i = 0; i < 5; i++) {
            AppleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < 50; i++) {
            AppleBox2.addFruit(new Apple());
        }
        System.out.println(AppleBox1);
        System.out.println(AppleBox2);
        System.out.printf("Сравниваем коробки. Они равны? Ответ: %s", (AppleBox1.compare(AppleBox2)) ? "Да" : "Нет");

        System.out.println("\n");

        System.out.println("Пересыпаем яблоки из второй коробки в первую");
        AppleBox2.moveFruitsToOtherBox(AppleBox1);
        System.out.println(AppleBox1);
        System.out.println(AppleBox2);
        System.out.printf("Сравниваем коробки. Они равны? Ответ: %s", (AppleBox1.compare(AppleBox2)) ? "Да" : "Нет");

        System.out.println("\n");

        System.out.println("Добавляем во вторую коробку 55 яблок");

        for (int i = 0; i < 55; i++) {
            AppleBox2.addFruit(new Apple());
        }
        System.out.println(AppleBox1);
        System.out.println(AppleBox2);
        System.out.printf("Сравниваем коробки. Они равны? Ответ: %s", (AppleBox1.compare(AppleBox2)) ? "Да" : "Нет");

        System.out.println("\n");

        System.out.println("Создаем 1 коробку с апельсинами и кладем в нее 20 апельсинов");

        Box<Orange> OrangeBox = new Box<>();
        for (int i = 0; i < 20; i++) {
            OrangeBox.addFruit(new Orange());
        }
        System.out.println(OrangeBox);

        System.out.printf(
                "Сравниваем (по весу конечно) коробку с апельсинами и коробку с Яблоками. Они равны? Ответ: %s",
                (AppleBox1.compare(OrangeBox)) ? "Да" : "Нет");

        System.out.println("\n");

        System.out.println("Добавляем в коробку с яблоками 5 яблок, а в коробку с апельсинами 20 апельсинов");
        for (int i = 0; i < 5; i++) {
            AppleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < 20; i++) {
            OrangeBox.addFruit(new Orange());
        }
        System.out.println(AppleBox1);
        System.out.println(OrangeBox);

        System.out.printf(
                "Сравниваем (по весу конечно) коробку с апельсинами и коробку с Яблоками. Они равны? Ответ: %s",
                (AppleBox1.compare(OrangeBox)) ? "Да" : "Нет");
    }

}
