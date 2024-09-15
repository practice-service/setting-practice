package practice.setting.domain.test.application;

import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("테스트 메소드 참 반환")
    public void testPositive() {
        int value = 1;
        assertThat(testService.isPositive(value)).isEqualTo(true);
    }

    @Test
    @DisplayName("테스트 메소드 거짓 반환")
    public void testNegative() {
        int value = -1;
        assertThat(testService.isPositive(value)).isEqualTo(false);
    }
}
