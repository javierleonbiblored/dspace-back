package co.gov.biblored.serviciosDspace.service;


import co.gov.biblored.serviciosDspace.repository.MetadatavalueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadatavalueService {

    @Autowired
    private MetadatavalueRepository metadatavalueRepository;


    public int contMetadatavalueByElemet(String textValue) {
            return metadatavalueRepository.countMetadatavalueBy(textValue);
    }

    public List<Object[]> consultaMetadata(String textValue) {
        return metadatavalueRepository.consultaMetadata(textValue);
    }
}
