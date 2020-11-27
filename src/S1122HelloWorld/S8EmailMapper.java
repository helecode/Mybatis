package S1122HelloWorld;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

public interface S8EmailMapper {

	public S4Email selectEamil(int  id);

	public S4Email selectEamilByIdMessage(int  id);
	
	public S4Email selectEamilByIdMessageFenBu(int  id);
	//¶¯Ì¬SQL
	//where-if
	public S4Email dynamicSelectEamil(@Param("id")int id,@Param("name")String name);
	//trim
	public S4Email dynamicSelectEamilTrim(@Param("id")int id,@Param("name")String name);
	//set-if
	public boolean dynamicSelectEamilSet(@Param("id")int id,@Param("name")String name);
	//choose-when
	public S4Email dynamicSelectEamilChoose(@Param("id")int id,@Param("name")String name);
	//foreach
	public List<S4Email> dynamicSelectEamilForeach(List<Integer> list);
	@Select("select * from email")
	public List<S4Email> displayEmail();
}
