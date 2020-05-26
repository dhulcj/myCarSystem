package com.jkxy.car.api.dao;

import com.jkxy.car.api.pojo.BuyCar;
import com.jkxy.car.api.pojo.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface CarDao {
    @Select("select * from carMessage")
    List<Car> findAll();

    @Select("select * from carMessage where id = #{id}")
    Car findById(int id);

    @Select("select * from carMessage where carName = #{carName}")
    List<Car> findByCarName(String carName);

    @Select("select qty from carMessage where carName = #{carName} and carType = #{carType} and carSeries = #{carSeries}")
    int getNumByCar(BuyCar buyCar);

    @Delete("delete from carMessage where id = #{id}")
    void deleteById(int id);

    @Update("update carMessage set qty = #{qty} where carName =#{carName}")
    void buyCar(BuyCar buyCar);

    @Update("update carMessage set carName=#{carName},carType=#{carType},price=#{price},carSeries=#{carSeries} where id = #{id}")
    void updateById(Car car);

    @Insert("insert into carMessage(carName,carType,price,carSeries) values(#{carName},#{carType},#{price},#{carSeries})")
    void insertCar(Car car);
}
