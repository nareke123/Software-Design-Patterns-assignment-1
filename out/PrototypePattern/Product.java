//Паттерн "Prototype" используется для создания объектов путем копирования существующего объекта-прототипа вместо создания новых экземпляров с помощью конструктора

public class Product implements Cloneable{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Product clone() {
    try{
        return (Product) super.clone();
    } catch (CloneNotSupportedException e) {
        return null;
    }

    }

    public String toString() {
        return name + " " + price;
    }
}
