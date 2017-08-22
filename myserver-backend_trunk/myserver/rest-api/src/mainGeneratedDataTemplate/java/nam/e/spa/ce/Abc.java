
package nam.e.spa.ce;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Be nice to write something!
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/hanyuandong/Desktop/SystemDesign2/myserver-backend_trunk/myserver/rest-api/src/main/pegasus/nam/e/spa/ce/Abc.pdsc.", date = "Mon Aug 21 20:18:30 PDT 2017")
public class Abc
    extends RecordTemplate
{

    private final static Abc.Fields _fields = new Abc.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Abc\",\"namespace\":\"nam.e.spa.ce\",\"doc\":\"Be nice to write something!\",\"fields\":[{\"name\":\"longUrl\",\"type\":\"string\",\"doc\":\"Be nice to write something!\"},{\"name\":\"shortUrl\",\"type\":\"string\",\"doc\":\"Be nice to write something!\"}]}"));
    private final static RecordDataSchema.Field FIELD_LongUrl = SCHEMA.getField("longUrl");
    private final static RecordDataSchema.Field FIELD_ShortUrl = SCHEMA.getField("shortUrl");

    public Abc() {
        super(new DataMap(), SCHEMA);
    }

    public Abc(DataMap data) {
        super(data, SCHEMA);
    }

    public static Abc.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for longUrl
     * 
     * @see Abc.Fields#longUrl
     */
    public boolean hasLongUrl() {
        return contains(FIELD_LongUrl);
    }

    /**
     * Remover for longUrl
     * 
     * @see Abc.Fields#longUrl
     */
    public void removeLongUrl() {
        remove(FIELD_LongUrl);
    }

    /**
     * Getter for longUrl
     * 
     * @see Abc.Fields#longUrl
     */
    public String getLongUrl(GetMode mode) {
        return obtainDirect(FIELD_LongUrl, String.class, mode);
    }

    /**
     * Getter for longUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Abc.Fields#longUrl
     */
    @Nonnull
    public String getLongUrl() {
        return obtainDirect(FIELD_LongUrl, String.class, GetMode.STRICT);
    }

    /**
     * Setter for longUrl
     * 
     * @see Abc.Fields#longUrl
     */
    public Abc setLongUrl(String value, SetMode mode) {
        putDirect(FIELD_LongUrl, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for longUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Abc.Fields#longUrl
     */
    public Abc setLongUrl(
        @Nonnull
        String value) {
        putDirect(FIELD_LongUrl, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for shortUrl
     * 
     * @see Abc.Fields#shortUrl
     */
    public boolean hasShortUrl() {
        return contains(FIELD_ShortUrl);
    }

    /**
     * Remover for shortUrl
     * 
     * @see Abc.Fields#shortUrl
     */
    public void removeShortUrl() {
        remove(FIELD_ShortUrl);
    }

    /**
     * Getter for shortUrl
     * 
     * @see Abc.Fields#shortUrl
     */
    public String getShortUrl(GetMode mode) {
        return obtainDirect(FIELD_ShortUrl, String.class, mode);
    }

    /**
     * Getter for shortUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Abc.Fields#shortUrl
     */
    @Nonnull
    public String getShortUrl() {
        return obtainDirect(FIELD_ShortUrl, String.class, GetMode.STRICT);
    }

    /**
     * Setter for shortUrl
     * 
     * @see Abc.Fields#shortUrl
     */
    public Abc setShortUrl(String value, SetMode mode) {
        putDirect(FIELD_ShortUrl, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for shortUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Abc.Fields#shortUrl
     */
    public Abc setShortUrl(
        @Nonnull
        String value) {
        putDirect(FIELD_ShortUrl, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Abc clone()
        throws CloneNotSupportedException
    {
        return ((Abc) super.clone());
    }

    @Override
    public Abc copy()
        throws CloneNotSupportedException
    {
        return ((Abc) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Be nice to write something!
         * 
         */
        public PathSpec longUrl() {
            return new PathSpec(getPathComponents(), "longUrl");
        }

        /**
         * Be nice to write something!
         * 
         */
        public PathSpec shortUrl() {
            return new PathSpec(getPathComponents(), "shortUrl");
        }

    }

}
