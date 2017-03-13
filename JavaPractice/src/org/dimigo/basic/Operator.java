/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Operator
 * 
 * 1. Overview : 디미베네 급여 계산
 * 2. Date : 2017. 3. 13.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary_per_month = 1700000;
		int employee_per_store = 3;
		int store = 1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n", salary_per_month);
		System.out.printf("점포 내 직원수 : %,d명\n", employee_per_store);
		System.out.printf("점포 수 : %,d개\n\n", store);
		System.out.printf("연간 인건비 : %,d원", (long) salary_per_month * 12 * employee_per_store * store );
	}

}
