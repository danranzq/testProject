package com.project.test.log4j;

import org.apache.log4j.Logger;

public class TestLog {
	private static Logger log = Logger.getLogger(TestLog.class);
	public static void main(String[] args) {
		log.info("######Info message!");
		log.debug("#####Debug Message!");
		log.error("#########error message!");
		log.warn("##########warn message!");
		log.fatal("##########fatal message!");
	}
}
