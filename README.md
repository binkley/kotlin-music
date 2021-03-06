<a href="LICENSE.md">
<img src="https://unlicense.org/pd-icon.png" alt="Public Domain" align="right"/>
</a>

# Kotlin Music

[![build](https://github.com/binkley/kotlin-music/workflows/build/badge.svg)](https://github.com/binkley/kotlin-music/actions)
[![issues](https://img.shields.io/github/issues/binkley/kotlin-music.svg)](https://github.com/binkley/kotlin-music/issues/)
[![Public Domain](https://img.shields.io/badge/license-Public%20Domain-blue.svg)](http://unlicense.org/)
[![made with kotlin](https://img.shields.io/badge/made%20with-Kotlin-1f425f.svg)](https://kotlinlang.org/)

Kotlin types, properties, and functions for music.

## Build and try

To build, use `./mvnw clean verify`.

There are no run-time dependencies.

## Platform

This code has been built for JDK 11.

## Build

* [DependencyCheck](https://github.com/jeremylong/DependencyCheck) scans for
  dependency security issues
* [detekt](https://github.com/arturbosch/detekt) runs static code analysis for
  Kotlin
* [JUnit](https://github.com/junit-team/junit5) runs tests
* [JaCoCo](https://github.com/jacoco/jacoco) measures code coverage
* [ktlint](https://github.com/pinterest/ktlint) keeps code tidy

Use `./mvnw` (Maven) or `./batect build` (Batect) to build, run tests, and
create a demo program. Use `./run.sh` or `./batect run` to run the demo.

[Batect](https://batect.dev/) works "out of the box", however, an important
optimization is to avoid redownloading plugins and dependencies from within a
Docker container.

This shares Maven plugin and dependency downloads with the Docker container
run by Batect.

## API

### Pitches

Pitches are assumed as
[_equal temperment_](https://en.wikipedia.org/wiki/Equal_temperament): "A#"
is treated as identical to "Bb".

The 12 standard pitches are represented as the
[`Pitches`](src/main/kotlin/hm/binkley/music/Pitch.kt) `enum`. This code
chooses to represent "black key" notes as _flats_ in the enum values. In terms
of code, it is easy to append a simple "b" character to a "white key" enum
name, and difficult to append a "#" symbol, and this helps with code
completion, and Java interoperability.

#### Properties

- `flatSupertonic`
- `supertonic`
- `minorMediant`
- `majorMediant`
- `subdominant`
- `tritone`
- `dominant`
- `minorSubmediant`
- `majorSubmediant`
- `minorSubtonic`
- `minorSupertonic`

#### Functions

- `asMajorKey` returns a standard major scale for the pitch
- `asMinorKey` returns a standard minor scale for the pitch

### Scales

The implicit assumption is a 12-tone scale. Factory methods are provided to
produce a standard major or minor scale.

#### Properties

- `tonic` is the root of the scale following tradition
- `pitches` are the notes, with the tonic as the first element

#### Functions

- `MajorScale.asRelativeMinor` returns the relative minor scale of a major
  scale
- `MinorScale.asRelativeMajor` returns the relative major scale of a minor
  scale
