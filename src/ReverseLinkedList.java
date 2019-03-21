import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Long> list = new LinkedList<Long>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		int print = -1;
		for (int i = 0; i < n; i++) {
			if (list.get(i) % 2 != 0) {
				if ((print + 1) == i) {
					System.out.print(list.get(i) + " ");
					print = i;
				} else {
					for (int j = i - 1; j > print; j--) {
						System.out.print(list.get(j) + " ");
					}
					print = i - 1;
					i--;
				}
			}
		}
		for (int i = n - 1; i > print; i--) {
			System.out.print(list.get(i) + " ");
		}
		sc.close();
	}

}