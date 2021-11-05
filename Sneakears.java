package com.company;

public class Sneakears extends Shoes  {
    public Sneakears(Brand b){
        super(b);
    }
    @Override
    public void createshoesthisbrand() {
        System.out.print("Sneakears was created by ");
        brand.createshoesbythisbrand();
    }
}
