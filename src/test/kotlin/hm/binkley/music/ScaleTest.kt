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

/**
 * @todo These tests _assume_ how the code works.  There are not separate
 * tests for each major/minor key
 */
internal class ScaleTest {
    @Test
    fun `should have all notes for major keys`() {
        A.asMajorKey().tonic shouldBeSameInstanceAs A
        A.asMajorKey().pitches shouldBe listOf(A, B, Db, D, E, Gb, Ab)
    }

    @Test
    fun `should have all notes for minor keys`() {
        A.asMinorKey().tonic shouldBeSameInstanceAs A
        A.asMinorKey() shouldBe listOf(A, B, C, D, E, F, G)
    }

    @Test
    fun `should have a relative minor for major scales`() {
        A.asMajorKey().asRelativeMinor() shouldBe Gb.asMinorKey()
        Bb.asMajorKey().asRelativeMinor() shouldBe G.asMinorKey()
        B.asMajorKey().asRelativeMinor() shouldBe Ab.asMinorKey()
        C.asMajorKey().asRelativeMinor() shouldBe A.asMinorKey()
        Db.asMajorKey().asRelativeMinor() shouldBe Bb.asMinorKey()
        D.asMajorKey().asRelativeMinor() shouldBe B.asMinorKey()
        Eb.asMajorKey().asRelativeMinor() shouldBe C.asMinorKey()
        E.asMajorKey().asRelativeMinor() shouldBe Db.asMinorKey()
        F.asMajorKey().asRelativeMinor() shouldBe D.asMinorKey()
        Gb.asMajorKey().asRelativeMinor() shouldBe Eb.asMinorKey()
        G.asMajorKey().asRelativeMinor() shouldBe E.asMinorKey()
        Ab.asMajorKey().asRelativeMinor() shouldBe F.asMinorKey()
    }

    @Test
    fun `should have a relative major for minor scales`() {
        A.asMinorKey().asRelativeMajor() shouldBe C.asMajorKey()
        Bb.asMinorKey().asRelativeMajor() shouldBe Db.asMajorKey()
        B.asMinorKey().asRelativeMajor() shouldBe D.asMajorKey()
        C.asMinorKey().asRelativeMajor() shouldBe Eb.asMajorKey()
        Db.asMinorKey().asRelativeMajor() shouldBe E.asMajorKey()
        D.asMinorKey().asRelativeMajor() shouldBe F.asMajorKey()
        Eb.asMinorKey().asRelativeMajor() shouldBe Gb.asMajorKey()
        E.asMinorKey().asRelativeMajor() shouldBe G.asMajorKey()
        F.asMinorKey().asRelativeMajor() shouldBe Ab.asMajorKey()
        Gb.asMinorKey().asRelativeMajor() shouldBe A.asMajorKey()
        G.asMinorKey().asRelativeMajor() shouldBe Bb.asMajorKey()
        Ab.asMinorKey().asRelativeMajor() shouldBe B.asMajorKey()
    }
}
