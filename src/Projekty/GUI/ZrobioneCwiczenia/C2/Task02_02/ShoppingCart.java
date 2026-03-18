package FinalneMarcinaIMoje.Task02_02;

abstract  class ShoppingCart
{
    abstract void addProduct(Product product);
    abstract public Double getTotalPrice();
    abstract public void removeProduct(Product product);
}