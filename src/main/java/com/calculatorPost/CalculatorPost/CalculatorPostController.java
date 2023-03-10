package com.calculatorPost.CalculatorPost;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;
import java.util.stream.*;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;



@RestController

public class CalculatorPostController {

    @PostMapping("/ai/calculation2")

    public CalculatorPostResponse calculation2(@RequestBody CalculatorPost calculatorPost) {

        System.out.println(calculatorPost);

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList<String> array = new ArrayList<String>();
        int resultIndex = 0;
        int max = calculatorPost.getMax();
        int divisor = calculatorPost.getDivisor();
        int limit = calculatorPost.getLimit();

        for (int i = 1; i < max; i++) {
            if (i % divisor == 0) {
                myArray.add(i);
                resultIndex = myArray.size();
            }
        }
        for (int n = 1; n <= limit; n++) {
            String myString = Integer.toString(myArray.get(resultIndex - n) + 2);

            array.add("" + "I am " + myString + "");

        }


            return new CalculatorPostResponse(array);
        }
    }
