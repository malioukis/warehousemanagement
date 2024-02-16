package org.malioukis.warehousemanagement.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.malioukis.warehousemanagement.domain.dao.Product;
import org.malioukis.warehousemanagement.domain.dto.ProductDTO;
import org.malioukis.warehousemanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RequestMapping("/product")
@RestController
public class ProductController {


    private final ProductService productService;

    @GetMapping("/")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/")
    public ProductDTO addProduct(@RequestBody Product product) {
        final var productDTO = productService.addProduct(product);
        return productService.findById(productDTO.getId());
    }

}
