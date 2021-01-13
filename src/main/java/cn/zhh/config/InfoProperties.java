package cn.zhh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据源配置
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 0:24
 */
@Data
@Component
@ConfigurationProperties(prefix = "info.mp")
public class InfoProperties {

    private List<MpConfig> configs;

    @Data
    public static class MpConfig {

        /**
         * driverClassName
         */
        private String driverClassName;

        /**
         * url
         */
        private String url;

        /**
         * username
         */
        private String username;

        /**
         * password
         */
        private String password;
    }
}
