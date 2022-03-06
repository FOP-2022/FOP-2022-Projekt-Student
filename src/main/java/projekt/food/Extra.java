package projekt.food;


/**
 * A modification that targets configurable values in a {@link Food.Config}.
 *
 * @param <C> The target {@link Food.Config} type
 */
public interface Extra<C extends Food.Config> {

    /**
     * The name of this extra.
     *
     * @return The name of this extra
     */
    String getName();

    /**
     * The priority of the extra, lower is calculated first.
     *
     * @return The priority of this extra
     */
    int getPriority();

    /**
     * Applies the modifications of this extra to the provided {@link C config}.
     *
     * @param config {@link Food.Config} to modify
     */
    void apply(C config);
}
