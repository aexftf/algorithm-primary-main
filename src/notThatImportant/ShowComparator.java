package notThatImportant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mac
 */
public class ShowComparator {

	public static class Student {
		public String name;
		public int id;
		public int age;

		public Student(String name, int id, int age) {
			this.name = name;
			this.id = id;
			this.age = age;
		}
	}

	// 谁id大，谁放前！
	public static class IdComparator implements Comparator<Student> {

		// 如果返回负数，认为第一个参数应该排在前面
		// 如果返回正数，认为第二个参数应该排在前面
		// 如果返回0，认为谁放前面无所谓
		//前面小返回1，前面大返回-1 ，前面减去后面
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.id < o2.id) {
				return 1;
			} else if (o2.id < o1.id) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
	// 谁age大，谁放前！
	public static class AgeComparator implements Comparator<Student> {

		// 如果返回负数，认为第一个参数应该排在前面
		// 如果返回正数，认为第二个参数应该排在前面
		// 如果返回0，认为谁放前面无所谓
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.age < o2.age) {
				return 1;
			} else if (o2.age < o1.age) {
				return -1;
			} else {
				return 0;
			}
		}
	}














}
