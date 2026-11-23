package io.github.dovecoteescapee.byedpi.utility

import android.app.Activity
import android.content.Context
import io.github.dovecoteescapee.byedpi.R

/** True when running on a device whose UI mode is "television" (see values-television). */
fun Context.isTv(): Boolean = resources.getBoolean(R.bool.is_tv)

/** Call before setContentView. Adds visible focus highlights for D-pad navigation. */
fun Activity.applyTvThemeOverlay() {
    if (isTv()) {
        theme.applyStyle(R.style.ThemeOverlay_ByeDPI_Tv, true)
    }
}
