package test;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.Test;

import model.AnimateSprite;
import model.BubbleKey;

public class testAnimateSprite {
	@Test
	public void testAnimateSprite() {
		String[] urls = {"sprite/lorann_b.png", "sprite/lorann_bl.png", "sprite/lorann_br.png", "sprite/lorann_l.png", "sprite/lorann_r.png", "sprite/lorann_u.png", "sprite/lorann_ul.png", "sprite/lorann_ur.png"};
		assertNotNull(new AnimateSprite("sprite/lorann_b.png", urls));
	}
	
	@Test
	public void testGetImage() {
		fail("No test for this function yet");
	}

	@Test
	public void testNextImage() {
		fail("No test for this function yet");
	}

}