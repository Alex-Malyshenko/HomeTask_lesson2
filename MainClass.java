import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 19);
        Cat cat2 = new Cat("Charbon", 24);
        Cat cat3 = new Cat("Cesar", 18);
        Cat cat4 = new Cat("Basil", 29);
        Cat cat5 = new Cat("Baks", 35);


        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat: cats ) {

            if (plate.getFood() > cat.getAppetite()) {
                cat.eat(plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());

            }

            if (cat.isSatiety()) {
                System.out.printf("Котик %s сыт!\n", cat.getName());
                plate.info(); // Вывод остатка еды
            }
            else
                System.out.printf(" Котику %s не хватает еды!\n", cat.getName());
        }
        plate.info();

        //  Добавим еду в тарелку!
        plate.addFood(50);

        plate.info();


    }
}