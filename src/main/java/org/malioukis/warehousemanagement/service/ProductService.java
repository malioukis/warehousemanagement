package org.malioukis.warehousemanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.malioukis.warehousemanagement.domain.dao.Product;
import org.malioukis.warehousemanagement.domain.repo.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Transactional(readOnly = true) // add readonly to be safe and on write assign it exclusively
@Service
public class ProductService {

    private final ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
