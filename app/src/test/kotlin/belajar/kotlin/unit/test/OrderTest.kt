package belajar.kotlin.unit.test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {
    var counter = 0

    @BeforeAll
    fun beforeAll(){

    }
    @AfterAll
    fun afterAll(){

    }

    @Test
    @Order(3)
    fun testA(){
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Test
    @Order(1)
    fun testC(){
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Test
    @Order(2)
    fun testB(){
        counter++
        println(counter)
        println(this.hashCode())
    }
}