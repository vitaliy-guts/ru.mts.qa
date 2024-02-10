package dto;

public class Properties {
    public static void main(String[] args) {
        int count = 5;
        double count2 = 8.434234;
        System.out.println(count % 2);

        House woodHouse = new House();
        woodHouse.material = "Дерево";
        woodHouse.square = 4.566F;

        House secondHouse = new House();
        secondHouse.material = "Кирпич";
        secondHouse.square = 45.1231231f;

        System.out.println(secondHouse.square);
    }
}
