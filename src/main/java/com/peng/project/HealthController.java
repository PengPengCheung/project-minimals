package com.peng.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongpengheng
 * @version 1.0
 * @date 2023/5/1 4:42 PM
 * @group
 */
@RestController
public class HealthController {

    @RequestMapping("/health")
    public String health() {
        return "OK";
    }
}
