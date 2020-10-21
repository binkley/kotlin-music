package hm.binkley.music

import hm.binkley.music.Pitch.A
import hm.binkley.music.Pitch.Ab
import hm.binkley.music.Pitch.B
import hm.binkley.music.Pitch.Bb
import hm.binkley.music.Pitch.C
import hm.binkley.music.Pitch.D
import hm.binkley.music.Pitch.Db
import hm.binkley.music.Pitch.E
import hm.binkley.music.Pitch.Eb
import hm.binkley.music.Pitch.F
import hm.binkley.music.Pitch.G
import hm.binkley.music.Pitch.Gb
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

internal class KeyTest {
    @Test
    fun `should have all notes for major keys`() {
        AMajor.tonic shouldBeSameInstanceAs A
        AMajor.notes shouldBe listOf(A, B, Db, D, E, Gb, Ab)
        BbMajor.tonic shouldBeSameInstanceAs Bb
        BbMajor.notes shouldBe listOf(Bb, C, D, Eb, F, G, A)
        BMajor.tonic shouldBeSameInstanceAs B
        BMajor.notes shouldBe listOf(B, Db, Eb, E, Gb, Ab, Bb)
        CMajor.tonic shouldBeSameInstanceAs C
        CMajor.notes shouldBe listOf(C, D, E, F, G, A, B)
    }

    @Test
    fun `should have all notes for minor keys`() {
        AMinor.tonic shouldBeSameInstanceAs A
        AMinor.notes shouldBe listOf(A, B, C, D, E, F, G)
        BbMinor.tonic shouldBeSameInstanceAs Bb
        BbMinor.notes shouldBe listOf(Bb, C, Db, Eb, F, Gb, Ab)
        BMinor.tonic shouldBeSameInstanceAs B
        BMinor.notes shouldBe listOf(B, Db, D, E, Gb, G, A)
        CMinor.tonic shouldBeSameInstanceAs C
        CMinor.notes shouldBe listOf(C, D, Eb, F, G, Ab, Bb)
    }
}
