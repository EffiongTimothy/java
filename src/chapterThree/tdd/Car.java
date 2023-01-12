package tdd;
public class car {
    private String model;
private String year;
private double price;
    public car(String model, String year, double price) {
    this.model = model;
    this.year = year;
    this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price > 0)
        this.price = price;

    }
}




