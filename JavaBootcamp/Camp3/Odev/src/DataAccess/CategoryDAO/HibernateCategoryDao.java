package DataAccess.CategoryDAO;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile "+category.getCategoryName()+"kategori eklendi");
    }
}
