import java.util.List;

public class Invoice {

    private String customer;
    private List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Performance> getPerformances() {
        return performances;
    }
}
