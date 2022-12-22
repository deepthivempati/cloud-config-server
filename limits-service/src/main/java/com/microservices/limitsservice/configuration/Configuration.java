package com.microservices.limitsservice.configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
@NoArgsConstructor
public class Configuration {
    private int minimum;
    private int maximum;
}
