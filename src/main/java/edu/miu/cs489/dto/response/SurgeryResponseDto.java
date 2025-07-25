package edu.miu.cs489.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurgeryResponseDto {
    private Long id;
    private String surgeryNo;
    private AddressResponseDto address;
}
