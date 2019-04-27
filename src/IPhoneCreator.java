public class IPhoneCreator implements PhoneCreator {
    @Override
    public MobilPhone createMobilPhone() {
        return new IPhone();
    }
}
