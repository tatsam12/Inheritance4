package Model;

public class Grinder extends Electronics {


int BladeSpeed;



    public int getBladeSpeed() {
        return BladeSpeed;
    }

    public void setBladeSpeed(int bladeSpeed) {
        BladeSpeed = bladeSpeed;
    }

    public Grinder(boolean warranty, int bladeSpeed) {
        super(warranty);
        BladeSpeed = bladeSpeed;
    }

    public void getProduct(){

        System.out.println("Product : Grinder");
    }
}
