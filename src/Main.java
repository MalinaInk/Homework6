public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для Вашей ОС нет версии данного приложения");
        }
        //Задание 2
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //Задание 3
        int year = 2021;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Год не является високосным");
            }
            if (year % 400 ==0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год является високосным");
            }
        } else {
            System.out.println("Год не является високосным");
        }



        //Задание 4
        int deliveryDistance = 95;
        int daysCount = 1;
        if (deliveryDistance <=20){
            System.out.println("Потребуется дней: " + daysCount);
        }
        if (deliveryDistance >20 && deliveryDistance <=60){
            System.out.println("Потребуется дней: " + (daysCount+1));
        }
        if (deliveryDistance >60 && deliveryDistance <=100){
            System.out.println("Потребуется дней: " + (daysCount+2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года - ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - ВЕСНА!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - ЛЕТО!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - ОСЕНЬ");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
