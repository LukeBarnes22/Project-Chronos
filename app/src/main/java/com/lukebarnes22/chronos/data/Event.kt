package com.lukebarnes22.chronos.data

data class Events(val id: Int, val name: String, val category: String, val date: String, val start_time: String, val end_time: String, val all_day: Boolean, val amount: Int, val paid: Boolean, val transaction_id: Int) {

}
