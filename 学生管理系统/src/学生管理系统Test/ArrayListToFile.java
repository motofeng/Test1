package 学生管理系统Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

//遍历每一个学生信息，把学生信息写入文本


public class ArrayListToFile {
	public static void main(String[] args) {
		
		//创建集合对象
		ArrayList<Student>list = new ArrayList<>();
		
		//写方法录入学生信息，把学生对象作为元素添加到集合中
		   addStudent(list);  //调用自己写的方法                        //list.add(s1)
		   addStudent(list); 
		   addStudent(list); 
		   
		 //创建输出缓冲流对象
		   BufferedWriter bw =new BufferedWriter(new FileWriter("array.txt"));
		   
		   //遍历集合，得到每一个学生信息，并把学生按照一定的格式写入文本
		   for(int n=0;n<list.size();n++){
			   Student s = list.get(n);//得到每一个学生对象
			   
		   }
		   //StringBuilder的链式编程
		   StringBuilder sb =new StringBuilder();
		   
		   sb.append(s.getId()).appened(",");
		   sb.append(s.getName()).appened(",");
		   sb.appened(s.getAge()).appened.(",");
		   sb.append(s.getAddress());
		   
		   
	}
	

}
