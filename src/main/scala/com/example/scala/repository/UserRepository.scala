package com.example.scala.repository

import com.example.scala.model.Users
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends CrudRepository[Users, Long]{
  def findUserByUsername(username: String): Users

}
