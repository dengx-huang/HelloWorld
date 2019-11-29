package com.hdx.dao;

import com.hdx.bean.TbNuon;
import com.hdx.bean.TbNuonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNuonMapper {
    int countByExample(TbNuonExample example);

    int deleteByExample(TbNuonExample example);

    int insert(TbNuon record);

    int insertSelective(TbNuon record);

    List<TbNuon> selectByExample(TbNuonExample example);

    int updateByExampleSelective(@Param("record") TbNuon record, @Param("example") TbNuonExample example);

    int updateByExample(@Param("record") TbNuon record, @Param("example") TbNuonExample example);
}