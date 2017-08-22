
package nam.e.spa.ce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.schema.validation.ValidationResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.UpdateRequestBuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.validation.RestLiDataValidator;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Aug 20 14:11:18 PDT 2017")
public class AbcUpdateRequestBuilder
    extends UpdateRequestBuilderBase<java.lang.String, Abc, AbcUpdateRequestBuilder>
{


    public AbcUpdateRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Abc.class, resourceSpec, requestOptions);
    }

    public static ValidationResult validateInput(Abc input) {
        Map<java.lang.String, List<java.lang.String>> annotations = new HashMap<java.lang.String, List<java.lang.String>>();
        RestLiDataValidator validator = new RestLiDataValidator(annotations, Abc.class, ResourceMethod.UPDATE);
        return validator.validateInput(input);
    }

}
