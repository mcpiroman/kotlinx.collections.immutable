/*
 * Copyright 2016-2019 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package kotlinx.collections.immutable.internal

internal actual fun assert(condition: Boolean) = kotlin.assert(condition)


internal actual var AbstractMutableList<*>.modCount: Int
    get() = 0
    set(@Suppress("UNUSED_PARAMETER") value) {}