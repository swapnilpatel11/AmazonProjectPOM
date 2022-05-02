package com.fdmgroup.testscript;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	
	SigniinFunctionality.class,
	NavigationBarTest.class,
	FooterLinksTest.class,
	BestSellerLinkTest.class,
	NewReleasesTest.class,
	SearchAnItemTest.class
})
public class TestRunner {

}