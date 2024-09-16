package practice.setting.domain.test.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

    public boolean isPositive(int value) {
        return value > 0;
    }

    public void validatePositive(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("test error");
        }
    }
}
