package store

import store.ducks.counter.CounterAction
import store.ducks.counter.CounterReducer

object Reducer {

    fun <T> reduce(state: State, action: Action<T>): State {
        return when (action) {
            is CounterAction -> CounterReducer.reduce(state, action)
            else -> state
        }
    }
}