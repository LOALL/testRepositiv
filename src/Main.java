public class Main {

    public static void main(String[] args) {
        // Задание №1
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко",45,10.9);
        vasyaBasket.add("Кефир",30,100);
        vasyaBasket.print("Задание №1: " + "\n" +  " Корзина пользователя: " + "\n" + "Васи");
        System.out.println();

        Basket katiaBasket = new Basket();
        katiaBasket.add("Вода", 49,10);
        katiaBasket.add("Квас", 104, 8);
        katiaBasket.print(" Корзина пользователя: " + "\n" + "Кати");
        System.out.println();

        // Задание №2
        Arithmetic numberOneArithmetic = new Arithmetic(10,90);
        numberOneArithmetic.printy("Задание №2: " + "\n" + " Получившиеся результат: ");

    }
}
