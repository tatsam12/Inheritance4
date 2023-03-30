package Model;

public class Child extends Parent {

    @Override
    public void getName(){
        super.getName();
        System.out.println("No");
    }

}
