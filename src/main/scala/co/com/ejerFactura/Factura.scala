package co.com.ejerFactura

object Factura {

  def totalBruto (precio : Double, cantidadP: Double) = {
    val valorBruto = precio * cantidadP
    valorBruto
  }

  def valorIvaIpoCons(valorBruto: Double, aplicaIpo: Boolean = false) = {
    val iva = valorBruto * 0.19
    valorIvaIncluido(iva,valorBruto, aplicaIpo)
  }

  def valorIvaIncluido(iva: Double, valorBruto: Double,aplicaIpo: Boolean) = {

    println(s"El valor bruto es, ${valorBruto}")
    println(s"El valor del iva es, ${iva}")

    if(aplicaIpo){
      val total = (valorBruto * 0.16) + iva + valorBruto
      println(s"El valor total es, ${total}")
    }else{
      val total = valorBruto + iva
      println(s"El valor total es, ${total}")
    }

}


