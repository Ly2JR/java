import java.util.Vector;

public class PersonTester {
    public static void main(String[] args) {
        Employee jim=new Manager();
        jim.setName("Jim");

        Manager unknown=(Manager) jim;
        unknown.setEmployeeNumber(543469);
        unknown.responsibilities=new Vector<String>();
        unknown.responsibilities.add("Internet project");
        unknown.responsibilities.add("Internet project1");

        System.out.println(jim.getName());//Jim
        System.out.println(jim.getEmployeeNumber());//543469
        System.out.println(unknown.getName());//Jim
        System.out.println(unknown.getEmployeeNumber());//543469
        System.out.println(unknown.getResponsibilities());//[Internet project,Internet project1]
    }
}
