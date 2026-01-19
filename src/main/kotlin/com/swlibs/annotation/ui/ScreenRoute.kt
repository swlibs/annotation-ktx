package com.swlibs.annotation.ui

import com.swlibs.annotation.development.Experimental

/**
 * Route for UI navigation.
 */
@Target(
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
@Experimental
annotation class ScreenRoute(
    val value : String = ""
)