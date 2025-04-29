import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Задача 1
        System.out.println("Задача 1");
        int year = 2025;
        if (year < 1584) {
            System.out.println("Григорианский календарь был введён позже");
        } else {
            checkLeapYear(year);
        }

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        findDeviceApp(clientOS, clientDeviceYear);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 3) {
            System.out.printf("Доставки нет");
        } else {
            System.out.println("Для доставки потребуется дней: "+ days);
        }
    }

    public static void checkLeapYear (int year) {
        double year4 = year % 4;
        double year100 = year % 100;
        double year400 = year % 400;
        if ((year4 == 0 && year100 != 0) || year400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void findDeviceApp (int clientOS, int clientDeviceYear) {
        int year = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear != year) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == year) {
            System.out.println("Установите полную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear != year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays (int distance) {
        int days = 1;
        if (distance <= 20) {
            return days;
        } else if (distance <= 60) {
            return days + 1;
        } else if (distance <= 100) {
            return days + 2;
        } else {
            return days + 3;
        }
    }
}