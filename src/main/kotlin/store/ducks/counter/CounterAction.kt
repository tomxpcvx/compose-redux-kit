package store.ducks.counter

import store.Action

class CounterAction<T>(val type: CounterActionType, t: T) : Action<T>(type, t) {

    val value: T = t

    companion object {
        fun increment(payload: Int): CounterAction<Int> = CounterAction(CounterActionType.INCREMENT, payload)
        fun decrement(payload: Int): CounterAction<Int> = CounterAction(CounterActionType.DECREMENT, payload)
    }
}

