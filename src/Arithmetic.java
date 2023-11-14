public class Arithmetic {
    private static int multiplication = 0;
    private static int sum = 0;
    private static int numberOne = 0;
    private static int numberTwo = 0;
    private static int maxNumbers = 0;
    private static int minNumbers = 0;

    //Конструктор
    public Arithmetic(int numberOne, int numberTwo) {

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    public int sum() {
        return numberOne + numberTwo;
    }

    public int multiplication() {
        return numberOne * numberTwo;
    }
    public int isMaxNumbers() {

        if (numberOne > numberTwo) {
            return numberOne;
        }
        return numberTwo;
    }
    public int isMinNumbers() {
        if (numberOne < numberTwo) {
            return numberOne;
        }
        return numberTwo;
    }






    //Ввывод числа
    public void printy(String title) {
        System.out.println(title);
        System.out.println();
        System.out.println("Ваши введёные числа: " + numberOne + ";" + numberTwo + ":");

        System.out.println("Сумма чисел: " + sum());
        System.out.println("Произведение чисел: " + multiplication());

        if (isMaxNumbers() == isMinNumbers()) {
            System.out.println("Числа равны: " + isMaxNumbers() + " = " + isMinNumbers());
        } else {
            int maxNubers = isMaxNumbers();
            System.out.println("Наибольшее число: " + maxNubers);
            int minNumbers = isMinNumbers();
            System.out.println("Наименьшее число: " + minNumbers);
        }

    }
}
