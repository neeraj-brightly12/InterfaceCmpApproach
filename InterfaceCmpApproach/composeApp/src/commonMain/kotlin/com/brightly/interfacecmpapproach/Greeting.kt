package com.brightly.interfacecmpapproach

import com.brightly.interfacecmpapproach.StringProvider

class Greeting(
    private val stringProvider: StringProvider
) {
    fun greet(): String {
        return stringProvider.getString()
    }
}