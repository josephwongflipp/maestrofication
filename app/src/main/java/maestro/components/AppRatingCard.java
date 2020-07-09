/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AppRatingCard extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AppRatingCard\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"app_rating_card\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AppRatingCard() {}

  /**
   * All-args constructor.
   */
  public AppRatingCard(CharSequence type) {
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

  /** Creates a new AppRatingCard RecordBuilder */
  public static maestro.components.AppRatingCard.Builder newBuilder() {
    return new maestro.components.AppRatingCard.Builder();
  }

  /** Creates a new AppRatingCard RecordBuilder by copying an existing Builder */
  public static maestro.components.AppRatingCard.Builder newBuilder(maestro.components.AppRatingCard.Builder other) {
    return new maestro.components.AppRatingCard.Builder(other);
  }

  /** Creates a new AppRatingCard RecordBuilder by copying an existing AppRatingCard instance */
  public static maestro.components.AppRatingCard.Builder newBuilder(maestro.components.AppRatingCard other) {
    return new maestro.components.AppRatingCard.Builder(other);
  }

  /**
   * RecordBuilder for AppRatingCard instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AppRatingCard>
    implements org.apache.avro.data.RecordBuilder<AppRatingCard> {

    private CharSequence type;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.AppRatingCard.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.AppRatingCard.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
    }

    /** Creates a Builder by copying an existing AppRatingCard instance */
    private Builder(maestro.components.AppRatingCard other) {
            super(maestro.components.AppRatingCard.SCHEMA$);
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
    public maestro.components.AppRatingCard.Builder setType(CharSequence value) {
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
    public maestro.components.AppRatingCard.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public AppRatingCard build() {
      try {
        AppRatingCard record = new AppRatingCard();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
