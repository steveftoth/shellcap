package com.codekoan.shellcap

class Address(val name: String) {

  override def toString() = name
}

object Address {
  def apply(name: String): Address = {
    new Address(name)
  }
}
