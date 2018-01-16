package com.teste.thiago

import com.teste.thiago.model.ImagesUrls
import junit.framework.Assert.assertEquals
import org.junit.Test


/**
 * Created by ThiagoDigo on 16/01/2018.
 */
class ImageUrlsTest{

    @Test
    fun testImageUrlsGetters() {
        val (large, medium, small, template) = ImagesUrls("large", "medium", "small", "template")

        assertEquals(large, "large")
        assertEquals(medium, "medium")
        assertEquals(small, "small")
        assertEquals(template, "template")
    }
}