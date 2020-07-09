/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlyerItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlyerItem\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerItem\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"style\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public int id;
  @Deprecated public int flyer_id;
  @Deprecated public CharSequence style;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlyerItem() {}

  /**
   * All-args constructor.
   */
  public FlyerItem(CharSequence type, Integer id, Integer flyer_id, CharSequence style) {
    this.type = type;
    this.id = id;
    this.flyer_id = flyer_id;
    this.style = style;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    case 2: return flyer_id;
    case 3: return style;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: id = (Integer)value$; break;
    case 2: flyer_id = (Integer)value$; break;
    case 3: style = (CharSequence)value$; break;
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

  /**
   * Gets the value of the 'flyer_id' field.
   */
  public Integer getFlyerId() {
    return flyer_id;
  }

  /**
   * Sets the value of the 'flyer_id' field.
   * @param value the value to set.
   */
  public void setFlyerId(Integer value) {
    this.flyer_id = value;
  }

  /**
   * Gets the value of the 'style' field.
   */
  public CharSequence getStyle() {
    return style;
  }

  /**
   * Sets the value of the 'style' field.
   * @param value the value to set.
   */
  public void setStyle(CharSequence value) {
    this.style = value;
  }

  /** Creates a new FlyerItem RecordBuilder */
  public static maestro.components.FlyerItem.Builder newBuilder() {
    return new maestro.components.FlyerItem.Builder();
  }

  /** Creates a new FlyerItem RecordBuilder by copying an existing Builder */
  public static maestro.components.FlyerItem.Builder newBuilder(maestro.components.FlyerItem.Builder other) {
    return new maestro.components.FlyerItem.Builder(other);
  }

  /** Creates a new FlyerItem RecordBuilder by copying an existing FlyerItem instance */
  public static maestro.components.FlyerItem.Builder newBuilder(maestro.components.FlyerItem other) {
    return new maestro.components.FlyerItem.Builder(other);
  }

  /**
   * RecordBuilder for FlyerItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlyerItem>
    implements org.apache.avro.data.RecordBuilder<FlyerItem> {

    private CharSequence type;
    private int id;
    private int flyer_id;
    private CharSequence style;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.FlyerItem.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.FlyerItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[2].schema(), other.flyer_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.style)) {
        this.style = data().deepCopy(fields()[3].schema(), other.style);
        fieldSetFlags()[3] = true;
      }
    }

    /** Creates a Builder by copying an existing FlyerItem instance */
    private Builder(maestro.components.FlyerItem other) {
            super(maestro.components.FlyerItem.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[2].schema(), other.flyer_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.style)) {
        this.style = data().deepCopy(fields()[3].schema(), other.style);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.FlyerItem.Builder setType(CharSequence value) {
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
    public maestro.components.FlyerItem.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public Integer getId() {
      return id;
    }

    /** Sets the value of the 'id' field */
    public maestro.components.FlyerItem.Builder setId(int value) {
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
    public maestro.components.FlyerItem.Builder clearId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'flyer_id' field */
    public Integer getFlyerId() {
      return flyer_id;
    }

    /** Sets the value of the 'flyer_id' field */
    public maestro.components.FlyerItem.Builder setFlyerId(int value) {
      validate(fields()[2], value);
      this.flyer_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'flyer_id' field has been set */
    public boolean hasFlyerId() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'flyer_id' field */
    public maestro.components.FlyerItem.Builder clearFlyerId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'style' field */
    public CharSequence getStyle() {
      return style;
    }

    /** Sets the value of the 'style' field */
    public maestro.components.FlyerItem.Builder setStyle(CharSequence value) {
      validate(fields()[3], value);
      this.style = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'style' field has been set */
    public boolean hasStyle() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'style' field */
    public maestro.components.FlyerItem.Builder clearStyle() {
      style = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public FlyerItem build() {
      try {
        FlyerItem record = new FlyerItem();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (Integer) defaultValue(fields()[1]);
        record.flyer_id = fieldSetFlags()[2] ? this.flyer_id : (Integer) defaultValue(fields()[2]);
        record.style = fieldSetFlags()[3] ? this.style : (CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
