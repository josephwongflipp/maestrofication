/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components.internal;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FavouritesCarousel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FavouritesCarousel\",\"namespace\":\"maestro.components.internal\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.internal.FavouritesCarousel\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"flyers\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"PremiumFlyer\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.PremiumFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Auction\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Auction\"},{\"name\":\"auction_uuid\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Budget\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Budget\"},{\"name\":\"budget_id\",\"type\":\"int\"},{\"name\":\"cost_model_type\",\"type\":\"string\"}]}],\"default\":null}]},{\"type\":\"record\",\"name\":\"OrganicFlyer\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.OrganicFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",\"maestro.common.Auction\"],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",\"maestro.common.Budget\"],\"default\":null}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence name;
  @Deprecated public java.util.List<Object> flyers;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FavouritesCarousel() {}

  /**
   * All-args constructor.
   */
  public FavouritesCarousel(CharSequence type, CharSequence name, java.util.List<Object> flyers) {
    this.type = type;
    this.name = name;
    this.flyers = flyers;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return name;
    case 2: return flyers;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: name = (CharSequence)value$; break;
    case 2: flyers = (java.util.List<Object>)value$; break;
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

  /**
   * Gets the value of the 'flyers' field.
   */
  public java.util.List<Object> getFlyers() {
    return flyers;
  }

  /**
   * Sets the value of the 'flyers' field.
   * @param value the value to set.
   */
  public void setFlyers(java.util.List<Object> value) {
    this.flyers = value;
  }

  /** Creates a new FavouritesCarousel RecordBuilder */
  public static maestro.components.internal.FavouritesCarousel.Builder newBuilder() {
    return new maestro.components.internal.FavouritesCarousel.Builder();
  }

  /** Creates a new FavouritesCarousel RecordBuilder by copying an existing Builder */
  public static maestro.components.internal.FavouritesCarousel.Builder newBuilder(maestro.components.internal.FavouritesCarousel.Builder other) {
    return new maestro.components.internal.FavouritesCarousel.Builder(other);
  }

  /** Creates a new FavouritesCarousel RecordBuilder by copying an existing FavouritesCarousel instance */
  public static maestro.components.internal.FavouritesCarousel.Builder newBuilder(maestro.components.internal.FavouritesCarousel other) {
    return new maestro.components.internal.FavouritesCarousel.Builder(other);
  }

  /**
   * RecordBuilder for FavouritesCarousel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FavouritesCarousel>
    implements org.apache.avro.data.RecordBuilder<FavouritesCarousel> {

    private CharSequence type;
    private CharSequence name;
    private java.util.List<Object> flyers;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.internal.FavouritesCarousel.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.internal.FavouritesCarousel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyers)) {
        this.flyers = data().deepCopy(fields()[2].schema(), other.flyers);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing FavouritesCarousel instance */
    private Builder(maestro.components.internal.FavouritesCarousel other) {
            super(maestro.components.internal.FavouritesCarousel.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyers)) {
        this.flyers = data().deepCopy(fields()[2].schema(), other.flyers);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.internal.FavouritesCarousel.Builder setType(CharSequence value) {
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
    public maestro.components.internal.FavouritesCarousel.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public CharSequence getName() {
      return name;
    }

    /** Sets the value of the 'name' field */
    public maestro.components.internal.FavouritesCarousel.Builder setName(CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'name' field */
    public maestro.components.internal.FavouritesCarousel.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'flyers' field */
    public java.util.List<Object> getFlyers() {
      return flyers;
    }

    /** Sets the value of the 'flyers' field */
    public maestro.components.internal.FavouritesCarousel.Builder setFlyers(java.util.List<Object> value) {
      validate(fields()[2], value);
      this.flyers = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'flyers' field has been set */
    public boolean hasFlyers() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'flyers' field */
    public maestro.components.internal.FavouritesCarousel.Builder clearFlyers() {
      flyers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FavouritesCarousel build() {
      try {
        FavouritesCarousel record = new FavouritesCarousel();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (CharSequence) defaultValue(fields()[1]);
        record.flyers = fieldSetFlags()[2] ? this.flyers : (java.util.List<Object>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
