package ru.t1.spting_study.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.t1.spting_study.demo.entity.Product;
import ru.t1.spting_study.demo.repository.ProductRepository;

@Service
public class ProductsService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(Long id) {
        Product temp = productRepository.findById(id);//.get();
        return temp;
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.remove(product);
    }

}
