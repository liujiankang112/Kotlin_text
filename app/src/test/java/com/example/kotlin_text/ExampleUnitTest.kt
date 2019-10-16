package com.example.kotlin_text

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun TestWhere(){
        var a:Int
        val data = setOf<Int>(1,2,3,7,8,9)
        val num = 10
        when{
            4 in data -> System.out.println("数字在数组中")
            else -> {
                System.out.println("数字不在数组中")
            }
        }

        //条件判断
        when (num){
            in 1..5 -> System.out.println("当前输入值在1到5之间")
            !in 1..5 -> System.out.println("当前输入的值不在1到5之间")

        }
    }


}
