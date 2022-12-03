package live.shuuyu.mirage.ui.data

import java.util.Locale

/**
 * Creates a new property.
 *
 * @param name The name of the given module
 * @param description The description of what the module does. If left blank, it will default to "No description provided".
 * @param category The category of which the module is going to be located at.
 * @param experimental Marks the given module as WIP
 */
@Deprecated(
    message = "Why did I add this again? Oh right, because I am dumb.",
    level = DeprecationLevel.ERROR
)
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class Property(
    val name: String,
    val description: String = "No description provided.",
    val category: String = "",
    val experimental: Boolean = false
)