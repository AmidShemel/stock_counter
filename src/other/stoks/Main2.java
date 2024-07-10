package other.stoks;

import java.util.ArrayList;

public class Main2 {
    public static void main (String[] args){

        ArrayList<Integer> aList = new ArrayList<>();
        //Додаємо заготовки на склад
        aList.add(70);
        aList.add(350);
        aList.add(50);
        aList.add(148);
        aList.add(449);
        aList.add(899);

        int storage = 0; //загальна кількість на складі
        int stockSize = 150; //Розмір заготовки
        int count = 0; //Сюди складемо кількість заготовок, які можна заготовити зі складських запасів

        System.out.print("Наявні заготовки ");
        for (Integer j : aList) {
            System.out.print(j + " | ");
            storage += j;
        }

        System.out.println("\nЗагальна кількість: " + storage);

        //Починається магія
        for (Integer j : aList) {
            if(j>=stockSize) count+=j/stockSize;
        }
        //Магія звкінчилась

        System.out.println("Зі складу можнна заготовити: " + count + " заготовк");
    }
}
