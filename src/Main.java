public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int total = 0;
        int accumulation = 15_000;
        int term = 0;
        while (total < 2_459_000) {
            term++;
            total += accumulation;
            System.out.println("Месяц " + term + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int populationY = 12_000_000;
        double fertility = 1.017;
        double mortality = 0.992;
        double finalChanges = fertility - (1 - mortality);
        for (int i = 1; i < 11; i++) {
            populationY *= finalChanges;
            //populationY = populationY + ((populationY / 1000) * (17 - 8));
            System.out.println("Год " + i + ", численность населения составляет " + populationY);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int total = 15_000;
        double percent = 1.07;
        for (int i = 1; total < 12_000_000; i++) {
            //total = total + ((total / 100) * 7);
            total *= percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int total = 15_000;
        double percent = 1.07;
        for (int i = 1; total < 12_000_000; i++) {
            //total = total + ((total / 100) * 7);
            total *= percent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            } else if (total >= 12_000_000) {
                System.out.println("Месяц " + i + ", ИТОГОВАЯ сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int total = 15_000;
        double percent = 1.07;
        //второй способ
        //int term = 0;
        //while (term <= 108){
        //    term++;
        //    total *= percent;
        //    if (term % 6 == 0) {
        //        System.out.println("Месяц " + term + ", сумма накоплений равна " + total + " рублей");
        //    }
        //}
        for (int i = 1; i <= 108; i++) {
            total *= percent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int firstFridayOfMonth = 3;
        int fridayOfMonth = firstFridayOfMonth;
        while (fridayOfMonth < 32) {
            System.out.println("Сегодня пятница, " + fridayOfMonth + "-е число. Необходимо подготовить отчет");
            fridayOfMonth += 7;
        }
        //второй способ
        //for (int i = firstFridayOfMonth; i < 32; i += 7) {
        //    fridayOfMonth = i;
        //    System.out.println("Сегодня пятница, " + fridayOfMonth + "-е число. Необходимо подготовить отчет");
        //}
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int lowerTimeLimit = 1823;
        int upperTimeLimit = 2123;
        for (int i = lowerTimeLimit; i <= upperTimeLimit; i++) {
            if (i % 79 ==0) {
                System.out.println(i);
            }
        }
    }
}