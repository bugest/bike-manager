package org.share.bike.bikeinfo.dao;

import org.share.bike.bikeinfo.entity.BikeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeInfoDao extends JpaRepository<BikeInfo, String> {

}
