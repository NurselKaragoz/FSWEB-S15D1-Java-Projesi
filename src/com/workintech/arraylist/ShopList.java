package com.workintech.arraylist;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ShopList {
    private static List<String> shopList=new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choosenNumber = scanner.nextLine();
        String addItems= scanner.nextLine();
        String removeItems= scanner.nextLine();
        if(choosenNumber.equals("0")){
            System.out.println("Uygulama durduruldu");

        }
        else if(choosenNumber.equals("1")){
            System.out.println("eklenecek malzemeyi yazınız"+ addItems);
        }
        else if(choosenNumber.equals("2")){
            System.out.println("çıkarılacak malzemeyi yazınız"+ removeItems);
        }


        shopList.add("addItems");
        shopList.add("removeItems");
        System.out.println(shopList);
        System.out.println("enter number:"+ choosenNumber);

    }

}
