import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import store.Store
import store.StoreComposition
import components.Component


@Composable
@Preview
fun App() {
    val store = remember { mutableStateOf(Store()) }

    MaterialTheme {
        CompositionLocalProvider(
            StoreComposition provides store
        ) {
            Component()
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Example for redux like state handling in Compose") {
        App()
    }
}
