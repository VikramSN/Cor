package com.vsn.coro

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Created by Name : Vikram Singh Negi on 11/12/2019.
 */
object Coro {

    // MAIN
    fun main(mainWork: suspend (() -> Unit)) {
        CoroutineScope(Dispatchers.Main)
            .launch {
                mainWork()
            }
    }

    // I/O
    fun io(ioWork: suspend (() -> Unit)) {
        CoroutineScope(Dispatchers.IO)
            .launch {
                ioWork()
            }
    }

    // DEFAULT
    fun default(defaultWork: suspend (() -> Unit)) {
        CoroutineScope(Dispatchers.Default)
            .launch {
                defaultWork()
            }
    }

    // UNCONFINED
    fun unconfined(unconfinedWork: suspend (() -> Unit)) {
        CoroutineScope(Dispatchers.Unconfined)
            .launch {
                unconfinedWork()
            }
    }


}