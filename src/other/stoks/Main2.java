package other.stoks;

import java.util.ArrayList;

public class Main2 {
    public static void main (String[] args){

        ArrayList<Integer> aList = new ArrayList<>();
        //������ ��������� �� �����
        aList.add(70);
        aList.add(350);
        aList.add(50);
        aList.add(148);
        aList.add(449);
        aList.add(899);

        int storage = 0; //�������� ������� �� �����
        int stockSize = 150; //����� ���������
        int count = 0; //���� �������� ������� ���������, �� ����� ���������� � ���������� ������

        System.out.print("����� ��������� ");
        for (Integer j : aList) {
            System.out.print(j + " | ");
            storage += j;
        }

        System.out.println("\n�������� �������: " + storage);

        //���������� ����
        for (Integer j : aList) {
            if(j>=stockSize) count+=j/stockSize;
        }
        //���� ����������

        System.out.println("ǳ ������ ������ ����������: " + count + " ��������");
    }
}
