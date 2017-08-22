
package nam.e.spa.ce;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * generated from: com.newsoftvalley.myserver.rest.resources.XyzResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link nam.e.spa.ce.XyzRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from /Users/ggpf/Desktop/SystemDesign/myserver-backend_trunk/myserver/rest-api/src/main/idl/nam.e.spa.ce.xyz.restspec.json.", date = "Sun Aug 20 14:11:17 PDT 2017")
@Deprecated
public class XyzBuilders {

    private final String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static String ORIGINAL_RESOURCE_PATH = "xyz";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<String, DynamicRecordMetadata> requestMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, DynamicRecordMetadata> responseMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.CREATE, ResourceMethod.UPDATE, ResourceMethod.DELETE), requestMetadataMap, responseMetadataMap, ComplexResourceKey.class, XyzKey.class, EmptyRecord.class, Xyz.class, keyParts);
    }

    public XyzBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public XyzBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public XyzBuilders(String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public XyzBuilders(String primaryResourceName, RestliRequestOptions requestOptions) {
        _baseUriTemplate = primaryResourceName;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    private String getBaseUriTemplate() {
        return _baseUriTemplate;
    }

    public RestliRequestOptions getRequestOptions() {
        return _requestOptions;
    }

    public String[] getPathComponents() {
        return URIParamUtils.extractPathComponentsFromUriTemplate(_baseUriTemplate);
    }

    private static RestliRequestOptions assignRequestOptions(RestliRequestOptions requestOptions) {
        if (requestOptions == null) {
            return RestliRequestOptions.DEFAULT_OPTIONS;
        } else {
            return requestOptions;
        }
    }

    public static String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public XyzGetBuilder get() {
        return new XyzGetBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzUpdateBuilder update() {
        return new XyzUpdateBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzCreateBuilder create() {
        return new XyzCreateBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzDeleteBuilder delete() {
        return new XyzDeleteBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
