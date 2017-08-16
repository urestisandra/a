/**
 * 
 */
package com.rccl.entities.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;

/**
 * @author d.serrano.parreno
 *
 */
public class ShipTest {
	protected void run() {
        	double r = Math.random();
        	if (r < 0.1) {
            	fail("oops");
        	} else if (r < 0.2) {
           	throw new AssumptionViolatedException("skipping");
        	}
   	 }
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		run (); // TODO
	}
	
	// to be implemented @Test 

}
