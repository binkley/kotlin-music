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
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

/**
 * *NB* &mdash; Using `EnumSource` in a parameterized test would be nice,
 * however I don't want to repeat the algorithms in checking the results.
 *
 * @todo Rethink test approach: perhaps passing in input/expected pairs?
 */
internal class PitchTest {
    @Test
    fun `all pitches have a dominant`() {
        A.dominant shouldBeSameInstanceAs E
        Bb.dominant shouldBeSameInstanceAs F
        B.dominant shouldBeSameInstanceAs Gb
        C.dominant shouldBeSameInstanceAs G
        Db.dominant shouldBeSameInstanceAs Ab
        D.dominant shouldBeSameInstanceAs A
        Eb.dominant shouldBeSameInstanceAs Bb
        E.dominant shouldBeSameInstanceAs B
        F.dominant shouldBeSameInstanceAs C
        Gb.dominant shouldBeSameInstanceAs Db
        G.dominant shouldBeSameInstanceAs D
        Ab.dominant shouldBeSameInstanceAs Eb
    }

    @Test
    fun `all pitches have a subdominant`() {
        A.subdominant shouldBeSameInstanceAs D
        Bb.subdominant shouldBeSameInstanceAs Eb
        B.subdominant shouldBeSameInstanceAs E
        C.subdominant shouldBeSameInstanceAs F
        Db.subdominant shouldBeSameInstanceAs Gb
        D.subdominant shouldBeSameInstanceAs G
        Eb.subdominant shouldBeSameInstanceAs Ab
        E.subdominant shouldBeSameInstanceAs A
        F.subdominant shouldBeSameInstanceAs Bb
        Gb.subdominant shouldBeSameInstanceAs B
        G.subdominant shouldBeSameInstanceAs C
        Ab.subdominant shouldBeSameInstanceAs Db
    }
}
