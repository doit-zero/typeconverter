package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class MyNumberFormatterTest {
    MyNumberFormatter formatter = new MyNumberFormatter();
    @Test
    public void parse_test() throws Exception{
        Number result = formatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L);
    }
    @Test
    void print_test(){
        String result = formatter.print(1000,Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }
}
