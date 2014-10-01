package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import android.test.ActivityInstrumentationTestCase2;

public class TestCase extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	public TestCase() {
		super(LonelyTwitterActivity.class);
	}

	public void testFiveisFive() {
		assertEquals("Five is Five", 5 ,5);
	}
	
	public void testAbstrarctTweet() {
		assertEquals("Five is Five", 5 , 5);
	}
	
	public void testAbstractTweet() {
		Tweet t = new Tweet("Hello");
		Tweet t2 = new Tweet("Hello");
		String actual = t.getTweetBody();
		
		assertEquals("Tweet body is the same,", "Hello", actual);
		assertSame("Smae tweets",t , t2);
	}
}
