package com.codurance

import java.math.BigDecimal

class Employee(id: Int, name: String?, anualGrossSalary: BigDecimal?) {
    private val id: Int
    private val name: String?
    private val anualGrossSalary: BigDecimal?

    init {
        this.id = id
        this.name = name
        this.anualGrossSalary = anualGrossSalary
    }

    fun ID(): Int {
        return id
    }

    fun name(): String? {
        return this.name
    }

    fun grossSalary(): BigDecimal? {
        return anualGrossSalary
    }
}
