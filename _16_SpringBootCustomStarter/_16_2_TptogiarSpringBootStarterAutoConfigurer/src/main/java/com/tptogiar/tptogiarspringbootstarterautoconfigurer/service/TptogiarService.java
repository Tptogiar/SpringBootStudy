package com.tptogiar.tptogiarspringbootstarterautoconfigurer.service;

import com.tptogiar.tptogiarspringbootstarterautoconfigurer.properties.TptogiarProperties;
import lombok.Data;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/12 - 15:22
 */
@Data
public class TptogiarService {

    TptogiarProperties tptogiarProperties;

    public String doService(String service) {
        return tptogiarProperties.getPrefix() + "/" + service + "/" + tptogiarProperties.getSuffix();
    }

}
