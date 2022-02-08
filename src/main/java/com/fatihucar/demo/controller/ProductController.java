package com.fatihucar.demo.controller;

import com.fatihucar.demo.model.Product;
import com.fatihucar.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;

    }

    @GetMapping("/products/{product_id}")
    public ResponseEntity<List<Product>> getProductById(@PathVariable(value = "product_id") UUID productID)
    throws ResourceNotFoundException{
        final List<Product> product = productRepository.findByKeyProductId(productID);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        return productRepository.findAll();
    }

}
