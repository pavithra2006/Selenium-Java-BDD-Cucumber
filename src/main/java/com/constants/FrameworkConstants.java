package com.constants;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * FrameworkConstansts class is holds all framework constants.
 *
 * <p>
 * It contains getter methods
 * </p>
 * May 1, 2023
 *
 * @author Pavithra
 * @version 1.0
 * @since 1.0
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FrameworkConstants {
    @Getter(AccessLevel.PUBLIC)
    private static final String resourcesPath = System.getProperty("user.dir") + "/src/test/resources";
    @Getter(AccessLevel.PUBLIC)
    private static final String configPropertiesPath = resourcesPath + "/config/config.properties";
    @Getter(AccessLevel.PUBLIC)
    private static final int frameworkwait = 30;
}
