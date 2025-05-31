package OOPs.Encapsulation;

public class MainEncapsulationGetterSetter {
    public static void main(String[] args) {
        EncapsulationGetterSetter encapsulationGetterSetter = new  EncapsulationGetterSetter("user","12345");
        System.out.println(encapsulationGetterSetter.getUserName());
        System.out.println(encapsulationGetterSetter.getPassword());
        System.out.println(encapsulationGetterSetter.setPassword("hello"));
        encapsulationGetterSetter.isValidUser("user","hello");
    }
}
