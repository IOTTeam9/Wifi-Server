package com.iot.wifi_indoor.service;

import com.iot.wifi_indoor.domain.Wifi;
import com.iot.wifi_indoor.dto.PostWifiReq;
import com.iot.wifi_indoor.repository.WifiRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WifiService {

    private final WifiRepository wifiRepository;

    public void postWifi(List<PostWifiReq> dto) {

        for(PostWifiReq postWifiReq : dto) {
            Wifi wifi = PostWifiReq.toEntity(postWifiReq);
            wifiRepository.save(wifi);
        }
    }

}
