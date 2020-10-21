package hm.binkley.music

import hm.binkley.music.Pitch.A
import hm.binkley.music.Pitch.Ab
import hm.binkley.music.Pitch.B
import hm.binkley.music.Pitch.C
import hm.binkley.music.Pitch.D
import hm.binkley.music.Pitch.Db
import hm.binkley.music.Pitch.E
import hm.binkley.music.Pitch.F
import hm.binkley.music.Pitch.G
import hm.binkley.music.Pitch.Gb
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

/**
 * @todo These tests _assume_ how the code works.  There are not separate
 * tests for each major/minor key
 */
internal class KeyTest {
    @Test
    fun `should have all notes for major keys`() {
        A.asMajorKey().tonic shouldBeSameInstanceAs A
        A.asMajorKey().pitches shouldBe listOf(A, B, Db, D, E, Gb, Ab)
    }

    @Test
    fun `should have all notes for minor keys`() {
        A.asMinorKey().tonic shouldBeSameInstanceAs A
        A.asMinorKey().pitches shouldBe listOf(A, B, C, D, E, F, G)
    }
}
