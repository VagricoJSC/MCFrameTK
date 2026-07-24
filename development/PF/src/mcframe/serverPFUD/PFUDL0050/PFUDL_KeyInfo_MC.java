package mcframe.serverPFUD.PFUDL0050;

abstract public class PFUDL_KeyInfo_MC {
	
	/////////////////////////////////////////////////////////////
	// 基本情報
	/////////////////////////////////////////////////////////////
	protected String _key;
	
	protected PFUDL_KeyInfo setKey(String key) {
		_key = key;
		return (PFUDL_KeyInfo)this;
	}
	
	protected String getKey() {
		return _key;
	}
	
	/////////////////////////////////////////////////////////////
	// 文字型、数値型、論理型、オブジェクト型に共通の属性
	/////////////////////////////////////////////////////////////
	/**
	 * 親キーまたはルートに対して子キーが必須か否か
	 */
	protected boolean _isReq;
	
	/**
	 * <table>
	 *  <tr><th>値</th><th>データ型</th></tr>
	 *  <tr><td>S</td><td>文字型</td></tr>
	 *  <tr><td>N</td><td>数値型</td></tr>
	 *  <tr><td>B</td><td>論理型</td></tr>
	 *  <tr><td>O</td><td>オブジェクト型</td></tr>
	 *  <tr><td>S[]</td><td>文字型の配列</td></tr>
	 *  <tr><td>N[]</td><td>数値型の配列</td></tr>
	 *  <tr><td>B[]</td><td>論理型の配列</td></tr>
	 *  <tr><td>O[]</td><td>オブジェクト型の配列</td></tr>
	 *  <tr><td>X[]</td><td>オブジェクトまたは配列の配列</td></tr>
	 *  <tr><td>null</td><td>未定義</td></tr>
	 * </table>
	 */
	protected String _dataType;
	
	public static final String DATA_TYP_STR = "String";
	public static final String DATA_TYP_NUM = "Number";
	public static final String DATA_TYP_BOO = "Boolean";
	public static final String DATA_TYP_OBJ = "Object";
	public static final String DATA_TYP_STRs = "StringArray";
	public static final String DATA_TYP_NUMs = "NumberArray";
	public static final String DATA_TYP_BOOs = "BooleanArray";
	public static final String DATA_TYP_OBJs = "ObjectArray";
	public static final String DATA_TYP_ARR = "Array";
	public static final String DATA_TYP_NULL = null;
	
	/////////////////////////////////////////////////////////////
	// 文字型、数値型、オブジェクト型、に共通の属性
	/////////////////////////////////////////////////////////////
	/**
	 * NotNull制約
	 */
	protected boolean _isNotNull;
	
	/////////////////////////////////////////////////////////////
	// 文字型、に固有の属性
	/////////////////////////////////////////////////////////////
	/**
	 * 選択形式の文字列。nullは含めない。nullを許可するか否かは、_isNotNull,_isArrayNotNullで設定する
	 */
	protected String[] _selectStrs;
	protected boolean _isSameNullBlank = true;
	protected boolean _isTrim;
	
	/////////////////////////////////////////////////////////////
	// 数値型、に固有の属性
	/////////////////////////////////////////////////////////////
	/**
	 * 整数か否か
	 */
	protected boolean _isInt;
	
	/////////////////////////////////////////////////////////////
	// 配列に共通の属性
	/////////////////////////////////////////////////////////////
	protected boolean _isNotZeroSize = true;
	
	/////////////////////////////////////////////////////////////
	// 文字型、数値型、の配列に共通の属性
	/////////////////////////////////////////////////////////////
	/**
	 * 配列の要素に重複を許可するか否か
	 */
	protected boolean _isArrayNotDupVal;
	
	/////////////////////////////////////////////////////////////
	// 文字型、数値型、オブジェクト型、の配列に共通の属性
	/////////////////////////////////////////////////////////////
	/**
	 * 配列の要素のNotNull制約
	 */
	protected boolean _isArrayNotNull;
	
	/////////////////////////////////////////////////////////////
	// 属性のsetter/getter
	/////////////////////////////////////////////////////////////
	public PFUDL_KeyInfo dataType(String val) {
		_dataType = val;
		return (PFUDL_KeyInfo)this;
	}
	
	public String dataType() {
		return _dataType;
	}
	
	public boolean isString() {
		return DATA_TYP_STR.equals(_dataType);
	}

	public boolean isStringArray() {
		return DATA_TYP_STRs.equals(_dataType);
	}
	
	public boolean isNumber() {
		return DATA_TYP_NUM.equals(_dataType);
	}

	public boolean isNumberArray() {
		return DATA_TYP_NUMs.equals(_dataType);
	}

	public boolean isBoolean() {
		return DATA_TYP_BOO.equals(_dataType);
	}

	public boolean isBooleanArray() {
		return DATA_TYP_BOOs.equals(_dataType);
	}
	
	public boolean isObject() {
		return DATA_TYP_OBJ.equals(_dataType);
	}

	public boolean isObjectArray() {
		return DATA_TYP_OBJs.equals(_dataType);
	}
	
	public boolean isArrayNode() {
		return DATA_TYP_ARR.equals(_dataType);
	}
	
	public PFUDL_KeyInfo isReq(boolean boo) {
		_isReq = boo;
		return (PFUDL_KeyInfo)this;
	}
	
	public boolean isReq() {
		return _isReq;
	}
	
	public PFUDL_KeyInfo selectStr(String... strs) {
		_selectStrs = strs;
		return (PFUDL_KeyInfo)this;
	}
	
	public String[] selectStr() {
		return _selectStrs;
	}
	
	public PFUDL_KeyInfo isSameNullBlank(boolean boo) {
		_isSameNullBlank = boo;
		return (PFUDL_KeyInfo)this;
	}
	
	public boolean isSameNullBlank() {
		return _isSameNullBlank;
	}
	
	public PFUDL_KeyInfo isTrim(boolean boo) {
		_isTrim = boo;
		return (PFUDL_KeyInfo)this;
	}
	
	public boolean isTrim() {
		return _isTrim;
	}
	
	public PFUDL_KeyInfo isArrayNotDupVal(boolean boo) {
		_isArrayNotDupVal = boo;
		return (PFUDL_KeyInfo)this;
	}
	
	public boolean isArrayNotDupVal() {
		return _isArrayNotDupVal;
	}
	
	public PFUDL_KeyInfo isNotNull(boolean boo) {
		_isNotNull = boo;
		return (PFUDL_KeyInfo)this;
	}
	
	public boolean isNotNull() {
		return _isNotNull;
	}
	
	public PFUDL_KeyInfo isInt(boolean boo) {
		_isInt = boo;
		return (PFUDL_KeyInfo)this;
	}

	public boolean isInt() {
		return _isInt;
	}
	
	public PFUDL_KeyInfo isNotZeroSize(boolean boo) {
		_isNotZeroSize = boo;
		return (PFUDL_KeyInfo)this;
	}
	public boolean isNotZeroSize() {
		return _isNotZeroSize;
	}
	
	public PFUDL_KeyInfo isArrayNotNull(boolean boo) {
		_isArrayNotNull = boo;
		return (PFUDL_KeyInfo)this;
	}

	public boolean isArrayNotNull() {
		return _isArrayNotNull;
	}

}
