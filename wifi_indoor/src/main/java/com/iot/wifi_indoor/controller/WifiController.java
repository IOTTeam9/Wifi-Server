package com.iot.wifi_indoor.controller;

import com.iot.wifi_indoor.BaseResponse;
import com.iot.wifi_indoor.dto.PostWifiReq;
import com.iot.wifi_indoor.service.WifiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wifis")
public class WifiController {

    private final WifiService wifiService;

    @ResponseBody
    @PostMapping("/create")
    private BaseResponse<String> saveWifi(@RequestBody PostWifiReq dto) {
        wifiService.postWifi(dto);

        return new BaseResponse<>("success");
    }
}
