package DataAccess;

import Entities.Product;

public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("Hİbernate eklendi");
    }
}
