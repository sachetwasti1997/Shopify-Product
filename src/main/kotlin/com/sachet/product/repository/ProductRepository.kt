package com.sachet.product.repository

import com.sachet.product.model.Product
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface ProductRepository: ReactiveMongoRepository<Product, String>