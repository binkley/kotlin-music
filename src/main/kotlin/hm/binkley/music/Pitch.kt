package hm.binkley.music

enum class Pitch(private val aka: List<String>) {
    // Choosing the flattened form as # is not representable in code
    // Note the interplay of white-vs-black note keys
    A(listOf("Gx", "Bbb")),
    Bb(listOf("A#", "Cbb")),
    B(listOf("Ax", "Cb")),
    C(listOf("B#", "Dbb")),
    Db(listOf("C#", "Bx")),
    D(listOf("Cx", "Ebb")),
    Eb(listOf("D#", "Fbb")),
    E(listOf("Dx", "Fb")),
    F(listOf("E#", "Gbb")),
    Gb(listOf("F#", "Ex")),
    G(listOf("Fx", "Abb")),
    Ab(listOf("G#"));

    val flatSupertonic get() = this + 1
    val supertonic get() = this + 2
    val minorMediant get() = this + 3
    val majorMediant get() = this + 4
    val subdominant get() = this + 5
    val tritone get() = this + 6
    val dominant get() = this + 7
    val minorSubmediant get() = this + 8
    val majorSubmediant get() = this + 9
    val minorSubtonic get() = this + 10
    val majorSubtonic get() = this + 11

    operator fun plus(steps: Int) = values()[(ordinal + steps) % 12]

    fun asMajorKey() = MajorKey(this)
    fun asMinorKey() = MinorKey(this)

    companion object {
        /**
         * *NB* &mdash; there is no clean way to "override" a static
         * function.
         */
        fun equivalentTo(name: String): Pitch {
            for (value in values()) {
                if (name == value.name) return value
                if (name in value.aka) return value
            }
            throw IllegalArgumentException("No enum constant matches $name.")
        }
    }
}
