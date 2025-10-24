package org.example.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class SmokeTest {
    // PUBLIC_INTERFACE
    @Test
    /** Basic smoke test to ensure test discovery and execution in CI. */
    fun testSmoke() {
        assertTrue(true)
    }
}
