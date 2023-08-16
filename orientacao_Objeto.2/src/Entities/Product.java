package Entities;
public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueStock() {
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public  String toString() {
        return name +", R$"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " Quantidades no stock, total: R$"
                + String.format("%.2f", totalValueStock());
    }

}
