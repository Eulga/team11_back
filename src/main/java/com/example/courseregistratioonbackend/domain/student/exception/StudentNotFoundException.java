package com.example.courseregistratioonbackend.domain.student.exception;

import com.example.courseregistratioonbackend.global.enums.ErrorCode;
import com.example.courseregistratioonbackend.global.exception.GlobalException;

public class StudentNotFoundException extends GlobalException {
    public StudentNotFoundException(ErrorCode errorCode){super(errorCode);}
}
