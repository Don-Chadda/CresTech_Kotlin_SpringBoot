package com.tutorial.tutorial.datasource

import com.tutorial.tutorial.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}