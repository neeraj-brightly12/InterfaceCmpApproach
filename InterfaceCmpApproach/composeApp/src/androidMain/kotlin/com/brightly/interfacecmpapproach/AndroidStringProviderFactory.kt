package com.brightly.interfacecmpapproach


class AndroidStringProviderFactory : StringProviderFactory {
    override fun create(): StringProvider {
        return AndroidStringProvider()
    }
}