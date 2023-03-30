package Model;

public class Electronics {

    String company = "Prestige";

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public Electronics(boolean warranty) {
        this.warranty = warranty;
    }

    boolean warranty;
    public void getDevice(){
        System.out.println("Device: Electronic  Device ");
    }
}
