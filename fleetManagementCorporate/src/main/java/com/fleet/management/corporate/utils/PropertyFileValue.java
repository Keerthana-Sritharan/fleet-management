package com.fleet.management.corporate.utils;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@PropertySource("classpath:application.properties")
public final class PropertyFileValue {
	 private PropertyFileValue() {}
}
