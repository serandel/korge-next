
package com.soywiz.korge.gradle

object BuildVersions {
    const val GIT = "v2.0.7.0-31-gb0fa8fda-dirty"
    const val KRYPTO = "2.0.0.999"
	const val KLOCK = "2.0.0.999"
	const val KDS = "2.0.0.999"
	const val KMEM = "2.0.0.999"
	const val KORMA = "2.0.0.999"
	const val KORIO = "2.0.0.999"
	const val KORIM = "2.0.0.999"
	const val KORAU = "2.0.0.999"
	const val KORGW = "2.0.0.999"
	const val KORGE = "2.0.0.999"
	const val KOTLIN = "1.4.31"
    const val JNA = "5.7.0"
	const val COROUTINES = "1.4.2"
	const val ANDROID_BUILD = "4.0.1"

    val ALL_PROPERTIES by lazy { listOf(::GIT, ::KRYPTO, ::KLOCK, ::KDS, ::KMEM, ::KORMA, ::KORIO, ::KORIM, ::KORAU, ::KORGW, ::KORGE, ::KOTLIN, ::JNA, ::COROUTINES, ::ANDROID_BUILD) }
    val ALL by lazy { ALL_PROPERTIES.associate { it.name to it.get() } }
}
