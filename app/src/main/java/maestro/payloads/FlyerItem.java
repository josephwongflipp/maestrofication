/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.payloads;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlyerItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlyerItem\",\"namespace\":\"maestro.payloads\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.payloads.FlyerItem\"},{\"name\":\"current_price\",\"type\":\"float\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"image_height_over_width\",\"type\":\"float\"},{\"name\":\"image_url\",\"type\":\"string\"},{\"name\":\"merchant_id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"original_price\",\"type\":[\"null\",\"float\"]},{\"name\":\"pre_price_text\",\"type\":[\"null\",\"string\"]},{\"name\":\"dollars_off\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"percent_off\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"post_price_text\",\"type\":[\"null\",\"string\"]},{\"name\":\"sale_story\",\"type\":[\"null\",\"string\"]},{\"name\":\"valid_from\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"valid_to\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public float current_price;
  @Deprecated public int flyer_id;
  @Deprecated public int id;
  @Deprecated public float image_height_over_width;
  @Deprecated public CharSequence image_url;
  @Deprecated public int merchant_id;
  @Deprecated public CharSequence name;
  @Deprecated public Float original_price;
  @Deprecated public CharSequence pre_price_text;
  @Deprecated public Float dollars_off;
  @Deprecated public Float percent_off;
  @Deprecated public CharSequence post_price_text;
  @Deprecated public CharSequence sale_story;
  @Deprecated public long valid_from;
  @Deprecated public long valid_to;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlyerItem() {}

  /**
   * All-args constructor.
   */
  public FlyerItem(CharSequence type, Float current_price, Integer flyer_id, Integer id, Float image_height_over_width, CharSequence image_url, Integer merchant_id, CharSequence name, Float original_price, CharSequence pre_price_text, Float dollars_off, Float percent_off, CharSequence post_price_text, CharSequence sale_story, Long valid_from, Long valid_to) {
    this.type = type;
    this.current_price = current_price;
    this.flyer_id = flyer_id;
    this.id = id;
    this.image_height_over_width = image_height_over_width;
    this.image_url = image_url;
    this.merchant_id = merchant_id;
    this.name = name;
    this.original_price = original_price;
    this.pre_price_text = pre_price_text;
    this.dollars_off = dollars_off;
    this.percent_off = percent_off;
    this.post_price_text = post_price_text;
    this.sale_story = sale_story;
    this.valid_from = valid_from;
    this.valid_to = valid_to;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return current_price;
    case 2: return flyer_id;
    case 3: return id;
    case 4: return image_height_over_width;
    case 5: return image_url;
    case 6: return merchant_id;
    case 7: return name;
    case 8: return original_price;
    case 9: return pre_price_text;
    case 10: return dollars_off;
    case 11: return percent_off;
    case 12: return post_price_text;
    case 13: return sale_story;
    case 14: return valid_from;
    case 15: return valid_to;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: current_price = (Float)value$; break;
    case 2: flyer_id = (Integer)value$; break;
    case 3: id = (Integer)value$; break;
    case 4: image_height_over_width = (Float)value$; break;
    case 5: image_url = (CharSequence)value$; break;
    case 6: merchant_id = (Integer)value$; break;
    case 7: name = (CharSequence)value$; break;
    case 8: original_price = (Float)value$; break;
    case 9: pre_price_text = (CharSequence)value$; break;
    case 10: dollars_off = (Float)value$; break;
    case 11: percent_off = (Float)value$; break;
    case 12: post_price_text = (CharSequence)value$; break;
    case 13: sale_story = (CharSequence)value$; break;
    case 14: valid_from = (Long)value$; break;
    case 15: valid_to = (Long)value$; break;
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
   * Gets the value of the 'current_price' field.
   */
  public Float getCurrentPrice() {
    return current_price;
  }

  /**
   * Sets the value of the 'current_price' field.
   * @param value the value to set.
   */
  public void setCurrentPrice(Float value) {
    this.current_price = value;
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
   * Gets the value of the 'image_height_over_width' field.
   */
  public Float getImageHeightOverWidth() {
    return image_height_over_width;
  }

  /**
   * Sets the value of the 'image_height_over_width' field.
   * @param value the value to set.
   */
  public void setImageHeightOverWidth(Float value) {
    this.image_height_over_width = value;
  }

  /**
   * Gets the value of the 'image_url' field.
   */
  public CharSequence getImageUrl() {
    return image_url;
  }

  /**
   * Sets the value of the 'image_url' field.
   * @param value the value to set.
   */
  public void setImageUrl(CharSequence value) {
    this.image_url = value;
  }

  /**
   * Gets the value of the 'merchant_id' field.
   */
  public Integer getMerchantId() {
    return merchant_id;
  }

  /**
   * Sets the value of the 'merchant_id' field.
   * @param value the value to set.
   */
  public void setMerchantId(Integer value) {
    this.merchant_id = value;
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
   * Gets the value of the 'original_price' field.
   */
  public Float getOriginalPrice() {
    return original_price;
  }

  /**
   * Sets the value of the 'original_price' field.
   * @param value the value to set.
   */
  public void setOriginalPrice(Float value) {
    this.original_price = value;
  }

  /**
   * Gets the value of the 'pre_price_text' field.
   */
  public CharSequence getPrePriceText() {
    return pre_price_text;
  }

  /**
   * Sets the value of the 'pre_price_text' field.
   * @param value the value to set.
   */
  public void setPrePriceText(CharSequence value) {
    this.pre_price_text = value;
  }

  /**
   * Gets the value of the 'dollars_off' field.
   */
  public Float getDollarsOff() {
    return dollars_off;
  }

  /**
   * Sets the value of the 'dollars_off' field.
   * @param value the value to set.
   */
  public void setDollarsOff(Float value) {
    this.dollars_off = value;
  }

  /**
   * Gets the value of the 'percent_off' field.
   */
  public Float getPercentOff() {
    return percent_off;
  }

  /**
   * Sets the value of the 'percent_off' field.
   * @param value the value to set.
   */
  public void setPercentOff(Float value) {
    this.percent_off = value;
  }

  /**
   * Gets the value of the 'post_price_text' field.
   */
  public CharSequence getPostPriceText() {
    return post_price_text;
  }

  /**
   * Sets the value of the 'post_price_text' field.
   * @param value the value to set.
   */
  public void setPostPriceText(CharSequence value) {
    this.post_price_text = value;
  }

  /**
   * Gets the value of the 'sale_story' field.
   */
  public CharSequence getSaleStory() {
    return sale_story;
  }

  /**
   * Sets the value of the 'sale_story' field.
   * @param value the value to set.
   */
  public void setSaleStory(CharSequence value) {
    this.sale_story = value;
  }

  /**
   * Gets the value of the 'valid_from' field.
   */
  public Long getValidFrom() {
    return valid_from;
  }

  /**
   * Sets the value of the 'valid_from' field.
   * @param value the value to set.
   */
  public void setValidFrom(Long value) {
    this.valid_from = value;
  }

  /**
   * Gets the value of the 'valid_to' field.
   */
  public Long getValidTo() {
    return valid_to;
  }

  /**
   * Sets the value of the 'valid_to' field.
   * @param value the value to set.
   */
  public void setValidTo(Long value) {
    this.valid_to = value;
  }

  /** Creates a new FlyerItem RecordBuilder */
  public static maestro.payloads.FlyerItem.Builder newBuilder() {
    return new maestro.payloads.FlyerItem.Builder();
  }

  /** Creates a new FlyerItem RecordBuilder by copying an existing Builder */
  public static maestro.payloads.FlyerItem.Builder newBuilder(maestro.payloads.FlyerItem.Builder other) {
    return new maestro.payloads.FlyerItem.Builder(other);
  }

  /** Creates a new FlyerItem RecordBuilder by copying an existing FlyerItem instance */
  public static maestro.payloads.FlyerItem.Builder newBuilder(maestro.payloads.FlyerItem other) {
    return new maestro.payloads.FlyerItem.Builder(other);
  }

  /**
   * RecordBuilder for FlyerItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlyerItem>
    implements org.apache.avro.data.RecordBuilder<FlyerItem> {

    private CharSequence type;
    private float current_price;
    private int flyer_id;
    private int id;
    private float image_height_over_width;
    private CharSequence image_url;
    private int merchant_id;
    private CharSequence name;
    private Float original_price;
    private CharSequence pre_price_text;
    private Float dollars_off;
    private Float percent_off;
    private CharSequence post_price_text;
    private CharSequence sale_story;
    private long valid_from;
    private long valid_to;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.payloads.FlyerItem.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.payloads.FlyerItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.current_price)) {
        this.current_price = data().deepCopy(fields()[1].schema(), other.current_price);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[2].schema(), other.flyer_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.image_height_over_width)) {
        this.image_height_over_width = data().deepCopy(fields()[4].schema(), other.image_height_over_width);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.image_url)) {
        this.image_url = data().deepCopy(fields()[5].schema(), other.image_url);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.merchant_id)) {
        this.merchant_id = data().deepCopy(fields()[6].schema(), other.merchant_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.name)) {
        this.name = data().deepCopy(fields()[7].schema(), other.name);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.original_price)) {
        this.original_price = data().deepCopy(fields()[8].schema(), other.original_price);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.pre_price_text)) {
        this.pre_price_text = data().deepCopy(fields()[9].schema(), other.pre_price_text);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dollars_off)) {
        this.dollars_off = data().deepCopy(fields()[10].schema(), other.dollars_off);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.percent_off)) {
        this.percent_off = data().deepCopy(fields()[11].schema(), other.percent_off);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.post_price_text)) {
        this.post_price_text = data().deepCopy(fields()[12].schema(), other.post_price_text);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.sale_story)) {
        this.sale_story = data().deepCopy(fields()[13].schema(), other.sale_story);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.valid_from)) {
        this.valid_from = data().deepCopy(fields()[14].schema(), other.valid_from);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.valid_to)) {
        this.valid_to = data().deepCopy(fields()[15].schema(), other.valid_to);
        fieldSetFlags()[15] = true;
      }
    }

    /** Creates a Builder by copying an existing FlyerItem instance */
    private Builder(maestro.payloads.FlyerItem other) {
            super(maestro.payloads.FlyerItem.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.current_price)) {
        this.current_price = data().deepCopy(fields()[1].schema(), other.current_price);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.flyer_id)) {
        this.flyer_id = data().deepCopy(fields()[2].schema(), other.flyer_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.image_height_over_width)) {
        this.image_height_over_width = data().deepCopy(fields()[4].schema(), other.image_height_over_width);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.image_url)) {
        this.image_url = data().deepCopy(fields()[5].schema(), other.image_url);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.merchant_id)) {
        this.merchant_id = data().deepCopy(fields()[6].schema(), other.merchant_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.name)) {
        this.name = data().deepCopy(fields()[7].schema(), other.name);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.original_price)) {
        this.original_price = data().deepCopy(fields()[8].schema(), other.original_price);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.pre_price_text)) {
        this.pre_price_text = data().deepCopy(fields()[9].schema(), other.pre_price_text);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dollars_off)) {
        this.dollars_off = data().deepCopy(fields()[10].schema(), other.dollars_off);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.percent_off)) {
        this.percent_off = data().deepCopy(fields()[11].schema(), other.percent_off);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.post_price_text)) {
        this.post_price_text = data().deepCopy(fields()[12].schema(), other.post_price_text);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.sale_story)) {
        this.sale_story = data().deepCopy(fields()[13].schema(), other.sale_story);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.valid_from)) {
        this.valid_from = data().deepCopy(fields()[14].schema(), other.valid_from);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.valid_to)) {
        this.valid_to = data().deepCopy(fields()[15].schema(), other.valid_to);
        fieldSetFlags()[15] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.payloads.FlyerItem.Builder setType(CharSequence value) {
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
    public maestro.payloads.FlyerItem.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'current_price' field */
    public Float getCurrentPrice() {
      return current_price;
    }

    /** Sets the value of the 'current_price' field */
    public maestro.payloads.FlyerItem.Builder setCurrentPrice(float value) {
      validate(fields()[1], value);
      this.current_price = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'current_price' field has been set */
    public boolean hasCurrentPrice() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'current_price' field */
    public maestro.payloads.FlyerItem.Builder clearCurrentPrice() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'flyer_id' field */
    public Integer getFlyerId() {
      return flyer_id;
    }

    /** Sets the value of the 'flyer_id' field */
    public maestro.payloads.FlyerItem.Builder setFlyerId(int value) {
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
    public maestro.payloads.FlyerItem.Builder clearFlyerId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public Integer getId() {
      return id;
    }

    /** Sets the value of the 'id' field */
    public maestro.payloads.FlyerItem.Builder setId(int value) {
      validate(fields()[3], value);
      this.id = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'id' field */
    public maestro.payloads.FlyerItem.Builder clearId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'image_height_over_width' field */
    public Float getImageHeightOverWidth() {
      return image_height_over_width;
    }

    /** Sets the value of the 'image_height_over_width' field */
    public maestro.payloads.FlyerItem.Builder setImageHeightOverWidth(float value) {
      validate(fields()[4], value);
      this.image_height_over_width = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'image_height_over_width' field has been set */
    public boolean hasImageHeightOverWidth() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'image_height_over_width' field */
    public maestro.payloads.FlyerItem.Builder clearImageHeightOverWidth() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'image_url' field */
    public CharSequence getImageUrl() {
      return image_url;
    }

    /** Sets the value of the 'image_url' field */
    public maestro.payloads.FlyerItem.Builder setImageUrl(CharSequence value) {
      validate(fields()[5], value);
      this.image_url = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'image_url' field has been set */
    public boolean hasImageUrl() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'image_url' field */
    public maestro.payloads.FlyerItem.Builder clearImageUrl() {
      image_url = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'merchant_id' field */
    public Integer getMerchantId() {
      return merchant_id;
    }

    /** Sets the value of the 'merchant_id' field */
    public maestro.payloads.FlyerItem.Builder setMerchantId(int value) {
      validate(fields()[6], value);
      this.merchant_id = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'merchant_id' field has been set */
    public boolean hasMerchantId() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'merchant_id' field */
    public maestro.payloads.FlyerItem.Builder clearMerchantId() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public CharSequence getName() {
      return name;
    }

    /** Sets the value of the 'name' field */
    public maestro.payloads.FlyerItem.Builder setName(CharSequence value) {
      validate(fields()[7], value);
      this.name = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[7];
    }

    /** Clears the value of the 'name' field */
    public maestro.payloads.FlyerItem.Builder clearName() {
      name = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'original_price' field */
    public Float getOriginalPrice() {
      return original_price;
    }

    /** Sets the value of the 'original_price' field */
    public maestro.payloads.FlyerItem.Builder setOriginalPrice(Float value) {
      validate(fields()[8], value);
      this.original_price = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /** Checks whether the 'original_price' field has been set */
    public boolean hasOriginalPrice() {
      return fieldSetFlags()[8];
    }

    /** Clears the value of the 'original_price' field */
    public maestro.payloads.FlyerItem.Builder clearOriginalPrice() {
      original_price = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'pre_price_text' field */
    public CharSequence getPrePriceText() {
      return pre_price_text;
    }

    /** Sets the value of the 'pre_price_text' field */
    public maestro.payloads.FlyerItem.Builder setPrePriceText(CharSequence value) {
      validate(fields()[9], value);
      this.pre_price_text = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /** Checks whether the 'pre_price_text' field has been set */
    public boolean hasPrePriceText() {
      return fieldSetFlags()[9];
    }

    /** Clears the value of the 'pre_price_text' field */
    public maestro.payloads.FlyerItem.Builder clearPrePriceText() {
      pre_price_text = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'dollars_off' field */
    public Float getDollarsOff() {
      return dollars_off;
    }

    /** Sets the value of the 'dollars_off' field */
    public maestro.payloads.FlyerItem.Builder setDollarsOff(Float value) {
      validate(fields()[10], value);
      this.dollars_off = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /** Checks whether the 'dollars_off' field has been set */
    public boolean hasDollarsOff() {
      return fieldSetFlags()[10];
    }

    /** Clears the value of the 'dollars_off' field */
    public maestro.payloads.FlyerItem.Builder clearDollarsOff() {
      dollars_off = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'percent_off' field */
    public Float getPercentOff() {
      return percent_off;
    }

    /** Sets the value of the 'percent_off' field */
    public maestro.payloads.FlyerItem.Builder setPercentOff(Float value) {
      validate(fields()[11], value);
      this.percent_off = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /** Checks whether the 'percent_off' field has been set */
    public boolean hasPercentOff() {
      return fieldSetFlags()[11];
    }

    /** Clears the value of the 'percent_off' field */
    public maestro.payloads.FlyerItem.Builder clearPercentOff() {
      percent_off = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'post_price_text' field */
    public CharSequence getPostPriceText() {
      return post_price_text;
    }

    /** Sets the value of the 'post_price_text' field */
    public maestro.payloads.FlyerItem.Builder setPostPriceText(CharSequence value) {
      validate(fields()[12], value);
      this.post_price_text = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /** Checks whether the 'post_price_text' field has been set */
    public boolean hasPostPriceText() {
      return fieldSetFlags()[12];
    }

    /** Clears the value of the 'post_price_text' field */
    public maestro.payloads.FlyerItem.Builder clearPostPriceText() {
      post_price_text = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'sale_story' field */
    public CharSequence getSaleStory() {
      return sale_story;
    }

    /** Sets the value of the 'sale_story' field */
    public maestro.payloads.FlyerItem.Builder setSaleStory(CharSequence value) {
      validate(fields()[13], value);
      this.sale_story = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /** Checks whether the 'sale_story' field has been set */
    public boolean hasSaleStory() {
      return fieldSetFlags()[13];
    }

    /** Clears the value of the 'sale_story' field */
    public maestro.payloads.FlyerItem.Builder clearSaleStory() {
      sale_story = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'valid_from' field */
    public Long getValidFrom() {
      return valid_from;
    }

    /** Sets the value of the 'valid_from' field */
    public maestro.payloads.FlyerItem.Builder setValidFrom(long value) {
      validate(fields()[14], value);
      this.valid_from = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /** Checks whether the 'valid_from' field has been set */
    public boolean hasValidFrom() {
      return fieldSetFlags()[14];
    }

    /** Clears the value of the 'valid_from' field */
    public maestro.payloads.FlyerItem.Builder clearValidFrom() {
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'valid_to' field */
    public Long getValidTo() {
      return valid_to;
    }

    /** Sets the value of the 'valid_to' field */
    public maestro.payloads.FlyerItem.Builder setValidTo(long value) {
      validate(fields()[15], value);
      this.valid_to = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /** Checks whether the 'valid_to' field has been set */
    public boolean hasValidTo() {
      return fieldSetFlags()[15];
    }

    /** Clears the value of the 'valid_to' field */
    public maestro.payloads.FlyerItem.Builder clearValidTo() {
      fieldSetFlags()[15] = false;
      return this;
    }

    @Override
    public FlyerItem build() {
      try {
        FlyerItem record = new FlyerItem();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.current_price = fieldSetFlags()[1] ? this.current_price : (Float) defaultValue(fields()[1]);
        record.flyer_id = fieldSetFlags()[2] ? this.flyer_id : (Integer) defaultValue(fields()[2]);
        record.id = fieldSetFlags()[3] ? this.id : (Integer) defaultValue(fields()[3]);
        record.image_height_over_width = fieldSetFlags()[4] ? this.image_height_over_width : (Float) defaultValue(fields()[4]);
        record.image_url = fieldSetFlags()[5] ? this.image_url : (CharSequence) defaultValue(fields()[5]);
        record.merchant_id = fieldSetFlags()[6] ? this.merchant_id : (Integer) defaultValue(fields()[6]);
        record.name = fieldSetFlags()[7] ? this.name : (CharSequence) defaultValue(fields()[7]);
        record.original_price = fieldSetFlags()[8] ? this.original_price : (Float) defaultValue(fields()[8]);
        record.pre_price_text = fieldSetFlags()[9] ? this.pre_price_text : (CharSequence) defaultValue(fields()[9]);
        record.dollars_off = fieldSetFlags()[10] ? this.dollars_off : (Float) defaultValue(fields()[10]);
        record.percent_off = fieldSetFlags()[11] ? this.percent_off : (Float) defaultValue(fields()[11]);
        record.post_price_text = fieldSetFlags()[12] ? this.post_price_text : (CharSequence) defaultValue(fields()[12]);
        record.sale_story = fieldSetFlags()[13] ? this.sale_story : (CharSequence) defaultValue(fields()[13]);
        record.valid_from = fieldSetFlags()[14] ? this.valid_from : (Long) defaultValue(fields()[14]);
        record.valid_to = fieldSetFlags()[15] ? this.valid_to : (Long) defaultValue(fields()[15]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
