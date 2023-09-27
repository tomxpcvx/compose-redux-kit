package components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import store.StoreComposition
import store.ducks.counter.CounterAction

@Composable
fun Component() {
    var store by StoreComposition.current
    val (count) = store.state.counterState

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
            ) {
                Button(
                    onClick = {
                        store = store.dispatch(CounterAction.increment(3))
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Increment Counter")
                }
            }

            Column(
            ) {
                Button(
                    onClick = {
                        store = store.dispatch(CounterAction.decrement(3))
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Decrement Counter")
                }
            }
        }
        Text("Counter in Component: $count")

        ChildComponent()
    }

}