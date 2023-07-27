import Business.ProductManager;
import DataAccess.HibernateProductDao;
import DataAccess.JdbcProductDao;
import Entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");
        Product product1=new Product(1,"Seyma",2000);

        ProductManager productManager=new ProductManager(new JdbcProductDao());
        productManager.add(product1);
    }
}