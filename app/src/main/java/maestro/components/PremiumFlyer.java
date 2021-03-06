/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PremiumFlyer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PremiumFlyer\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.PremiumFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Auction\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Auction\"},{\"name\":\"auction_uuid\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Budget\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Budget\"},{\"name\":\"budget_id\",\"type\":\"int\"},{\"name\":\"cost_model_type\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"payload_override\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FlyerOverride\",\"namespace\":\"maestro.payloads\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.payloads.FlyerOverride\"},{\"name\":\"flyer_page_thumbnails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"storefront_carousel_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"storefront_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"featured_items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FlyerFeaturedItem\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerFeaturedItem\"},{\"name\":\"id\",\"type\":\"int\"}]}},\"default\":[]},{\"name\":\"best_deals\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public int flyer_id;
  @Deprecated public maestro.common.Auction auction;
  @Deprecated public maestro.common.Budget budget;
  @Deprecated public maestro.payloads.FlyerOverride payload_override;
  @Deprecated public java.util.List<maestro.components.FlyerFeaturedItem> featured_items;
  @Deprecated public java.util.List<Integer> best_deals;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PremiumFlyer() {}

  /**
   * All-args constructor.
   */
  public PremiumFlyer(CharSequence type, Integer flyer_id, maestro.common.Auction auction, maestro.common.Budget budget, maestro.payloads.FlyerOverride payload_override, java.util.List<maestro.components.FlyerFeaturedItem> featured_items, java.util.List<Integer> best_deals) {
    this.type = type;
    this.flyer_id = flyer_id;
    this.auction = auction;
    this.budget = budget;
    this.payload_override = payload_override;
    this.featured_items = featured_items;
    this.best_deals = best_deals;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return flyer_id;
    case 2: return auction;
    case 3: return budget;
    case 4: return payload_override;
    case 5: return featured_items;
    case 6: return best_deals;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: flyer_id = (Integer)value$; break;
    case 2: auction = (maestro.common.Auction)value$; break;
    case 3: budget = (maestro.common.Budget)value$; break;
    case 4: payload_override = (maestro.payloads.FlyerOverride)value$; break;
    case 5: featured_items = (java.util.List<maestro.components.FlyerFeaturedItem>)value$; break;
    case 6: best_deals = (java.util.List<Integer>)value$; break;
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
   * Gets the value of the 'auction' field.
   */
  public maestro.common.Auction getAuction() {
    return auction;
  }

  /**
   * Sets the value of the 'auction' field.
   * @param value the value to set.
   */
  public void setAuction(maestro.common.Auction value) {
    this.auction = value;
  }

  /**
   * Gets the value of the 'budget' field.
   */
  public maestro.common.Budget getBudget() {
    return budget;
  }

  /**
   * Sets the value of the 'budget' field.
   * @param value the value to set.
   */
  public void setBudget(maestro.common.Budget value) {
    this.budget = value;
  }

  /**
   * Gets the value of the 'payload_override' field.
   */
  public maestro.payloads.FlyerOverride getPayloadOverride() {
    return payload_override;
  }

  /**
   * Sets the value of the 'payload_override' field.
   * @param value the value to set.
   */
  public void setPayloadOverride(maestro.payloads.FlyerOverride value) {
    this.payload_override = value;
  }

  /**
   * Gets the value of the 'featured_items' field.
   */
  public java.util.List<maestro.components.FlyerFeaturedItem> getFeaturedItems() {
    return featured_items;
  }

  /**
   * Sets the value of the 'featured_items' field.
   * @param value the value to set.
   */
  public void setFeaturedItems(java.util.List<maestro.components.FlyerFeaturedItem> value) {
    this.featured_items = value;
  }

  /**
   * Gets the value of the 'best_deals' field.
   */
  public java.util.List<Integer> getBestDeals() {
    return best_deals;
  }

  /**
   * Sets the value of the 'best_deals' field.
   * @param value the value to set.
   */
  public void setBestDeals(java.util.List<Integer> value) {
    this.best_deals = value;
  }

  /** Creates a new PremiumFlyer RecordBuilder */
  public static maestro.components.PremiumFlyer.Builder newBuilder() {
    return new maestro.components.PremiumFlyer.Builder();
  }

  /** Creates a new PremiumFlyer RecordBuilder by copying an existing Builder */
  public static maestro.components.PremiumFlyer.Builder newBuilder(maestro.components.PremiumFlyer.Builder other) {
    return new maestro.components.PremiumFlyer.Builder(other);
  }

  /** Creates a new PremiumFlyer RecordBuilder by copying an existing PremiumFlyer instance */
  public static maestro.components.PremiumFlyer.Builder newBuilder(maestro.components.PremiumFlyer other) {
    return new maestro.components.PremiumFlyer.Builder(other);
  }

  /**
   * RecordBuilder for PremiumFlyer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PremiumFlyer>
    implements org.apache.avro.data.RecordBuilder<PremiumFlyer> {

    private CharSequence type;
    private int flyer_id;
    private maestro.common.Auction auction;
    private maestro.common.Budget budget;
    private maestro.payloads.FlyerOverride payload_override;
    private java.util.List<maestro.components.FlyerFeaturedItem> featured_items;
    private java.util.List<Integer> best_deals;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.PremiumFlyer.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.PremiumFlyer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[1].schema(), other.flyer_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.auction)) {
        this.auction = data().deepCopy(fields()[2].schema(), other.auction);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.budget)) {
        this.budget = data().deepCopy(fields()[3].schema(), other.budget);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.payload_override)) {
        this.payload_override = data().deepCopy(fields()[4].schema(), other.payload_override);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.featured_items)) {
        this.featured_items = data().deepCopy(fields()[5].schema(), other.featured_items);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.best_deals)) {
        this.best_deals = data().deepCopy(fields()[6].schema(), other.best_deals);
        fieldSetFlags()[6] = true;
      }
    }

    /** Creates a Builder by copying an existing PremiumFlyer instance */
    private Builder(maestro.components.PremiumFlyer other) {
            super(maestro.components.PremiumFlyer.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[1].schema(), other.flyer_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.auction)) {
        this.auction = data().deepCopy(fields()[2].schema(), other.auction);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.budget)) {
        this.budget = data().deepCopy(fields()[3].schema(), other.budget);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.payload_override)) {
        this.payload_override = data().deepCopy(fields()[4].schema(), other.payload_override);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.featured_items)) {
        this.featured_items = data().deepCopy(fields()[5].schema(), other.featured_items);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.best_deals)) {
        this.best_deals = data().deepCopy(fields()[6].schema(), other.best_deals);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.PremiumFlyer.Builder setType(CharSequence value) {
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
    public maestro.components.PremiumFlyer.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'flyer_id' field */
    public Integer getFlyerId() {
      return flyer_id;
    }

    /** Sets the value of the 'flyer_id' field */
    public maestro.components.PremiumFlyer.Builder setFlyerId(int value) {
      validate(fields()[1], value);
      this.flyer_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'flyer_id' field has been set */
    public boolean hasFlyerId() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'flyer_id' field */
    public maestro.components.PremiumFlyer.Builder clearFlyerId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'auction' field */
    public maestro.common.Auction getAuction() {
      return auction;
    }

    /** Sets the value of the 'auction' field */
    public maestro.components.PremiumFlyer.Builder setAuction(maestro.common.Auction value) {
      validate(fields()[2], value);
      this.auction = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'auction' field has been set */
    public boolean hasAuction() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'auction' field */
    public maestro.components.PremiumFlyer.Builder clearAuction() {
      auction = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'budget' field */
    public maestro.common.Budget getBudget() {
      return budget;
    }

    /** Sets the value of the 'budget' field */
    public maestro.components.PremiumFlyer.Builder setBudget(maestro.common.Budget value) {
      validate(fields()[3], value);
      this.budget = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'budget' field has been set */
    public boolean hasBudget() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'budget' field */
    public maestro.components.PremiumFlyer.Builder clearBudget() {
      budget = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'payload_override' field */
    public maestro.payloads.FlyerOverride getPayloadOverride() {
      return payload_override;
    }

    /** Sets the value of the 'payload_override' field */
    public maestro.components.PremiumFlyer.Builder setPayloadOverride(maestro.payloads.FlyerOverride value) {
      validate(fields()[4], value);
      this.payload_override = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'payload_override' field has been set */
    public boolean hasPayloadOverride() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'payload_override' field */
    public maestro.components.PremiumFlyer.Builder clearPayloadOverride() {
      payload_override = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'featured_items' field */
    public java.util.List<maestro.components.FlyerFeaturedItem> getFeaturedItems() {
      return featured_items;
    }

    /** Sets the value of the 'featured_items' field */
    public maestro.components.PremiumFlyer.Builder setFeaturedItems(java.util.List<maestro.components.FlyerFeaturedItem> value) {
      validate(fields()[5], value);
      this.featured_items = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'featured_items' field has been set */
    public boolean hasFeaturedItems() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'featured_items' field */
    public maestro.components.PremiumFlyer.Builder clearFeaturedItems() {
      featured_items = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'best_deals' field */
    public java.util.List<Integer> getBestDeals() {
      return best_deals;
    }

    /** Sets the value of the 'best_deals' field */
    public maestro.components.PremiumFlyer.Builder setBestDeals(java.util.List<Integer> value) {
      validate(fields()[6], value);
      this.best_deals = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'best_deals' field has been set */
    public boolean hasBestDeals() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'best_deals' field */
    public maestro.components.PremiumFlyer.Builder clearBestDeals() {
      best_deals = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public PremiumFlyer build() {
      try {
        PremiumFlyer record = new PremiumFlyer();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.flyer_id = fieldSetFlags()[1] ? this.flyer_id : (Integer) defaultValue(fields()[1]);
        record.auction = fieldSetFlags()[2] ? this.auction : (maestro.common.Auction) defaultValue(fields()[2]);
        record.budget = fieldSetFlags()[3] ? this.budget : (maestro.common.Budget) defaultValue(fields()[3]);
        record.payload_override = fieldSetFlags()[4] ? this.payload_override : (maestro.payloads.FlyerOverride) defaultValue(fields()[4]);
        record.featured_items = fieldSetFlags()[5] ? this.featured_items : (java.util.List<maestro.components.FlyerFeaturedItem>) defaultValue(fields()[5]);
        record.best_deals = fieldSetFlags()[6] ? this.best_deals : (java.util.List<Integer>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
