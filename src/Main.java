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

    private static void task8() {

        System.out.println("Задача 8");

        int mashaOldSalary = 67760;
        int denisOldSalary = 83690;
        int krestinaOldSalary = 76230;
        float premiumCoefficient = 0.1f;

        float mashaNewSalary = (mashaOldSalary * premiumCoefficient) + mashaOldSalary;
        float mashaDifference = mashaNewSalary - mashaOldSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");

        float denisNewSalary = (denisOldSalary * premiumCoefficient) + denisOldSalary;
        float denisDifference = denisNewSalary - denisOldSalary;
        System.out.println("Маша теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");

        float krestinaNewSalary = (krestinaOldSalary * premiumCoefficient) + krestinaOldSalary;
        float krestinaDifference = krestinaNewSalary - krestinaOldSalary;
        System.out.println("Маша теперь получает " + krestinaNewSalary + " рублей. Годовой доход вырос на " + krestinaDifference + " рублей");

    }

    private static void task7() {

        System.out.println("Задача 7");

        int targetWeightLoss = 7000;
        int weightLossRateOne = 250;
        int weightLossRateTwo = 500;

        int weightLossDaysOne = targetWeightLoss / weightLossRateOne;
        int weightLossDaysTwo = targetWeightLoss / weightLossRateTwo;
        int averageRateWeightLoss = (weightLossDaysOne + weightLossDaysTwo) / 2;

        System.out.println( weightLossDaysOne + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(weightLossDaysTwo + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(averageRateWeightLoss + " день потребуется в среднем, чтобы добиться результата похудения.");

    }

    private static void task6() {

        System.out.println("Задача 6");

        int sumWeightBananas = 5 * 80;
        int sumWeightMilk = 2 * 105;
        int sumWeightCream = 2 * 100;
        int sumWeightEggs = 4 * 70;
        float oneKilogram = 1000f;

        int totalBreakfastWeightGram = sumWeightBananas + sumWeightMilk + sumWeightCream + sumWeightEggs;
        float totalBreakfastWeightKilogram = totalBreakfastWeightGram / oneKilogram;

        System.out.println("Вес в граммах " +totalBreakfastWeightGram);
        System.out.println("Вес в килограммах " + totalBreakfastWeightKilogram);
    }

    private static void task5() {

        System.out.println("Задача 5");

        int needPaint = 120;
        int whiteConsumptionPaint = 2;
        int brownConsumptionPaint = 4;

        int totalNumberClasses = needPaint/(whiteConsumptionPaint + brownConsumptionPaint);

        int whitePaintTotal = whiteConsumptionPaint * totalNumberClasses;
        int brownPaintTotal = brownConsumptionPaint * totalNumberClasses;

        System.out.println("В школе, где " + totalNumberClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

    }

    private static void task4() {

        System.out.println("Задача 4");

        int bottles = 16;
        int laborProductivity = bottles * 30;

        int thirdHour = laborProductivity / 3;
        System.out.println("За 20 минут машина произвела " + thirdHour + " бутылок");

        int day = laborProductivity * 24;
        System.out.println("За 1 день машина произвела " + day + " бутылок");

        int threeDays = laborProductivity * 24 * 3;
        System.out.println("За 3 дня машина произвела " + threeDays + " бутылок");

        int oneMonth = laborProductivity * 24 * 30;
        System.out.println("За 1 месяц машина произвела " + oneMonth + " бутылок");

    }

    private static void task3() {

        System.out.println("Задача 3");

        short ludaP = 23;
        short annaS = 27;
        short katyaA = 30;
        int allSheetsPaper = 480;

        int allStudents = ludaP+annaS+katyaA;
        int x = allSheetsPaper/allStudents;

        System.out.println("На каждого ученика рассчитано " + x +" листов бумаги");

    }

    private static void task2() {

        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

    }

    private static void task1() {

        byte white = 100;
        short black = 32700;
        int red = 2145000;
        long yellow = 9788798787564839L;
        float orange = 1.1234f;
        double green = 2.345786859;

        System.out.println("Задача 1");
        System.out.println("Значение переменной white с типом byte равно " + white );
        System.out.println("Значение переменной black с типом short равно " + black );
        System.out.println("Значение переменной red с типом int равно " + red);
        System.out.println("Значение переменной yellow с типом long  равно " + yellow);
        System.out.println("Значение переменной orange с типом float равно " + orange);
        System.out.println("Значение переменной green с типом double равно " + green );
    }
}