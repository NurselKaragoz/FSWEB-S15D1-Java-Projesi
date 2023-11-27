package com.workintech.arraylist;

import java.util.*;

public class GroceryList {
    private ArrayList<String> items=new ArrayList<>();



    public void addItems(String items ){
        String [] splitItems= items.split(",");
        for(String item :splitItems){
            String trimmedItem= item.trim();
            if(checkItemIsInList(trimmedItem)){
                System.out.println("Girilen item listede mevcut:"+item);
            }
            else {
                this.items.add(trimmedItem);
                sortItems();
            }
        }
    }
    public void removeItems(String items){
        String[] splitItems= items.split(",");
        for(String item:splitItems){
        String trimmedItem= item.trim();
        if(!checkItemIsInList(trimmedItem)){
            System.out.println("Bu item zaten mevcut değil"+item);
        }
        else{
            this.items.remove(trimmedItem);
        }
    }}
    public void printSorted(){
        for (String item:this.items){
            System.out.println("Mevcut List:"+item);
        }
    }
    public boolean checkItemIsInList(String item){
        return items.contains(item);
    }
    public void sortItems(){
        Collections.sort(this.items);
    }

}
