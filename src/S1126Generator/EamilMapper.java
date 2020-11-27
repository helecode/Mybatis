package S1126Generator;

import S1126Generator.Eamil;
import java.util.List;

public interface EamilMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Eamil record);
    
    Eamil selectByPrimaryKey(Integer id);

    List<Eamil> selectAll();

    int updateByPrimaryKey(Eamil record);
}