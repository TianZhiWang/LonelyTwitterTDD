package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.AbstractTweet;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;
import android.R.bool;
import android.test.ActivityInstrumentationTestCase2;

public class TestTweetListModel extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	public TestTweetListModel() {
		super(LonelyTwitterActivity.class);
	}
	
	public void testGetCount() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		model.addTweet(tweet);
		int count = model.getCount();
		assertEquals("Count is correct", count ,1);
	}
	
	public void testAddTweet() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		model.addTweet(tweet);
		int count = model.getCount();
		assertEquals("Add Tweet Works", count ,1);
	}
	
	public void testAddDuplicateTweet() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		model.addTweet(tweet);
		Tweet tweet2 = new Tweet("Hello");
		try {
			model.addTweet(tweet2);
		} catch (IllegalArgumentException e) {
			int count = model.getCount();
			assertEquals("Add Duplicate Tweet", count ,1);
		}
	}
	
	public void testHasTweet() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		model.addTweet(tweet);
		boolean has = model.hasTweet(tweet);
		assertEquals("has tweet", has ,true);
	}
	
	public void testNotHasTweet() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		boolean has = model.hasTweet(tweet);
		assertEquals("not has tweet", has ,false);
	}
	
	public void testRemoveTweet() {
		TweetListModel model = new TweetListModel();
		Tweet tweet = new Tweet("Hello");
		model.addTweet(tweet);
		model.removeTweet(tweet);
		assertEquals("remove tweet", model.hasTweet(tweet) ,false);
	}
	
	public void testGetTweets() {
		TweetListModel model = new TweetListModel();
		Tweet tweet0 = new Tweet("Hello");
		Tweet tweet1 = new Tweet("Hello1");
		Tweet tweet2 = new Tweet("Hello2");
		Tweet tweet3 = new Tweet("Hello3");
		
		model.addTweet(tweet0);
		model.addTweet(tweet1);
		model.addTweet(tweet2);
		model.addTweet(tweet3);
		AbstractTweet[] a = model.getTweets();
		
		assertEquals("Are tweets Sorted", tweet0.equals(a[0]) , true);
	}
}
