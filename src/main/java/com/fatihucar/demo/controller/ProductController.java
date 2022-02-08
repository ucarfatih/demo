package com.fatihucar.demo.controller;

import com.fatihucar.demo.model.Product;
import com.fatihucar.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Integer id)
    throws ResourceNotFoundException{
        final Product product = productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Product not found " + id));
        return ResponseEntity.ok(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        return productRepository.findAll();
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Integer productId,
                                                 @RequestBody Product productDetails){
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product not found" + productId));
        product.setName(productDetails.getName());
        final Product updatedProduct = productRepository.save(product);
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "id") Integer productId){
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found" + productId));
        productRepository.delete(product);
        return ResponseEntity.ok().build();
    }
}
