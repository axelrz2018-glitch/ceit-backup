package org.arh.mikmp
import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSTimeZone
import platform.Foundation.localTimeZone

// implementación 'actual' en shared/src/iosMain/
actual fun getCurrentTime(): String {
    val formatter = NSDateFormatter().apply {
        dateFormat = "HH:mm:ss"
        timeZone = NSTimeZone.localTimeZone
    }
    return formatter.stringFromDate(NSDate())
}
