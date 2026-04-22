package com.shpak.dynamicocean.controller

import com.shpak.dynamicocean.model.GameField
import com.shpak.dynamicocean.model.GameObject

interface GameListener {
    // Game field
    fun createGameField(gameField: GameField)
    fun resizeGameField(width: Int, height: Int, onDone: (() -> Unit)? = null)
    fun destroyGameField()

    // Game object
    fun putGameObject(gameObject: GameObject)
    fun moveObject(gameObject: GameObject)
}