package com.student.svcet;

import java.io.Serial;

public class StudentNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String customMessage) {
        super(customMessage);
    }
}
