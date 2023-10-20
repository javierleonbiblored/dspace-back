package co.gov.biblored.serviciosDspace.repository;

import co.gov.biblored.serviciosDspace.model.Metadatavalue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.lang.model.element.Element;
import java.util.List;

@Repository
public interface MetadatavalueRepository extends JpaRepository<Metadatavalue, Long> {
    @Query("SELECT COUNT(m.id) FROM Metadatavalue m, Metadatafieldregistry m2 where m.metadataField.id = m2.id and m2.element = :element")
    int countMetadatavalueBy(@Param("element")String element);

    @Query("SELECT m.id, m.dspaceObject.id, m.textValue FROM Metadatavalue m, Metadatafieldregistry m2 where m.metadataField.id = m2.id and m2.element = :element")
    List<Object[]> consultaMetadata(@Param("element") String element);

  // List<Metadatavalue> findByTextValue(String textValue); // Método para filtrar por textValue
}
