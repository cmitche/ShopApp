public class ShopApp {
    //FIELDS, STATES, INSTANCE VARIABLES
    double tax = .1;

    // +calcTotal(Clothing[]): double
    public double calcTotal(Clothing[] clothing){
        double totalPrice = .0;
        for(int index = 0; index < clothing.length; index++){
            totalPrice += clothing[index].getPrice();
        }
        totalPrice = (totalPrice * tax) + totalPrice;
        return totalPrice;
    }

    // +measure(Customer): char
    public char measure(Customer customer){
        return customer.getSize();
    }

    // +employeePriceAfterDisc(Employee): double
    public double employeePriceAfterDisc(Employee employee){
        double totalPrice = .0;
        Clothing[] employeeClothes = employee.getClothingItems();
        for(int index = 0; index < employeeClothes.length; index++){
            totalPrice += employeeClothes[index].getPrice();
        }
        totalPrice = totalPrice - (totalPrice * employee.getDiscount());
        totalPrice = (totalPrice * tax) + totalPrice;
        return totalPrice;
    }
}
