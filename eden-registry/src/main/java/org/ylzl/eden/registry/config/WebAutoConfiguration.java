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
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.actuate.autoconfigure.web.server.ManagementServerProperties;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.View;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;
import org.ylzl.eden.spring.boot.commons.bean.BeanCopier;
import org.ylzl.eden.spring.boot.framework.core.FrameworkProperties;
import org.ylzl.eden.spring.boot.framework.core.util.PathMatcherConstants;
import org.ylzl.eden.spring.boot.framework.web.WebConfigurerAdapter;
import org.ylzl.eden.spring.boot.framework.web.filter.CorsFilterBuilder;
import org.ylzl.eden.spring.boot.integration.swagger.SwaggerConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Web 自动配置
 *
 * @author gyl
 * @since 1.0.0
 */
@Slf4j
@Configuration
public class WebAutoConfiguration extends WebConfigurerAdapter {

	public WebAutoConfiguration(FrameworkProperties frameworkProperties, Environment environment) {
		super(frameworkProperties, environment);
	}

	@Bean
	public CorsFilter corsFilter(FrameworkProperties frameworkProperties, ManagementServerProperties managementServerProperties) {
		CorsConfiguration corsConfiguration = frameworkProperties.getCors();
		List<String> paths = new ArrayList<>();
		if (corsConfiguration.getAllowedOrigins() != null && !corsConfiguration.getAllowedOrigins().isEmpty()) {
			paths.add("/api" + PathMatcherConstants.ALL_CHILD_PATTERN);
			paths.add(managementServerProperties.getServlet().getContextPath() + PathMatcherConstants.ALL_CHILD_PATTERN);
			paths.add(SwaggerConstants.DEFAULT_URL);
		}
		return CorsFilterBuilder.builder().corsConfiguration(corsConfiguration).paths(paths).build();
	}
}
