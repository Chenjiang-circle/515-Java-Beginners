package com.my;
import java.util.Scanner;// ��������Ĺ��߰�
/**
 * ���ַ���
 * @author zhenli798
 *
 */
public class TaskTwo {

	public static void main(String []args)
	{
		/**
		 * ����һϵ�����������밴Ҫ������ֽ��з��࣬��������� 5 �����֣�
 		 * A1 = �ܱ� 5 ����������������ż���ĺͣ� 
 		 * A2 = ���� 5 ������ 1 �����ְ�����˳����н�����ͣ�������  -  +  -  �������� 
 		 * A3 = �� 5 ������ 2 �����ֵĸ�����
 		 * A4 = �� 5 ������ 3 �����ֵ�ƽ��������ȷ��С����� 1 λ��
 		 * A5 = �� 5 ������ 4 ��������������֡�
		 */
		Scanner input = new Scanner(System.in);// ����ɨ���Ƕ���
		
		int len = 0;// ���鳤��
		int []arr;// ����һ������
		len = input.nextInt();// ��ȡ�û���������ָ���
		arr = new int [len]; // �����������
		
		for(int i = 0; i < len; i++)
		{// ���������
			arr[i] = input.nextInt();
		}
		
		int A1 = 0;// ����ܱ�5����������������ż���ĺ�
		int A2 = 0;// ����5������1�����ְ�-+˳����н�����͵�ֵ
		int A3 = 0;// ��5������2�����ֵĸ���
		double A4 = 0;// ��5������3�����ֵ�ƽ��������ȷ��С�����һλ
		int A5 = 0;// ��5������4���������������
		
		int k = 1;// ���㱻5������1�����ֵĽ�����͵Ĺ���
		int n1 = 0;// ͳ�Ʊ�5��2����ż���ĸ���
		int n2 = 0;// ͳ�Ʊ�5������1���ָ���
		int n4 = 0;// ͳ�Ʊ�5������3�����ֵĸ���
		int n5 = 0;// ͳ�Ʊ�5������4�����ָ���
		int sum = 0; // ͳ�Ʊ�5������3�������ܺ�
		int max = 0; // ��5������4���������������
		for(int i = 0; i < len; i++)
		{
			if(arr[i]%5 ==0 && arr[i]%2 == 0)
			{
				A1 += arr[i];
				n1++;
			}
			else if(arr[i]%5 == 1)
			{
				if(k%2 == 0)
					A2 -= arr[i];
				else
					A2 += arr[i];
				k++;
				n2++;
			}
			else if(arr[i]%5 == 2)
			{
				A3++;
			}
			else if(arr[i]%5 == 3)
			{
				sum += arr[i];
				n4++;
			}
			else if(arr[i]%5 == 4)
			{
				if(arr[i] > max)
					max = arr[i];
				n5++;
			}
		}
		A4 = sum/(n4*1.0);
		A5 = max;
		
		//���
		if(n1 != 0)
			System.out.print(A1 + " ");
		else
			System.out.print("N ");
		if(n2 != 0)
			System.out.print(A2 + " ");
		else
			System.out.print("N ");
		if(A3 != 0)
			System.out.print(A3 + " ");
		else 
			System.out.print("N ");
		if(n4 != 0)
			System.out.printf("%.1f ", A4);
		else
			System.out.print("N ");
		if(n5 != 0)
			System.out.print(A5);
		else
			System.out.print("N");
	}
}
