package com.gaoyg.monkeyzi.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: 高yg
 * @date: 2018/9/23 21:34
 * @qq:854152531@qq.com
 * @blog http://www.monkeyzi.xin
 * @description:
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages="com.gaoyg.monkeyzi.swagger")
public class SwaggerConfiguration {
    @Autowired
    private SwaggerInfo swaggerInfo;

    @Bean
    public Docket controllerApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName(swaggerInfo.getGroupName())
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();


        return docket;
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swaggerInfo.getTitle())
                .description(swaggerInfo.getDescription())
                .contact(swaggerInfo.getContact())
                .license(swaggerInfo.getLicense())
                .version(swaggerInfo.getVersion())
                .build();
    }

}
