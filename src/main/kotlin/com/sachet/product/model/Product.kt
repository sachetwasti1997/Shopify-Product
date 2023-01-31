package com.sachet.product.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Product (
    @Id
    var id:String ?= null,
    var name: String ?= null,
    var userId: String ?= null,
    var image: String ?= null,
    var brand: String ?= null,
    var category: String ?= null,
    var description: String ?= null,
    var rating: Double ?= null,
    var numReviews: Int ?= null,
    var price: Double ?= null,
    var countInStock: Int ?= null,
    var createdAt: LocalDateTime ?= LocalDateTime.now()
)