package com.lab515.Task;

import java.util.Scanner;

/**
 * ˭��ý�Ʒ(��Ȼ������)
 * @author 86134
 * 
 */
public class TaskTwo {
	
	public static void champion(int n, int m)
	{
		boolean []persons = new boolean[n]; // ��ʼ����Ϊfalse���ҵ���ֵΪtrue
		int code = 1;
		int idx = 0;
		int size = n;
		while (size > 1)
		{
			if (!persons[idx])
			{ // δ����̭��
				if(code == m)
				{
					persons[idx] = true;
					code = 0; // ���¼���
					size--; // �ܴ�С��1
				}
				code++; //�Ϸ��ı�ż�1
			}
			idx++; // �����±�������������β��������idx�����¿�ʼѭ��
			if (idx == n)
			{
				idx = 0;
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			if(!persons[i])
				System.out.println(i+1);
		}
	}
	
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		champion(n, m);
	}
}
