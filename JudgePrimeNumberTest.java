package DFS;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class JudgePrimeNumberTest {

	@Test
	public void test() {
		JudgePrimeNumber pn = new JudgePrimeNumber();
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		list.add(14);
		list.add(71);
		list.add(73);
		list.add(74);
		for( int i: list ){
			System.out.print(i+" ");
		}
		System.out.println("==================");
		for( int i: list ){
			if( pn.judgePrime(i)){
				System.out.println(i+" is prime number");
			}else{
				System.out.println( i+" is not prime number");
			}
		}
		//fail("Not yet implemented");
	}

}
