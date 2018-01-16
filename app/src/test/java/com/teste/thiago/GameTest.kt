package com.teste.thiago

import com.teste.thiago.model.Game
import com.teste.thiago.model.ImagesUrls
import junit.framework.Assert.assertEquals
import org.junit.Test


/**
 * Created by ThiagoDigo on 16/01/2018.
 */
class GameTest{

    @Test
    fun testGameGetters() {
        val imagesUrls = ImagesUrls("large", "medium", "small", "template")
        val (name, box, logo, id, giantBombId) = Game("gameName", imagesUrls, imagesUrls, "id", "giantBomb")

        assertEquals(name, "gameName")
        assertEquals(id, "id")
        assertEquals(giantBombId, "giantBomb")
        assertEquals(logo, imagesUrls)
        assertEquals(box, imagesUrls)
    }
}