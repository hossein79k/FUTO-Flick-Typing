# Build the FUTO Flick Typing APK using only a phone

The APK is built on GitHub Actions, so the phone does not need Android Studio, Windows, the Android NDK, or a local Gradle installation.

## Apply the source patch

1. Open your fork: `https://github.com/hossein79k/FUTO-Flick-Typing`.
2. Clone/open that repository in Code on the Go (or another Git client/editor on your phone).
3. Copy the supplied `flick-typing.patch` file into the repository root.
4. Open the project's terminal and run:

   ```sh
   git apply flick-typing.patch
   ```

5. Check that the patch applied without errors, then commit and push the changes to `master` (or `main`).

If your Code on the Go build does not include a Git terminal, use its file manager to replace the files listed in `flick-typing-overlay.zip` in the matching paths, then commit/push those changes with the Git client you use.

## Run the cloud build

1. Open the fork on GitHub in your phone browser.
2. Open the **Actions** tab.
3. Select **Build FUTO Flick Typing APK**.
4. Tap **Run workflow**, choose the branch containing the changes, and start the run.
5. Wait for the workflow to finish successfully.
6. Open that run and download the artifact named **futo-flick-typing-apk**.
7. Extract the downloaded artifact ZIP and install the APK.

## Install behavior

This workflow builds `unstableDebug`, which has a distinct `.unstable` application ID. It can coexist with the official FUTO keyboard. Select the new FUTO Flick keyboard in Android Settings > System > Keyboard > On-screen keyboard (the exact menu wording varies by device).

The APK is a personal debug build, not an official FUTO release. It is signed with the repository's debug key, so it cannot update the official FUTO app in place.

## If the build fails

Open the failed GitHub Actions run and share the first red error section or the full build log. A common issue would be a submodule that GitHub Actions cannot fetch; the workflow checks out submodules recursively because FUTO's README says they are required.
