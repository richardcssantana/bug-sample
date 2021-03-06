package br.com.richardcsantana.bugsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author richardsantana
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @NotNull
    @Size(min = 3,max = 15)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String name;
    @NotNull
    @Pattern(regexp = "\\d{4,5}-\\d{4}")
    private String telephone;

}
