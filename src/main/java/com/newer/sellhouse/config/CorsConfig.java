package com.newer.sellhouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    //配置访问源
    public static String[] originVals={
            "127.0.0.1:8080",
            "localhost:8080",
            "baidu.com",
            "google.com"
    };

    /**
     * 配置跨域的过滤器
     */
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //this.addAllowOrigin(corsConfiguration);
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.setAllowCredentials(true);//允许session跨域配置
        corsConfiguration.addAllowedOrigin("*"); //所有的请求能可以访问
        source.registerCorsConfiguration("/**",corsConfiguration);
        return  new CorsFilter(source);
    }

   /* private void addAllowOrigin(CorsConfiguration corsConfiguration) {
        for(String origin:originVals){
            corsConfiguration.addAllowedOrigin("http://"+origin);
            corsConfiguration.addAllowedOrigin("https://"+origin);
        }

    }*/


}
