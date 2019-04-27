public abstract class MobilPhone {
    private int price;
    private String name;

    public MobilPhone() {

    }

    public abstract void makeCall();
    public int getBalance() {
      return this.price * name.hashCode();
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
