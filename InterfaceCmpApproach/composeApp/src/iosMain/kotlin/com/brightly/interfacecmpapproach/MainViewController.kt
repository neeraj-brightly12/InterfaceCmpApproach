package com.brightly.interfacecmpapproach

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController(
    factory: StringProviderFactory
) = ComposeUIViewController {
    App(factory = factory)
}