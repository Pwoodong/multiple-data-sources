package com.jiu.demo.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Package com.jiu.demo.utils
 * ClassName DuplicatedUtil.java
 * Description 重复值计算工具类
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-10 13:37
 **/
public class DuplicatedUtil {

    public static Set<Map<String,Object>> findDuplicateBySetAdd(List<Map<String,Object>> list) {
        Set<String> items = new HashSet<>();
        return list.stream().filter(n -> !items.add(n.get("NAME").toString())).collect(Collectors.toSet());
    }

}
