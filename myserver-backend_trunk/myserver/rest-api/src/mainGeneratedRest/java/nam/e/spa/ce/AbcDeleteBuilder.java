
package nam.e.spa.ce;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.DeleteRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link nam.e.spa.ce.AbcDeleteRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Aug 20 14:11:17 PDT 2017")
@Deprecated
public class AbcDeleteBuilder
    extends DeleteRequestBuilderBase<java.lang.String, Abc, AbcDeleteBuilder>
{


    public AbcDeleteBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Abc.class, resourceSpec, requestOptions);
    }

}
