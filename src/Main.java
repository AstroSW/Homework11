import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Задача 1
        System.out.println("Задача 1");
        int year = 2025;
        leapYear(year);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        selectApp(clientOS, clientDeviceYear);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.printf("Доставки нет");
        } else {
            System.out.println("Для доставки потребуется дней: "+ deliveryTime(deliveryDistance));
        }
    }

    public static void leapYear (int year) {
        double year4 = year % 4;
        double year100 = year % 100;
        double year400 = year % 400;
        if (year <= 1584) {
            System.out.println("Григорианский календарь был введён позже");
        } else if ((year4 == 0 && year100 != 0) || year400 == 0) {
            System.out.println(year + "  год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void selectApp (int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear != LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == LocalDate.now().getYear()) {
            System.out.println("Установите полную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear != LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
    }

    public static int deliveryTime (int distance) {
        int days = 1;
        if (distance <= 20) {
            return days;
        } else if (distance <= 60) {
            return days + 1;
        } else {
            return days + 2;
        }
    }
}