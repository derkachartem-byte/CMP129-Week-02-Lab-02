public class PersonTest {
    public static void main(String[] args){
        Person fp = new Person();
        fp.setName("Jessica Sittler");
        fp.setAge(38);
        fp.setEmail("sjessica@gamil.com");
        String name = fp.getName();
        Person sp = new Person("Michael Finch", 76, "rocknroll@yahoo.com");
        System.out.println(fp.displayInfo());
        System.out.println("");
        System.out.println(sp.displayInfo());
    }
}
