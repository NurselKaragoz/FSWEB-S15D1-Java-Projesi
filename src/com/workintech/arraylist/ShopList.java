package com.workintech.arraylist;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ShopList {
    private static List<String> shopList=new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choosenNumber = scanner.nextLine();

        shopList.add("pepper");
        System.out.println(shopList);
        System.out.println("enter number:"+ choosenNumber);

    }

}
