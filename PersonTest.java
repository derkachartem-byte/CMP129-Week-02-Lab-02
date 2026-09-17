public class PersonTest {
    public static void main(String[] args){
        Person fp = new Person();
        fp.setName("Jessica Sittler");
        fp.setAge(38);
        fp.setEmail("sjessica@gmail.com");
        String name = fp.getName();
        Person sp = new Person();
        sp.setName("Michael Finch");
        sp.setAge(76);
        sp.setEmail("rocknroll@yahoo.com");
        String email = sp.getEmail();
        System.out.println(fp.displayInfo());
        System.out.println("");
        System.out.println(sp.displayInfo());
    }
}
