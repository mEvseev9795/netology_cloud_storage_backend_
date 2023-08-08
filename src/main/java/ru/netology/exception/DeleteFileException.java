package ru.netology.exception;

public class DeleteFileException extends RuntimeException {

    /**
     * @author Aleksandr Polochkin
     * 20.04.2023
     */

    public DeleteFileException() {
    }

    public DeleteFileException(String message) {
        super(message);
    }

    public DeleteFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteFileException(Throwable cause) {
        super(cause);
    }

    public DeleteFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}