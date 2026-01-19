package com.swlibs.annotation.modularization

import com.swlibs.annotation.development.Experimental
import com.swlibs.annotation.preprocessor.AnnotationPreprocessor

/**
 * Application module.
 *
 * @version 1 (2024-06-21)
 */
@Target(
    AnnotationTarget.CLASS
)
@Experimental
@AnnotationPreprocessor
annotation class ModuleBean(val value: String)
