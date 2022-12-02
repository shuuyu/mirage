package live.shuuyu.mirage.ui.data

/**
 * Creates a slider.
 *
 * @param name The name of the slider module.
 * @param description The description of what the slider module does.
 * @param category The category that the module is going to be located in.
 * @param subcategory The other category that the module is going to be located in.
 * @param min The minimum integer that will be accepted.
 * @param max The maximum integer that will be accepted.
 * @param hidden Makes it so the module is either public or private. By default, it will be public.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class Slider (
    val name: String,
    val description: String = "No description provided.",
    val category: String = "General",
    val subcategory: String = "",
    val min: Int,
    val max: Int,
    val hidden: Boolean = false
)