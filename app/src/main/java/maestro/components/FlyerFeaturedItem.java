/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlyerFeaturedItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlyerFeaturedItem\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerFeaturedItem\"},{\"name\":\"id\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public int id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlyerFeaturedItem() {}

  /**
   * All-args constructor.
   */
  public FlyerFeaturedItem(CharSequence type, Integer id) {
    this.type = type;
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: id = (Integer)value$; break;
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
   * Gets the value of the 'id' field.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(Integer value) {
    this.id = value;
  }

  /** Creates a new FlyerFeaturedItem RecordBuilder */
  public static maestro.components.FlyerFeaturedItem.Builder newBuilder() {
    return new maestro.components.FlyerFeaturedItem.Builder();
  }

  /** Creates a new FlyerFeaturedItem RecordBuilder by copying an existing Builder */
  public static maestro.components.FlyerFeaturedItem.Builder newBuilder(maestro.components.FlyerFeaturedItem.Builder other) {
    return new maestro.components.FlyerFeaturedItem.Builder(other);
  }

  /** Creates a new FlyerFeaturedItem RecordBuilder by copying an existing FlyerFeaturedItem instance */
  public static maestro.components.FlyerFeaturedItem.Builder newBuilder(maestro.components.FlyerFeaturedItem other) {
    return new maestro.components.FlyerFeaturedItem.Builder(other);
  }

  /**
   * RecordBuilder for FlyerFeaturedItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlyerFeaturedItem>
    implements org.apache.avro.data.RecordBuilder<FlyerFeaturedItem> {

    private CharSequence type;
    private int id;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.FlyerFeaturedItem.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.FlyerFeaturedItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing FlyerFeaturedItem instance */
    private Builder(maestro.components.FlyerFeaturedItem other) {
            super(maestro.components.FlyerFeaturedItem.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.FlyerFeaturedItem.Builder setType(CharSequence value) {
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
    public maestro.components.FlyerFeaturedItem.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public Integer getId() {
      return id;
    }

    /** Sets the value of the 'id' field */
    public maestro.components.FlyerFeaturedItem.Builder setId(int value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'id' field */
    public maestro.components.FlyerFeaturedItem.Builder clearId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FlyerFeaturedItem build() {
      try {
        FlyerFeaturedItem record = new FlyerFeaturedItem();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}