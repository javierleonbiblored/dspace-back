package co.gov.biblored.serviciosDspace.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link co.gov.biblored.serviciosDspace.model.Metadatavalue}
 */
@Value
public class MetadatavalueDto implements Serializable {
    Integer id;
    Integer metadataFieldId;
    String metadataFieldElement;
    String metadataFieldQualifier;
    String metadataFieldScopeNote;
    String textValue;
    String textLang;
    Integer place;
    String authority;
    Integer confidence;
    UUID dspaceObjectId;
}