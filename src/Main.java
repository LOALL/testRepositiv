public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко",130,1,3);
        vasyaBasket.add("Кефир",120,1,6);
        vasyaBasket.print("Задание №2: " + "\n" +  " Корзина пользователя: " + "\n" + "Васи");
        System.out.println();

        Basket katiaBasket = new Basket();
        katiaBasket.add("Вода", 120, 1, 2);
        katiaBasket.add("Квас", 130, 1, 4);
        katiaBasket.add("Сок", 140, 1,3);
        katiaBasket.print(" Корзина пользователя: " + "\n" + "Кати");
        System.out.println();

        System.out.println("Стоимость всех корзин: " + Basket.getCommonPrice());
        System.out.println("Количество всех товаров: " + Basket.getCommonCount());
        System.out.println("Средняя цена товаров во всех корзинах: " + Basket.getAveragePrice());

        System.out.println();

    }
}
