package com.iot.wifi_indoor.controller;

import com.iot.wifi_indoor.BaseResponse;
import com.iot.wifi_indoor.dto.PostWifiReq;
import com.iot.wifi_indoor.service.WifiService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wifis")
public class WifiController {

    private final WifiService wifiService;


    /**
     *  와이파이 정보 등록
     * [POST] /wifis/create
     * @return BaseResponse<String>
     */

    @ResponseBody
    @PostMapping("/create")
    @ApiOperation(value = "와이파이 정보 등록")
    private BaseResponse<String> saveWifi(@RequestBody List<PostWifiReq> dto) {
        wifiService.postWifi(dto);

        return new BaseResponse<>("success");
    }
}
