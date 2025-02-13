package com.ll.SimpleDb;

import java.util.List;

public class Sql {
    public String querypart;
    public List<Object> params;

    public Sql() {
        this.querypart = "";
        this.params = null;
    }

    public Sql append(String sqlpart) {

        return null;
    }

    public Sql append(String sqlpart, Object... params) {
        return null;
    }

    public Long insert() {
        return null;
    }
}



