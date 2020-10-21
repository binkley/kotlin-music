package hm.binkley.music

import hm.binkley.music.Pitches.A
import hm.binkley.music.Pitches.E
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

internal class PitchesTest {
    @Test
    fun `has dominant`() {
        A.dominant shouldBeSameInstanceAs E
    }
}
