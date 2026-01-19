# Package

Date: 2024-01-21.
Name: com.swlibs.annotation-ktx

Annotation Library.

* `ApplicationBean` - marks the Application class. Detailed description in the module `preprocessor-ktx`.

## Development

Annotations used in development.

* `Development` - marks temporary classes that should be removed from the release;
* `Experimental` - experimental functionality.

## DI

Date: 2024-01-21

Inversion of Control. Dependency injection.

DI (Dependency injection) - annotations for dependency injection.
Preprocessor required (example: `preprocessor-ktx`).

* `Component`
* `Inject`

When launched, the application creates instances marked with annotation `com.swlibs.annotation.di.Component` and adds them to `BeansContext`.
Dependencies are marked with annotations `com.swlibs.annotation.di.Inject`.
Example:
```kotlin
import com.swlibs.annotation.di.Component
import com.swlibs.annotation.di.Inject

open class Human(val name: String)

//Component created from a class
@Component("ivan")
class Ivan : Human("Ivan")

//Component obtained from the method
object People {
    @Component("tom")
    fun getTom() : Human {
        return Human("Tom")
    }
}

//Value injection in parameter
class Team {
    @Inject("ivan") lateinit var leader: Human
}

//Value injection in field
class Project(@Inject("tom") owner: Human)
```

## Modularization

Date: 2024-07-29
Modularization for application.
Methods marked with annotation `com.swlibs.annotation.modularization.ModuleBean` will become application modules.
Parameters:
* `value` module name

Example:
```kotlin
import com.swlibs.annotation.modularization.ApplicationModule
import com.swlibs.modularization.OnCreateModule

@ApplicationModule("preferences")
class ExampleManager : OnCreateModule {
    fun onCreate() {
        /*...*/
    }
}
```

## Preprocessor

Annotations for preprocessor automation.

* `AnnotationPreprocessor`

## REST

Annotations for WEB requests.

* `Body`
* `Header`
* `RequestRoute`

## Scheduling

Date: 2024-01-21.
Executing functions on a timer. Preprocessor required (example: `preprocessor-ktx`).

* `Scheduled` - Analogue `Scheduled` from Spring Framework.

Methods marked with annotation `com.swlibs.annotation.scheduling.Scheduled` will be executed on schedule.
Parameters:
* `interval` frequency of execution
* `initialDelay` delay before first execution

Example:
```kotlin
import com.swlibs.annotation.scheduling.Scheduled

object ExampleManager {
    @Scheduled(interval=5000, initialDelay=5000)
    fun scheduledTask() {
        /*...*/
    }
}
```

## UI

Annotations for the user interface.

* `ScreenRoute`



