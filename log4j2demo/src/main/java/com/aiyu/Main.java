package com.aiyu;

import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/7/17 1:34 上午
 * @description
 */

public class Main {
    //static final Logger LOGGER = LogManager.getLogger(Main.class);
    static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("log4j2 demo");
    }
}
