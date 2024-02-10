package HomeWork;

/**
 * В начале работы был создан класс Product, в котором содержатся такие значения, как:
 * 1) кол-во товара
 * 2) цена товара
 * 3) скидка товара
 */
public class ProductInfo {

    private final int QUANTITY; // кол-во товара

    private final double PRICE; // цена товара

    private final double DISCOUNT; // скидка товара

    // констурктор в котором мы указываем характеристики объекта, без которых создание невозможно
    public ProductInfo(int QUANTITY, double PRICE, double DISCOUNT) {
        this.QUANTITY = QUANTITY;
        this.PRICE = PRICE;
        this.DISCOUNT = DISCOUNT;
    }

    @Override
    public String toString() {
        return "Количество товара: " + QUANTITY + ", " +
                "Цена товара: " + PRICE + ", " +
                "Скидка товара: " + DISCOUNT;
    }

    // метод, который считает общую сумму товара со скидкой и без
    public void calculateAmount() {
        double amountWithDiscount;
        double amountWithoutDiscount;

        amountWithoutDiscount = roundToNDecimals((QUANTITY * PRICE), 2);
        System.out.println("Получившаяся сумма без скидки: " + amountWithoutDiscount);

        if (DISCOUNT == 0) {
            System.out.println("Дарагой, скидка нету");

        } else if (DISCOUNT > 0) {
            double convertedDiscount = convertDiscountToCoef(DISCOUNT);
            amountWithDiscount = roundToNDecimals(QUANTITY * PRICE * convertedDiscount, 2);
            System.out.println("Получившаяся сумма со скидкой: " + amountWithDiscount);

        } else {
            System.out.println("Некорректные данные");
        }
    }

    /**
     * Округляет до n знака после запятой
     */
    private static double roundToNDecimals(double number, int n) {
        double factor = Math.pow(10, n);

        return Math.round(number * factor) / factor;
    }

    /**
     * Конвертирует скидку
     * Пример: 15% -> 0.85
     */
    private static double convertDiscountToCoef(double discount) {
        return 100 - (discount / 100);
    }
}