package com.example.scala.service

import org.springframework.stereotype.Service
import com.example.scala.model.Users
import com.example.scala.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired

import java.lang
import java.util.Optional

@Service
class UserService (@Autowired private val userRepository: UserRepository){
  def listUsers(): lang.Iterable[Users] = {
    userRepository.findAll
  }

  def getUser(id: Long): Optional[Users] = {
    userRepository.findById(id): Optional[Users]
  }

  def createUser(user: Users): Long = {
    userRepository.save(user)
    user.id
  }



}
