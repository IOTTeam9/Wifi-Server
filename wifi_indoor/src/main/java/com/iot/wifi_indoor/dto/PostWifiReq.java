package com.iot.wifi_indoor.dto;

import com.iot.wifi_indoor.domain.Wifi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostWifiReq {

    private String place;

    private String ssid;

    private String bssid;
    private int rssi;

    public static Wifi toEntity(PostWifiReq dto){
        return Wifi.builder()
                .place(dto.getPlace())
                .ssid(dto.getSsid())
                .bssid(dto.getBssid())
                .rssi(dto.getRssi())
                .build();
    }
}
