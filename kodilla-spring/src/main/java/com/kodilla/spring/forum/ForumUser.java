package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

  public final String userName = "John Smith";

    public String getUserName() {
        return "John Smith";
    }
}

