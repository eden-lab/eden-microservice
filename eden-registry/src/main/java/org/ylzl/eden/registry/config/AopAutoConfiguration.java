/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ylzl.eden.registry.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.ylzl.eden.registry.aop.LoggingAspect;
import org.ylzl.eden.spring.boot.framework.core.ProfileConstants;

/**
 * 切面自动配置
 *
 * @author gyl
 * @since 1.0.0
 */
@EnableAspectJAutoProxy
@Slf4j
@Configuration
public class AopAutoConfiguration {

    /**
     * 配置日志切面
     *
     * @return {@link LoggingAspect}
     */
    /*@Profile(ProfileConstants.SPRING_PROFILE_DEVELOPMENT)
    @Bean
    public LoggingAspect loggingAspect() {
		log.debug("Inject Logging aspect");
		return new LoggingAspect();
    }*/
}
