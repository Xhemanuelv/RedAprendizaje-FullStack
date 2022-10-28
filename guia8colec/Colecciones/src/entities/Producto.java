package entities;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Xhemanuelv
 */
public class Producto {

    //TO DO Remove  the hashmap from the object it will  be called from main or service
    private String product;
    private Float price;
    private HashMap<String, Float> productos = new HashMap();

    public Producto() {
    }

    public Producto(String product, Float price) {
        this.product = product;
        this.price = price;
        this.productos.put(product, price);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public HashMap<String, Float> getProductos() {
        return productos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.product);
        hash = 53 * hash + Objects.hashCode(this.price);
        hash = 53 * hash + Objects.hashCode(this.productos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "product=" + product + ", price=" + price + ", productos=" + productos + '}';
    }

}
