package com.company;

public class Boots extends Shoes{
    public Boots(Brand b){
        super(b);

    }
    @Override
    public void createshoesthisbrand() {
        System.out.print("Boots was created by ");
        brand.createshoesbythisbrand();
    }
}
