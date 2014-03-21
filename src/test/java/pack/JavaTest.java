package pack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static pack.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by de13lb on 3/21/14.
 */
public class JavaTest {

    @Test
    public void test() {
        assertThat(new Java()).hasField(null);
    }

    @Test
    public void scalaTest() {
        assertThat(Scala.method()).isNotNull();
    }
}
