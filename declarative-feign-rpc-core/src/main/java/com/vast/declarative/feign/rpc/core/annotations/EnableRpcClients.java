package com.vast.declarative.feign.rpc.core.annotations;

import com.vast.declarative.feign.rpc.core.RpcClientBeanDefinitionRegistrar;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 开启声明式远程api调用
 * </p>
 *
 * @author vastliu
 * @since 2022-01-17 15:59
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(RpcClientBeanDefinitionRegistrar.class)
public @interface EnableRpcClients {
    String[] basePackages() default {};
}
