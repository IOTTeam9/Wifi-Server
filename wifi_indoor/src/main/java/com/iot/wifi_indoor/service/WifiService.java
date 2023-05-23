package com.iot.wifi_indoor.service;

import com.iot.wifi_indoor.domain.Wifi;
import com.iot.wifi_indoor.dto.PostWifiReq;
import com.iot.wifi_indoor.repository.WifiRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class WifiService {

    private final WifiRepository wifiRepository;

    public void postWifi(PostWifiReq dto) {
        Wifi wifi = PostWifiReq.toEntity(dto);
        wifiRepository.save(wifi);
    }

}
