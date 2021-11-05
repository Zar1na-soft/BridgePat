package com.company;

public abstract class Shoes {
    protected Brand brand;

    public Shoes(Brand b){
        this.brand = b;
    }

    abstract public void createshoesthisbrand();
}


