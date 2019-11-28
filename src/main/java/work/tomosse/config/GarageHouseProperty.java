package work.tomosse.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
public class GarageHouseProperty {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.messages.basename}")
    private String basename;

    @Value("${spring.security.secret-key}")
    private String secretKey;
}
