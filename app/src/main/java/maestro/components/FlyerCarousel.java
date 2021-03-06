/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlyerCarousel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlyerCarousel\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerCarousel\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"flyers\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"PremiumFlyer\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.PremiumFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Auction\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Auction\"},{\"name\":\"auction_uuid\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Budget\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Budget\"},{\"name\":\"budget_id\",\"type\":\"int\"},{\"name\":\"cost_model_type\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"payload_override\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FlyerOverride\",\"namespace\":\"maestro.payloads\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.payloads.FlyerOverride\"},{\"name\":\"flyer_page_thumbnails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"storefront_carousel_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"storefront_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"featured_items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FlyerFeaturedItem\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerFeaturedItem\"},{\"name\":\"id\",\"type\":\"int\"}]}},\"default\":[]},{\"name\":\"best_deals\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]}]},{\"type\":\"record\",\"name\":\"OrganicFlyer\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.OrganicFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",\"maestro.common.Auction\"],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",\"maestro.common.Budget\"],\"default\":null}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence name;
  @Deprecated public java.util.List<Object> flyers;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlyerCarousel() {}

  /**
   * All-args constructor.
   */
  public FlyerCarousel(CharSequence type, CharSequence name, java.util.List<Object> flyers) {
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

  /** Creates a new FlyerCarousel RecordBuilder */
  public static maestro.components.FlyerCarousel.Builder newBuilder() {
    return new maestro.components.FlyerCarousel.Builder();
  }

  /** Creates a new FlyerCarousel RecordBuilder by copying an existing Builder */
  public static maestro.components.FlyerCarousel.Builder newBuilder(maestro.components.FlyerCarousel.Builder other) {
    return new maestro.components.FlyerCarousel.Builder(other);
  }

  /** Creates a new FlyerCarousel RecordBuilder by copying an existing FlyerCarousel instance */
  public static maestro.components.FlyerCarousel.Builder newBuilder(maestro.components.FlyerCarousel other) {
    return new maestro.components.FlyerCarousel.Builder(other);
  }

  /**
   * RecordBuilder for FlyerCarousel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlyerCarousel>
    implements org.apache.avro.data.RecordBuilder<FlyerCarousel> {

    private CharSequence type;
    private CharSequence name;
    private java.util.List<Object> flyers;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.FlyerCarousel.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.FlyerCarousel.Builder other) {
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

    /** Creates a Builder by copying an existing FlyerCarousel instance */
    private Builder(maestro.components.FlyerCarousel other) {
            super(maestro.components.FlyerCarousel.SCHEMA$);
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
    public maestro.components.FlyerCarousel.Builder setType(CharSequence value) {
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
    public maestro.components.FlyerCarousel.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public CharSequence getName() {
      return name;
    }

    /** Sets the value of the 'name' field */
    public maestro.components.FlyerCarousel.Builder setName(CharSequence value) {
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
    public maestro.components.FlyerCarousel.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'flyers' field */
    public java.util.List<Object> getFlyers() {
      return flyers;
    }

    /** Sets the value of the 'flyers' field */
    public maestro.components.FlyerCarousel.Builder setFlyers(java.util.List<Object> value) {
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
    public maestro.components.FlyerCarousel.Builder clearFlyers() {
      flyers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FlyerCarousel build() {
      try {
        FlyerCarousel record = new FlyerCarousel();
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
