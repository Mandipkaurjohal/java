package Collections;

public class Generic<t,m> {
    t name;
    m id;

    public Generic(t name, m id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Generic<String,Integer> generic=new Generic<>("mandip",123);
        System.out.println(generic);
        Generic<Integer,String>generic1= new Generic<>(1234,"msndip");
        System.out.println(generic1);
    }
}

