package com.brightly.interfacecmpapproach

class IOSStringProvider(
    private val bridge: StringProviderBridge
) : StringProvider {

    override fun getString(): String {
        return bridge.getString().toString()
    }
}