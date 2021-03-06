/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.common;  
@SuppressWarnings("all")
/** A Browse Category component describes a category of slots that can appear in the Browse Layout. A default category value of null will be used to render the Explore category of slots in the Browse Layout. Other category values of nearby, alphabetical, latest, favourites, and stackid_<id> (where <id> respresents the integer id value of a stack) will be used to render corresponding Nearby, A-Z, Latest, Favourites, and stack categories of slots. */
@org.apache.avro.specific.AvroGenerated
public class BrowseCategory extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BrowseCategory\",\"namespace\":\"maestro.common\",\"doc\":\"A Browse Category component describes a category of slots that can appear in the Browse Layout. A default category value of null will be used to render the Explore category of slots in the Browse Layout. Other category values of nearby, alphabetical, latest, favourites, and stackid_<id> (where <id> respresents the integer id value of a stack) will be used to render corresponding Nearby, A-Z, Latest, Favourites, and stack categories of slots.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.BrowseCategory\"},{\"name\":\"category\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence category;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BrowseCategory() {}

  /**
   * All-args constructor.
   */
  public BrowseCategory(CharSequence type, CharSequence category) {
    this.type = type;
    this.category = category;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return category;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: category = (CharSequence)value$; break;
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
   * Gets the value of the 'category' field.
   */
  public CharSequence getCategory() {
    return category;
  }

  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(CharSequence value) {
    this.category = value;
  }

  /** Creates a new BrowseCategory RecordBuilder */
  public static maestro.common.BrowseCategory.Builder newBuilder() {
    return new maestro.common.BrowseCategory.Builder();
  }

  /** Creates a new BrowseCategory RecordBuilder by copying an existing Builder */
  public static maestro.common.BrowseCategory.Builder newBuilder(maestro.common.BrowseCategory.Builder other) {
    return new maestro.common.BrowseCategory.Builder(other);
  }

  /** Creates a new BrowseCategory RecordBuilder by copying an existing BrowseCategory instance */
  public static maestro.common.BrowseCategory.Builder newBuilder(maestro.common.BrowseCategory other) {
    return new maestro.common.BrowseCategory.Builder(other);
  }

  /**
   * RecordBuilder for BrowseCategory instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BrowseCategory>
    implements org.apache.avro.data.RecordBuilder<BrowseCategory> {

    private CharSequence type;
    private CharSequence category;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.common.BrowseCategory.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.common.BrowseCategory.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.category)) {
        this.category = data().deepCopy(fields()[1].schema(), other.category);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing BrowseCategory instance */
    private Builder(maestro.common.BrowseCategory other) {
            super(maestro.common.BrowseCategory.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.category)) {
        this.category = data().deepCopy(fields()[1].schema(), other.category);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.common.BrowseCategory.Builder setType(CharSequence value) {
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
    public maestro.common.BrowseCategory.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'category' field */
    public CharSequence getCategory() {
      return category;
    }

    /** Sets the value of the 'category' field */
    public maestro.common.BrowseCategory.Builder setCategory(CharSequence value) {
      validate(fields()[1], value);
      this.category = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'category' field has been set */
    public boolean hasCategory() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'category' field */
    public maestro.common.BrowseCategory.Builder clearCategory() {
      category = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public BrowseCategory build() {
      try {
        BrowseCategory record = new BrowseCategory();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.category = fieldSetFlags()[1] ? this.category : (CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
