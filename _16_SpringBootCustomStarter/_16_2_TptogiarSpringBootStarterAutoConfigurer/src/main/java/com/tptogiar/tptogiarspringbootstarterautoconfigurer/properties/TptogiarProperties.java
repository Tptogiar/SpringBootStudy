package com.tptogiar.tptogiarspringbootstarterautoconfigurer.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/12 - 15:19
 */

@ConfigurationProperties(prefix = "tptogiar.tptogiar")
@Data
public class TptogiarProperties {
    private String prefix;
    private String suffix;
}
