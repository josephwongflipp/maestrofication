/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WebPromo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WebPromo\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.WebPromo\"},{\"name\":\"web_promo_id\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public int web_promo_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WebPromo() {}

  /**
   * All-args constructor.
   */
  public WebPromo(CharSequence type, Integer web_promo_id) {
    this.type = type;
    this.web_promo_id = web_promo_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return web_promo_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: web_promo_id = (Integer)value$; break;
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
   * Gets the value of the 'web_promo_id' field.
   */
  public Integer getWebPromoId() {
    return web_promo_id;
  }

  /**
   * Sets the value of the 'web_promo_id' field.
   * @param value the value to set.
   */
  public void setWebPromoId(Integer value) {
    this.web_promo_id = value;
  }

  /** Creates a new WebPromo RecordBuilder */
  public static maestro.components.WebPromo.Builder newBuilder() {
    return new maestro.components.WebPromo.Builder();
  }

  /** Creates a new WebPromo RecordBuilder by copying an existing Builder */
  public static maestro.components.WebPromo.Builder newBuilder(maestro.components.WebPromo.Builder other) {
    return new maestro.components.WebPromo.Builder(other);
  }

  /** Creates a new WebPromo RecordBuilder by copying an existing WebPromo instance */
  public static maestro.components.WebPromo.Builder newBuilder(maestro.components.WebPromo other) {
    return new maestro.components.WebPromo.Builder(other);
  }

  /**
   * RecordBuilder for WebPromo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WebPromo>
    implements org.apache.avro.data.RecordBuilder<WebPromo> {

    private CharSequence type;
    private int web_promo_id;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.WebPromo.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.WebPromo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.web_promo_id)) {
        this.web_promo_id = data().deepCopy(fields()[1].schema(), other.web_promo_id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing WebPromo instance */
    private Builder(maestro.components.WebPromo other) {
            super(maestro.components.WebPromo.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.web_promo_id)) {
        this.web_promo_id = data().deepCopy(fields()[1].schema(), other.web_promo_id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.WebPromo.Builder setType(CharSequence value) {
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
    public maestro.components.WebPromo.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'web_promo_id' field */
    public Integer getWebPromoId() {
      return web_promo_id;
    }

    /** Sets the value of the 'web_promo_id' field */
    public maestro.components.WebPromo.Builder setWebPromoId(int value) {
      validate(fields()[1], value);
      this.web_promo_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'web_promo_id' field has been set */
    public boolean hasWebPromoId() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'web_promo_id' field */
    public maestro.components.WebPromo.Builder clearWebPromoId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public WebPromo build() {
      try {
        WebPromo record = new WebPromo();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.web_promo_id = fieldSetFlags()[1] ? this.web_promo_id : (Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
