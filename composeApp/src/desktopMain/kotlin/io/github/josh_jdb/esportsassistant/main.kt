package io.github.josh_jdb.esportsassistant

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "eSports Assistant",
    ) {
        App()
    }
}