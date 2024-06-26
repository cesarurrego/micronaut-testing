package com.cesarurrego.jwttokensmn.controller

import com.cesarurrego.jwttokensmn.model.AppUser
import com.cesarurrego.jwttokensmn.model.AppUserRequest
import com.cesarurrego.jwttokensmn.model.SearchRequest
import com.cesarurrego.jwttokensmn.service.AppUserService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn

@Controller("/users")
@ExecuteOn(TaskExecutors.IO)
class AppUserController(
    private val appUserService: AppUserService
) {

    @Get
    fun findAllUsers(): List<AppUser> =
        appUserService.findAll()

    @Get("/{id}")
    fun findById(@PathVariable id: String): AppUser =
        appUserService.findById(id)

    @Post
    @Status(HttpStatus.CREATED)
    fun createUser(@Body request: AppUserRequest): AppUser =
        appUserService.create(request)

    @Post("/search")
    fun searchUsers(@Body searchRequest: SearchRequest): List<AppUser> =
        appUserService.findByNameLike(
            name = searchRequest.name
        )
    @Put("/{id}")
    fun updateById(
        @PathVariable id: String,
        @Body request: AppUserRequest
    ): AppUser =
        appUserService.update(id, request)

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    fun deleteById(@PathVariable id: String) =
        appUserService.deleteById(id)
}