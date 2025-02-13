package com.ll.SimpleDb;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SimpleDb {
    private final String host;
    private final String username;
    private final String password;
    private final String dbName;

    public void setDevMode(boolean b) {
        Boolean devMode = b;
    }


    public Sql genSql() {
        Sql sql = new Sql();

        return sql;
    }


    public void run(String dropTableIfExistsArticle) {
    }
}
