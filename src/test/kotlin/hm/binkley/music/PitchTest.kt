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
import io.kotest.assertions.throwables.shouldThrow
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
    fun `all pitches have a supertonic`() {
        A.supertonic shouldBeSameInstanceAs B
        Bb.supertonic shouldBeSameInstanceAs C
        B.supertonic shouldBeSameInstanceAs Db
        C.supertonic shouldBeSameInstanceAs D
        Db.supertonic shouldBeSameInstanceAs Eb
        D.supertonic shouldBeSameInstanceAs E
        Eb.supertonic shouldBeSameInstanceAs F
        E.supertonic shouldBeSameInstanceAs Gb
        F.supertonic shouldBeSameInstanceAs G
        Gb.supertonic shouldBeSameInstanceAs Ab
        G.supertonic shouldBeSameInstanceAs A
        Ab.supertonic shouldBeSameInstanceAs Bb
    }

    @Test
    fun `all pitches have a minor mediant`() {
        A.minorMediant shouldBeSameInstanceAs C
        Bb.minorMediant shouldBeSameInstanceAs Db
        B.minorMediant shouldBeSameInstanceAs D
        C.minorMediant shouldBeSameInstanceAs Eb
        Db.minorMediant shouldBeSameInstanceAs E
        D.minorMediant shouldBeSameInstanceAs F
        Eb.minorMediant shouldBeSameInstanceAs Gb
        E.minorMediant shouldBeSameInstanceAs G
        F.minorMediant shouldBeSameInstanceAs Ab
        Gb.minorMediant shouldBeSameInstanceAs A
        G.minorMediant shouldBeSameInstanceAs Bb
        Ab.minorMediant shouldBeSameInstanceAs B
    }

    @Test
    fun `all pitches have a major mediant`() {
        A.majorMediant shouldBeSameInstanceAs Db
        Bb.majorMediant shouldBeSameInstanceAs D
        B.majorMediant shouldBeSameInstanceAs Eb
        C.majorMediant shouldBeSameInstanceAs E
        Db.majorMediant shouldBeSameInstanceAs F
        D.majorMediant shouldBeSameInstanceAs Gb
        Eb.majorMediant shouldBeSameInstanceAs G
        E.majorMediant shouldBeSameInstanceAs Ab
        F.majorMediant shouldBeSameInstanceAs A
        Gb.majorMediant shouldBeSameInstanceAs Bb
        G.majorMediant shouldBeSameInstanceAs B
        Ab.majorMediant shouldBeSameInstanceAs C
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

    @Test
    fun `all pitches have a tritone`() {
        A.tritone shouldBeSameInstanceAs Eb
        Bb.tritone shouldBeSameInstanceAs E
        B.tritone shouldBeSameInstanceAs F
        C.tritone shouldBeSameInstanceAs Gb
        Db.tritone shouldBeSameInstanceAs G
        D.tritone shouldBeSameInstanceAs Ab
        Eb.tritone shouldBeSameInstanceAs A
        E.tritone shouldBeSameInstanceAs Bb
        F.tritone shouldBeSameInstanceAs B
        Gb.tritone shouldBeSameInstanceAs C
        G.tritone shouldBeSameInstanceAs Db
        Ab.tritone shouldBeSameInstanceAs D
    }

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
    fun `all pitches have a minor submediant`() {
        A.minorSubmediant shouldBeSameInstanceAs F
        Bb.minorSubmediant shouldBeSameInstanceAs Gb
        B.minorSubmediant shouldBeSameInstanceAs G
        C.minorSubmediant shouldBeSameInstanceAs Ab
        Db.minorSubmediant shouldBeSameInstanceAs A
        D.minorSubmediant shouldBeSameInstanceAs Bb
        Eb.minorSubmediant shouldBeSameInstanceAs B
        E.minorSubmediant shouldBeSameInstanceAs C
        F.minorSubmediant shouldBeSameInstanceAs Db
        Gb.minorSubmediant shouldBeSameInstanceAs D
        G.minorSubmediant shouldBeSameInstanceAs Eb
        Ab.minorSubmediant shouldBeSameInstanceAs E
    }

    @Test
    fun `all pitches have a major submediant`() {
        A.majorSubmediant shouldBeSameInstanceAs Gb
        Bb.majorSubmediant shouldBeSameInstanceAs G
        B.majorSubmediant shouldBeSameInstanceAs Ab
        C.majorSubmediant shouldBeSameInstanceAs A
        Db.majorSubmediant shouldBeSameInstanceAs Bb
        D.majorSubmediant shouldBeSameInstanceAs B
        Eb.majorSubmediant shouldBeSameInstanceAs C
        E.majorSubmediant shouldBeSameInstanceAs Db
        F.majorSubmediant shouldBeSameInstanceAs D
        Gb.majorSubmediant shouldBeSameInstanceAs Eb
        G.majorSubmediant shouldBeSameInstanceAs E
        Ab.majorSubmediant shouldBeSameInstanceAs F
    }

    @Test
    fun `all pitches have a minor subtonic`() {
        A.minorSubtonic shouldBeSameInstanceAs G
        Bb.minorSubtonic shouldBeSameInstanceAs Ab
        B.minorSubtonic shouldBeSameInstanceAs A
        C.minorSubtonic shouldBeSameInstanceAs Bb
        Db.minorSubtonic shouldBeSameInstanceAs B
        D.minorSubtonic shouldBeSameInstanceAs C
        Eb.minorSubtonic shouldBeSameInstanceAs Db
        E.minorSubtonic shouldBeSameInstanceAs D
        F.minorSubtonic shouldBeSameInstanceAs Eb
        Gb.minorSubtonic shouldBeSameInstanceAs E
        G.minorSubtonic shouldBeSameInstanceAs F
        Ab.minorSubtonic shouldBeSameInstanceAs Gb
    }

    @Test
    fun `all pitches have a major subtonic`() {
        A.majorSubtonic shouldBeSameInstanceAs Ab
        Bb.majorSubtonic shouldBeSameInstanceAs A
        B.majorSubtonic shouldBeSameInstanceAs Bb
        C.majorSubtonic shouldBeSameInstanceAs B
        Db.majorSubtonic shouldBeSameInstanceAs C
        D.majorSubtonic shouldBeSameInstanceAs Db
        Eb.majorSubtonic shouldBeSameInstanceAs D
        E.majorSubtonic shouldBeSameInstanceAs Eb
        F.majorSubtonic shouldBeSameInstanceAs E
        Gb.majorSubtonic shouldBeSameInstanceAs F
        G.majorSubtonic shouldBeSameInstanceAs Gb
        Ab.majorSubtonic shouldBeSameInstanceAs G
    }

    @Test
    fun `all pitches have alternative names`() {
        shouldThrow<IllegalArgumentException> {
            Pitch.equivalentTo("F###") // No triple sharps
        }
        shouldThrow<IllegalArgumentException> {
            Pitch.equivalentTo("Bbbb") // No triple flats
        }

        Pitch.equivalentTo("A") shouldBeSameInstanceAs A
        Pitch.equivalentTo("Gx") shouldBeSameInstanceAs A
        Pitch.equivalentTo("Bbb") shouldBeSameInstanceAs A
        Pitch.equivalentTo("Bb") shouldBeSameInstanceAs Bb
        Pitch.equivalentTo("A#") shouldBeSameInstanceAs Bb
        Pitch.equivalentTo("Cbb") shouldBeSameInstanceAs Bb
        Pitch.equivalentTo("B") shouldBeSameInstanceAs B
        Pitch.equivalentTo("Ax") shouldBeSameInstanceAs B
        Pitch.equivalentTo("Cb") shouldBeSameInstanceAs B
        Pitch.equivalentTo("C") shouldBeSameInstanceAs C
        Pitch.equivalentTo("B#") shouldBeSameInstanceAs C
        Pitch.equivalentTo("Dbb") shouldBeSameInstanceAs C
        Pitch.equivalentTo("Db") shouldBeSameInstanceAs Db
        Pitch.equivalentTo("C#") shouldBeSameInstanceAs Db
        Pitch.equivalentTo("Bx") shouldBeSameInstanceAs Db
        Pitch.equivalentTo("D") shouldBeSameInstanceAs D
        Pitch.equivalentTo("Cx") shouldBeSameInstanceAs D
        Pitch.equivalentTo("Ebb") shouldBeSameInstanceAs D
        Pitch.equivalentTo("Eb") shouldBeSameInstanceAs Eb
        Pitch.equivalentTo("D#") shouldBeSameInstanceAs Eb
        Pitch.equivalentTo("Fbb") shouldBeSameInstanceAs Eb
        Pitch.equivalentTo("E") shouldBeSameInstanceAs E
        Pitch.equivalentTo("Dx") shouldBeSameInstanceAs E
        Pitch.equivalentTo("Fb") shouldBeSameInstanceAs E
        Pitch.equivalentTo("F") shouldBeSameInstanceAs F
        Pitch.equivalentTo("E#") shouldBeSameInstanceAs F
        Pitch.equivalentTo("Gbb") shouldBeSameInstanceAs F
        Pitch.equivalentTo("Gb") shouldBeSameInstanceAs Gb
        Pitch.equivalentTo("F#") shouldBeSameInstanceAs Gb
        Pitch.equivalentTo("Ex") shouldBeSameInstanceAs Gb
        Pitch.equivalentTo("G") shouldBeSameInstanceAs G
        Pitch.equivalentTo("Fx") shouldBeSameInstanceAs G
        Pitch.equivalentTo("Abb") shouldBeSameInstanceAs G
        // NB -- A-flat is special, with black keys on either side
        Pitch.equivalentTo("Ab") shouldBeSameInstanceAs Ab
        Pitch.equivalentTo("G#") shouldBeSameInstanceAs Ab
    }
}
