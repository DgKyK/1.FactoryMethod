public class IPhone extends MobilPhone {


    public IPhone() {
        super();
        this.setName("IPhone");
        this.setPrice(1400);
    }

    @Override
    public void makeCall() {
        System.out.println("IPhone is making call....");
    }
}
