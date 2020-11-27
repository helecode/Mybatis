package S1122HelloWorld;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface S2MessageMapper {
	public S1Message findMessage(int id);
	
	public List<S1Message> displayMessage();
	
	public boolean addMessage(S1Message message);
	
	public boolean deleteMessage(int id);
	
	public boolean updateMessage(S1Message message);
	//多个参数
	public List<S1Message> selectMessage(String name,int age,String education);
	//注解入参
	public List<S1Message> selectMessageMM(@Param("name")String name,@Param("age")int age);
	//封装在Map入参
	public List<S1Message> selectMessageMap(Map<String,Object> map);
	//封装在Map入参并用$符号进行拼接
	public List<S1Message> selectMessageMapPJ(Map<String,Object> map);
	//使用ResultType
	public List<S1Message> selectMessageMapResultMap(S1Message message);
}
