package nl.tudelft.core.language;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class PredicateIdentity {
    /**
     * The name of the predicate.
     */
    private final String name;

    /**
     * The arity (number of arguments).
     */
    private final int arity;

    /**
     * The kind or origin.
     */
    private final Kind kind;

    /**
     * The element that declares this predicate.
     */
    private transient PsiElement declarator;

    /**
     * Any documentation, if present.
     */
    private transient String documentation = "";

    /**
     * Creates a new predicate.
     *
     * @param name  the name
     * @param arity the arity, or number of arguments
     * @param kind  the kind of predicate, either a callable or knowledge
     */
    public PredicateIdentity(final @NotNull @NonNls String name, final int arity, final Kind kind) {
        this.name = name;
        this.arity = arity;
        this.kind = kind;
    }

    /**
     * Sets the docstring.
     *
     * @param documentation the docstring
     */
    public void setDocumentation(final @NotNull @NonNls String documentation) {
        this.documentation = documentation;
    }

    /**
     * Sets the declaring element.
     *
     * @param declarator the element
     */
    public void setDeclarator(final @NotNull PsiElement declarator) {
        this.declarator = declarator;
    }

    /**
     * Returns the name of the predicate.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the arity of the predicate.
     *
     * @return the arity
     */
    public int getArity() {
        return this.arity;
    }

    /**
     * Returns the kind of the predicate.
     *
     * @return the kind
     */
    public Kind getKind() {
        return this.kind;
    }

    /**
     * Returns the docstring.
     *
     * @return the docstring
     */
    public String getDocumentation() {
        return this.documentation;
    }

    /**
     * Returns the declaring element.
     *
     * @return the declarator
     */
    public PsiElement getDeclarator() {
        return this.declarator;
    }

    /**
     * Returns true if both predicates describe the same predicate.
     *
     * @param pred the other predicate
     *
     * @return {@code true} if they describe the same predicate, otherwise {@code false}
     */
    public boolean isEquivalent(final PredicateIdentity pred) {
        return Objects.equals(this.name, pred.name)
                && this.arity == pred.arity;
    }

    /**
     * Checks whether this object is equal to another.
     *
     * @param obj the other object
     *
     * @return {@code true} if the objects are equal, otherwise {@code false}
     */
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof PredicateIdentity)) {
            return false;
        }

        final PredicateIdentity other = (PredicateIdentity) obj;

        return Objects.equals(this.name, other.name)
                && this.arity == other.arity;
    }

    /**
     * Calculates the object's hash code.
     *
     * @return the hash code
     */
    public int hashCode() {
        return Objects.hash(this.name, this.arity);
    }

    /**
     * Returns the predicate as a string, in the form of name/arity.
     *
     * Example: member/2
     *
     * @return the predicate as a string
     */
    public String toString() {
        return this.name + '/' + this.arity;
    }

    /**
     * The predicate kind.
     */
    public enum Kind {
        /**
         * Not a true declaration, but rather an instance where this predicate was used.
         */
        REFERENCE,

        /**
         * An action.
         */
        ACTION,

        /**
         * A module.
         */
        MODULE,

        /**
         * A macro.
         */
        MACRO,

        /**
         * A dynamic Prolog declaration.
         */
        DYNAMIC,

        /**
         * A Prolog rule.
         */
        RULE,

        /**
         * A Prolog fact.
         */
        FACT,

        /**
         * A Prolog builtin.
         */
        BUILTIN
    }
}
