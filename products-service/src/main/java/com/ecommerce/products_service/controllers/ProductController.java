package com.ecommerce.products_service.controllers;

import com.ecommerce.products_service.model.dtos.ProductRequest;
import com.ecommerce.products_service.model.dtos.ProductResponse;
import com.ecommerce.products_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /* o puede ser = @RequiredArgsConstructor  (Inyeccion de Dependencias)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }*/

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductRequest productRequest) {
        this.productService.addProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return this.productService.getAllProducts();
    }
}
