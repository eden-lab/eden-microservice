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

import lombok.experimental.UtilityClass;

/**
 * 应用常量定义
 *
 * @author gyl
 * @since 1.0.0
 */
@UtilityClass
public final class ApplicationConstants {

  /** Spring Boot Admin 路径匹配表达式 */
  public static final String SPRING_BOOT_ADMIN_PATTERN = "/api/applications";

  /** Spring Boot Admin Turbine 路径匹配表达式 */
  public static final String SPRING_BOOT_ADMIN_TURBINE_PATTERN = "/api/turbine";
}
