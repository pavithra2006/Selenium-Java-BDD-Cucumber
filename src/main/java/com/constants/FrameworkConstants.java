package com.constants;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FrameworkConstants {
    @Getter(AccessLevel.PUBLIC)
    private static final String resourcesPath = System.getProperty("user.dir") + "/src/test/resources";
    @Getter(AccessLevel.PUBLIC)
    private static final String configPropertiesPath = resourcesPath + "/config/config.properties";
    @Getter(AccessLevel.PUBLIC)
    private static final int frameworkwait = 30;
}
