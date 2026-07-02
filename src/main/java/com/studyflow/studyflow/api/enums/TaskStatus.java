package com.studyflow.studyflow.api.enums;

public enum TaskStatus {
    PENDING(1),
    IN_PROGRESS(2),
    DONE(3),
    CANCELLED(4);

    private final int codigo;

    TaskStatus (int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
