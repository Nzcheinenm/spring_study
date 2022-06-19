package ru.t1.spting_study.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.t1.spring_study.demo")
@EnableAspectJAutoProxy
public class AppConfig {
}
