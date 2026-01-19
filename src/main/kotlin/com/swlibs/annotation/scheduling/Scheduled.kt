package com.swlibs.annotation.scheduling

import com.swlibs.annotation.preprocessor.AnnotationPreprocessor

/**
 * Scheduled tasks.
 *
 * @version 1 (2024-01-21)
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
@AnnotationPreprocessor
annotation class Scheduled(
    val interval: Long = 1000L,
    val initialDelay: Long = 0L
)
