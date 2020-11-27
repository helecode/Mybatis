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
	//�������
	public List<S1Message> selectMessage(String name,int age,String education);
	//ע�����
	public List<S1Message> selectMessageMM(@Param("name")String name,@Param("age")int age);
	//��װ��Map���
	public List<S1Message> selectMessageMap(Map<String,Object> map);
	//��װ��Map��β���$���Ž���ƴ��
	public List<S1Message> selectMessageMapPJ(Map<String,Object> map);
	//ʹ��ResultType
	public List<S1Message> selectMessageMapResultMap(S1Message message);
}
