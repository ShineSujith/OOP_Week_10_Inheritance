package ie.atu;

public class Customer extends Person{
    private String custno;
    private boolean mailingList;

    public Customer() {

    }


    public Customer(String name, String address, String phone, String custno, boolean mailingList) {
        super(name, address, phone);
        this.custno = custno;
        this.mailingList = mailingList;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public String getCustno() {
        return custno;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "custno='" + custno + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
