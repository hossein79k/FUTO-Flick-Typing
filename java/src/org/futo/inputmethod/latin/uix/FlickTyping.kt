package org.futo.inputmethod.latin.uix

import androidx.datastore.preferences.core.booleanPreferencesKey

/**
 * Enables BlackBerry-style on-key predictions. Predictions are displayed on the letter key
 * corresponding to the next character; a short upward flick on that key inserts the full word.
 */
val FlickTypingEnabled = SettingsKey(
    key = booleanPreferencesKey("flick_typing_enabled"),
    default = true
)
