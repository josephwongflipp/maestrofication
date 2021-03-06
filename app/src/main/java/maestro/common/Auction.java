/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.common;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Auction extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Auction\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Auction\"},{\"name\":\"auction_uuid\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence auction_uuid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Auction() {}

  /**
   * All-args constructor.
   */
  public Auction(CharSequence type, CharSequence auction_uuid) {
    this.type = type;
    this.auction_uuid = auction_uuid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return auction_uuid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: auction_uuid = (CharSequence)value$; break;
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
   * Gets the value of the 'auction_uuid' field.
   */
  public CharSequence getAuctionUuid() {
    return auction_uuid;
  }

  /**
   * Sets the value of the 'auction_uuid' field.
   * @param value the value to set.
   */
  public void setAuctionUuid(CharSequence value) {
    this.auction_uuid = value;
  }

  /** Creates a new Auction RecordBuilder */
  public static maestro.common.Auction.Builder newBuilder() {
    return new maestro.common.Auction.Builder();
  }

  /** Creates a new Auction RecordBuilder by copying an existing Builder */
  public static maestro.common.Auction.Builder newBuilder(maestro.common.Auction.Builder other) {
    return new maestro.common.Auction.Builder(other);
  }

  /** Creates a new Auction RecordBuilder by copying an existing Auction instance */
  public static maestro.common.Auction.Builder newBuilder(maestro.common.Auction other) {
    return new maestro.common.Auction.Builder(other);
  }

  /**
   * RecordBuilder for Auction instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Auction>
    implements org.apache.avro.data.RecordBuilder<Auction> {

    private CharSequence type;
    private CharSequence auction_uuid;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.common.Auction.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.common.Auction.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.auction_uuid)) {
        this.auction_uuid = data().deepCopy(fields()[1].schema(), other.auction_uuid);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing Auction instance */
    private Builder(maestro.common.Auction other) {
            super(maestro.common.Auction.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.auction_uuid)) {
        this.auction_uuid = data().deepCopy(fields()[1].schema(), other.auction_uuid);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.common.Auction.Builder setType(CharSequence value) {
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
    public maestro.common.Auction.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'auction_uuid' field */
    public CharSequence getAuctionUuid() {
      return auction_uuid;
    }

    /** Sets the value of the 'auction_uuid' field */
    public maestro.common.Auction.Builder setAuctionUuid(CharSequence value) {
      validate(fields()[1], value);
      this.auction_uuid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'auction_uuid' field has been set */
    public boolean hasAuctionUuid() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'auction_uuid' field */
    public maestro.common.Auction.Builder clearAuctionUuid() {
      auction_uuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Auction build() {
      try {
        Auction record = new Auction();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.auction_uuid = fieldSetFlags()[1] ? this.auction_uuid : (CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
