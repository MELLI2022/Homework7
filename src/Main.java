public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int contribution = 29000;
        int total = 1;
        int i = 1;
        while (total <= 2459000) {
            total = total + contribution;
            total = total + (total * 1 / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }

        System.out.println("Задание 1.2");
        int u = 1;
        while (u <= 10) {
            System.out.print(u + " ");
            u++;
        }

        System.out.println();

        for (u = 10; u >= 1; u--) {
            System.out.print(u + " ");
        }

        System.out.println();

        System.out.println("Задание 1.3");

        int totalPopulation = 12000000;
        int birthRate = totalPopulation / 1000 * 17;
        int mortality = totalPopulation / 1000 * 8;
        for (i = 1; i <= 10; i++) {
            total = total + birthRate;
            total = total - mortality;
            total = total + totalPopulation;
            System.out.println("Год " + i + ", численность населения составляет " + total);
        }
        System.out.println("Задание 2");

        int cash = 15000;
        int amountSavings = cash * 7 / 100;
        int r = 1;
        {
            System.out.println("Сумма накоплений равна " + amountSavings);
        }

        System.out.println("Задание 2.1");
        while (cash <= 12000000) {
            cash = cash + amountSavings;
            System.out.println("Месяц " + r + ", накопления состовляют " + cash);r++;}

            System.out.println("Задание 2.2");
            while (cash  <= 12000000) {
                cash  = cash  + amountSavings;
            int e = 6;
                e+= 6;
            System.out.println("Месяц " + e + ", накопления составляют " + cash );}

            System.out.println("Задание 2.3 ");
         cash  = cash  + amountSavings;
        for (int e = 6;cash  <= 12000000 && e <= 9;e+= 6) {
            System.out.println("Месяц " + e + ", накопления составляют " + cash );}

        System.out.println("Задание 2.4 ");
        {
            for (int c = 5; c <= 31; c+= 7)
                System.out.println("Сегодня пятница,"+c+"-е число. Необходимо подготовить отчет." );
        }
        System.out.println("Задание 3.1");
        System.out.println("Траектория движения кометы:");
        {
            {for (int a = 0; a <= 2022; a+=79)
                System.out.println("Год движения кометы равен " +a);}

            {for (int s = 1817;s <= 2122;s+=79)
            System.out.println("Год движения кометы равен " +s);}


        }
        System.out.println("Задание 3.2");

            for (int w = 1; w <= 10; w++) {
                System.out.println("2*" + w + "=" + 2 * w);

            }
        }

    }

