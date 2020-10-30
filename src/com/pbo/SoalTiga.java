package com.pbo;

public class SoalTiga extends SoalSatu {
    public  SoalTiga() {
        super();
    }
    private double bilMax() {
        double maks = -9999;
        if (this.a > maks) {
            maks = this.a;
        }
        if (this.b > maks) {
            maks = this.b;
        }
        if (this.c > maks){
            maks = this.c;
        }
        return maks;
    }
    public void getData() {
        System.out.println("Bilangan 1 = " + this.a +
                "\nBilangan 2 = " + this.b +
                "\nBilangan 3 = " + this.c +
                "\nNilai Max = " + this.bilMax());
    }
}
