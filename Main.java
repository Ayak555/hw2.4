public class Main {

    public static void main(String[] args) {


        Stockroom st1 = new Stockroom();
        Manufacturer man1 = new Manufacturer();
        Customer cus1 = new Customer();

        man1.start();
        cus1.start();
    }
}
