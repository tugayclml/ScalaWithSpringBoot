package com.example.scala.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}
import com.example.scala.model.Users
import com.example.scala.service.UserService
import com.google.common.net.HttpHeaders
import org.springframework.http.{HttpStatus, ResponseEntity}

import javax.sql.DataSource
import java.lang
import java.util.Optional

@RestController
@RequestMapping(path = Array("/api"))
class UserController (@Autowired val userService: UserService, @Autowired val dataSource: DataSource){

  @GetMapping(path = Array("/users"))
  def getAllUsers: lang.Iterable[Users] = {
    userService.listUsers
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): Optional[Users] = {
    userService.getUser(id): Optional[Users]
  }

  @PostMapping(path = Array("/users"))
  def createUser(@RequestBody users: Users): ResponseEntity[Long] = {
    val id = userService.createUser(users)
    new ResponseEntity(id, HttpStatus.CREATED)
  }
}
