package practice.setting.domain.test.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class TestServiceTest {
    @Autowired private TestService testService;

    @Test
    public void testPositive_Success_01() {
        int value = 1;
        assertThat(testService.isPositive(value)).isEqualTo(true);
    }

    @Test
    public void testPositive_Success_02() {
        int value = -1;
        assertThat(testService.isPositive(value)).isEqualTo(false);
    }
}
