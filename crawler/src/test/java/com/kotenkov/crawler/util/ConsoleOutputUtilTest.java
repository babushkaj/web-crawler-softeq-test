package com.kotenkov.crawler.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
public class ConsoleOutputUtilTest {

    private static final String EXPECTED_OUT_STRING = "testUrl 1 2 3 ";

    @Test
    public void shouldTransformEntryToStringProperly(){
        Map.Entry<String, List<Integer>> entry = new Map.Entry<>() {
            @Override
            public String getKey() {
                return "testUrl";
            }

            @Override
            public List<Integer> getValue() {
                return List.of(1,2,3);
            }

            @Override
            public List<Integer> setValue(List<Integer> value) {
                return null;
            }
        };

        String result = ConsoleOutputUtil.prepareUrlToConsoleOutput(entry);
        Assert.assertEquals(EXPECTED_OUT_STRING, result);
    }

}
