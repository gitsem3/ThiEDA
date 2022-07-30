package com.example.thieda.service;

import com.example.thieda.entity.Sale;
import com.example.thieda.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaleService {
    final SaleRepository saleRepository;

    public Page<Sale> findAll(int page, int limit, String sortBy) {
        return saleRepository.findAll(PageRequest.of(page - 1, limit));
    }

    public Optional<Sale> findById(long id) {
        return saleRepository.findById(id);
    }
}
