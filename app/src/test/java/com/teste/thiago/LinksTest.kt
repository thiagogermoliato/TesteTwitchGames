package com.teste.thiago

import com.teste.thiago.model.Links
import junit.framework.Assert.assertEquals
import org.junit.Test


/**
 * Created by ThiagoDigo on 16/01/2018.
 */
class LinksTest{

    @Test
    fun testLinkGetters() {
        val (self, next) = Links("self", "next")

        assertEquals(next, "next")
        assertEquals(self, "self")
    }
}