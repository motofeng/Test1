package ѧ������ϵͳTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

//����ÿһ��ѧ����Ϣ����ѧ����Ϣд���ı�


public class ArrayListToFile {
	public static void main(String[] args) {
		
		//�������϶���
		ArrayList<Student>list = new ArrayList<>();
		
		//д����¼��ѧ����Ϣ����ѧ��������ΪԪ����ӵ�������
		   addStudent(list);  //�����Լ�д�ķ���                        //list.add(s1)
		   addStudent(list); 
		   addStudent(list); 
		   
		 //�����������������
		   BufferedWriter bw =new BufferedWriter(new FileWriter("array.txt"));
		   
		   //�������ϣ��õ�ÿһ��ѧ����Ϣ������ѧ������һ���ĸ�ʽд���ı�
		   for(int n=0;n<list.size();n++){
			   Student s = list.get(n);//�õ�ÿһ��ѧ������
			   
		   }
		   //StringBuilder����ʽ���
		   StringBuilder sb =new StringBuilder();
		   
		   sb.append(s.getId()).appened(",");
		   sb.append(s.getName()).appened(",");
		   sb.appened(s.getAge()).appened.(",");
		   sb.append(s.getAddress());
		   
		   
	}
	

}
