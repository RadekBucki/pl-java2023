package java9.collectionFactoryMethods;

import java.util.Set;

public class ImageConverter {
    private final static String JPG_FILE_KEY = "jpg";
    private final static String PNG_FILE_KEY = "png";
    private final static String BMP_FILE_KEY = "bmp";


    public Set<String> getAvailableFileKeys() {
        return Set.of(JPG_FILE_KEY, PNG_FILE_KEY, BMP_FILE_KEY);
    }
}
