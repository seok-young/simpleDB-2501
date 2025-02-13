package com.ll.SimpleDb;

import org.w3c.dom.Text;

import java.time.LocalDateTime;

public class Article {
    public Long id;

    public LocalDateTime createdDate;
    public LocalDateTime updatedDate;
    public String title;
    public Text Body;
    public Boolean isblind;

}
