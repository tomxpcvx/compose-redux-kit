package store.ducks.counter

import store.State

object CounterReducer {
    fun <T> reduce(state: State, action: CounterAction<T>): State {
        when (action.type) {
            CounterActionType.INCREMENT -> {
                if (action.value is Int) {
                    val incrementOperator: Int = action.value
                    val newCount: Int = state.counterState.count + incrementOperator
                    val counterState: CounterState = state.counterState.copy(count = newCount)
                    return state.copy(counterState = counterState)
                }
                return state;
            }
            CounterActionType.DECREMENT -> {
                if (action.value is Int) {
                    val decrementOperator: Int = action.value
                    val newCount: Int = state.counterState.count - decrementOperator
                    val counterState: CounterState = state.counterState.copy(count = newCount)
                    return state.copy(counterState = counterState)
                }
                return state;
            }
        }
    }
}

