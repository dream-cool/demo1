package com.clt.wechatordering.mapper;

import com.clt.wechatordering.pojo.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    List<OrderDetail> findAllOrder();

    OrderDetail findOrderById(Integer id);
}
