package ibm.java.academy.services.eduardocortes.constant;

/**
 * @author Eduardo Cortés
 */

public class BusinessErrorMessages {

    public static final String STUDENT_ID_INVALID = "Was not found student by id: ";
    public static final String GENDER_KEY_INVALID = "There is no gender with key: ";
    public static final String DATETIME_PARSE_INVALID = "Text cannot be parsed to example pattern: yyy-MM-dd";

    private BusinessErrorMessages() {
        throw new IllegalStateException("Utility class");
    }
}
