package co.gov.biblored.serviciosDspace.controller;

import co.gov.biblored.serviciosDspace.dto.MetadatavalueDto;
import co.gov.biblored.serviciosDspace.model.Metadatavalue;
import co.gov.biblored.serviciosDspace.repository.MetadatavalueRepository;
import co.gov.biblored.serviciosDspace.service.MetadatavalueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MetadatavalueController {

    @Autowired
    private MetadatavalueService metadatavalueService;

   // @Autowired
    //private MetadatavalueRepository metadatavalueRepository;

    @GetMapping("/count-metadatavalueServices")
    public ResponseEntity<Integer> countMetadatavalueServiceByElement(@RequestParam String element) {
        int count = metadatavalueService.contMetadatavalueByElemet(element);
        return ResponseEntity.ok(count);
    }

   /* @GetMapping("/data")
    public Metadatavalue obtenerResultadoIdentidad() {
        // Lógica para obtener y devolver un objeto Resultado
        Metadatavalue metadatavalue = new Metadatavalue();
        metadatavalue.getId();
        metadatavalue.getTextValue();
        return metadatavalue;
    }*/

    /*@GetMapping("/filtrarTextValue")
    public List<MetadatavalueDto> filtrarTextValue(@RequestParam String textValue) {
        MetadatavalueDto metadatavalueDto = new MetadatavalueDto();

        return metadatavalueRepository.findByTextValue(textValue);
    }*/
}
