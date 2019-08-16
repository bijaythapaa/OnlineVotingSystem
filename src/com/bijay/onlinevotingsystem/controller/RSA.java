package com.bijay.onlinevotingsystem.controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

public class RSA {
	private BigInteger p;
	private BigInteger q;
	private BigInteger N;
	private BigInteger phi;
	private BigInteger e;
	private BigInteger d;
	private int bitlength = 1024;
	// gives random value based on Linear Congruential formula
	private Random r;

	// RSA - Ron Rivest, Adi Shamir and Leonard Adleman
	public RSA() {
		r = new Random();
		//probablePrime() method gives a positive BigInteger ie prime number
		p = BigInteger.probablePrime(bitlength, r);
		q = BigInteger.probablePrime(bitlength, r);
		N = p.multiply(q);
		phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		e = BigInteger.probablePrime(bitlength / 2, r);
		while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
			e.add(BigInteger.ONE);
		}
		d = e.modInverse(phi);
	}

	public RSA(BigInteger e, BigInteger d, BigInteger N) {
		this.e = e;
		this.d = d;
		this.N = N;
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// object created and constructor automatically called
		RSA rsa = new RSA();
		
		// jdk1.1 ma use hunthyo, 
		DataInputStream in = new DataInputStream(System.in);
		String teststring;
		System.out.println("Enter the plain text:");
		
		// add supress warning kinaki readLine() method le properly converts bytes to character gardaina
		teststring = in.readLine();
		System.out.println("Encrypting String: " + teststring);
		
		//calls static method with argument in array of bytes by getBytes() method
		System.out.println("String in Bytes: " + bytesToString(teststring.getBytes()));
		
		// encryption happening here
		byte[] encrypted = rsa.encrypt(teststring.getBytes());
		
		// decryption happening heres
		byte[] decrypted = rsa.decrypt(encrypted);
		
		// prints the returned values form encrypt and decrypt methods
		System.out.println("Decrypting Bytes: " + bytesToString(decrypted));
		
		//new String le array-of-bytes lai decode garera string ma convert garxa
		System.out.println("Decrypted String: " + new String(decrypted));
	}

	private static String bytesToString(byte[] encrypted) {
		String test = "";
		for (byte b : encrypted) {
			test += Byte.toString(b);
		}
		return test;
	}

	// Encrypted message return garxa
	public byte[] encrypt(byte[] message) {
		//byte msg translated in big-int value, (msg^e)modN, bytes of array return garxa
		return (new BigInteger(message)).modPow(e, N).toByteArray();
	}

	// Decrypted message return garxa
	public byte[] decrypt(byte[] message) {
		//encrypted msg bytes of array ma thyo so bigint ma translate hunxa, (msg^d)modN, bytes-of-arr
		//print garda, new String() ma garxau, so returns original msg
		return (new BigInteger(message)).modPow(d, N).toByteArray();
	}
}
