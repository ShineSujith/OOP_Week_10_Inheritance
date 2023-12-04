package ie.atu;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("shine", "duyewfdi", "0878");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer();
        Customer myCustomer2 = new Customer("Shine", "efbwwe", "5463526", "236e", true);

        System.out.println(myCustomer2.toString());
    }
}
