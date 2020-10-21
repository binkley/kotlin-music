package hm.binkley.music

enum class Pitches {
    // Choosing the flattened form as # is not representable in code
    A, Bb, B, C, Db, D, Eb, E, F, Gb, G, Ab;

    val dominant get() = values()[(ordinal + 7) % 12]
}
