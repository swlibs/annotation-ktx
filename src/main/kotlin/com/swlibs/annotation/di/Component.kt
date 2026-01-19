package com.swlibs.annotation.di

import com.swlibs.annotation.preprocessor.AnnotationPreprocessor

/**
 * Component for DI.
 *
 * @version 1 (2024-01-21)
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
@AnnotationPreprocessor
annotation class Component(
    val value : String = ""
)