import UIKit
import SwiftUI
import ComposeApp

struct ComposeView: UIViewControllerRepresentable {

    let factory: IOSStringProviderFactory

    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController(factory: factory)
    }

    func updateUIViewController(
        _ uiViewController: UIViewController,
        context: Context
    ) {}
}


struct ContentView: View {

    private let factory: IOSStringProviderFactory

    init() {
        let swiftProvider = SwiftStringProvider()
        self.factory = IOSStringProviderFactory(bridge: swiftProvider)
    }

    var body: some View {
        ComposeView(factory: factory)
            .ignoresSafeArea()
    }
}

