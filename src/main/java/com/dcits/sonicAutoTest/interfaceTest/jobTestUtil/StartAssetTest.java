package com.dcits.sonicAutoTest.interfaceTest.jobTestUtil;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

/**
 * @program: sonicAtuoTest
 * @description: 接口自动化测试main方法启动
 * @author: liu yan
 * @create: 2019-11-04 08:56
 */
public class StartAssetTest {
    public static void main(String[] args) {
        TestNG testng = new TestNG();

        List suites = Lists.newArrayList();
        //预言值文件，后期应该放在项目中去
        suites.add("testNG/jobTest.xml");//path to xml..

        testng.setTestSuites(suites);

        testng.run();
    }

}
