public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int month = 1 ;
        while ( total < 2_459_000  ) {
            month ++ ;
            total = total + salary;
            System.out.println("Месяц " + month + " - сумма накоплений равна " + total + " рублей");
        }


        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();



        System.out.println("Задача 3");

        int population = 12_000_000 ;
        int deathRate = 8 ;
        int birthRate = 17 ;
        for (int year = 1; year <= 10; year++) {
        float births = (float) birthRate / 1000;
        float deaths = (float) deathRate / 1000;
        population = (int) (population + (population * births) - (population*deaths)) ;
        System.out.println("Год " + year + ", численность населения составляет " + population);
    }

        System.out.println("Задача 4");

        int money = 15_000 ;
        int m = 0;
        while ( money <= 12_000_000  ) {
            money = money + money / 100 * 7;
            m++;

            System.out.println("Месяц " + m + " сумма накоплений равна " + money + " рублей");
        }

        System.out.println("Задача 5");

        int money1 = 15_000 ;
        int m1 = 0;
        while ( money1 <= 12_000_000  ) {
            money1 = money1 + money1 / 100 * 7;
            m1++;
            if (m1 % 6 == 0) {
                System.out.println("Месяц " + m1 + " сумма накоплений равна " + money1 + " рублей");
            }
        }


        System.out.println("Задача 6");

        int money2 = 15_000 ;
        for (int m2=0;m2<=108;m2++) {
        money2 = money2 + money2 / 100 * 7;
        if (m2 % 6 == 0) {
            System.out.println("Месяц " + m2 + " сумма накоплений равна " + money2 + " рублей");
        }
        }

        System.out.println("Задача 7");

        int friday = 6;
        int day = friday;
        while (day <= 31) {
        System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        day += 7;
    }

        System.out.println("Задача 8");

        int year= 2023;
        int yearBefore= year-200;
        int yearAfter=year+100;

        for ( year = yearBefore; year <= yearAfter; year++) {
            if (year % 79 ==0)
                System.out.println(year);
        }

    }
}