package hm.binkley.music

enum class Pitch {
    // Choosing the flattened form as # is not representable in code
    A, Bb, B, C, Db, D, Eb, E, F, Gb, G, Ab;

    val supertonic get() = this + 2
    val minorMediant get() = this + 3
    val majorMediant get() = this + 4
    val subdominant get() = this + 5
    val tritone get() = this + 6
    val dominant get() = this + 7

    /** The "relative minor" implies we are in a major key. */
    val relativeMinor get() = this + 9

    /** The "relative major" implies we are in a minor key. */
    val relativeMajor get() = this + 3

    operator fun plus(steps: Int) = values()[(ordinal + steps) % 12]
}
