package com.codekoan.shellcap

class Transaction(val source: Address, val destination: Address, val amount: Long) {

  override def toString() =
    "Transaction from:" + source + " to:" + destination + " amount:" + amount
}

object Transaction {
  def apply(source: Address, destination: Address, amount: Long): Transaction = {
    new Transaction(source, destination, amount)
  }

  def apply(source: String, destination: String, amount: Long): Transaction = {
    new Transaction(Address(source), Address(destination), amount)
  }

}