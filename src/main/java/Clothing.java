public class Clothing {
    //FIELDS, STATES
    // -description: String
    private String description;
    // -price: double
    private double price;
    // -size: char
    private char size;
    // +getPrice(): double

    //CONSTRUCTOR
    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    //METHODS
    // +getPrice(): double
    public double getPrice(){
        return price;
    }

    // +isAFit(Customer): boolean
    public boolean isAFit(Customer customer){
        if(customer.getSize() == size){
            return true;
        }else
        return false;
    }
    // +toString(): String
    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
