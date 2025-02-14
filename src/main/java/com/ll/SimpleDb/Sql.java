package com.ll.SimpleDb;

import java.util.ArrayList;
import java.util.HashMap;

public class Sql {
    private final ArrayList<HashMap<String, Object>> sqlParts;

    public Sql() {
        this.sqlParts = new ArrayList<>();
    }

    public Sql append(String query) {
        return append(query, null); // 중복 코드 줄이기
    }

    public Sql append(String query, Object param) {
        HashMap<String, Object> sqlPart = new HashMap<>();
        sqlPart.put("querypart", query);
        sqlPart.put("params", param);
        sqlParts.add(sqlPart);
        return this; // 체이닝을 위해 this 반환
    }

    @Override
    public String toString() {
//        return "Sql{" +
//                "sqlParts=" + sqlParts +
//                '}';
        return sqlParts.toString();
    }
    }



