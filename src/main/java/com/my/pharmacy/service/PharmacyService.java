package com.my.pharmacy.service;

import com.my.pharmacy.dto.OutputDto;
import com.my.pharmacy.entity.Pharmacy;
import com.my.pharmacy.repository.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PharmacyService {

    private final PharmacyRepository pharmacyRepository;

    public List<Pharmacy> saveAll(List<OutputDto> outputDtoList) {
        List<Pharmacy> pharmacies = outputDtoList.stream().map(dto ->
                Pharmacy.builder()
                        .pharmacyName(dto.getPharmacyName())
                        .pharmacyAddress(dto.getPharmacyAddress())
                        .directionURL(dto.getDirectionURL())
                        .roadViewURL(dto.getRoadViewURL())
                        .distance(dto.getDistance())
                        .build()
        ).collect(Collectors.toList());

        return pharmacyRepository.saveAll(pharmacies);
    }
}
