package com.mockuai.giftscenter.core;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by edgar.zr on 8/4/15.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public abstract class BaseTest extends AbstractTestNGSpringContextTests {

}