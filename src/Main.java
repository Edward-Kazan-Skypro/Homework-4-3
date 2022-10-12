public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Решение задачи 1");
        int total = 0;
        int cash = 29000;
        for (int i = 1; i <=12; i++) {
            total = total + cash;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();

        //Задание 2
        System.out.println("Решение задачи 2");
        total = 0;
        cash = 29000;
              
        for (int i = 1; i <=12; i++) {
            total = total + total/100;
            total = total + cash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}