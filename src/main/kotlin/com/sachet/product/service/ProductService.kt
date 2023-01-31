package com.sachet.product.service

import com.sachet.product.model.Product
import com.sachet.product.repository.ProductRepository
import kotlinx.coroutines.reactive.collect
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService (
    @Autowired
    var productRepository: ProductRepository
) {

    suspend fun getAllProducts () : List<Product> {
        val productList = ArrayList<Product>()
        productRepository
            .findAll()
            .collect {
                productList.add(it)
            }
        return productList
    }

}