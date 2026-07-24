package mcframe.serverPFBZ.PFBZL9070;

import java.util.regex.Pattern;

abstract public class PFBZL_FixLenFileDef_MC {
	
	/**
	 * 改行コード（LF）
	 */
	public static final String RTN_CODE_LF = "\n";

	/**
	 * 改行コード（CR）
	 */
	public static final String RTN_CODE_CR = "\r";

	/**
	 * 改行コード（CR/LF）
	 */
	public static final String RTN_CODE_CRLF = "\r\n";

	/**
	 * 半角スペース
	 */
	public static final String SP = " ";
	
	/**
	 * トリム BOTH
	 */
	public static final String TRIM_TYPE_BOTH = "BOTH";
	
	/**
	 * トリム NONE
	 */
	public static final String TRIM_TYPE_NONE = "NONE";
	
	/**
	 * 整列 left
	 */
	public static final String ALIGN_LEFT = "left";

	/**
	 * 整列 right
	 */
	public static final String ALIGN_RIGHT = "right";
	
	/**
	 * 符号の位置 head
	 */
	public static final String POSITION_HEAD = "head";
	
	/**
	 * 符号の位置 fit
	 */
	public static final String POSITION_FIT = "fit";
	
	/**
	 * 固定長フォーマット defaultキー
	 */
	public static final String DEFAULT_KEY = "default";

	/**
	 * 固定長フォーマット controlキー
	 */
	public static final String CONTROL_KEY = "control";

	/**
	 * 固定長フォーマット headerキー
	 */
	public static final String HEADER_KEY = "header";

	/**
	 * 固定長フォーマット dataキー
	 */
	public static final String DATA_KEY = "data";

	/**
	 * 固定長フォーマット trailerキー
	 */
	public static final String TRAILER_KEY = "trailer";

	/**
	 * 固定長フォーマット endキー
	 */
	public static final String END_KEY = "end";

	/**
	 * 固定長フォーマット skipキー
	 */
	public static final String SKIP_KEY = "skip";

	/**
	 * 固定長フォーマット columnキー
	 */
	public static final String COLUMN_KEY = "column";
	
	/**
	 * column.nameのキー
	 */
	public static final String NAME_KEY = "name";
	
	/**
	 * column.dataTypeのキー
	 */
	public static final String DATATYPE_KEY = "dataType";
	
	/**
	 * column.lengthのキー
	 */
	public static final String LENGTH_KEY = "length";

	/**
	 * column.stringのキー
	 */
	public static final String COL_C_KEY = "string";
	
	/**
	 * column.numberのキー
	 */
	public static final String COL_N_KEY = "number";
	
	/**
	 * column.dateのキー
	 */
	public static final String COL_D_KEY = "date";
	
	/**
	 * column.timestampのキー
	 */
	public static final String COL_TS_KEY = "timestamp";
	
	/**
	 * column.booleanのキー
	 */
	public static final String COL_F_KEY = "boolean";
	
	/**
	 * column.optionのキー
	 */
	public static final String COL_OP_KEY = "option";
	
	/**
	 * column.op.sequenceのキー
	 */
	public static final String COL_SEQ_KEY = "sequence";
	
	/**
	 * column.op.numPtnのキー
	 */
	public static final String COL_NPTN_KEY = "numPtn";
	
	/**
	 * column.op.editのキー
	 */
	public static final String COL_EDIT_KEY = "edit";

	/**
	 * column.*.formatのキー
	 */
	public static final String COL_FORMAT_KEY = "format";

	/**
	 * returnのキー
	 */
	public static final String RETURN_KEY = "return";
	
	/**
	 * dataType:Stringの値
	 */
	public static final String TYPE_STRING = "C";
	
	/**
	 * dataType:Numberの値
	 */
	public static final String TYPE_NUMBER = "N";
	
	/**
	 * dataType:Dateの値
	 */
	public static final String TYPE_DATE = "D";
	
	/**
	 * dataType:Timestampの値
	 */
	public static final String TYPE_TIMESTAMP = "TS";
	
	/**
	 * dataType:Booleanの値
	 */
	public static final String TYPE_BOOL = "F";
	
	/**
	 * column.mappingのキー（前方一致用)
	 */
	public static final String MAPPING_KEY = "mapping.";

	/**
	 * column.synonymのキー
	 */
	public static final String SYNONYM_KEY = "synonym";
	
	/**
	 * プラス記号(+)
	 */
	public static final String PLUS = "+";
	
	/**
	 * マイナス記号(-)
	 */
	public static final String MINUS = "-";
	
	/**
	 * synonym参照エラー情報のキー
	 */
	public static final String SYNONYM_ERROR_KEY = "synonym_ref_error";

	/**
	 * mapping参照エラー情報のキー
	 */
	public static final String MAPPGIN_ERROR_KEY = "mapping_ref_error";
	
	/**
	 * mapping型違いエラー情報のキー
	 */
	public static final String MAPPGIN_TYPE_ERROR_KEY = "mapping_type_error";

	/**
	 * column.name重複エラー情報のキー
	 */
	public static final String NAME_DUP_ERROR_KEY = "name_duplication_error";
	
	/**
	 * synonym参照先のカラム定義を格納するキー
	 */
	public static final String SYNONYM_REF_COL_KEY = "__$synonym_ref_colmap$__";
	
	/**
	 * 数値のみパターン
	 */
	public static final Pattern NUM_PTN = Pattern.compile("^[0-9]+$");

	/**
	 * 全て0パターン
	 */
	public static final Pattern ALL_ZERO_PTN = Pattern.compile("^0+$");

	/**
	 * date.formatのデフォルト値
	 */
	public static final String DEF_DATE_FORMAT = "yyyyMMdd";
	
	/**
	 * timestamp.formatのデフォルト値
	 */
	public static final String DEF_TIMESTAMP_FORMAT = "yyyyMMddhhmmssSSS";
	
	/**
	 * trailer/end.calc.methodの値：count
	 */
	public static final String CALC_COUNT = "count";

	/**
	 * trailer/end.calc.methodの値：sum
	 */
	public static final String CALC_SUM = "sum";
	
	/**
	 * column.fixedValueTypeの値：fixedValue
	 */
	public static final String FIX_TYPE_VALUE = "fixedValue";

	/**
	 * column.fixedValueTypeの値：headerRows
	 */
	public static final String FIX_TYPE_H_ROWS = "headerRows";

	/**
	 * column.fixedValueTypeの値：dataRows
	 */
	public static final String FIX_TYPE_D_ROWS = "dataRows";
	
}
