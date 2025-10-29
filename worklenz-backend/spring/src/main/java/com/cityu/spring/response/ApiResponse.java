package com.cityu.spring.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder

public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;

}

