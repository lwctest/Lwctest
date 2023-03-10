package com.tmb.tests.mobile.base;

import com.tmb.driver.Driver;
import com.tmb.enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class IosSetup {

    /*
    Please check MobileSetup
     */

  @BeforeEach
  public void setUp() {
    Driver.initDriverForMobile(MobilePlatformType.IOS);
  }

  @AfterEach
  public void tearDown() {
    Driver.quitDriver();
  }
}
