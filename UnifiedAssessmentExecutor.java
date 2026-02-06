abstract class AbstractAssessmentFlow {

    public final void executeAssessment() {
        validate();
        prepare();
        evaluate();
        publishResult();
    }

    protected void validate() {
        System.out.println("Validating assessment prerequisites...");
    }

    protected void prepare() {
        System.out.println("Preparing assessment environment...");
    }

    public abstract void evaluate(); 

    protected void publishResult() {
        System.out.println("Publishing assessment result...");
    }
}

interface AutoAssessment {
    default void evaluate() {
        System.out.println("Performing automatic assessment evaluation...");
    }
}

interface ManualAssessment {
    default void evaluate() {
        System.out.println("Performing manual assessment evaluation...");
    }
}

public class UnifiedAssessmentExecutor
        extends AbstractAssessmentFlow
        implements AutoAssessment, ManualAssessment {

    private final boolean isProctored;

    public UnifiedAssessmentExecutor(boolean isProctored) {
        this.isProctored = isProctored;
    }

    @Override
    public void evaluate() {   
        if (isProctored) {
            ManualAssessment.super.evaluate();
        } else {
            AutoAssessment.super.evaluate();
        }
    }

    public static void main(String[] args) {
        UnifiedAssessmentExecutor auto = new UnifiedAssessmentExecutor(false);
        auto.executeAssessment();

        System.out.println();

        UnifiedAssessmentExecutor manual = new UnifiedAssessmentExecutor(true);
        manual.executeAssessment();
    }
}
