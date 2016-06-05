package main

/**
  * Created by Eric on 02/06/2016.
  */
trait Atacante {
  def potencialOfensivo: Int
  def atacarA(alguien: Defensor) = {
    val danio = this.potencialOfensivo - alguien.potencialDefensivo
    if (danio > 0)
      alguien.recibirDanio(danio)
  }
}
