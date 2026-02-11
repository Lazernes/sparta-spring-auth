package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaenTest {

    @Autowired
    @Qualifier("pizza")
    Food food;
}
