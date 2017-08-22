
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/hanyuandong/Desktop/SystemDesign2/myserver-backend_trunk/myserver/rest-api/src/main/pegasus/nam/e/spa/ce/Xyz.pdsc.", date = "Mon Aug 21 20:18:30 PDT 2017")
public class Xyz
    extends RecordTemplate
{

    private final static Xyz.Fields _fields = new Xyz.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Xyz\",\"namespace\":\"nam.e.spa.ce\",\"doc\":\"Be nice to write something!\",\"fields\":[{\"name\":\"numA\",\"type\":\"int\"},{\"name\":\"numB\",\"type\":\"int\"},{\"name\":\"sum\",\"type\":\"int\"}]}"));
    private final static RecordDataSchema.Field FIELD_NumA = SCHEMA.getField("numA");
    private final static RecordDataSchema.Field FIELD_NumB = SCHEMA.getField("numB");
    private final static RecordDataSchema.Field FIELD_Sum = SCHEMA.getField("sum");

    public Xyz() {
        super(new DataMap(), SCHEMA);
    }

    public Xyz(DataMap data) {
        super(data, SCHEMA);
    }

    public static Xyz.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for numA
     * 
     * @see Xyz.Fields#numA
     */
    public boolean hasNumA() {
        return contains(FIELD_NumA);
    }

    /**
     * Remover for numA
     * 
     * @see Xyz.Fields#numA
     */
    public void removeNumA() {
        remove(FIELD_NumA);
    }

    /**
     * Getter for numA
     * 
     * @see Xyz.Fields#numA
     */
    public Integer getNumA(GetMode mode) {
        return obtainDirect(FIELD_NumA, Integer.class, mode);
    }

    /**
     * Getter for numA
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#numA
     */
    @Nonnull
    public Integer getNumA() {
        return obtainDirect(FIELD_NumA, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numA
     * 
     * @see Xyz.Fields#numA
     */
    public Xyz setNumA(Integer value, SetMode mode) {
        putDirect(FIELD_NumA, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numA
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#numA
     */
    public Xyz setNumA(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumA, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numA
     * 
     * @see Xyz.Fields#numA
     */
    public Xyz setNumA(int value) {
        putDirect(FIELD_NumA, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numB
     * 
     * @see Xyz.Fields#numB
     */
    public boolean hasNumB() {
        return contains(FIELD_NumB);
    }

    /**
     * Remover for numB
     * 
     * @see Xyz.Fields#numB
     */
    public void removeNumB() {
        remove(FIELD_NumB);
    }

    /**
     * Getter for numB
     * 
     * @see Xyz.Fields#numB
     */
    public Integer getNumB(GetMode mode) {
        return obtainDirect(FIELD_NumB, Integer.class, mode);
    }

    /**
     * Getter for numB
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#numB
     */
    @Nonnull
    public Integer getNumB() {
        return obtainDirect(FIELD_NumB, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numB
     * 
     * @see Xyz.Fields#numB
     */
    public Xyz setNumB(Integer value, SetMode mode) {
        putDirect(FIELD_NumB, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numB
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#numB
     */
    public Xyz setNumB(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumB, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numB
     * 
     * @see Xyz.Fields#numB
     */
    public Xyz setNumB(int value) {
        putDirect(FIELD_NumB, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sum
     * 
     * @see Xyz.Fields#sum
     */
    public boolean hasSum() {
        return contains(FIELD_Sum);
    }

    /**
     * Remover for sum
     * 
     * @see Xyz.Fields#sum
     */
    public void removeSum() {
        remove(FIELD_Sum);
    }

    /**
     * Getter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Integer getSum(GetMode mode) {
        return obtainDirect(FIELD_Sum, Integer.class, mode);
    }

    /**
     * Getter for sum
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#sum
     */
    @Nonnull
    public Integer getSum() {
        return obtainDirect(FIELD_Sum, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(Integer value, SetMode mode) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for sum
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(int value) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Xyz clone()
        throws CloneNotSupportedException
    {
        return ((Xyz) super.clone());
    }

    @Override
    public Xyz copy()
        throws CloneNotSupportedException
    {
        return ((Xyz) super.copy());
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

        public PathSpec numA() {
            return new PathSpec(getPathComponents(), "numA");
        }

        public PathSpec numB() {
            return new PathSpec(getPathComponents(), "numB");
        }

        public PathSpec sum() {
            return new PathSpec(getPathComponents(), "sum");
        }

    }

}
