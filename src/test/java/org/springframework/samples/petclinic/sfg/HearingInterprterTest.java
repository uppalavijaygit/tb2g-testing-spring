package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig()
class HearingInterprterTest {

    HearingInterprter hearingInterprter;

    @Test
    void getWord() {
        String interprterWord = hearingInterprter.getWord();
        assertThat("Laural").isEqualToIgnoringCase(interprterWord);
    }
}