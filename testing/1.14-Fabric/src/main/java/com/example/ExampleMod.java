package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod {
    public static final Logger LOGGER = LogManager.getLogger("modid");


    @Override
    public void onInitialize() {
        ExampleMod.LOGGER.info("Hello from Fabric!");
    }
}
