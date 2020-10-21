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
    fun `all pitches have a relative minor for major keys`() {
        A.relativeMinor shouldBeSameInstanceAs Gb
        Bb.relativeMinor shouldBeSameInstanceAs G
        B.relativeMinor shouldBeSameInstanceAs Ab
        C.relativeMinor shouldBeSameInstanceAs A
        Db.relativeMinor shouldBeSameInstanceAs Bb
        D.relativeMinor shouldBeSameInstanceAs B
        Eb.relativeMinor shouldBeSameInstanceAs C
        E.relativeMinor shouldBeSameInstanceAs Db
        F.relativeMinor shouldBeSameInstanceAs D
        Gb.relativeMinor shouldBeSameInstanceAs Eb
        G.relativeMinor shouldBeSameInstanceAs E
        Ab.relativeMinor shouldBeSameInstanceAs F
    }

    @Test
    fun `all pitches have a relative major for minor keys`() {
        A.relativeMajor shouldBeSameInstanceAs C
        Bb.relativeMajor shouldBeSameInstanceAs Db
        B.relativeMajor shouldBeSameInstanceAs D
        C.relativeMajor shouldBeSameInstanceAs Eb
        Db.relativeMajor shouldBeSameInstanceAs E
        D.relativeMajor shouldBeSameInstanceAs F
        Eb.relativeMajor shouldBeSameInstanceAs Gb
        E.relativeMajor shouldBeSameInstanceAs G
        F.relativeMajor shouldBeSameInstanceAs Ab
        Gb.relativeMajor shouldBeSameInstanceAs A
        G.relativeMajor shouldBeSameInstanceAs Bb
        Ab.relativeMajor shouldBeSameInstanceAs B
    }
}
