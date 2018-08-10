package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] interger1 = new int[5];
        int[] interger2 = new int[5];
        int[] interger3 = new int[interger1.length + interger2.length];

        System.out.println("Nhập vào giá trị cho mạng thứ nhất: ");
        for(int i = 0; i < interger1.length; i++) {
            System.out.print("interger1["+i+"]= ");
            interger1[i] = scanner.nextInt();
        }

        System.out.println("Nhập vào giá trị cho mạng thứ nhất: ");
        for(int i = 0; i < interger1.length; i++) {
            System.out.print("interger2["+i+"]= ");
            interger2[i] = scanner.nextInt();
        }

//Gán phần tử mảng 1 cho mảng 3

        for(int i = 0; i < interger1.length; i++) {
            interger3[i] = interger1[i];
        }

//Gán phẩn tử mảng 2 cho mảng 3
        int j = 0;
        for (int i = interger2.length; i < interger3.length; i++){
            interger3[i] = interger2[j];
            j++;
        }

//Xuất mảng 3

        System.out.println("Các phần tử mảng 3 sau khi gộp từ mảng 1 và 2:");
        for (int i = 0; i < interger3.length; i++){
            System.out.println("interger["+i+"]= "+interger3[i]);
        }
    }
}
