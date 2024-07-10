package plate.stoks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String[] args){

        Map<Integer, Integer> storageList = new HashMap<>();

        //������ �������� ��������� �� ����� (������, �������)
        storageList.put(100, 100);
        storageList.put(200, 100);
        storageList.put(201, 200);
        storageList.put(300, 300);
        storageList.put(101, 600);
        storageList.put(600, 100);
        storageList.put(601, 600);
        storageList.put(301, 600);

        int widthDet = 100; //������ �����
        int lengthDet = 200; //������� �������
        int count = 0; //���� �������� ������� �������, �� ����� ���������� � ���������� ������
        int storage = 0; //����� ��� ��������� �������� ������� �������� �� �����


        System.out.print("����� ��������� ");
        for (Map.Entry<Integer, Integer> entry : storageList.entrySet()) {
            int dimA = entry.getKey();
            int dimB = entry.getValue();
            System.out.print(dimA + "x" + dimB + " | ");
            storage += dimA*dimB;
        }

        System.out.println("\n�������� �������: " + storage + "mm2" );

        //���������� ��������� ����
        for (Map.Entry<Integer, Integer> entry : storageList.entrySet()) {
            int width = entry.getKey();
            int length = entry.getValue();

            System.out.print(width + "x" + length + " - ");

            if (width >= widthDet && length >= lengthDet) {
                count += (width / widthDet) * (length / lengthDet);
                System.out.println("ok (+" + (width / widthDet) * (length / lengthDet) + ")");
            } else if (width >= lengthDet && length >= widthDet) {
                    count += (width / lengthDet) * (length / widthDet);
                    System.out.println("ok (+" + (width / lengthDet) * (length / widthDet) + ") - 90deg");
            } else {
                System.out.println("not");
            }
        }
        //��� � ���, ���� ����������

        System.out.println("ǳ ������ ������ ����������: " + count + " ��������");
    }
}
