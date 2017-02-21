package org.share.bike.bikeinfo.service.impl;

import org.share.bike.bikeinfo.dao.BikeInfoDao;
import org.share.bike.bikeinfo.service.IBikeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BikeInfoServiceImpl implements IBikeInfoService {
	@Autowired
	private BikeInfoDao bikeInfoDao;
}
