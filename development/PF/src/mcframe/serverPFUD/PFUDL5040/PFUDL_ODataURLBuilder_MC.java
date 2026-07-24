package mcframe.serverPFUD.PFUDL5040;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCException;

public class PFUDL_ODataURLBuilder_MC {

	protected static final Class<PFUDL_ODataURLBuilder> CLAZZ = PFUDL_ODataURLBuilder.class;

	protected String _baseURL = "";

	protected Map<String, String> _options = new LinkedHashMap<>();

	protected void setBaseUrl(String baseURL) {
		_baseURL = baseURL;
	}

	protected String getBaseUrl() {
		return _baseURL;
	}


	/**
	 *createInstance(String baseUrl) を使用してインスタンスを生成する。
	 */
	@Deprecated
	public PFUDL_ODataURLBuilder_MC() {}

	public static PFUDL_ODataURLBuilder createInstance(String baseUrl) {
		return object(CLAZZ)._createInstance(baseUrl);
	}

	protected PFUDL_ODataURLBuilder _createInstance(String baseUrl) {
		PFUDL_ODataURLBuilder odb = new PFUDL_ODataURLBuilder();
		odb.setBaseUrl(baseUrl);
		return odb;
	}
	
	public PFUDL_ODataURLBuilder filterEq(String field, String value) {
		return addFilter(field + " eq '" + value + "'");
	}

	public PFUDL_ODataURLBuilder filterEqDate(String field, String value) {
		return addFilter(field + " eq " + value);
	}
	
	public PFUDL_ODataURLBuilder filterEq(String field, double value) {
		return addFilter(field + " eq " + value);
	}

	public PFUDL_ODataURLBuilder filterNe(String field, String value) {
		return addFilter(field + " ne '" + value + "'");
	}
	
	public PFUDL_ODataURLBuilder filterNe(String field, double value) {
		return addFilter(field + " ne " + value);
	}

	public PFUDL_ODataURLBuilder filterNeDate(String field, String value) {
		return addFilter(field + " ne " + value);
	}

	public PFUDL_ODataURLBuilder filterLt(String field, String value) {
		return addFilter(field + " lt '" + value + "'");
	}

	public PFUDL_ODataURLBuilder filterLt(String field, double value) {
		return addFilter(field + " lt " + value);
	}

	public PFUDL_ODataURLBuilder filterLtDate(String field, String value) {
		return addFilter(field + " lt " + value);
	}
	
	public PFUDL_ODataURLBuilder filterLe(String field, String value) {
		return addFilter(field + " le '" + value + "'");
	}

	public PFUDL_ODataURLBuilder filterLe(String field, double value) {
		return addFilter(field + " le " + value);
	}
	
	public PFUDL_ODataURLBuilder filterLeDate(String field, String value) {
		return addFilter(field + " le " + value);
	}

	public PFUDL_ODataURLBuilder filterGt(String field, String value) {
		return addFilter(field + " gt '" + value + "'");
	}

	public PFUDL_ODataURLBuilder filterGt(String field, double value) {
		return addFilter(field + " gt " + value);
	}
	
	public PFUDL_ODataURLBuilder filterGtDate(String field, String value) {
		return addFilter(field + " gt " + value);
	}
	
	public PFUDL_ODataURLBuilder filterGe(String field, String value) {
		return addFilter(field + " ge '" + value + "'");
	}

	public PFUDL_ODataURLBuilder filterGe(String field, double value) {
		return addFilter(field + " ge " + value);
	}

	public PFUDL_ODataURLBuilder filterGeDate(String field, String value) {
		return addFilter(field + " ge " + value);
	}
	
	//Odata v4専用
	public PFUDL_ODataURLBuilder filterStartsWith(String field, String value) {
		return addFilter("startswith(" + field + ", '" + value + "')");
	}

	//Odata v4専用
	public PFUDL_ODataURLBuilder filterEndsWith(String field, String value) {
		return addFilter("endswith(" + field + ", '" + value + "')");
	}

	//Odata v2専用
	public PFUDL_ODataURLBuilder filterSubstringof(String field, String value) {
		return addFilter("substringof('" + value + "', " + field + ")");
	}
	
	//Odata v4専用
	public PFUDL_ODataURLBuilder filterContains(String field, String value) {
		return addFilter("contains(" + field + ", '" + value + "')");
	}

	
	protected PFUDL_ODataURLBuilder addFilter(String expression) {
		String existing = _options.get("$filter");
		if (existing == null || existing.trim().isEmpty()) {
			return addOption("$filter", expression);
		}
		else {
			return addOption("$filter", existing + " and " + expression);
		}
	}

	public PFUDL_ODataURLBuilder top(int count) {
		return (0 < count) ? addOption("$top", String.valueOf(count)) : (PFUDL_ODataURLBuilder) this;
	}

	public PFUDL_ODataURLBuilder orderby(String expression) {
		return addOption("$orderby", expression);
	}

	public PFUDL_ODataURLBuilder skip(int count) {
		return (0 < count) ? addOption("$skip", String.valueOf(count)) : (PFUDL_ODataURLBuilder) this;
	}


	//Odata v2専用
	public PFUDL_ODataURLBuilder inlinecountAllpages() {
		return addOption("$inlinecount", "allpages");
	}
	
	//Odata v4専用
	public PFUDL_ODataURLBuilder countTrue() {
		return addOption("$count", "true");
	}


	public PFUDL_ODataURLBuilder select(String... fields) {
		if (fields != null && fields.length > 0) {
			StringJoiner joiner = new StringJoiner(",");
			for (String f : fields) {
				joiner.add(f);
			}
			return addOption("$select", joiner.toString());
		}
		return (PFUDL_ODataURLBuilder) this;
	}

	protected static final String OdataV2DateTimeFormat = new String("yyyy-MM-dd'T'HH:mm:ss");
	protected static final String OdataV4DateFormat = new String("yyyy-MM-dd");

	public static String toODataV2DateLiteral(MCDate date) {
		//日付、日付・時刻形式どちらも同じフォーマット
		return "datetime'" + date.toString(OdataV2DateTimeFormat) + "'";
	}

	public static String toODataV2DateTimeLiteral(MCDate date) {
		return "datetime'" + date.toString(OdataV2DateTimeFormat) + "'";
	}

	public static String toODataV4DateLiteral(MCDate date) {
		return date.toString(OdataV4DateFormat);
	}


	protected PFUDL_ODataURLBuilder addOption(String key, String value) {
		if (value != null && !value.trim().isEmpty()) {
			_options.put(key, value);
		}
		return (PFUDL_ODataURLBuilder)this;
	}

	public String buildURL() {
		if (_options.isEmpty()) return _baseURL;

		StringBuilder sb = new StringBuilder(_baseURL);
		sb.append(_baseURL.contains("?") ? "&" : "?");

		StringJoiner joiner = new StringJoiner("&");
		for (Map.Entry<String, String> entry : _options.entrySet()) {
			joiner.add(encode(entry.getKey()) + "=" + encode(entry.getValue()));
		}

		sb.append(joiner.toString());
		return sb.toString();
	}

	protected String encode(String value) {
		try {
			return URLEncoder.encode(value, "UTF-8");
		}
		catch (UnsupportedEncodingException e) {
			throw new MCException(e);
		}
	}
}