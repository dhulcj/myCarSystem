package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.BuyCar;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.pojo.FuzzyQueryVO;

import java.util.List;


public interface CarService {

    List<Car> findAll();

    Car findById(int id);

    List<Car> findByCarName(String carName);

    List<Car> fuzzyQuery(FuzzyQueryVO fuzzyQueryVO);

    void deleteById(int id);

    void updateById(Car car);

    void insertCar(Car car);

    void buyCar(BuyCar buyCar);
}
