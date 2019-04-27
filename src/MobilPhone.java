public abstract class MobilPhone {
    private int price;
    private String name;

    public MobilPhone() {

    }

    public abstract void makeCall();
    public int IMEI() {
      return Math.abs(this.price * name.hashCode());
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
