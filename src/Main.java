public class Main {

    public static void main(String[] args) {
        // Задание №2
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко",45,4,3);
        vasyaBasket.add("Кефир",30,6,6);
        vasyaBasket.print("Задание №2: " + "\n" +  " Корзина пользователя: " + "\n" + "Васи");
        System.out.println();

        Basket katiaBasket = new Basket();
        katiaBasket.add("Вода", 49, 3, 2);
        katiaBasket.add("Квас", 104, 3, 4);
        katiaBasket.print(" Корзина пользователя: " + "\n" + "Кати");
        System.out.println();

        // Задание №1
        Arithmetic numberOneArithmetic = new Arithmetic(10,90);
        numberOneArithmetic.printy("Задание №1: " + "\n" + " Получившиеся результат: ");

    }
}
