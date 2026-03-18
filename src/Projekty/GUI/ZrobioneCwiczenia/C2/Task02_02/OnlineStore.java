package FinalneMarcinaIMoje.Task02_02;

class OnlineStore extends ShoppingCart{
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

    @Override
    void addProduct(Product product)
    {
        if (productCounter >= products.length)
        {
            System.out.println("koszyk jest pelny");
            return;
        }
        products[productCounter++] = product;
    }

    @Override
    public Double getTotalPrice()
    {
        Double totalPrice = 0d;
        for (int a = 0; a < productCounter; a++)
            totalPrice += products[a].getPrice();
        return totalPrice;
    }

    @Override
    public void removeProduct(Product product)
    {
        int index = getIndexOfProduct(product);
        if (index != -1)
            changeOrderArray(index);
        productCounter--;
    }

    private void changeOrderArray(int index)
    {
        products[index] = null;
        for (int a = index+1; a < products.length; a++)
            products[a-1] = products[a];
    }

    private int getIndexOfProduct(Product product)
    {
        int indexWhereIsProduct = -1;
        for (int a = 0; a < productCounter; a++)
            if (product.equals(products[a]))
                return a;
        return indexWhereIsProduct;
    }

//TODO: implement missing methods from abstract class

}
