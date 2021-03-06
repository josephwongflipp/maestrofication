/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SearchCarousel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchCarousel\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SearchCarousel() {}

  /**
   * All-args constructor.
   */
  public SearchCarousel(CharSequence name) {
    this.name = name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: name = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /** Creates a new SearchCarousel RecordBuilder */
  public static maestro.components.SearchCarousel.Builder newBuilder() {
    return new maestro.components.SearchCarousel.Builder();
  }

  /** Creates a new SearchCarousel RecordBuilder by copying an existing Builder */
  public static maestro.components.SearchCarousel.Builder newBuilder(maestro.components.SearchCarousel.Builder other) {
    return new maestro.components.SearchCarousel.Builder(other);
  }

  /** Creates a new SearchCarousel RecordBuilder by copying an existing SearchCarousel instance */
  public static maestro.components.SearchCarousel.Builder newBuilder(maestro.components.SearchCarousel other) {
    return new maestro.components.SearchCarousel.Builder(other);
  }

  /**
   * RecordBuilder for SearchCarousel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchCarousel>
    implements org.apache.avro.data.RecordBuilder<SearchCarousel> {

    private CharSequence name;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.SearchCarousel.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.SearchCarousel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
    }

    /** Creates a Builder by copying an existing SearchCarousel instance */
    private Builder(maestro.components.SearchCarousel other) {
            super(maestro.components.SearchCarousel.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public CharSequence getName() {
      return name;
    }

    /** Sets the value of the 'name' field */
    public maestro.components.SearchCarousel.Builder setName(CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'name' field */
    public maestro.components.SearchCarousel.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public SearchCarousel build() {
      try {
        SearchCarousel record = new SearchCarousel();
        record.name = fieldSetFlags()[0] ? this.name : (CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
