package analysis.utils;

import java.util.logging.Level;

/**
 * Created by alistarle on 28/03/2017.
 */
public class Info {

    private int label;
    private String message;
    private Level level;

    public Info(int label, String message, Level level) {
        this.label = label;
        this.message = message;
        this.level = level;
    }

    public int getLabel() {
        return label;
    }

    public String getMessage() {
        return message;
    }

    public Level getLevel() {
        return level;
    }
}
