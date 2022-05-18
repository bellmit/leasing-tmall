package com.hshc.relay.dao.typehandler;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-09 15:00
 */
public class MapHandler implements TypeHandler<Map<?, ?>> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Map<?, ?> map, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, JSON.toJSONString(map));
    }

    @Override
    public Map<?, ?> getResult(ResultSet resultSet, String s) throws SQLException {
        return JSON.parseObject(resultSet.getString(s));
    }

    @Override
    public Map<?, ?> getResult(ResultSet resultSet, int i) throws SQLException {
        return JSON.parseObject(resultSet.getString(i));
    }

    @Override
    public Map<?, ?> getResult(CallableStatement callableStatement, int i) throws SQLException {
        return JSON.parseObject(callableStatement.getString(i));
    }
}
