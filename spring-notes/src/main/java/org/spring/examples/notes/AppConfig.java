package org.spring.examples.notes;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-03-23
 */
@Configurable
@ComponentScan(basePackages = "org.spring.examples.notes")
public class AppConfig {
}
