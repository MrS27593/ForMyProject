package FinalneMarcinaIMoje.Task02_02;

import java.util.Objects;

abstract class Product
{
    private String name;
    private Double price;

    public Product(String name, Double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public Double getPrice()
    {
        return price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }
}
