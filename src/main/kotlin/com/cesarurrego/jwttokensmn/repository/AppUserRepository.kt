package com.cesarurrego.jwttokensmn.repository

import com.cesarurrego.jwttokensmn.model.AppUser
import io.micronaut.data.mongodb.annotation.MongoFindQuery
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository

@MongoRepository
interface AppUserRepository : CrudRepository<AppUser, String> {

    fun findByFirstNameEquals(firstName: String): List<AppUser>

    @MongoFindQuery("{ firstName: { \$regex: :name}}")
    fun findByFirstNameLike(name: String): List<AppUser>
}
