package ru.kromarong.geekshop.service;


import ru.kromarong.geekshop.controllers.repr.ProductRepr;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<ProductRepr> findAll();

    ProductRepr findById(Long id);

    void deleteById(Long id);

    void save(ProductRepr product) throws IOException;
}
