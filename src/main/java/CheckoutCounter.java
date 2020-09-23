import java.util.ArrayList;
public class CheckoutCounter {

    //METHODS
    // +main(String[]): String
    public static void main(String[] args) {

        //Order #1
        Clothing tShirt = new Clothing("Dior Sweatshirt", 1280.00,'L');
        Clothing pantelones = new Clothing("Amiri Jeans", 2990.00,'M');
        Clothing belt = new Clothing("Louis Vuitton Monogram Eclipse Belt", 770.00, 'M');
        Clothing sneaks = new Clothing("Balenciaga Speed Trainer in Black", 795.00,'L');

        //Order#2
        Clothing jacket = new Clothing("Starter x Fubu Jacket", 35.00, 'M');
        Clothing jeans = new Clothing("Ecko Unlimited Jeans", 50.00, 'M');
        Clothing bobos = new Clothing("Payless Bobos", 15.00, 'M');


        //shoppingBag: Clothing[]
        Clothing[] shoppingBag = {tShirt, pantelones, belt, sneaks};
        Clothing[] shoppingBag2 = {jacket, jeans, bobos};


        //Create customer object
        Customer customer = new Customer("Big Pookie", shoppingBag, 'L');

        //Create employee object
        Employee employee = new Employee("Lil Ray Ray", shoppingBag2, 'M', .1);

        ShopApp shopApp = new ShopApp();


        //Customer Checkout
        System.out.println("Welcome " + customer.getName() + " to Neiman Marcus!");
        System.out.println("We took your measurement and you were: " + shopApp.measure(customer));
        //for loop
        for(int index = 0; index <shoppingBag.length; index++){
            if(shoppingBag[index].isAFit(customer)){
                System.out.println(shoppingBag[index]);
                System.out.println("This item fits");
            }else{
                System.out.println(shoppingBag[index]);
                System.out.println("This item does not fit.");
            }
        }
        System.out.println("Customer total is: $" + shopApp.calcTotal(shoppingBag) + "\n");


        //Employee Checkout
        System.out.println("Welcome " + employee.getName() + " to Foreman Mills!");
        System.out.println("We took your measurement and you were: " + shopApp.measure(employee));
        //for loop
        for(int index = 0; index <shoppingBag2.length; index++){
            if(shoppingBag2[index].isAFit(employee)){
                System.out.println(shoppingBag2[index]);
                System.out.println("This item fits");
            }else{
                System.out.println(shoppingBag2[index]);
                System.out.println("This item does not fit.");
            }
        }
        System.out.println("Employee total is: $" + shopApp.employeePriceAfterDisc(employee));
    }
}
