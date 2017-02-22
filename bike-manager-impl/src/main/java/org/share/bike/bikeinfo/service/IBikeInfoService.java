package org.share.bike.bikeinfo.service;

import java.util.List;

import org.share.bike.bikeinfo.entity.BikeInfo;

public interface IBikeInfoService {

	List<BikeInfo> findAll();
}
