package com.my;
import java.util.Scanner;// ��������Ĺ��߰�
/**
 * ��һ����Ӣ�ﵥ�ʵ������
 * @author zhenli798
 *
 */
public class TaskOne {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);// ��������ɨ���� 
		String str;// ����һ���ַ���
		str = scan.nextLine();// ��ȡ�û������һ���ַ���
		char [] chr = str.toCharArray();// ���ַ���ת�����ַ�����
		
		int end = chr.length-1; // ÿ���������һ����ĸ����ֵ
		int begin;// ÿ����������ĸ����ֵ
		for(int i = chr.length-1; i >= 0; i--)
		{
			if((chr[i] == 32)||i == 0)
			{// �ǿո����iΪ0�������
				if(i != 0)
					begin = i+1;// ÿ�����ʵ�����ĸ����ֵ�ͱ�ɿո�����ֵ+1
				else
					begin = i;// ��������ĸ����ֵΪ0
				for(int k = begin; k <= end; k++)
				{
					System.out.print(chr[k]);// �������
				}
				end = i-1;// 
			}
			if(chr[i] == 32)
				System.out.print(chr[i]);// ����ո�
		}
	}
}
