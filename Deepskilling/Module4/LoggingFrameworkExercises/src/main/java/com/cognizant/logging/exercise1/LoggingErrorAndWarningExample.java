package com.cognizant.logging.exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingErrorAndWarningExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingErrorAndWarningExample.class);

    public static void main(String[] args) {

        logger.error("This is an error message");

        logger.warn("This is a warning message");
    }
}