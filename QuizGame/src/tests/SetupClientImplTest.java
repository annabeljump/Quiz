package tests;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import otherInterfaces.*;
import networkInterfaces.*;
import otherImpls.*;
import networkImpls.*;

public class SetupClientImplTest {
	
	List<Quiz> quizList = new ArrayList<Quiz>();
	List<Player> playerList = new ArrayList<Player>();
	SetupClient testClient;

	@Before
	public void setUp() throws Exception {
		testClient = new SetupClientImpl();
	}

	@After
	public void tearDown() throws Exception {
		testClient = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
