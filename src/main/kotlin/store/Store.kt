package store

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.staticCompositionLocalOf

val StoreComposition = staticCompositionLocalOf<MutableState<Store>> { error("No AppAmbient provided") }

data class Store(var state: State = State()) {

    fun <T> dispatch(action: Action<T>): Store {
        return copy(state = Reducer.reduce(state, action));
    }
}
