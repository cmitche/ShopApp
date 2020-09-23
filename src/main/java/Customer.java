import java.util.Arrays;

public class Customer {
    //Instance Variables, States, Fields
    // -name: String
    private String name;
    // -clothingItems: Clothing[]
    private Clothing[] clothingItems;
    // -size: char
    private char size;

    //Constructor
    public Customer(String name, Clothing[] clothingItems, char size) {
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

    // +getSize(): char
    public char getSize(){
        return size;
    }

    // +getName(): String
    public String getName(){
        return name;
    }

    // +getClothingItems():
    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    // +toString(): String
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
