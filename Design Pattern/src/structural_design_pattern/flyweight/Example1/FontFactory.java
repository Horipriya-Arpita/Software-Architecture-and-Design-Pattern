package structural_design_pattern.flyweight.Example1;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    
    private static final Map<String, Font> fonts = new HashMap<>();

    public static Font getFont(String name, int size, boolean bold) {
        String key = name + "-" + size + "-" + bold;
        Font font = fonts.get(key);

        if (font == null) {
            font = new FontImpl(name, size, bold);
            fonts.put(key, font);
        }

        return font;
    }

}
