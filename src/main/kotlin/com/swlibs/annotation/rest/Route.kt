package com.swlibs.annotation.rest

import com.swlibs.annotation.preprocessor.AnnotationPreprocessor

/**
 * Endpoint route for request.
 *
 * @version 2 (2024-01-28)
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@AnnotationPreprocessor
annotation class Route(

    /**
     * Endpoint path
     */
    val path : String = ""

)
