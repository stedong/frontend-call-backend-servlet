
package nam.e.spa.ce;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Aug 20 14:11:18 PDT 2017")
public class XyzGetRequestBuilder
    extends GetRequestBuilderBase<ComplexResourceKey<XyzKey, EmptyRecord> , Xyz, XyzGetRequestBuilder>
{


    public XyzGetRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Xyz.class, resourceSpec, requestOptions);
    }

}
