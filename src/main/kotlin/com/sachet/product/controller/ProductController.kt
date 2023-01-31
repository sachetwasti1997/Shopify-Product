package com.sachet.product.controller

import com.sachet.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/product")
class ProductController(
    @Autowired
    var productService: ProductService
) {
    @GetMapping("/all")
    suspend fun getAllProducts() = productService.getAllProducts()
}