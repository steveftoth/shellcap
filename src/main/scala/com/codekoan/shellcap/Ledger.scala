package com.codekoan.shellcap


class Ledger {
  var transactions = List[Transaction]()

  def add(transaction: Transaction): Ledger = {
    transactions = transaction :: transactions
    this
  }

  def totals: TraversableOnce[(Address, Long)] = {
    transactions.flatMap(x => List((x.source, -x.amount), (x.destination, x.amount))).groupBy(_._1)
      .mapValues(v => v.map(_._2).reduce(_ + _)).toTraversable
  }
}

object Ledger {
  def apply(transactions: List[Transaction]): Ledger = {
    val l = new Ledger()
    l.transactions = transactions
    l
  }
}