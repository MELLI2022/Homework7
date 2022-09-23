public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int contribution = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2459000){
            total = total + contribution/100;
            total = total + contribution;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println("Задание 1.2");
        int u = 1;
        while (u <= 10) {
            System.out.print(u + " "); u++;
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
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + birthRate - mortality;// прирост
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }
        System.out.println("Задание 2.1");
        int cash = 15000;
        int month2 = 1;
        while (cash <= 12000000) {
            cash = cash + (cash * 7) / 100;
            System.out.println("Месяц " + month2 + ", накопления состовляют " + cash + " рублей");month2++;
        }
        System.out.println("Задание 2.2");
        int earning = 15000;//заработок
        int month1 = 6;
        while (earning <= 12000000){
            earning = earning + (earning* 7) / 100;
            earning = earning + (earning* 7) / 100;
            earning = earning + (earning* 7) / 100;
            earning = earning + (earning* 7) / 100;
            earning = earning + (earning* 7) / 100;
            earning = earning + (earning* 7) / 100;
            System.out.println("Месяц " + month1 + ", накопления состовляют " + earning);month1 += 6;
        }
        System.out.println("Задание 2.3 ");
        int earnings1 = 15000;//заработок
        int month3 = 6;
        while (month3 <= 108) {
        earnings1 = earnings1 + (earnings1* 7) / 100;
        earnings1 = earnings1 + (earnings1* 7) / 100;
        earnings1 = earnings1 + (earnings1* 7) / 100;
        earnings1 = earnings1 + (earnings1* 7) / 100;
        earnings1 = earnings1 + (earnings1* 7) / 100;
        earnings1 = earnings1 + (earnings1* 7) / 100;
            System.out.println("Месяц " + month3+ ", накопления состовляют " + earnings1);month3 += 6;
        }
        System.out.println("Задание 2.4 ");
        for (int c = 5; c <= 31; c += 7) {
            System.out.println("Сегодня пятница," + c + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задание 3.1");
        System.out.println("Траектория движения кометы:");
        for (int a = 0; a < 2122; a = a + 79) {
             if (a > 2022-200)
            System.out.println("Год движения кометы равен " + a);
        }

        System.out.println("Задание 3.2");
        for (int w = 1; w <= 10; w++) {
            System.out.println("2*" + w + "=" + 2 * w);
        }

    }
}

