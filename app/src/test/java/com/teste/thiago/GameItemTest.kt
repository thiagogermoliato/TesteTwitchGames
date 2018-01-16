package com.teste.thiago

import com.teste.thiago.model.GameItem
import junit.framework.Assert.assertEquals
import org.junit.Test


/**
 * Created by ThiagoDigo on 16/01/2018.
 */
class GameItemTest {

    @Test
    fun testGameItem() {

        val (game, viewers, channels) = GameItem(null, 100, 200)

        assertEquals(channels, 200)
        assertEquals(viewers, 100)
        assertEquals(game, null)
    }
}