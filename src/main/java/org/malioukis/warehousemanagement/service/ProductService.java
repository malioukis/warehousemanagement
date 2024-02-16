package org.malioukis.warehousemanagement.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.malioukis.warehousemanagement.domain.dao.Product;
import org.malioukis.warehousemanagement.domain.dto.ProductDTO;
import org.malioukis.warehousemanagement.domain.mapper.GenericMapper;
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
    private final GenericMapper genericMapper;


    public ProductDTO findById(Long id) {
        return productRepo.findById(id)
                .map(genericMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException());
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Transactional(readOnly = false)
    public ProductDTO addProduct(Product product) {
        final var persistedProduct = productRepo.saveAndFlush(product);
        return findById(persistedProduct.getId());
    }
}
