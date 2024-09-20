package practice.setting.domain.tests.application;

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
}
