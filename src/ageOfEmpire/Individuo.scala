package ageOfEmpire

/**
  * Created by Eric on 02/06/2016.
  */
class Guerrero(
               var energia: Int = 100,
               var potencialOfensivo: Int = 20,
               var potencialDefensivo: Int = 10
               ) extends Atacante with Defensor {
  def recibirDanio(danio: Int) = this.energia -= danio
}

class Espadachin(){}

class Misil(var antiguedad: Int) extends Atacante {
  def potencialOfensivo = (2016 - antiguedad) * 10
}