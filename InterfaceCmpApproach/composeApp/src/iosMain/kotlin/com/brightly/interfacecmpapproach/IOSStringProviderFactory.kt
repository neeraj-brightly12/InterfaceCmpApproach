package com.brightly.interfacecmpapproach


class IOSStringProviderFactory(
    private val bridge: StringProviderBridge
) : StringProviderFactory {

    override fun create(): StringProvider {
        return IOSStringProvider(bridge)
    }
}