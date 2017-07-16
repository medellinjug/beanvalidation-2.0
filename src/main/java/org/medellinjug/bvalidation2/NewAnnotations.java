
package org.medellinjug.bvalidation2;

import java.util.Date;
import javax.validation.constraints.*;

/**
 *
 * Created by Patricia on 15/07/17.
 * MedellinJUG.org
 */
public class NewAnnotations {



    //@NotNull//BV 1.1

    @NotBlank//BV 2.0
    private String notBlank;

    @NotEmpty//BV 2.0
    private String notEmpty;

    //@NotNull//BV 1.1
    @Email//BV 2.0
    private String email;

    @FutureOrPresent//BV 2.0
    private Date futureOrPresent;

    @PastOrPresent//BV 2.0
    private Date pastOrPresent;


    @Positive//BV 2.0
    private Long positive;

    @PositiveOrZero//BV 2.0
    private Long positiveOrZero;

    @Negative//BV 2.0
    private Long negative;

    @NegativeOrZero//BV 2.0
    private Long negativeOrZero;

    public String getNotBlank() {
        return notBlank;
    }

    public void setNotBlank(String notBlank) {
        this.notBlank = notBlank;
    }

    public String getNotEmpty() {
        return notEmpty;
    }

    public void setNotEmpty(String notEmpty) {
        this.notEmpty = notEmpty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFutureOrPresent() {
        return futureOrPresent;
    }

    public void setFutureOrPresent(Date futureOrPresent) {
        this.futureOrPresent = futureOrPresent;
    }

    public Date getPastOrPresent() {
        return pastOrPresent;
    }

    public void setPastOrPresent(Date pastOrPresent) {
        this.pastOrPresent = pastOrPresent;
    }

    public Long getPositive() {
        return positive;
    }

    public void setPositive(Long positive) {
        this.positive = positive;
    }

    public Long getPositiveOrZero() {
        return positiveOrZero;
    }

    public void setPositiveOrZero(Long positiveOrZero) {
        this.positiveOrZero = positiveOrZero;
    }

    public Long getNegative() {
        return negative;
    }

    public void setNegative(Long negative) {
        this.negative = negative;
    }

    public Long getNegativeOrZero() {
        return negativeOrZero;
    }

    public void setNegativeOrZero(Long negativeOrZero) {
        this.negativeOrZero = negativeOrZero;
    }


    @Override
    public String toString() {
        return "NewAnnotations{" +
                "notBlank='" + notBlank + '\'' +
                ", notEmpty='" + notEmpty + '\'' +
                ", email='" + email + '\'' +
                ", futureOrPresent=" + futureOrPresent +
                ", pastOrPresent=" + pastOrPresent +
                ", positive=" + positive +
                ", positiveOrZero=" + positiveOrZero +
                ", negative=" + negative +
                ", negativeOrZero=" + negativeOrZero +
                '}';
    }
}

