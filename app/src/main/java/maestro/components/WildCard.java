/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WildCard extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WildCard\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.WildCard\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WildCard() {}

  /**
   * All-args constructor.
   */
  public WildCard(CharSequence type) {
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
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

  /** Creates a new WildCard RecordBuilder */
  public static maestro.components.WildCard.Builder newBuilder() {
    return new maestro.components.WildCard.Builder();
  }

  /** Creates a new WildCard RecordBuilder by copying an existing Builder */
  public static maestro.components.WildCard.Builder newBuilder(maestro.components.WildCard.Builder other) {
    return new maestro.components.WildCard.Builder(other);
  }

  /** Creates a new WildCard RecordBuilder by copying an existing WildCard instance */
  public static maestro.components.WildCard.Builder newBuilder(maestro.components.WildCard other) {
    return new maestro.components.WildCard.Builder(other);
  }

  /**
   * RecordBuilder for WildCard instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WildCard>
    implements org.apache.avro.data.RecordBuilder<WildCard> {

    private CharSequence type;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.WildCard.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.WildCard.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
    }

    /** Creates a Builder by copying an existing WildCard instance */
    private Builder(maestro.components.WildCard other) {
            super(maestro.components.WildCard.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.WildCard.Builder setType(CharSequence value) {
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
    public maestro.components.WildCard.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public WildCard build() {
      try {
        WildCard record = new WildCard();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
