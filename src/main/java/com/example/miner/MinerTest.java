package com.example.miner;

import com.example.miner.components.Miner;
import com.example.miner.configuration.MinerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MinerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MinerConfiguration.class);
        Miner miner =  context.getBean("miner", Miner.class);
        miner.checkHash("Hello World");
        context.close();
    }


}
