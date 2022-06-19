package ru.t1.spting_study.demo.repository;

import org.springframework.stereotype.Repository;
import ru.t1.spting_study.demo.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private List<Product> products;

    public List<Product> findAll() {
        return products;
    }

    public Product findByTitle(String title) {
        return products.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void save(Product product) {
        products.add(product);
    }
    public void remove(Product product){
        products.remove(product);
    }
    public List<Product> filterProduct(String filter)
    {
        return products.stream().filter(x->x.getTitle().contains(filter)).collect(Collectors.toList());
    }
}
