package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

@Service
public class HearingInterprter {

    WordProducer wordProducer;

    public HearingInterprter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String getWord(){
        String producerWord = wordProducer.getWord();
        System.out.println("producerWord = " + producerWord);
        return producerWord;
    }

}
