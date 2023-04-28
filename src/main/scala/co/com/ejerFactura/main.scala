package co.com.ejerFactura

object main {
  def main (arg: Array[String]) = {

    Factura.valorIvaIpoCons(Factura.totalBruto(23567.56, 5))

  }
}
