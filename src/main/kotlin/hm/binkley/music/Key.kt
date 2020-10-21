package hm.binkley.music

import hm.binkley.music.Pitch.A
import hm.binkley.music.Pitch.B
import hm.binkley.music.Pitch.Bb
import hm.binkley.music.Pitch.C

/** @todo Extend with modal keys directly? */
sealed class Key(val notes: List<Pitch>) {
    val tonic get() = notes[0]
}

sealed class MajorKey(tonic: Pitch) :
    Key(
        listOf(
            tonic,
            tonic.supertonic,
            tonic.majorMediant,
            tonic.subdominant,
            tonic.dominant,
            tonic.majorSubmediant,
            tonic.majorSubtonic
        )
    )

sealed class MinorKey(tonic: Pitch) :
    Key(
        listOf(
            tonic,
            tonic.supertonic,
            tonic.minorMediant,
            tonic.subdominant,
            tonic.dominant,
            tonic.minorSubmediant,
            tonic.minorSubtonic
        )
    )

object AMajor : MajorKey(A)
object AMinor : MinorKey(A)
object BbMajor : MajorKey(Bb)
object BbMinor : MinorKey(Bb)
object BMajor : MajorKey(B)
object BMinor : MinorKey(B)
object CMajor : MajorKey(C)
object CMinor : MinorKey(C)
