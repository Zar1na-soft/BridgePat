package com.company;

public class Main {

    public static void main(String[] args) {
	Shoes nikesne = new Sneakears(new Nike());
	nikesne.createshoesthisbrand();
	Shoes adidasboot = new Boots(new Adidas());
	adidasboot.createshoesthisbrand();
    }
}
