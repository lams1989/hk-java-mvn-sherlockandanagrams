package com.lams1989.sherlockandanagrams;

import junit.framework.TestCase;

public class SherlockAndAnagramsTest extends TestCase {
	
	public void testSherlockAndAnagrams1() {
		String ejemplo = "ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(399, count);
	}
	
	public void testSherlockAndAnagrams2() {
		String ejemplo = "gffryqktmwocejbxfidpjfgrrkpowoxwggxaknmltjcpazgtnakcfcogzatyskqjyorcftwxjrtgayvllutrjxpbzggjxbmxpnde";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(471, count);
	}
	
	public void testSherlockAndAnagrams3() {
		String ejemplo = "mqmtjwxaaaxklheghvqcyhaaegtlyntxmoluqlzvuzgkwhkkfpwarkckansgabfclzgnumdrojexnrdunivxqjzfbzsodycnsnmw";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(370, count);
	}
	public void testSherlockAndAnagrams4() {
		String ejemplo = "ofeqjnqnxwidhbuxxhfwargwkikjqwyghpsygjxyrarcoacwnhxyqlrviikfuiuotifznqmzpjrxycnqktkryutpqvbgbgthfges";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(403, count);
	}
	
	public void testSherlockAndAnagrams5() {
		String ejemplo = "zjekimenscyiamnwlpxytkndjsygifmqlqibxxqlauxamfviftquntvkwppxrzuncyenacfivtigvfsadtlytzymuwvpntngkyhw";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(428, count);
	}
	
	public void testSherlockAndAnagrams6() {
		String ejemplo = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		int count = 0;
        count = SherlockAndAnagrams.sherlockAndAnagrams(ejemplo);
        assertEquals(166650, count);
	}
	
	public void testIsAnagram1() {
		String a= "aaaabbbbaaaabbbb";
		String b= "babababababababa";
		boolean c = SherlockAndAnagrams.isAnagram(a, b);
		assertEquals(true, c);
	
	}
	
	public void testIsAnagram2() {
		String a= "cccccccaaaaaaa";
		String b= "ccaaccaacacaca";
		boolean c = SherlockAndAnagrams.isAnagram(a, b);
		assertEquals(true, c);
	
	}
	public void testIsAnagram3() {
		String a= "ccccccc";
		String b= "ccaacca";
		boolean c = SherlockAndAnagrams.isAnagram(a, b);
		assertEquals(false, c);
	
	}
	
}

