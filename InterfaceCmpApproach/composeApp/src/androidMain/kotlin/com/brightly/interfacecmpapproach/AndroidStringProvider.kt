package com.brightly.interfacecmpapproach


class AndroidStringProvider : StringProvider {
    override fun getString(): String {
        return "Hello from Android"
    }
}