
public @interface Join {
    Class<?> relatedClass();
    String foreignKey();
    String localKey();
}