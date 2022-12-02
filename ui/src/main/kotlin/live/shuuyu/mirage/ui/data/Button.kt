package live.shuuyu.mirage.ui.data

/**
 * Creates a button that can be interacted with.
 *
 * @param name The name of the given button module
 * @param description The description of the button module. If left blank, it will default to "No description provided".
 * @param category The category that the module is going to be located in.
 * @param subcategory The other category that the module is going to be located in.
 * @param hidden Makes it so the module is either public or private. By default, it will be public.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class Button (
    val name: String,
    val description: String = "No description provided.",
    val category: String = "",
    val subcategory: String = "",
    val hidden: Boolean = false
)