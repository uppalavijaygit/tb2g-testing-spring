package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {BaseConfig.class,YannyConfig.class})
class HearingInterprterYanniTest {

    @Autowired
    HearingInterprter hearingInterprter;

    @Test
    void getWord() {
    }
}