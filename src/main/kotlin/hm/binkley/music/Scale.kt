package hm.binkley.music

import lombok.Generated
import java.util.Objects.hash

abstract class Scale(val pitches: List<Pitch>) {
    val tonic get() = pitches[0]

    @Generated
    override fun equals(other: Any?) = this === other ||
        other is Scale &&
        pitches == other.pitches

    @Generated
    override fun hashCode() = hash(javaClass, pitches)

    @Generated
    override fun toString() = pitches.toString()
}

/**@todo How best to seal major key?  There are only 12 */
open class MajorKey(tonic: Pitch) : Scale(
    listOf(
        tonic,
        tonic.supertonic,
        tonic.majorMediant,
        tonic.subdominant,
        tonic.dominant,
        tonic.majorSubmediant,
        tonic.majorSubtonic
    )
) {
    fun asRelativeMinor() = MinorKey(tonic.majorSubmediant)
}

/**@todo How best to seal minor key?  There are only 12 */
open class MinorKey(tonic: Pitch) : Scale(
    listOf(
        tonic,
        tonic.supertonic,
        tonic.minorMediant,
        tonic.subdominant,
        tonic.dominant,
        tonic.minorSubmediant,
        tonic.minorSubtonic
    )
) {
    fun asRelativeMajor() = MajorKey(tonic.minorMediant)
}
