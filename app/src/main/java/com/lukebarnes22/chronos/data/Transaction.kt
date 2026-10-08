package com.lukebarnes22.chronos.data

data class Transactions(val id: Int, val date: String, val desc: String, val amount: Int, val type: String, val account: String, val import_key: String) {

}