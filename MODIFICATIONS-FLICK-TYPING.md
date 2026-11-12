# FUTO Flick Typing — modification notice

This is a personal, non-commercial modification of the FUTO Keyboard source tree.

## What changed

- Added an **On-key predictions / Flick Typing** preference under Predictive Text settings.
- Maps the highest-ranked completion for each next-letter key from FUTO's existing suggestion list.
- Displays the predicted word above its corresponding letter key.
- A short, mostly vertical upward flick on that key inserts the complete suggested word.
- Keeps the existing suggestion strip and normal letter tapping.
- Keeps swipe typing available; only a short, mostly vertical upward flick is treated as a word-selection gesture.
- Adds a GitHub Actions workflow to build an installable `unstableDebug` APK.

## Build notes

The workflow uses the Android SDK, NDK, CMake, and the repository's recursive submodules. It builds the `unstableDebug` flavor, whose package name has the `.unstable` suffix. This allows it to be installed alongside the regular FUTO Keyboard rather than replacing it.

The resulting APK is a debug build signed with the repository's debug key. It is not signed with FUTO's official release key and cannot update the official app in place.

## Source version note

The source archive supplied for this modification was named `FUTO-Flick-Typing-master.zip`, which is the repository's default-branch archive. It was not a `v0.1.30` tag archive. Therefore this patch targets the supplied default-branch source and does not claim to be an exact source match for the separate FUTO Keyboard 0.1.30 APK.

## License notice

The upstream FUTO Source First License 1.1 is included in `LICENSE.md`. This modification is intended only for personal, non-commercial experimentation. Keep the original license, copyright, payment-related functionality, and notices intact. Do not distribute modified copies commercially.
