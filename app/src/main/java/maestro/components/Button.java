/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Button extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Button\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Button\"},{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"link\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence label;
  @Deprecated public CharSequence link;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Button() {}

  /**
   * All-args constructor.
   */
  public Button(CharSequence type, CharSequence label, CharSequence link) {
    this.type = type;
    this.label = label;
    this.link = link;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return label;
    case 2: return link;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: label = (CharSequence)value$; break;
    case 2: link = (CharSequence)value$; break;
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
   * Gets the value of the 'label' field.
   */
  public CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'link' field.
   */
  public CharSequence getLink() {
    return link;
  }

  /**
   * Sets the value of the 'link' field.
   * @param value the value to set.
   */
  public void setLink(CharSequence value) {
    this.link = value;
  }

  /** Creates a new Button RecordBuilder */
  public static maestro.components.Button.Builder newBuilder() {
    return new maestro.components.Button.Builder();
  }

  /** Creates a new Button RecordBuilder by copying an existing Builder */
  public static maestro.components.Button.Builder newBuilder(maestro.components.Button.Builder other) {
    return new maestro.components.Button.Builder(other);
  }

  /** Creates a new Button RecordBuilder by copying an existing Button instance */
  public static maestro.components.Button.Builder newBuilder(maestro.components.Button other) {
    return new maestro.components.Button.Builder(other);
  }

  /**
   * RecordBuilder for Button instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Button>
    implements org.apache.avro.data.RecordBuilder<Button> {

    private CharSequence type;
    private CharSequence label;
    private CharSequence link;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.Button.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.Button.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.link)) {
        this.link = data().deepCopy(fields()[2].schema(), other.link);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing Button instance */
    private Builder(maestro.components.Button other) {
            super(maestro.components.Button.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.link)) {
        this.link = data().deepCopy(fields()[2].schema(), other.link);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.Button.Builder setType(CharSequence value) {
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
    public maestro.components.Button.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public CharSequence getLabel() {
      return label;
    }

    /** Sets the value of the 'label' field */
    public maestro.components.Button.Builder setLabel(CharSequence value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'label' field */
    public maestro.components.Button.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'link' field */
    public CharSequence getLink() {
      return link;
    }

    /** Sets the value of the 'link' field */
    public maestro.components.Button.Builder setLink(CharSequence value) {
      validate(fields()[2], value);
      this.link = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'link' field has been set */
    public boolean hasLink() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'link' field */
    public maestro.components.Button.Builder clearLink() {
      link = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Button build() {
      try {
        Button record = new Button();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (CharSequence) defaultValue(fields()[1]);
        record.link = fieldSetFlags()[2] ? this.link : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
