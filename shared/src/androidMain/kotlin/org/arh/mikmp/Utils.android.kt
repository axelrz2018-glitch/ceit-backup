package org.arh.mikmp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// implementación 'actual' en shared/src/androidMain/
actual fun getCurrentTime(): String {
    val formatter = SimpleDateFormat(
        "HH:mm:ss", Locale.getDefault()
    )
    return formatter.format(Date())
}