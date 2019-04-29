package lesson_3.javaAccessModifiers;


/**
 * <h1>Access Control Modifiers:</h1>
 * <p>
 * |           │ Class │ Package │ Subclass │ Subclass │ World
 * |           │       │         │(same pkg)│(diff pkg)│
 * ────────────┼───────┼─────────┼──────────┼──────────┼────────
 * public      │   +   │    +    │    +     │     +    │   +
 * ────────────┼───────┼─────────┼──────────┼──────────┼────────
 * protected   │   +   │    +    │    +     │     +    │
 * ────────────┼───────┼─────────┼──────────┼──────────┼────────
 * no modifier │   +   │    +    │    +     │          │
 * ────────────┼───────┼─────────┼──────────┼──────────┼────────
 * private     │   +   │         │          │          │
 * <p>
 * + : accessible         blank : not accessible
 * <p>
 * more information found on the Internet: https://www.quora.com/What-is-the-difference-between-a-private-and-protected-variable-in-Java
 */
public class Father {
    // can be accessed from anywhere
    public String name;

    // Private Data members and methods are only accessible within the class
    private String secret;

    // Protected data member and method are only accessible by the classes of the same package and the subclasses present in any package
    protected double money;

    // Default: The scope of this modifier is limited to the package only
    String anotherSecret;

    /**
     * Constructor:
     * set value of secret
     */
    public Father() {
        secret = "das ist Geheim!";
    }


    /**
     * @return String secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * @param secret String secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }
}