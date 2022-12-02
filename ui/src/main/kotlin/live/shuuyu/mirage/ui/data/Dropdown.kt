package live.shuuyu.mirage.ui.data

/**
 * Creates a dropdown module.
 *
 * @param name The name of the dropdown module.
 * @param description The description of the dropdown module. If left blank, it'll default to "No description provided".
 * @param category The category that the module is going to be located in.
 * @param subcategory The other category that the module is going to be located in.
 * @param hidden Makes it so the module is either public or private. By default, it will be public.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Dropdown(
    val name: String,
    val description: String = "No description provided",
    val category: String = "",
    val subcategory: String = "",
    val hidden: Boolean = false
)