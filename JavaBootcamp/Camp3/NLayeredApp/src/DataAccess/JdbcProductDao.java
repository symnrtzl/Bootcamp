package DataAccess;

import Entities.Product;

public class JdbcProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("JDBC eklendi");
    }
}
