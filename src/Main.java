import java.time.LocalDate;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();

    public static void main(String[] args) {
        printYear(2012); // вводим год для проверки
        printVersionOS(2022, 1); // вводим операционную систему
        printCalculateTimeDelivery(19); // дистанция для доставки
        printCalculateTimeDelivery(2554); // дистанция для доставки
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4) == 0) && !((year % 100) == 0)); // считаем високосный год
    }
    public static void printYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " Этот год високосный ");
        } else {
            System.out.println(year + " Этот год не високосный ");
        }
    }
    public static boolean isNowYear(int year) {
        return year == CURRENTYEAR;
    }

    public static String getVersionOS(int versionOS) { // узнаем операционную систему
        if (versionOS == 0) {
            return "iOS";
        }
        return "Android";
    }

    public static void printVersionOS(int year, int versionOS) {
        if (isNowYear(year)) {
            System.out.println("Установите полную версию " + getVersionOS(versionOS));
        } else {
            System.out.println("Установите облегченную версию " + getVersionOS(versionOS));
        }
    }

    public static void printCalculateTimeDelivery(int distanse) {  // считаем доставку карты
        if (distanse > 0 && distanse < 3000) {
            System.out.println("Время доставки = " + ((distanse - 20) / 40 + 1));
            return;
        }
        System.out.println("Доставка не осуществляется");
    }
}



















