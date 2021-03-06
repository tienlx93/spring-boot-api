package com.example.demo.constants;

/**
 * Created by TienLX on 12/29/2017.
 */
public enum MessageCode {
    //Wrong parameter
    ERROR_BAD_REQUEST(400, "Bad request"),
    //User or request object not found
    ERROR_NOT_FOUND(404, "Not found"),
    //Other error
    ERROR_OTHER(9999, "Unexpected error");

    private final int value;
    private final String reasonPhrase;

    MessageCode(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    /**
     * Return a string representation of this status code.
     */
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    /**
     * Return the integer value of this status code.
     *
     * @return the int
     */
    public int value() {
        return this.value;
    }

    /**
     * Return the reason phrase of this status code.
     *
     * @return the reason phrase
     */
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    /**
     * Return the enum constant of this type with the specified numeric value.
     *
     * @param statusCode the numeric value of the enum to be returned
     * @return the enum constant with the specified numeric value
     * @throws IllegalArgumentException if this enum has no constant for the specified numeric value
     */
    public static MessageCode valueOf(int statusCode) {
        for (MessageCode status : values()) {
            if (status.value == statusCode) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
    }
}
