package com.Booysen31SA.WithSpringFrameWork;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class FunctionsWithSpringFrameWorkTest {

    FunctionsInterface functions = new FunctionsWithSpringFrameWork();

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        functions = (FunctionsInterface) ctx.getBean("FunctionsSettings");
    }

    @After
    public void tearDown() throws Exception {
        //Not sure what this does yet
    }

    @Test
    public void addingToList() {

        String vehicleName = "VW";
        String vehicleName2 = "Toyota";

        functions.addingToList(vehicleName);
        functions.addingToList(vehicleName2);

        Assert.assertEquals("Add", vehicleName, vehicleName);
        Assert.assertEquals("Add", vehicleName2, vehicleName2);
    }

    @Test
    public void addingToSet() {

        String rimSize1 = "16";
        String rimSize2 = "17";
        String rimSize3 = "18";
        String rimSize4 = "19";

        functions.addingToSet(rimSize1);
        functions.addingToSet(rimSize2);
        functions.addingToSet(rimSize3);
        functions.addingToSet(rimSize4);
        Assert.assertNotEquals("Check value is different", rimSize1, rimSize2);

    }

    @Test
    public void addngToMap() {

        String productKey1 = "01";
        String product1 = "Gate";
        String productKey2 = "02";
        String product2 = "Fence";
        String productKey3 = "03";
        String product3 = "Wall";

        functions.addingToMap(productKey1, product1);
        functions.addingToMap(productKey2, product2);
        functions.addingToMap(productKey3, product3);

        Assert.assertNotNull("check if not Null", productKey1);
        Assert.assertNotNull("check if not Null", productKey2);
        Assert.assertNotNull("check if not Null", productKey3);
    }
}