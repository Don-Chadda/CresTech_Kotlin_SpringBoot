package com.tutorial.tutorial.service

import com.tutorial.tutorial.datasource.BankDataSource
import com.tutorial.tutorial.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}