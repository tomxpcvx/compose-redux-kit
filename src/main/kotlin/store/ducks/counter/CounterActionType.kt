package store.ducks.counter

import store.ActionType

enum class CounterActionType : ActionType {
    INCREMENT,
    DECREMENT
}