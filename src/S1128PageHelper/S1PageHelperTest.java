package S1128PageHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import S1122HelloWorld.S4Email;
import S1122HelloWorld.S8EmailMapper;


public class S1PageHelperTest {

	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis-conf.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlsession=sqlSessionFactory.openSession();
		S8EmailMapper emailMapper=sqlsession.getMapper(S8EmailMapper.class);
		int pageNum=1,pageSize=3;
		PageHelper.startPage(pageNum, pageSize);
		List<S4Email> emailList=(List<S4Email>) emailMapper.displayEmail();
		  PageInfo<S4Email> p=new PageInfo<S4Email>(emailList);
			for(S4Email email:emailList){
				System.out.println("email:"+email);
			}
		
		  System.out.println("当前页号: "+p.getPageNum());
		  System.out.println("是否第一页: "+p.isIsFirstPage());
		  System.out.println("总记录数: "+p.getTotal());

		  int a[]=p.getNavigatepageNums();//导航号
		  for(int k:a)
			  System.out.print(k+"   a");
	  }
		
	

}
