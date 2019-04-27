public class GooglePixel2XL extends MobilPhone {


    public GooglePixel2XL(){
        super();
        this.setName("Google Pixel 2XL");
        this.setPrice(700);
    }

    @Override
    public void makeCall() {
        System.out.println("Pixel is making call....");
    }
}
