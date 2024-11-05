import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter charWritter = new CharArrayWriter();

        for (String word : words) {
            charWritter.write(word);
        }
        char[] array = charWritter.toCharArray();
        charWritter.close();

        return array;

    }
}