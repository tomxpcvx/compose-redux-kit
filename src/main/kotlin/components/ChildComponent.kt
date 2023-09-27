package components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import store.StoreComposition

@Composable
fun ChildComponent() {
    val store by StoreComposition.current

    Box(
        contentAlignment = Alignment.Center
    ) {
        Text("Counter in ChildComponent: ${store.state.counterState.count}")
    }
}

