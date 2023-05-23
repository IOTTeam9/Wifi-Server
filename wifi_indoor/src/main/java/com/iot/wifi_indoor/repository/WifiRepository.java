package com.iot.wifi_indoor.repository;

import com.iot.wifi_indoor.domain.Wifi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WifiRepository extends JpaRepository<Wifi, Long> {
}
