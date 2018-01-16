package com.teste.thiago

import com.teste.thiago.shared.Utils
import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Created by ThiagoDigo on 16/01/2018.
 */
class UtilsTest{

    @Test
    @Throws(Exception::class)
    fun testGetLogoUrl() {
        assertEquals(Utils.getLogoUrl("{width}", 2f), "128")
        assertEquals(Utils.getLogoUrl("{height}", 2f), "76")
    }

    @Test
    @Throws(Exception::class)
    fun testGetBoxUrl() {
        assertEquals(Utils.getBoxUrl("{width}", 2f), "304")
        assertEquals(Utils.getBoxUrl("{height}", 2f), "436")
    }
}