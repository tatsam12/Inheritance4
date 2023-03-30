import Model.Child;
import Model.Dry_grinder;

public class Main {
    public static void main(String[] args) {

        Dry_grinder dry_grinder = new Dry_grinder(true,  100, 2019);
        dry_grinder.getGrinderType();
        dry_grinder.getProduct();
        dry_grinder.getDevice();

        System.out.println(dry_grinder.getMake_year());
        System.out.println(dry_grinder.getCompany());
        System.out.println(dry_grinder.getBladeSpeed());


        Child c1 = new Child();
        c1.getName();

    }


    }
