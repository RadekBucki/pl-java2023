package java16.patternMatchingForInstanceof;

import java16.patternMatchingForInstanceof.withDisplayName.DisplayNamed;
import java16.patternMatchingForInstanceof.withNameShapes.Named;

public class ShapeDisplayNameResolver {

    public String resolveShape(Shape shape) {
        // implement here with pattern matching for instanceof usage

        if (shape instanceof DisplayNamed displayNamed) {
            return displayNamed.getDisplayName();
        }
        if (shape instanceof Named named) {
            return "This is " + named.getName() + " name!";
        }
        return "Unknown shape";
    }
}

// TIP: shape can be DisplayNamed or Named
// if shape is DisplayNamed use getDisplayName method
// if shape is Named use getName method and format it to expected display string
