package Business;

import DataAccess.ProductDao;
import Entities.Product;

public class ProductManager  {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {
        if( product.getUnitPrice() < 1000){
            throw new Exception("Ürün fiyatı 1000 den küçük olamaz");
        }
        productDao.add(product);
    }
}
