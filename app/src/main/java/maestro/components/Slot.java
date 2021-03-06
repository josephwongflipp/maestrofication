/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maestro.components;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Slot extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Slot\",\"namespace\":\"maestro.components\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Slot\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"component\",\"type\":[{\"type\":\"record\",\"name\":\"PremiumCollection\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.PremiumCollection\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"components\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"PremiumFlyer\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.PremiumFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Auction\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Auction\"},{\"name\":\"auction_uuid\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Budget\",\"namespace\":\"maestro.common\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.common.Budget\"},{\"name\":\"budget_id\",\"type\":\"int\"},{\"name\":\"cost_model_type\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"payload_override\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FlyerOverride\",\"namespace\":\"maestro.payloads\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.payloads.FlyerOverride\"},{\"name\":\"flyer_page_thumbnails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"storefront_carousel_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"storefront_premium_thumbnail_url\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"featured_items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FlyerFeaturedItem\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerFeaturedItem\"},{\"name\":\"id\",\"type\":\"int\"}]}},\"default\":[]},{\"name\":\"best_deals\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]}]},{\"type\":\"record\",\"name\":\"WebPromo\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.WebPromo\"},{\"name\":\"web_promo_id\",\"type\":\"int\"}]}]}}]},{\"type\":\"record\",\"name\":\"FlyerCarousel\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerCarousel\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"flyers\",\"type\":{\"type\":\"array\",\"items\":[\"PremiumFlyer\",{\"type\":\"record\",\"name\":\"OrganicFlyer\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.OrganicFlyer\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"auction\",\"type\":[\"null\",\"maestro.common.Auction\"],\"default\":null},{\"name\":\"budget\",\"type\":[\"null\",\"maestro.common.Budget\"],\"default\":null}]}]}}]},{\"type\":\"record\",\"name\":\"FlyerStackCarousel\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerStackCarousel\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"flyers\",\"type\":{\"type\":\"array\",\"items\":[\"PremiumFlyer\",\"OrganicFlyer\"]}},{\"name\":\"flyer_stack_id\",\"type\":\"long\"},{\"name\":\"use_stack_affinities\",\"type\":\"boolean\"}],\"aliases\":[\"maestro.components.internal.FlyerStackCarousel\"]},{\"type\":\"record\",\"name\":\"RecentlyViewedCarousel\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.RecentlyViewedCarousel\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"flyers\",\"type\":{\"type\":\"array\",\"items\":[\"PremiumFlyer\",\"OrganicFlyer\"]},\"default\":[]}]},{\"type\":\"record\",\"name\":\"WildCard\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.WildCard\"}]},{\"type\":\"record\",\"name\":\"Banner\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Banner\"},{\"name\":\"image_url\",\"type\":\"string\"},{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"link\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"ItemHighlights\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.ItemHighlights\"},{\"name\":\"background_image_url\",\"type\":\"string\"},{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"carousel\",\"type\":{\"type\":\"record\",\"name\":\"FlyerItemCarousel\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerItemCarousel\"},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FlyerItem\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.FlyerItem\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"flyer_id\",\"type\":\"int\"},{\"name\":\"style\",\"type\":[\"null\",\"string\"],\"default\":null}]}}}]}}]},{\"type\":\"record\",\"name\":\"NumberedList\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.NumberedList\"},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":\"FlyerItem\"}}]},{\"type\":\"record\",\"name\":\"ItemCollection\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.ItemCollection\"},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":\"FlyerItem\"}}]},{\"type\":\"record\",\"name\":\"OrganicCollection\",\"doc\":\"An Organic Collection component describes a grouping of Organic Flyers. This will be used to render Flyers with an optional header that describes the Flyers within the collection.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.OrganicCollection\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"components\",\"type\":{\"type\":\"array\",\"items\":\"OrganicFlyer\"}}]},{\"type\":\"record\",\"name\":\"Map\",\"doc\":\"A Map component describes a Geographical Map rendered within the Flipp App. A Map contains markers that can be plotted to indicate particular points of interest within the Map.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Map\"},{\"name\":\"markers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"MapMarker\",\"doc\":\"A MapMarker components describes a point of interest within a Map component. A MapMarker is specified with coordinates as well as an optional marker_icon_url which points to an icon that will be used to render the point of interest within the Map.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.MapMarker\"},{\"name\":\"coordinates\",\"type\":{\"type\":\"record\",\"name\":\"Coordinates\",\"doc\":\"A Coordinates components describes a point of interest. Coordinates are specified with a lat, lon.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Coordinates\"},{\"name\":\"lat\",\"type\":\"double\"},{\"name\":\"lon\",\"type\":\"double\"}]}},{\"name\":\"marker_icon_url\",\"type\":[\"null\",\"string\"],\"default\":null}]}}}]},{\"type\":\"record\",\"name\":\"Button\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.Button\"},{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"link\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"GoogleBannerAd\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.GoogleBannerAd\"},{\"name\":\"unit_id\",\"type\":\"string\"},{\"name\":\"width\",\"type\":\"int\"},{\"name\":\"height\",\"type\":\"int\"},{\"name\":\"location\",\"type\":\"boolean\"},{\"name\":\"custom_targetting\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"default\":{}},{\"name\":\"cache_key\",\"type\":\"string\",\"default\":\"\"}]},{\"type\":\"record\",\"name\":\"GoogleNativeAd\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"default\":\"maestro.components.GoogleNativeAd\"},{\"name\":\"unit_id\",\"type\":\"string\"},{\"name\":\"location\",\"type\":\"boolean\"},{\"name\":\"custom_targetting\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"default\":{}},{\"name\":\"cache_key\",\"type\":\"string\",\"default\":\"\"}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence type;
  @Deprecated public CharSequence id;
  @Deprecated public Object component;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Slot() {}

  /**
   * All-args constructor.
   */
  public Slot(CharSequence type, CharSequence id, Object component) {
    this.type = type;
    this.id = id;
    this.component = component;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    case 2: return component;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (CharSequence)value$; break;
    case 1: id = (CharSequence)value$; break;
    case 2: component = (Object)value$; break;
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
  public CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'component' field.
   */
  public Object getComponent() {
    return component;
  }

  /**
   * Sets the value of the 'component' field.
   * @param value the value to set.
   */
  public void setComponent(Object value) {
    this.component = value;
  }

  /** Creates a new Slot RecordBuilder */
  public static maestro.components.Slot.Builder newBuilder() {
    return new maestro.components.Slot.Builder();
  }

  /** Creates a new Slot RecordBuilder by copying an existing Builder */
  public static maestro.components.Slot.Builder newBuilder(maestro.components.Slot.Builder other) {
    return new maestro.components.Slot.Builder(other);
  }

  /** Creates a new Slot RecordBuilder by copying an existing Slot instance */
  public static maestro.components.Slot.Builder newBuilder(maestro.components.Slot other) {
    return new maestro.components.Slot.Builder(other);
  }

  /**
   * RecordBuilder for Slot instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Slot>
    implements org.apache.avro.data.RecordBuilder<Slot> {

    private CharSequence type;
    private CharSequence id;
    private Object component;

    /** Creates a new Builder */
    private Builder() {
      super(maestro.components.Slot.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(maestro.components.Slot.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.component)) {
        this.component = data().deepCopy(fields()[2].schema(), other.component);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing Slot instance */
    private Builder(maestro.components.Slot other) {
            super(maestro.components.Slot.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.component)) {
        this.component = data().deepCopy(fields()[2].schema(), other.component);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public CharSequence getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public maestro.components.Slot.Builder setType(CharSequence value) {
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
    public maestro.components.Slot.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public CharSequence getId() {
      return id;
    }

    /** Sets the value of the 'id' field */
    public maestro.components.Slot.Builder setId(CharSequence value) {
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
    public maestro.components.Slot.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'component' field */
    public Object getComponent() {
      return component;
    }

    /** Sets the value of the 'component' field */
    public maestro.components.Slot.Builder setComponent(Object value) {
      validate(fields()[2], value);
      this.component = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'component' field has been set */
    public boolean hasComponent() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'component' field */
    public maestro.components.Slot.Builder clearComponent() {
      component = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Slot build() {
      try {
        Slot record = new Slot();
        record.type = fieldSetFlags()[0] ? this.type : (CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (CharSequence) defaultValue(fields()[1]);
        record.component = fieldSetFlags()[2] ? this.component : (Object) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
