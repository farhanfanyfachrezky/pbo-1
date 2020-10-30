package com.pbo;

class SoalSatu {
    protected double a,b,c;
    public SoalSatu() {
        this.a = this.b = this.c = 0;
    }
    public void setInputData(double b1, double b2, double b3) {
        this.a = b1;
        this.b = b2;
        this.c = b3;
    }
    public void getData() {
        System.out.println("Bilangan 1 = " + this.a +
                "\nBilangan 2 = " + this.b +
                "\nBilangan 3 = " + this.c);
    }
}
