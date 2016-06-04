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

class Muralla(
              var altura: Int = 1, // metros
              var espesor: Int = 20 // centimetros
             ) extends Defensor {
  var energia = 500
  def potencialDefensivo = altura * espesor
  def recibirDanio(danio: Int) = this.energia -= danio
}