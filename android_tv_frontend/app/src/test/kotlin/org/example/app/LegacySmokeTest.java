package org.example.app;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * PUBLIC_INTERFACE
 * Minimal JUnit 4 test to ensure discovery in environments where JUnit 5 may not be wired.
 */
public class LegacySmokeTest {
    @Test
    public void testLegacySmoke() {
        assertTrue(true);
    }
}
