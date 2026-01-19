package com.swlibs.annotation.di

import com.swlibs.annotation.preprocessor.AnnotationPreprocessor

/**
 * Inject for DI.
 *
 * @version 1 (2024-01-21)
 */
@Target(
    AnnotationTarget.PROPERTY,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@AnnotationPreprocessor
annotation class Inject(
    val value : String = ""
)
