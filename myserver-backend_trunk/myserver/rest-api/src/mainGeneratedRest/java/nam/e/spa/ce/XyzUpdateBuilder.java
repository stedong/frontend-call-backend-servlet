
package nam.e.spa.ce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.schema.validation.ValidationResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.UpdateRequestBuilderBase;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.validation.RestLiDataValidator;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link nam.e.spa.ce.XyzUpdateRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Aug 20 14:11:17 PDT 2017")
@Deprecated
public class XyzUpdateBuilder
    extends UpdateRequestBuilderBase<ComplexResourceKey<XyzKey, EmptyRecord> , Xyz, XyzUpdateBuilder>
{


    public XyzUpdateBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Xyz.class, resourceSpec, requestOptions);
    }

    public static ValidationResult validateInput(Xyz input) {
        Map<String, List<String>> annotations = new HashMap<String, List<String>>();
        RestLiDataValidator validator = new RestLiDataValidator(annotations, Xyz.class, ResourceMethod.UPDATE);
        return validator.validateInput(input);
    }

}
