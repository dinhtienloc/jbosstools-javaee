package org.jboss.jsr299.tck.tests.jbt.validation.target;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.Stereotype;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Stereotype
@StereotypeWTypeTarget
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
@Documented
public @interface StereotypeMFBroken {

}