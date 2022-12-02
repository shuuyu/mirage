package live.shuuyu.mirage.ui.data

/**
 * Creates a switch module that is basically a boolean class.
 *
 * @param name The name of the switch module.
 * @param description The description of what the module does. If left blank, this will default to "No description provided."
 * @param category The category that the module is going to be located in.
 * @param subcategory The other category that the module is going to be located in.
 * @param hidden Makes it so the module is either public or private. By default, it will be public.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class Switch (
    val name: String,
    val description: String = "No description provided.",
    val category: String = "General",
    val subcategory: String = "",
    val hidden: Boolean = false
)