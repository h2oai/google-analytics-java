package com.brsanthu.googleanalytics;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DefaultRequestParameterDiscovererTest {

  @Test
  public void testDiscoverParameters() throws Exception {
    DefaultRequestParameterDiscoverer discoverer = new DefaultRequestParameterDiscoverer();
    DefaultRequest request = new DefaultRequest();

    GoogleAnalyticsConfig config = new GoogleAnalyticsConfig();

    assertNull(config.getUserAgent());
    assertNull(request.userLanguage());
    assertNull(request.documentEncoding());

    discoverer.discoverParameters(config, request);

    assertNotNull(config.getUserAgent());
    assertNotNull(request.userLanguage());
    assertNotNull(request.documentEncoding());
  }

}
