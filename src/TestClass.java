public class TestClass {
    public static void main(String[] args) {
        PhoneCreator creator = new GooglePixel2XLCreator(); //new IPhoneCreator();
        MobilPhone myNewPhone = creator.createMobilPhone();
        myNewPhone.makeCall();
        System.out.println("Get IMEI of My phone : " + myNewPhone.IMEI());
    }
}
