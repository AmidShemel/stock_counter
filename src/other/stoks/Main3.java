package other.stoks;

/*
    Перебираємо список наявного листового матеріалу на складі підраховуємо скільки можливо виготовоити деталей
    Алгоритм не ідеальний.
 */

public class Main3 {
    public static void main(String[] args) {

        int[] store =
                {
                        10, 200, 200,
                        20, 400, 200,
                        30, 300, 400,
                        50, 200, 200,
                        10, 200, 200,
                        20, 100, 200,
                        60, 600, 100
                };

        int sd = 20; //Товщина деталі
        int wDet = 100; //Ширина деталі
        int lDet = 200; //Довжина довжина
        int count = 0; //Сюди складемо кількість деталей, які можна виготовити зі складських запасів
        int storage = 0; //Змінна для зберігання загальної кількості матеріалу на складі

        for (int i = 0; i < store.length; i += 3) {
            int ss = store[i];
            int ws = store[i + 1];
            int ls = store[i + 2];

            //System.out.println("Лист "+ss+" "+ws+"x"+ls);

            if (ss == sd) {
                if (ws >= wDet && ls >= lDet) {
                    count += (ws / wDet) * (ls / lDet);
                    System.out.println("ok (+" + (ws / wDet) * (ls / lDet) + ")");
                } else if (ws >= lDet && ls >= wDet) {
                    count += (ws / lDet) * (ls / wDet);
                    System.out.println("ok (+" + (ws / lDet) * (ls / wDet) + ") - 90deg");
                } else {
                    System.out.println("not");
                }
            }
        }
        System.out.println("==> "+count);
    }
}
