/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
/** A MapMarker components describes a point of interest within a Map component. A MapMarker is specified with coordinates as well as an optional marker_icon_url which points to an icon that will be used to render the point of interest within the Map. */
@org.apache.avro.specific.AvroGenerated
public class MapMarker extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MapMarker\",\"namespace\":\"maestro.components\",\"doc\":\"A MapMarker components describes a point of interest within a Map component. A MapMarker is specified with coordinates as well as an optional marker_icon_url which points to an icon that will be used to render the point of interest within the Map.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.MapMarker\"},{\"name\":\"coordinates\",\"type\":{\"type\":\"record\",\"name\":\"Coordinates\",\"doc\":\"A Coordinates components describes a point of interest. Coordinates are specified with a lat, lon.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Coordinates\"},{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}},{\"name\":\"marker_icon_url\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public maestro.components.Coordinates coordinates;
  @Deprecated public CharSequence marker_icon_url;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MapMarker() {}

  /**
   * All-args constructor.
   */
  public MapMarker(CharSequence type, maestro.components.Coordinates coordinates, CharSequence marker_icon_url) {
    this.type = type;
    this.coordinates = coordinates;
    this.marker_icon_url = marker_icon_url;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return coordinates;
    case 2: return marker_icon_url;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: coordinates = (maestro.components.Coordinates)value$; break;
    case 2: marker_icon_url = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'coordinates' field.
   */
  public maestro.components.Coordinates getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the 'coordinates' field.
   * @param value the value to set.
   */
  public void setCoordinates(maestro.components.Coordinates value) {
    this.coordinates = value;
  }

  /**
   * Gets the value of the 'marker_icon_url' field.
   */
  public CharSequence getMarkerIconUrl() {
    return marker_icon_url;
  }

  /**
   * Sets the value of the 'marker_icon_url' field.
   * @param value the value to set.
   */
  public void setMarkerIconUrl(CharSequence value) {
    this.marker_icon_url = value;
  }

  /** Creates a new MapMarker RecordBuilder */
  public static maestro.components.MapMarker.Builder newBuilder() {
    return new maestro.components.MapMarker.Builder();
  }

  /** Creates a new MapMarker RecordBuilder by copying an existing Builder */
  public static maestro.components.MapMarker.Builder newBuilder(maestro.components.MapMarker.Builder other) {
    return new maestro.components.MapMarker.Builder(other);
  }

  /** Creates a new MapMarker RecordBuilder by copying an existing MapMarker instance */
  public static maestro.components.MapMarker.Builder newBuilder(maestro.components.MapMarker other) {
    return new maestro.components.MapMarker.Builder(other);
  }

  /**
   * RecordBuilder for MapMarker instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MapMarker>
    implements org.apache.avro.data.RecordBuilder<MapMarker> {

    private CharSequence type;
    private maestro.components.Coordinates coordinates;
    private CharSequence marker_icon_url;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.MapMarker.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.MapMarker.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[1].schema(), other.coordinates);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.marker_icon_url)) {
        this.marker_icon_url = data().deepCopy(fields()[2].schema(), other.marker_icon_url);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing MapMarker instance */
    private Builder(maestro.components.MapMarker other) {
            super(maestro.components.MapMarker.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[1].schema(), other.coordinates);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.marker_icon_url)) {
        this.marker_icon_url = data().deepCopy(fields()[2].schema(), other.marker_icon_url);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.MapMarker.Builder setType(CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'type' field */
    public maestro.components.MapMarker.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'coordinates' field */
    public maestro.components.Coordinates getCoordinates() {
      return coordinates;
    }

    /** Sets the value of the 'coordinates' field */
    public maestro.components.MapMarker.Builder setCoordinates(maestro.components.Coordinates value) {
      validate(fields()[1], value);
      this.coordinates = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'coordinates' field has been set */
    public boolean hasCoordinates() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'coordinates' field */
    public maestro.components.MapMarker.Builder clearCoordinates() {
      coordinates = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'marker_icon_url' field */
    public CharSequence getMarkerIconUrl() {
      return marker_icon_url;
    }

    /** Sets the value of the 'marker_icon_url' field */
    public maestro.components.MapMarker.Builder setMarkerIconUrl(CharSequence value) {
      validate(fields()[2], value);
      this.marker_icon_url = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'marker_icon_url' field has been set */
    public boolean hasMarkerIconUrl() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'marker_icon_url' field */
    public maestro.components.MapMarker.Builder clearMarkerIconUrl() {
      marker_icon_url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public MapMarker build() {
      try {
        MapMarker record = new MapMarker();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.coordinates = fieldSetFlags()[1] ? this.coordinates : (maestro.components.Coordinates) defaultValue(fields()[1]);
        record.marker_icon_url = fieldSetFlags()[2] ? this.marker_icon_url : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
