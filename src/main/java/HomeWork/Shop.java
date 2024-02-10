package HomeWork;

public class Shop {
    public static void main(String[] args) {
        ProductInfo productInfo1 = new ProductInfo(20, 50.4534, 0.75); // создание нового объекта пол название product1
        ProductInfo productInfo2 = new ProductInfo(40, 640.44235, 42.575); // создание нового объекта пол название product2
        ProductInfo productInfo3 = new ProductInfo(60, 10.12, 59.1); // создание нового объекта пол название product3

        System.out.println(productInfo1);
        productInfo1.calculateAmount(); // вызов метода, который считает общую сумму со скидкой и без у объекта product1

        System.out.println();

        System.out.println(productInfo2);
        productInfo2.calculateAmount(); // вызов метода, который считает общую сумму со скидкой и без у объекта product2

        System.out.println();

        System.out.println(productInfo3);
        productInfo3.calculateAmount(); // вызов метода, который считает общую сумму со скидкой и без у объекта product3
    }
}
