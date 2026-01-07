//
//  SwiftStringProvider.swift
//  iosApp
//
//  Created by Neeraj Soni on 07/01/26.
//

import Foundation
import ComposeApp
class SwiftStringProvider: NSObject, StringProviderBridge {

    func getString() -> String {
        return "Hello from Swift (iOS)"
    }
}
