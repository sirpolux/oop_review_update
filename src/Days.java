import AccessControl.Details;

public enum Days implements Details<Days> {
    MONDAY,
    TUESDAY,
    WEDNESDAY;

    @Override
    public void info() {

    }

    @Override
    public void subInfo() {
        System.out.println("Selected day is : "+ this.name());
    }
}
