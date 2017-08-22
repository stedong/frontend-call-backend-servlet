
package nam.e.spa.ce;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * generated from: com.newsoftvalley.myserver.rest.resources.AbcResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from /Users/ggpf/Desktop/SystemDesign/myserver-backend_trunk/myserver/rest-api/src/main/idl/nam.e.spa.ce.abc.restspec.json.", date = "Sun Aug 20 14:11:18 PDT 2017")
public class AbcRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "abc";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.CREATE, ResourceMethod.UPDATE, ResourceMethod.DELETE), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, Abc.class, keyParts);
    }

    public AbcRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AbcRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public AbcRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AbcRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public AbcDeleteRequestBuilder delete() {
        return new AbcDeleteRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcGetRequestBuilder get() {
        return new AbcGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcUpdateRequestBuilder update() {
        return new AbcUpdateRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcCreateRequestBuilder create() {
        return new AbcCreateRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
