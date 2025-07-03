package com.example.springprepare.testsample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("계산기 테스트")

class CalculatorTest {
    //mock(모의 객체)
    //before each
    @Test
    @DisplayName("곱하기 테스트")
    void test1() {
        //given (주어진 값.)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "*";

        //when (테스트 실행.)
        Double result = calculator.operate(num1,op,num2);

        //then (결과.)
        System.out.println("result = " + result);
        Assertions.assertEquals(16, result);
        }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        //given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "/";

        //when (테스트 실행.)
        Double result = calculator.operate(num1,op,num2);

        //then (결과.)
        System.out.println("result = " + result);
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("더하기 테스트")
    void test3() {
        //given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "+";

        //when (테스트 실행.)
        Double result = calculator.operate(num1,op,num2);

        //then (결과.)
        System.out.println("result = " + result);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test4() {
        //given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "-";

        //when (테스트 실행.)
        Double result = calculator.operate(num1,op,num2);

        //then (결과.)
        System.out.println("result = " + result);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("예외 테스트")
    void test5() {
        //given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "%";

        //when (테스트 실행.)
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.operate(num1,op,num2)
        );

        //then (결과)
        Assertions.assertEquals("잘못된 연산자입니다.",thrown.getMessage());
    }

    @Test
    @DisplayName("null 테스트")
    void test6() {
        //given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 0;
        String op = "/";

        //when (테스트 실행.)
        Double result = calculator.operate(num1,op,num2);

        //then (결과.)
        System.out.println("result = " + result);
        Assertions.assertNull(result);
    }
}