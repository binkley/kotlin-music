package hm.binkley.music

abstract class Scale(val pitches: List<Pitch>) {
    val tonic get() = pitches[0]
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
    val relativeMinor = tonic.majorSubmediant
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
    val relativeMinor = MajorKey(tonic.minorMediant)
}
