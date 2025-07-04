package com.example.springprepare.domain;

import lombok.*;

//@Getter
//@Setter //값 변경
@NoArgsConstructor //기본 생성자 생성 에너테이션
@AllArgsConstructor
//@RequiredArgsConstructor

public class Memo {
    private String username;
    private String content;
    private String description;
    private String password;
}
