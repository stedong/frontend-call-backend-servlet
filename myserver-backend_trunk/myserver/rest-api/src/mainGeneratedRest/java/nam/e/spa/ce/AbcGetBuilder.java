
package nam.e.spa.ce;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link nam.e.spa.ce.AbcGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Aug 20 14:11:17 PDT 2017")
@Deprecated
public class AbcGetBuilder
    extends GetRequestBuilderBase<java.lang.String, Abc, AbcGetBuilder>
{


    public AbcGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Abc.class, resourceSpec, requestOptions);
    }

}
