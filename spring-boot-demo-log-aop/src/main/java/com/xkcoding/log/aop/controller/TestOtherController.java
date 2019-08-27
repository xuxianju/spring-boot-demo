package com.xkcoding.log.aop.controller;

import com.xkcoding.log.aop.aspectj.AopLog;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试 Controller
 * </p>
 *
 */
@RestController
@Slf4j
public class TestOtherController {

    @Autowired
    private AopLog aopLog;
    /**
     * 测试方法2
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/test2")
    public Dict test(String who) {
        log.info("test2方法");
        aopLog.log();
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }

}
