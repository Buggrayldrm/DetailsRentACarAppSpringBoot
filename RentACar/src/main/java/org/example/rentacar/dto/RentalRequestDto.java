package org.example.rentacar.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RentalRequestDto {
    private String plaka;

    private LocalDateTime startTime;

    private  LocalDateTime endTime;


}
