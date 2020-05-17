package com.lab515.Task;

import java.util.Scanner;

/**
 * ��ӡ��������
 * @author 86134
 *
 */
public class TaskOne {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��ӡ�ľ��������");
		
		int n = scan.nextInt(); // ��ȡ�߳�
		int [][]a = new int[n][n]; // ����һ����ά����(����)
		int length = n; // �����ʼ�߳�
		int num = 0; // ����num��ʼ�±�
		int rowFirst = 1; // �����һ��Ȧ��һ�������̶�Ϊ1
		int i, j; // ѭ������
		
		while (n > 0)
		{
			a[num][num] = rowFirst; // ����ǰȦ�ĳ�ʼλ�ø�ֵ
			
			if(n >1){
				for (i = num, j = num + 1; j < n + num; j++)
				{
					a[i][j] = a[i][j -1] + 1; // ��������
				}
				for(i = num + 1, j = num + n - 1; i < n + num; i++)
				{
					a[i][j] = a[i-1][j] + 1; // ��������
				}
				for (i = num + n - 1, j = num + n -2; j >= num; j--)
				{
					a[i][j] = a[i][j+1] + 1; // ��������
				}
				for (i = num + n - 2, j = num; i > num; i--)
				{
					a[i][j] = a[i+1][j] + 1; // ��������
				}
			}else{
				break;
			}
			rowFirst = rowFirst + 4*(n-1); // ������һȦ��ʼ����
			n = n - 2; // ÿ���һȦ���߳���2
			num++; // ��ʼ�±�����1
		}
		
		for ( i = 0; i < length; i++)
		{
			for (j = 0; j < length; j++)
			{
				if(j != 0)
				{
					// System.out.print(" "); // �淶���
					System.out.print("\t"); // �ÿ�һЩ
				}	
				System.out.print(a[i][j]); // ��ӡ����Ԫ��
			}
			System.out.println(); // ����
		}
	}
}
