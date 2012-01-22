## Synopsis
If you've made it here, chances are you are not quite as satisfied with the Android application framework as you could be. Same for us, that's why we created ignition.

Ignition helps you getting your Android applications off the ground quickly, by offering ready-to-use components and utility classes that wrap a lot of the boilerplate that's involved when writing Android apps. Areas covered by ignition encompass:

 * UI components such as widgets, adapters, dialogs, and more
 * An HTTP wrapper library that allows you to write simple yet robust networking code
 * A class to load remote images off the web and cache them
 * A simple yet effective caching framework (caches to memory and disk, anything from HTTP responses to entire object trees)
 * Diagnostic helpers to gather device information and help users sending error reports to you via email
 * API level backwards compatibility helpers
 * A friendlier and more robust implementation of AsyncTask

Ignition is split up into three sub-projects. Click on one to see what's inside.

 * [ignition-core](https://github.com/kaeppler/ignition/wiki/Core-module-features). This is an Android library project that is compiled straight into your apps. This allows you to re-use views and shared resources right in your own code.
 * [ignition-support](https://github.com/kaeppler/ignition/wiki/Support-module-features). This is a standard Java library project, deployed as an ordinary JAR. It contains most of the utility classes. You can use this independently of the core module.
 * [ignition-location](https://github.com/kaeppler/ignition/wiki/Location-module-features). This is an Android AspectJ library project that is compiled straight into your apps. It allows your location-aware applications to always have the most recent location without the need to handle location updates within your Activity.

## Documentation
We decided to not write exhaustive documentation, since it would get outdated frequently. Instead, the project is documented both via [sample applications](https://github.com/kaeppler/ignition/wiki/Sample-applications) that are part of the build, as well as online JavaDoc (TODO).

## Installation
Please refer to [Installation and setup](https://github.com/kaeppler/ignition/wiki/Installation-and-setup).

## License
Apache License, Version 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)

## Authors
 * Matthias Käppler (m.kaeppler@gmail.com)
 * Stefano Dacchille (stefano.dacchille@gmail.com)
 * Michael England (mg.england@gmail.com)
 * the Android open-source community (http://stackoverflow.com/questions/tagged/android)
