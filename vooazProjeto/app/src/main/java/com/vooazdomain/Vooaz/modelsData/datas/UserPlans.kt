package com.vooazdomain.Vooaz.modelsData.datas

import java.util.Date


data class User(
    val userId: Int?,
    var name: String?,
    var country: String?,
    val flagCountry:Int?,
    var state: String?,
    var city: String?,
    val age: Int?,
    val imageRes: Int?,
    var AboutUser: String?,
    var neighborhood: String?,
    val languages: List<String>?,
    var email: String?,
    val password: String?,
    val historicTravels: List<Destinations?>?,
    var disabilityType: String?,
    var birthDate: Date?,
    var gender: String?,
    val userPlans: Plans?,
    var conected_users: List<User?>?,
)

data class Plans(
    val planId: Int,
    val planName: String,
    val monthlyFee: Double,
    val annualFee: Double,
    val benefits: List<String>
)