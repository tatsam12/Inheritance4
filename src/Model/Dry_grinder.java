package Model;

public class Dry_grinder extends Grinder {
    public int getMake_year() {
        return make_year;
    }

    public void setMake_year(int make_year) {
        this.make_year = make_year;
    }

    public Dry_grinder(boolean warranty, int bladeSpeed, int make_year) {
        super(warranty, bladeSpeed);
        this.make_year = make_year;
    }

    int make_year;
    public void getGrinderType(){
        System.out.println("Grinder Type : Dry");
    }
}
