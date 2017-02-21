package org.share.bike.bikeinfo.controller;

import org.share.bike.bikeinfo.service.IBikeInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BikeInfoController {
	@Autowired
	private IBikeInfoService bikeInfoService;
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());  
	
	public BikeInfoController(){
		System.out.println("fcdddddddddddddddddssssssssssss");
		logger.debug("DEBUG TEST 这个地方输出DEBUG级别的日志");  
        logger.info("INFO test 这个地方输出INFO级别的日志");  
        logger.error("ERROR test 这个地方输出ERROR级别的日志");  
	}
}
