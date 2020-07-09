/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DealCategory extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DealCategory\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.DealCategory\"},{\"name\":\"category_id\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public int category_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DealCategory() {}

  /**
   * All-args constructor.
   */
  public DealCategory(CharSequence type, Integer category_id) {
    this.type = type;
    this.category_id = category_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return category_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: category_id = (Integer)value$; break;
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
   * Gets the value of the 'category_id' field.
   */
  public Integer getCategoryId() {
    return category_id;
  }

  /**
   * Sets the value of the 'category_id' field.
   * @param value the value to set.
   */
  public void setCategoryId(Integer value) {
    this.category_id = value;
  }

  /** Creates a new DealCategory RecordBuilder */
  public static maestro.components.DealCategory.Builder newBuilder() {
    return new maestro.components.DealCategory.Builder();
  }

  /** Creates a new DealCategory RecordBuilder by copying an existing Builder */
  public static maestro.components.DealCategory.Builder newBuilder(maestro.components.DealCategory.Builder other) {
    return new maestro.components.DealCategory.Builder(other);
  }

  /** Creates a new DealCategory RecordBuilder by copying an existing DealCategory instance */
  public static maestro.components.DealCategory.Builder newBuilder(maestro.components.DealCategory other) {
    return new maestro.components.DealCategory.Builder(other);
  }

  /**
   * RecordBuilder for DealCategory instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DealCategory>
    implements org.apache.avro.data.RecordBuilder<DealCategory> {

    private CharSequence type;
    private int category_id;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.DealCategory.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.DealCategory.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.category_id)) {
        this.category_id = data().deepCopy(fields()[1].schema(), other.category_id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing DealCategory instance */
    private Builder(maestro.components.DealCategory other) {
            super(maestro.components.DealCategory.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.category_id)) {
        this.category_id = data().deepCopy(fields()[1].schema(), other.category_id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.DealCategory.Builder setType(CharSequence value) {
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
    public maestro.components.DealCategory.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'category_id' field */
    public Integer getCategoryId() {
      return category_id;
    }

    /** Sets the value of the 'category_id' field */
    public maestro.components.DealCategory.Builder setCategoryId(int value) {
      validate(fields()[1], value);
      this.category_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'category_id' field has been set */
    public boolean hasCategoryId() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'category_id' field */
    public maestro.components.DealCategory.Builder clearCategoryId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DealCategory build() {
      try {
        DealCategory record = new DealCategory();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.category_id = fieldSetFlags()[1] ? this.category_id : (Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
