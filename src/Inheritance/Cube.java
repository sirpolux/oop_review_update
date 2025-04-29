package Inheritance;

public class Cube extends Box{
    private String boxName;
    public Cube(double h, double l, double w){
        super(h,w,l);
    }

    @Override
    public String information(){
        String initialMsg= super.information();
        return "Box Name: Cube\n"+initialMsg;
    }
}
