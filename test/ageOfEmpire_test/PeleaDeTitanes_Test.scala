package ageOfEmpire_test

import ageOfEmpire._

import org.junit.Before
import org.junit.Assert.assertEquals
import org.junit.Test

/**
  * Created by Eric on 02/06/2016.
  */
class PeleaDeTitanes_Test {

  var atila: Guerrero = null
  var pepe: Guerrero = null

  @Before
  def crearPersonajes() = {
    atila = new Guerrero(200, 20, 10)
    pepe = new Guerrero(20,0,0)
  }

  @Test
  def atilaMataAPepe() = {
    atila.atacarA(pepe)
    assertEquals(0,pepe.energia)
  }

}
