This is an abbreviated project to demonstrate a bug in AGP 3.5.0's Lint functionality.  

The core of the issue is that using `@VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)` in a Kotlin file is not applied correctly.  All package-private attempts to access those classes fail lint.

To see the error, use `./gradlew :engine:lintDebug`

-----------

**Note**: The same `VisibleForTesting` declaration works if it is declared in Java.  See the difference between the `WorkingEngine*` and `NotWorkingEngine*` classes. 

**Note2**: Android Studio does not display the warning, leading me to think that this applies to the non-IDE invocation of Lint only.