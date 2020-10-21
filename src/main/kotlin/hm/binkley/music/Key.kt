package hm.binkley.music

abstract class Key(val pitches: List<Pitch>) {
    val tonic get() = pitches[0]
}

/**@todo How to seal major key?  There are only 12 */
open class MajorKey(tonic: Pitch) : Key(
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

/**@todo How to seal minor key?  There are only 12 */
open class MinorKey(tonic: Pitch) : Key(
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
