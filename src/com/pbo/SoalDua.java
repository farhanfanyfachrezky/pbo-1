package com.pbo;

public class SoalDua extends SoalSatu {
    public SoalDua (){
        super();
    }
    public void getData() {
        System.out.println("Bilangan 1 = " + this.a +
                "\nBilangan 2 = " + this.b +
                "\nBilangan 3 = " + this.c +
                "\nHasil penjumlahan dari 3 buah bilangan tsb adalah " + (this.a + this.b + this.c));
    }
}
