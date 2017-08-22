
package nam.e.spa.ce;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * generated from: com.newsoftvalley.myserver.rest.resources.AbcResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link nam.e.spa.ce.AbcRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from /Users/ggpf/Desktop/SystemDesign/myserver-backend_trunk/myserver/rest-api/src/main/idl/nam.e.spa.ce.abc.restspec.json.", date = "Sun Aug 20 14:11:17 PDT 2017")
@Deprecated
public class AbcBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "abc";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.CREATE, ResourceMethod.UPDATE, ResourceMethod.DELETE), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, Abc.class, keyParts);
    }

    public AbcBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AbcBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public AbcBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AbcBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        _baseUriTemplate = primaryResourceName;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    private java.lang.String getBaseUriTemplate() {
        return _baseUriTemplate;
    }

    public RestliRequestOptions getRequestOptions() {
        return _requestOptions;
    }

    public java.lang.String[] getPathComponents() {
        return URIParamUtils.extractPathComponentsFromUriTemplate(_baseUriTemplate);
    }

    private static RestliRequestOptions assignRequestOptions(RestliRequestOptions requestOptions) {
        if (requestOptions == null) {
            return RestliRequestOptions.DEFAULT_OPTIONS;
        } else {
            return requestOptions;
        }
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public AbcGetBuilder get() {
        return new AbcGetBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcUpdateBuilder update() {
        return new AbcUpdateBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcCreateBuilder create() {
        return new AbcCreateBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AbcDeleteBuilder delete() {
        return new AbcDeleteBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
