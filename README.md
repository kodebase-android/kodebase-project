# Kodebase Android
Welcome! Kodebase is basic Android project skeleton, it's using MVVM architecture, data binding, navigation components and other common technologies. The goal of this project is saving your time, avoid boilerplate and let you focus on important things.

## Main Features
- 100% Kotlin
- Base MVVM classes
- Data Binding Enabled
- Navigation Component with SafeArgs
- Prepared MainActivity with NavHostFragment and nav_graph
- Basic binding adapters (for network image loading etc.)
- No need for implementing RecyclerView adapters
- Integrated Koin
- Prepared AppTheme with basic colors
- Custom logger with hyperlinks in Logcat (+optionally Firebase Crashlytics)

## Getting Started
- Simply clone this project and you're ready.
- Change the applicationId in build.gradle
- Change app_name in strings.xml
- Change basic colors in colors.xml

## Used Libraries
- AndroidX
- Material Components
- Koin
- Glide

## FAQ
#### Why the hell the package name is "app"?
Well, forget about Java. It's not something bad and it has good reasons. This is really needed to have fully working Kodebase Templates for Android Studio with all their benefits. Ofcourse you can change it to your own, but then templates wouldn't be 100% seamless.


