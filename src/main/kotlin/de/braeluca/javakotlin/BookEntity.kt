package de.braeluca.javakotlin

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.model.naming.NamingStrategies
import javax.persistence.Table

@MappedEntity(namingStrategy = NamingStrategies.Raw::class)
@Table(name = "Book")
data class BookEntity @JvmOverloads constructor(
        @Id
        var id: String? = null,
        var name: String? = null)
