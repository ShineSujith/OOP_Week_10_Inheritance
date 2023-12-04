package ie.atu;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("shine", "duyewfdi", "0878");

        Customer myCustomer = new Customer();
        Customer myCustomer2 = new Customer("Shine", "efbwwe", "5463526", "236e", true);

        myCustomer.setName("Sujith");
        myCustomer.setAddress("drydyrd");
        myCustomer.setPhone("467632");
        myCustomer.setCustno("2229g");
        myCustomer.setMailingList(true);

        System.out.println("Customer 1: name: " + myCustomer.getName() + " address: " + myCustomer.getAddress() +
                " phoneNo. " + myCustomer.getPhone() + " customerNo. " + myCustomer.getCustno() + " Mailing list: " + myCustomer.isMailingList());
        System.out.println("Customer 2: name: " + myCustomer2.getName() + " address: " + myCustomer2.getAddress() +
                " phoneNo. " + myCustomer2.getPhone() + " customerNo. " + myCustomer2.getCustno() + " Mailing list: " + myCustomer2.isMailingList());

        System.out.println(myPerson.toString());
        System.out.println(myCustomer2.toString());
    }
}
