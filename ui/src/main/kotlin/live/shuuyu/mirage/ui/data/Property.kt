package live.shuuyu.mirage.ui.data

/**
 * Creates a new property.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Property(
    val name: String,
    val description: String = "No description provided.",
    val category: String = "",
    val experimental: Boolean = false
)