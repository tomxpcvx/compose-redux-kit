package store

import store.ducks.counter.CounterState

data class State(
    var counterState: CounterState = CounterState()
)
