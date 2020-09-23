public class Employee extends Customer{

    // -discount: double final
    private final double discount;

    public Employee(String name, Clothing[] clothingItems, char size, double discount) {
        super(name, clothingItems, size);
        this.discount = discount;
    }


    // +getDiscount(): double
    public double getDiscount() {
        return discount;
    }

    // +toString(): String
    @Override
    public String toString() {
        return "Employee{" +
                "discount=" + discount +
                '}';
    }
}
