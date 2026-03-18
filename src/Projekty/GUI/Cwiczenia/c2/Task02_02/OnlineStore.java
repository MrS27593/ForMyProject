package Projekty.GUI.Cwiczenia.c2.Task02_02;

public
class OnlineStore
    extends ShoppingCart{

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

//TODO: implement Book class
        Product book = new Book("The Catcher in the Rye", 10.99);
//TODO: implement Clothing class
        Product shirt = new Clothing("Blue Shirt", 25.99);
//TODO: implement Electronic class
        Product phone = new Electronics("iPhone 12", 999.99);

        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(phone);

        System.out.println("Total price: " + store.getTotalPrice());

        store.removeProduct(shirt);

        System.out.println("Total price: " + store.getTotalPrice());
    }

    private Product[] products = new Product[20];
    private int productCounter = 0;

//TODO: implement missing methods from abstract class

    @Override
    void addProduct(Product product) {
        this.products[this.productCounter++] = product;
    }

    @Override
    void removeProduct(Product product) {
        int i = 0;
        while(i < this.productCounter && this.products[i] != product)
            i++;

        for(int j = i; j < this.productCounter-1; j++){
            this.products[j] = this.products[j+1];
        }

        this.products[this.productCounter] = null;
        this.productCounter--;
    }

    @Override
    double getTotalPrice() {
        double sum = 0;
        for(int i=0; i < this.productCounter; i++)
            sum += this.products[i].getPrice();
        return sum;
    }
}
