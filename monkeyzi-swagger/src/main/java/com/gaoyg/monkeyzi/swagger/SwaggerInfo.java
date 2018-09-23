package com.gaoyg.monkeyzi.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 高yg
 * @date: 2018/9/23 21:37
 * @qq:854152531@qq.com
 * @blog http://www.monkeyzi.xin
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "monkeyzi.swagger")
public class SwaggerInfo {
    private String groupName ="monkeyzi-master";

    private String basePackage;

    private String antPath;

    private String title = "monkeyzi项目在线接口文档";

    private String description = "Swagger自动生成接口文档";

    private String license = "Apache License Version 2.0";

    private String contact="https://monkeyzi.github.io";

    private String version="1.0";
}
