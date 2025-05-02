package Inheritance;

public class Box {
   private  double l;
   private double w;
   private double h;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    public Box(){
    }

    public String information(){
        return "Box Information\nWidth: "+w+"\nHeight: "+h+"\nLength: "+l;
    }



}
