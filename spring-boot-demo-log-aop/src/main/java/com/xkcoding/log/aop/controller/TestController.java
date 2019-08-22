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
 * @package: com.xkcoding.log.aop.controller
 * @description: 测试 Controller
 * @author: yangkai.shen
 * @date: Created in 2018/10/1 10:10 PM
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private AopLog aopLog;
	/**
	 * 测试方法
	 *
	 * @param who 测试参数
	 * @return {@link Dict}
	 */
	@GetMapping("/test")
	public Dict test(String who) {
	    log.info("test方法");
        aopLog.log();
		return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
	}

}
