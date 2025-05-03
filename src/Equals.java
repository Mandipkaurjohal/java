public class Equals {
    public static void main(String args[])
    {
          String s1="Apple";
        String s2="orange";
        String s3="Apple";
        String s4= new String("Apple");
        String s5=new String("Apple");


        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s2.equals(s4));//false
        System.out.println(s4.equals(s5));//true
        System.out.println(s1==s5);//false




    }
}
