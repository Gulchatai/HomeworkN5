public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1. Способ 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            //} else if (clientOS == 0) {
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задача 1. Способ 2");
        int clientOS2 = '1';
        switch (clientOS2) {
            case '0':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case '1':
                System.out.println("становите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Вам ничего не светит установить");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 200;
        switch (clientOS) {
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите обычное приложение");
                }
                break;
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите обычное приложение");
                }
                break;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 300;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) && (year != 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год  не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 75;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 20;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца в году не существует");
                }
        }
    }
