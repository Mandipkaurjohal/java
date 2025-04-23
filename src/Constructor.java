public class Constructor {
    String memory;
    int phone;
    Constructor()
    {

        String memory;
        int phone;
    }
    Constructor(String memory ,int phone )
    {
       this.memory=memory ;
        this.phone=phone ;
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor("mandip",654);
        Constructor constructor1=new Constructor();
        System.out.println(constructor.memory);
        System.out.println(constructor.phone);
        System.out.println(constructor1.phone);
        System.out.println(constructor1.memory);
    }
}

