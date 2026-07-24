package mcframe.serverPFBZ.PFBZL9070;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mcframe.commonCore.lang.MCNumber;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;

/**
 * 固定長ファイルフォーマットの情報を保持するクラスです。
 * <p>
 * columnレコードはKey:name属性, Value:columnオブジェクトのMapで保持します。
 *
 */
abstract public class PFBZL_FixLenFileInfo_MC {
	
	/**
	 * controlレコード
	 */
	protected Map<String, Object> CTRL = null;
	
	/**
	 * control.columnレコード
	 */
	protected Map<String, Map<String, Object>> CTRL_COL_L = null;
	
	/**
	 * skip.columnレコード
	 */
	protected Map<String, Map<String, Object>> SKIP_COL_L = null;

	/**
	 * header.keyレコード
	 */
	protected String[] HEADER_KEY_L = null;
	
	/**
	 * header.columnレコード
	 */
	protected Map<String, Map<String, Object>> HEADER_COL_L = null;
	
	/**
	 * data.columnレコード
	 */
	protected List<Map<String, Map<String, Object>>> DATA_COL_L = null;
	
	/**
	 * trailer.columnレコード
	 */
	protected Map<String, Map<String, Object>> TRAILER_COL_L = null;
	
	/**
	 * trailer.calcレコード
	 */
	protected Map<String, Map<String, Object>> TRAILER_CALC_L = null;

	/**
	 * end.columnレコード
	 */
	protected Map<String, Map<String, Object>> END_COL_L = null;
	
	/**
	 * end.calcレコード
	 */
	protected Map<String, Map<String, Object>> END_CALC_L = null;
	
	/**
	 * default.returnレコード
	 */
	protected Map<String, Object> DEF_RETRUN = new HashMap<String, Object>();
	
	/**
	 * default.column.stringレコード
	 */
	protected Map<String, Object> DEF_COL_STRING = new HashMap<String, Object>();
	
	/**
	 * default.column.numberレコード
	 */
	protected Map<String, Object> DEF_COL_NUMBER = new HashMap<String, Object>();
	
	/**
	 * default.column.booleanレコード
	 */
	protected Map<String, Object> DEF_COL_BOOLEAN = new HashMap<String, Object>();
	
	/**
	 * default.column.dateレコード
	 */
	protected Map<String, Object> DEF_COL_DATE = new HashMap<String, Object>();
	
	/**
	 * default.column.timestampレコード
	 */
	protected Map<String, Object> DEF_COL_TIMESTAMP = new HashMap<String, Object>();
	
	/**
	 * default.column.date.optionレコード
	 */
	protected Map<String, Object> DEF_COL_DATE_OP = new HashMap<String, Object>();
	
	/**
	 * default.column.timestamp.optionレコード
	 */
	protected Map<String, Object> DEF_COL_TIMESTAMP_OP = new HashMap<String, Object>();
	
	/**
	 * control.column.lengthの合計値
	 */
	protected int CTRL_LENGTH = 0;

	/**
	 * header.column.lengthの合計値（control.column含まない）
	 */
	protected int HEADER_LENGTH = 0;
	
	/**
	 * skip.column.lengthの合計値
	 */
	protected int SKIP_LENGTH = 0;

	/**
	 * data.column.lengthの合計値（control.column含まない）
	 */
	protected int[] DATA_LENGTH = null;
	
	/**
	 * trailer.column.lengthの合計値（control.column含まない）
	 */
	protected int TRAILER_LENGTH = 0;

	/**
	 * end.column.lengthの合計値（control.column含まない）
	 */
	protected int END_LENGTH = 0;
	
	/**
	 * レコードセット
	 */
	protected int DATA_TYPE = 0;
	
	/**
	 * header.columnレコードをセットした際のフラグ
	 */
	protected static final int SET_HEADER = 1;

	/**
	 * header.keyをセットした際のフラグ
	 */
	protected static final int SET_HEADER_KEY = 2;
	
	/**
	 * controlレコードをセットした際のフラグ
	 */
	protected static final int SET_CTRL = 4;
	
	/**
	 * data.columnレコードをセットした際のフラグ
	 */
	protected static final int SET_DATA = 8;
	
	/**
	 * trailer.columnレコードをセットした際のフラグ
	 */
	protected static final int SET_TRAILER = 16;
	
	/**
	 * trailer.calcレコードをセットした際のフラグ
	 */
	protected static final int SET_TRAILER_CALC = 32;

	/**
	 * endレコードをセットした際のフラグ
	 */
	protected static final int SET_END = 64;

	/**
	 * end.calcレコードをセットした際のフラグ
	 */
	protected static final int SET_END_CALC = 128;

	/**
	 * skipレコードをセットした際のフラグ
	 */
	protected static final int SET_SKIP = 256;

	/**
	 * 改行項目名パターン
	 */
	protected Pattern _returnPattern = null;
	
	/**
	 * フォーマット解析エラー情報
	 */
	protected Map<String, List<String>> FMT_ERROR = new HashMap<String, List<String>>();
	
	/**
	 * control.column.nameのリスト
	 */
	protected List<String> CTRL_COL_NAMES = new ArrayList<String>();
	
	/**
	 * 呼出元固有の任意情報
	 */
	protected Map<String, Map<String, Object>> EXT_INFO = new HashMap<String, Map<String, Object>>();
	
	
	/**
	 * コンストラクタ.
	 */
	public PFBZL_FixLenFileInfo_MC() {
		initReturn();
		initColNumber();
		initColString();
		initColBoolean();
		initColDate();
		initColTimestamp();
	}

	// 定義読込み前に実施しておく処理
	public void setup() {
		// 改行項目名をコンパイル
		if (DEF_RETRUN.get("pattern") != null) {
			_returnPattern = Pattern.compile((String)DEF_RETRUN.get("pattern"));
		}
	}
	
	/**
	 * default.returnのシステムデフォルト設定
	 */
	protected void initReturn() {
		DEF_RETRUN.put("pattern", "^return.*");
		DEF_RETRUN.put("code", RTN_CODE_CRLF);
	}
	
	/**
	 * default.column.numberのシステムデフォルト設定
	 */
	protected void initColNumber() {
		DEF_COL_NUMBER.put("align", ALIGN_RIGHT);
		DEF_COL_NUMBER.put("decimalDisplayFlg",	false);
		DEF_COL_NUMBER.put("decimalFloatFlg", false);
		DEF_COL_NUMBER.put("decimalLength",	0);
		DEF_COL_NUMBER.put("decimalStr", ".");
		DEF_COL_NUMBER.put("nullStr", SP);
		DEF_COL_NUMBER.put("paddingStr", "0");
		DEF_COL_NUMBER.put("separatorDecimal", null);
		DEF_COL_NUMBER.put("separatorInteger", null);
		DEF_COL_NUMBER.put("signMinus", "-");
		DEF_COL_NUMBER.put("signPlus", "");
		DEF_COL_NUMBER.put("signPosition", POSITION_HEAD);
		DEF_COL_NUMBER.put("signZero", null);
	}
	
	/**
	 * default.column.stringのシステムデフォルト設定
	 */
	protected void initColString() {
		DEF_COL_STRING.put("align",	ALIGN_LEFT);
		DEF_COL_STRING.put("nullStr", SP);
		DEF_COL_STRING.put("paddingStr", SP);
		DEF_COL_STRING.put("trim", TRIM_TYPE_BOTH);
	}
	
	/**
	 * default.column.booleanのシステムデフォルト設定
	 */
	protected void initColBoolean() {
		DEF_COL_BOOLEAN.put("align", ALIGN_LEFT);
		DEF_COL_BOOLEAN.put("paddingStr", SP);
		DEF_COL_BOOLEAN.put("trueStr", "1");
		DEF_COL_BOOLEAN.put("falseStr", "0");
	}
	
	/**
	 * default.column.dateのシステムデフォルト設定
	 */
	protected void initColDate() {
		DEF_COL_DATE.put("align", ALIGN_LEFT);
		DEF_COL_DATE.put("nullStr", SP);
		DEF_COL_DATE.put("paddingStr", SP);
		DEF_COL_DATE.put("format", DEF_DATE_FORMAT);
		DEF_COL_DATE.put("shiftYear", 0);
		DEF_COL_DATE.put("omitYear", 2000);
		DEF_COL_DATE.put("omitMonth", 1);
		DEF_COL_DATE.put("omitDay", 1);
		DEF_COL_DATE.put("omitHour", 0);
		DEF_COL_DATE.put("omitSecond", 0);
		DEF_COL_DATE.put("omitMinutes", 0);
	}

	/**
	 * default.column.timestampのシステムデフォルト設定
	 */
	protected void initColTimestamp() {
		DEF_COL_TIMESTAMP.put("align", ALIGN_LEFT);
		DEF_COL_TIMESTAMP.put("nullStr", SP);
		DEF_COL_TIMESTAMP.put("paddingStr", SP);
		DEF_COL_TIMESTAMP.put("format", DEF_TIMESTAMP_FORMAT);
		DEF_COL_TIMESTAMP.put("shiftYear", 0);
		DEF_COL_TIMESTAMP.put("omitYear", 2000);
		DEF_COL_TIMESTAMP.put("omitMonth", 1);
		DEF_COL_TIMESTAMP.put("omitDay", 1);
		DEF_COL_TIMESTAMP.put("omitHour", 0);
		DEF_COL_TIMESTAMP.put("omitSecond", 0);
		DEF_COL_TIMESTAMP.put("omitMinutes", 0);
		DEF_COL_TIMESTAMP.put("omitMilliSecond", 0);
	}
	
	/**
	 * フォーマット解析エラー情報を取得します。
	 * <p>
	 * @return エラー情報
	 */
	public Map<String, List<String>> getFmtError() {
		return FMT_ERROR;
	}
	
	/**
	 * フォーマット解析エラー情報をクリアします。
	 */
	public void clearFmtError() {
		FMT_ERROR.clear();;
	}
	
	/**
	 * control.column.nameの一覧を取得します。
	 * @return name一覧
	 */
	public List<String> getControlColNames() {
		return CTRL_COL_NAMES;
	}
	
	/**
	 * default.returnレコードを取得します
	 * @return default.returnレコード
	 */
	public Map<String, Object> getReturnDefault() {
		return DEF_RETRUN;
	}

	/**
	 * default.column.stringレコードを取得します
	 * @return default.column.stringレコード
	 */
	public Map<String, Object> getColStringDefault() {
		return DEF_COL_STRING;
	}

	/**
	 * default.column.numberレコードを取得します
	 * @return default.column.numberレコード
	 */
	public Map<String, Object> getColNumberDefault() {
		return DEF_COL_NUMBER;
	}

	/**
	 * default.column.booleanレコードを取得します
	 * @return default.column.booleanレコード
	 */
	public Map<String, Object> getColBooleanDefault() {
		return DEF_COL_BOOLEAN;
	}

	/**
	 * default.column.dateレコードを取得します
	 * @return default.column.dateレコード
	 */
	public Map<String, Object> getColDateDefault() {
		return DEF_COL_DATE;
	}

	/**
	 * default.column.date.optionレコードを取得します
	 * @return default.column.date.optionレコード
	 */
	public Map<String, Object> getColDateOpDefault() {
		return DEF_COL_DATE_OP;
	}
	
	/**
	 * default.column.timestampレコードを取得します
	 * @return default.column.timestampレコード
	 */
	public Map<String, Object> getColTimestampDefault() {
		return DEF_COL_TIMESTAMP;
	}

	/**
	 * default.column.timestamp.optionレコードを取得します
	 * @return default.column.timestamp.optionレコード
	 */
	public Map<String, Object> getColTimestampOpDefault() {
		return DEF_COL_TIMESTAMP_OP;
	}
	
	/**
	 * defaultレコードを設定
	 * @param def defaultレコード
	 */
	@SuppressWarnings("unchecked")  // mapのキャスト
	public void setDefault(Map<String, Object> def) {
		if (def == null) {
			return;
		}
		// default.returnの設定
		if (def.containsKey(RETURN_KEY)) {
			Map<String, Object> map = (Map<String, Object>)def.get(RETURN_KEY);
			DEF_RETRUN.putAll(map);
		}
		
		if (!def.containsKey(COLUMN_KEY)) {
			return;
		}
		
		Map<String, Object> column = (Map<String, Object>) def.get(COLUMN_KEY);
		// default.column.stringの設定
		if (column.containsKey(COL_C_KEY)) {
			Map<String, Object> map = (Map<String, Object>)column.get(COL_C_KEY);
			DEF_COL_STRING.putAll(map);
		}
		// default.column.numberの設定
		if (column.containsKey(COL_N_KEY)) {
			Map<String, Object> map = (Map<String, Object>)column.get(COL_N_KEY);
			DEF_COL_NUMBER.putAll(map);
		}
		// default.column.dateの設定
		if (column.containsKey(COL_D_KEY)) {
			Map<String, Object> map = (Map<String, Object>)column.get(COL_D_KEY);
			// .optionは個別に保持
			if (map.containsKey(COL_OP_KEY)) {
				DEF_COL_DATE_OP.putAll((Map<String, Object>)map.get(COL_OP_KEY));
				// DEF_COL_DATE配下に.optionがセットされないようにremove
				map.remove(COL_OP_KEY);
			}
			
			DEF_COL_DATE.putAll(map);
		}
		// default.column.timestampの設定
		if (column.containsKey(COL_TS_KEY)) {
			Map<String, Object> map = (Map<String, Object>)column.get(COL_TS_KEY);
			// .optionは個別に保持
			if (map.containsKey(COL_OP_KEY)) {
				DEF_COL_TIMESTAMP_OP.putAll((Map<String, Object>)map.get(COL_OP_KEY));
				// DEF_COL_TIMESTAMP配下に.optionがセットされないようにremove
				map.remove(COL_OP_KEY);
			}

			DEF_COL_TIMESTAMP.putAll(map);
		}
		// default.column.booleanの設定
		if (column.containsKey(COL_F_KEY)) {
			Map<String, Object> map = (Map<String, Object>)column.get(COL_F_KEY);
			DEF_COL_BOOLEAN.putAll(map);
		}
	}
	
	/**
	 * controlレコードを取得します
	 * @return controlレコード
	 */
	public Map<String, Object> getControl() {
		return CTRL;
	}

	/**
	 * control.columnレコードを取得します
	 * @return control.columnレコード
	 */
	public Map<String, Map<String, Object>> getControlColumn() {
		return CTRL_COL_L;
	}

	/**
	 * skip.columnレコードを取得します
	 * @return skip.columnレコード
	 */
	public Map<String, Map<String, Object>> getSkipColumn() {
		return SKIP_COL_L;
	}

	/**
	 * header.keyレコードを取得します
	 * @return header.keyレコード
	 */
	public String[] getHeaderKey() {
		return HEADER_KEY_L;
	}

	/**
	 * header.columnレコードを取得します
	 * @return header.columnレコード
	 */
	public Map<String, Map<String, Object>> getHeaderColumn() {
		return HEADER_COL_L;
	}

	/**
	 * data.columnレコードリストを取得します
	 * @return data.columnレコードリスト
	 */
	public List<Map<String, Map<String, Object>>> getDataColumn() {
		return DATA_COL_L;
	}

	/**
	 * trailer.columnレコードを取得します
	 * @return trailer.columnレコード
	 */
	public Map<String, Map<String, Object>> getTrailerColumn() {
		return TRAILER_COL_L;
	}

	/**
	 * trailer.calcレコードを取得します
	 * @return trailer.calcレコード
	 */
	public Map<String, Map<String, Object>> getTrailerCalc() {
		return TRAILER_CALC_L;
	}

	/**
	 * end.columnレコードを取得します
	 * @return end.columnレコード
	 */
	public Map<String, Map<String, Object>> getEndColumn() {
		return END_COL_L;
	}

	/**
	 * end.calcレコードを取得します
	 * @return end.calcレコード
	 */
	public Map<String, Map<String, Object>> getEndCalc() {
		return END_CALC_L;
	}
	
	/**
	 * control.column.lengthの合計値を取得します
	 * @return length
	 */
	public int getControlLength() {
		return CTRL_LENGTH;
	}

	/**
	 * header.column.lengthの合計値を取得します
	 * @return length
	 */
	public int getHeaderLength() {
		return HEADER_LENGTH;
	}

	/**
	 * skip.column.lengthの合計値を取得します
	 * @return length
	 */
	public int getSkipLength() {
		return SKIP_LENGTH;
	}

	/**
	 * dataレコードごとのdata[].column.lengthの合計値を取得します
	 * <p>
	 * control.data[]の値(インデックス)と同じ位置に合計値が格納されます
	 * @return length
	 */
	public int[] getDataLength() {
		return DATA_LENGTH;
	}

	/**
	 * trailer.column.lengthの合計値を取得します
	 * @return length
	 */
	public int getTrailerLength() {
		return TRAILER_LENGTH;
	}

	/**
	 * end.column.lengthの合計値を取得します
	 * @return length
	 */
	public int getEndLength() {
		return END_LENGTH;
	}

	/**
	 * controlレコードを設定します
	 * @param ctrl controlレコード
	 */
	public void setControl(Map<String, Object> ctrl) {
		CTRL = ctrl;
		DATA_TYPE |= SET_CTRL;
	}
	
	/**
	 * control.columnレコードを設定します
	 * @param columnL control.columnレコード
	 */
	public void setControlColumn(Map<String, Map<String, Object>> columnL) {
		CTRL_COL_L = columnL;
		// .columnのデフォルト値を補完
		CTRL_LENGTH = fixedColumnL(CTRL_COL_L, CONTROL_KEY);
		// name一覧の保持
		for (Entry<String, Map<String, Object>> en : CTRL_COL_L.entrySet()) {
			CTRL_COL_NAMES.add(en.getKey());
		}
	}
	
	/**
	 * 呼出元固有の情報を設定する
	 */
	public void setExtInfo(String extPtn, Map<String, Object> extInfo) {
		EXT_INFO.put(extPtn, extInfo);
	}
	
	/**
	 * 呼出元固有の情報を取得する
	 */
	public Map<String, Object> getExtInfo(String extPtn) {
		return EXT_INFO.get(extPtn);
	}
	
	/**
	 * controlレコードが定義されているか否か
	 */
	public boolean hasControl() {
		return (DATA_TYPE & SET_CTRL) != 0;
	}
	
	/**
	 * skip.columnレコードを設定します
	 * @param columnL skip.columnレコード
	 */
	public void setSkipColumn(Map<String, Map<String, Object>> columnL) {
		SKIP_COL_L = columnL;
		// .columnのデフォルト値を補完
		SKIP_LENGTH = fixedColumnL(SKIP_COL_L, SKIP_KEY);
		
		DATA_TYPE |= SET_SKIP;
	}
	
	/**
	 * skipレコードが定義されているか否か
	 */
	public boolean hasSkip() {
		return (DATA_TYPE & SET_SKIP) != 0;
	}
	
	/**
	 * header.columnレコードを設定します
	 * @param columnL header.columnレコード
	 */
	public void setHeaderColumn(Map<String, Map<String, Object>> columnL) {
		HEADER_COL_L = columnL;
		// .columnのデフォルト値を補完
		HEADER_LENGTH = fixedColumnL(HEADER_COL_L, HEADER_KEY);
		// control.columnを追加
		addControlColumn(HEADER_COL_L, HEADER_KEY);

		DATA_TYPE |= SET_HEADER;
	}
	
	/**
	 * headerレコードが定義されているか否か
	 */
	public boolean hasHeader() {
		return (DATA_TYPE & SET_HEADER) != 0;
	}
	
	/**
	 * header.keyレコードを設定します
	 * @param keys header.keyレコード
	 */
	public void setHeaderKey(String[] keys) {
		HEADER_KEY_L = keys;
		
		DATA_TYPE |= SET_HEADER_KEY;
	}

	/**
	 * header.keyレコードが定義されているか否か
	 */
	public boolean hasHeaderKey() {
		return (DATA_TYPE & SET_HEADER_KEY) != 0;
	}
	
	/**
	 * data.columnレコードリストを設定します
	 * @param columnL data.columnレコードリスト
	 */
	public void setDataColumn(List<Map<String, Map<String, Object>>> columnL) {
		DATA_COL_L = columnL;
		DATA_LENGTH = new int[DATA_COL_L.size()];
		for (int i=0; i<DATA_COL_L.size(); i++) {
			// .columnのデフォルト値を補完
			DATA_LENGTH[i] = fixedColumnL(DATA_COL_L.get(i), DATA_KEY);
			// control.columnを追加
			addControlColumn(DATA_COL_L.get(i), DATA_KEY);
		}

		DATA_TYPE |= SET_DATA;
	}

	/**
	 * dataレコードが定義されているか否か
	 */
	public boolean hasData() {
		return (DATA_TYPE & SET_DATA) != 0;
	}
	
	/**
	 * trailer.columnレコードを設定します
	 * @param columnL trailer.columnレコード
	 */
	public void setTrailerColumn(Map<String, Map<String, Object>> columnL) {
		TRAILER_COL_L = columnL;
		// .columnのデフォルト値を補完
		TRAILER_LENGTH = fixedColumnL(TRAILER_COL_L, TRAILER_KEY);
		// control.columnを追加
		addControlColumn(TRAILER_COL_L, TRAILER_KEY);
		
		DATA_TYPE |= SET_TRAILER;
	}
	
	/**
	 * trailerレコードが定義されているか否か
	 */
	public boolean hasTrailer() {
		return (DATA_TYPE & SET_TRAILER) != 0;
	}
	
	/**
	 * trailer.calcレコードを設定します
	 * @param calcL trailer.calcレコード
	 */
	public void setTrailerCalc(Map<String, Map<String, Object>> calcL) {
		TRAILER_CALC_L = calcL;
		DATA_TYPE |= SET_TRAILER_CALC;
	}

	/**
	 * trailer.calcレコードが定義されているか否か
	 */
	public boolean hasTrailerCalc() {
		return (DATA_TYPE & SET_TRAILER_CALC) != 0;
	}

	/**
	 * end.columnレコードを設定します
	 * @param columnL end.columnレコード
	 */
	public void setEndColumn(Map<String, Map<String, Object>> columnL) {
		END_COL_L = columnL;
		// .columnのデフォルト値を補完
		END_LENGTH = fixedColumnL(END_COL_L, END_KEY);
		// control.columnを追加
		addControlColumn(END_COL_L, END_KEY);

		DATA_TYPE |= SET_END;
	}
	
	/**
	 * endレコードが定義されているか否か
	 */
	public boolean hasEnd() {
		return (DATA_TYPE & SET_END) != 0;
	}
	
	/**
	 * end.calcレコードを設定します
	 * @param calcL end.calcレコード
	 */
	public void setEndCalc(Map<String, Map<String, Object>> calcL) {
		END_CALC_L = calcL;
		DATA_TYPE |= SET_END_CALC;
	}
	
	/**
	 * end.calcレコードが定義されているか否か
	 */
	public boolean hasEndCalc() {
		return (DATA_TYPE & SET_END_CALC) != 0;
	}

	/**
	 * headerレコードのみのファイルの場合true
	 * <p>
	 * controlレコードもskipレコードも存在しない場合のみtrueが返ります。
	 * 
	 * @return headerのみの場合true
	 */
	public boolean isHeaderOnly() {
		return DATA_TYPE == SET_HEADER || DATA_TYPE == (SET_SKIP | SET_HEADER);
	}
	
	/**
	 * dataレコードが存在しないファイルの場合true
	 * <p>
	 * @return dataがない場合true
	 */
	public boolean isNoData() {
		return (DATA_TYPE & SET_DATA) == 0;
	}
	
	/**
	 * 改行項目か判定します。
	 * <p>
	 * column.nameがreturn.patternにマッチする場合trueを返す。
	 * 
	 * @param column カラム定義
	 * @return 改行項目の場合true
	 */
	public boolean isReturnColumn(Map<String, Object> column) {
		return isReturnColumn((String)column.get(NAME_KEY));
	}

	/**
	 * 改行項目か判定します。
	 * <p>
	 * nameがreturn.patternにマッチする場合trueを返す。
	 * 
	 * @param name カラム名
	 * @return 改行項目の場合true
	 */
	public boolean isReturnColumn(String name) {
		if (_returnPattern == null) {
			// 改行項目の定義が無い＝改行機能を使用しない
			return false;
		}
		Matcher matcher = _returnPattern.matcher(name);
		return matcher.find();
	}

	/**
	 * column.lengthを取得します。
	 * @param column columnMap
	 * @return length（lengthが無い場合は0)
	 */
	public static int getLength(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.getInt(column, LENGTH_KEY);
	}
	
	/**
	 * column.keyの値をintで返します。
	 * <p>
	 * 注意<b>int型より大きな数値は桁落ちします。</b>
	 * @param column カラム定義
	 * @param key キー
	 * @return column.keyの値。キーが見つからない場合はnull
	 */
	public static int getInt(Map<String, Object> column, String key) {
		int ret = 0;
		if (column.containsKey(key) && column.get(key) != null) {
			if (column.get(key) instanceof BigInteger) {
				ret = ((BigInteger)column.get(key)).intValue();
			}
			else if (column.get(key) instanceof MCNumber) {
				ret = ((MCNumber)column.get(key)).intValue();
			}
			else {
				ret = (Integer)column.get(key);
			}
		}
		return ret;
	}
	
	/**
	 * column.key.formatの値を取得します。
	 * <p>
	 * keyはdateまたはtimestampのみ有効です。
	 * 
	 * @param column カラム定義
	 * @param key キー
	 * @return formatの値（存在しない場合はnull）
	 */
	public static String getFormat(Map<String, Object> column, String key) {
		return (String)PFBZL_FixLenFileInfo.getAttribute(column, key).get(COL_FORMAT_KEY);
	}
	
	/**
	 * 属性情報(column.key)を取得します。
	 * @param column カラム定義
	 * @param key 属性名(data/timestamp/number/booleanなど)
	 * @return 属性情報のMap
	 */
	@SuppressWarnings("unchecked")	// mapのキャスト
	public static Map<String, Object> getAttribute(Map<String, Object> column, String key) {
		return (Map<String, Object>)column.get(key);
	}
	
	/**
	 * 属性情報の配列(column.key[])を取得します。
	 * @param column カラム定義
	 * @param key 属性名
	 * @return 属性情報のMapの配列
	 */
	@SuppressWarnings("unchecked")  // mapのキャスト
	public static Map<String, Object>[] getAttributeArray(Map<String, Object> column, String key) {
		return (Map<String, Object>[])column.get(key);
	}

	/**
	 * column.option配下の属性情報を取得します。
	 * 
	 * @param column カラム定義
	 * @param opKey 属性名(numPtn/sequenceのいずれか)
	 * @return オプション属性情報のMap
	 */
	public static Map<String, Object> getOptionAttr(Map<String, Object> column, String opKey) {
		if (!column.containsKey(COL_OP_KEY)) {
			return null;
		}
		Map<String, Object> op = PFBZL_FixLenFileInfo.getAttribute(column, COL_OP_KEY);
		if (!op.containsKey(opKey)) {
			return null;
		}
		
		return PFBZL_FixLenFileInfo.getAttribute(op, opKey);
	}

	/**
	 * column.option配下の属性情報を配列で取得します。
	 * <p>
	 * 
	 * @param column カラム定義
	 * @param opKey 属性名(editのみ)
	 * @return オプション属性情報のMapの配列
	 */
	public static Map<String, Object>[] getOptionAttrArray(Map<String, Object> column, String opKey) {
		if (!column.containsKey(COL_OP_KEY)) {
			return null;
		}
		Map<String, Object> op = PFBZL_FixLenFileInfo.getAttribute(column, COL_OP_KEY);
		if (!op.containsKey(opKey)) {
			return null;
		}
		
		return PFBZL_FixLenFileInfo.getAttributeArray(op, opKey);
	}

	/**
	 * ダミーカラムか判定します。
	 * @param column カラム定義
	 * @return ダミーカラムの場合true
	 */
	public static boolean isDummyColumn(Map<String, Object> column) {
		if (column.containsKey("dummyFlg")) {
			return PFBZL_FixLenFileInfo.getBoolean(column, "dummyFlg");
		}
		return false;
	}
	
	/**
	 * シノニムカラムか判定します。
	 * @param column カラム定義
	 * @return シノニムカラムの場合true
	 */
	public static boolean isSynonymColumn(Map<String, Object> column) {
		return column.get(SYNONYM_KEY) != null;
	}
	
	/**
	 * mapping定義があるカラムか判定します。
	 * @param column カラム定義
	 * @return mapping定義がある場合true
	 */
	public static boolean hasMappingColumn(Map<String, Object> column) {
		return column.get(MAPPING_KEY) != null;
	}

	/**
	 * column.dataTypeがStringの場合trueを返します。
	 * @param column カラム定義
	 * @return 結果
	 */
	public static boolean isStringType(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.equalsType(column, TYPE_STRING);
	}
	
	/**
	 * column.dataTypeがNumberの場合trueを返します。
	 * @param column カラム定義
	 * @return 結果
	 */
	public static boolean isNumberType(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.equalsType(column, TYPE_NUMBER);
	}
	
	/**
	 * column.dataTypeがDateの場合trueを返します。
	 * @param column カラム定義
	 * @return 結果
	 */
	public static boolean isDateType(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.equalsType(column, TYPE_DATE);
	}

	/**
	 * column.dataTypeがTimestampの場合trueを返します。
	 * @param column カラム定義
	 * @return 結果
	 */
	public static boolean isTimestampType(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.equalsType(column, TYPE_TIMESTAMP);
	}

	/**
	 * column.dataTypeがBooleanの場合trueを返します。
	 * @param column カラム定義
	 * @return 結果
	 */
	public static boolean isBoolType(Map<String, Object> column) {
		return PFBZL_FixLenFileInfo.equalsType(column, TYPE_BOOL);
	}
	
	/**
	 * column.dataTypeが引数typeと一致するか判定します。
	 * @param column カラム定義
	 * @param type dataTypeの値
	 * @return 結果
	 */
	public static boolean equalsType(Map<String, Object> column, String type) {
		return type.equals((String)column.get(DATATYPE_KEY));
	}

	/**
	 * column.keyの値をStringで返します。
	 * <p>
	 * @param column カラム定義
	 * @param key キー
	 * @return column.keyの値。キーが見つからない場合はnull
	 */
	public static String getString(Map<String, Object> column, String key) {
		return (String)column.get(key);
	}
	
	/**
	 * column.keyの値をMCNumberで返します。
	 * <p>
	 * @param column カラム定義
	 * @param key キー
	 * @return column.keyの値。キーが見つからない場合はnull
	 */
	public static MCNumber getNumber(Map<String, Object> column, String key) {
		if (!column.containsKey(key)) {
			return null;
		}
		return PFBZL_FixLenFileInfo.getNumber(column.get(key));
	}
	
	/**
	 * 引数の値をMCNumberで返します。
	 * <p>
	 * @param val 値
	 * @return MCNumber
	 */
	public static MCNumber getNumber(Object val) {
		if (val instanceof BigInteger) {
			return MCNumber.valueOf((BigInteger)val);
		}
		else if (val instanceof BigDecimal) {
			return MCNumber.valueOf((BigDecimal)val);
		}
		else if (val instanceof MCNumber) {
			return (MCNumber)val;
		}
		return MCNumber.valueOf((Integer)val);
	}
	
	public static boolean isNumber(Object val) {
		if (val instanceof BigInteger) {
			return true;
		}
		else if (val instanceof BigDecimal) {
			return true;
		}
		else if (val instanceof MCNumber) {
			return true;
		}
		return false;
	}
	
	/**
	 * column.keyの値をbooleanで返します。
	 * <p>
	 * @param column カラム定義
	 * @param key キー
	 * @return column.keyの値。キーが見つからない場合はfalse
	 */
	public static boolean getBoolean(Map<String, Object> column, String key) {
		Boolean val = (Boolean)column.get(key);
		return val == null ? false : val;
	}
	
	/**
	 * カラム定義Mapをディープコピーします。valueがMapの場合のみ、Mapの新しいインスタンスを作成します。
	 * <p>
	 * 定義可能な(有効な)カラム定義のみコピーされます。
	 * 
	 * @param column コピー元カラム定義Map
	 * @return 新しいカラム定義Map
	 */
	@SuppressWarnings("unchecked")  //mapのキャスト
	public static Map<String, Object> columnDeepCopy(Map<String, Object> column) {
		// *.column配下のキーをコピーして返します
		Map<String, Object> to = new HashMap<>(column);
		if (to.containsKey(COL_C_KEY)) {
			to.put(COL_C_KEY, new HashMap<>((Map<String, Object>)to.get(COL_C_KEY)));
		}
		if (to.containsKey(COL_N_KEY)) {
			to.put(COL_N_KEY, new HashMap<>((Map<String, Object>)to.get(COL_N_KEY)));
		}
		if (to.containsKey(COL_D_KEY)) {
			to.put(COL_D_KEY, new HashMap<>((Map<String, Object>)to.get(COL_D_KEY)));
		}
		if (to.containsKey(COL_TS_KEY)) {
			to.put(COL_TS_KEY, new HashMap<>((Map<String, Object>)to.get(COL_TS_KEY)));
		}
		if (to.containsKey(COL_F_KEY)) {
			to.put(COL_F_KEY, new HashMap<>((Map<String, Object>)to.get(COL_F_KEY)));
		}
		if (to.containsKey(COL_OP_KEY)) {
			Map<String, Object> op = new HashMap<>((Map<String, Object>)to.get(COL_OP_KEY));
			to.put(COL_OP_KEY, op);
			if (op.containsKey(COL_SEQ_KEY)) {
				op.put(COL_SEQ_KEY, new HashMap<>((Map<String, Object>)op.get(COL_SEQ_KEY)));
			}
			if (op.containsKey(COL_NPTN_KEY)) {
				op.put(COL_NPTN_KEY, new HashMap<>((Map<String, Object>)op.get(COL_NPTN_KEY)));
			}
			if (op.containsKey(COL_EDIT_KEY)) {
				Map<String, Object>[] edit = PFBZL_FixLenFileInfo.getAttributeArray(to, COL_EDIT_KEY);
				List<Map<String, Object>> newEdit = new ArrayList<Map<String, Object>>();
				for (Map<String, Object> tmp : edit) {
					newEdit.add(new HashMap<>(tmp));
				}
				op.put(COL_EDIT_KEY, newEdit.toArray());
			}
		}

		return to;
	}
	
	/**
	 * データ編集
	 * <p>
	 * valueの値がデータ編集対象の場合、編集後の値を返します。
	 * 
	 * @param valueTyp "file","table"のいずれか
	 * @param value 対象の値
	 * @param colMap カラム定義
	 * @return 編集後の値。対象ではない場合は引数value
	 */
	public static Comparable<?> getOpEditValue(String valueTyp, Comparable<?> value, Map<String, Object> colMap) {
		Map<String, Object>[] edit = PFBZL_FixLenFileInfo.getOptionAttrArray(colMap, COL_EDIT_KEY);
		if (edit == null) {
			return value;
		}
		
		for (Map<String, Object> editElm : edit) {
			Comparable<?> file = (Comparable<?>)editElm.get("file");
			Comparable<?> table = (Comparable<?>)editElm.get("table");
			if (isSame(valueTyp, "file")) {
				if (isSame(file, value)) {
					return table;
				}
			}
			else if (isSame(valueTyp, "table")) {
				if (isSame(table, value)) {
					return file;
				}
			}
		}
		return value;
	}
	
	/**
	 * .column[]を確定します。
	 * <p>
	 * 以下の処理を行う。<br>
	 * ・default値の補完<br>
	 * ・シノニム、マッピングの参照先チェック<br>
	 * ・ダミーカラム、改行項目の属性値の補完<br>
	 * 
	 * @param columnL .column[]
	 * @param recordKey レコードキー
	 * @return column.lengthの合計値
	 */
	@SuppressWarnings("unchecked")
	protected int fixedColumnL(Map<String, Map<String, Object>> columnL, String recordKey) {

		// column.lengthの合計値
		int length = 0;
		// 処理済みのcolumn.nameのリスト
		List<String> nameList = new ArrayList<String>();
		// 属性オブジェクトのキー
		String attrKey = null;
		for(Entry<String, Map<String, Object>> entry : columnL.entrySet()) {
			String colName = entry.getKey();
			Map<String, Object> column = entry.getValue();
			
			//////// column.dataTypeに応じた補完処理  ////////
			String dataType = (String)column.get(DATATYPE_KEY);
			if (dataType != null) {
				switch(dataType) {
					case TYPE_STRING:
						attrKey = COL_C_KEY;
						// column.stringを補完
						setDefaultColumn(COL_C_KEY, column, DEF_COL_STRING);
						// column.optionを補完
						setOpDefaultColumn(column, null);
						break;
					case TYPE_NUMBER:
						attrKey = COL_N_KEY;
						// column.numberを補完
						setDefaultColumn(COL_N_KEY, column, DEF_COL_NUMBER);
						// column.optionを補完
						setOpDefaultColumn(column, null);
						break;
					case TYPE_DATE:
						attrKey = COL_D_KEY;
						// column.dateを補完
						setDefaultColumn(COL_D_KEY, column, DEF_COL_DATE);
						// column.optionを補完
						setOpDefaultColumn(column, DEF_COL_DATE_OP);
						break;
					case TYPE_TIMESTAMP:
						attrKey = COL_TS_KEY;
						// column.timestampを補完
						setDefaultColumn(COL_TS_KEY, column, DEF_COL_TIMESTAMP);
						// column.optionを補完
						setOpDefaultColumn(column, DEF_COL_TIMESTAMP_OP);
						break;
					case TYPE_BOOL:
						attrKey = COL_F_KEY;
						// column.booleanを補完
						setDefaultColumn(COL_F_KEY, column, DEF_COL_BOOLEAN);
						// column.optionを補完
						setOpDefaultColumn(column, null);
						break;
					default:
						break;
				}
			}
			
			//////// 共通の補完とチェック処理 ////////
			// シノニム参照先存在チェック
			if (PFBZL_FixLenFileInfo.isSynonymColumn(column)) {
				String synonym = PFBZL_FixLenFileInfo.getString(column, SYNONYM_KEY);
				String[] keys = synonym.split(Pattern.quote("."));
				
				if (keys.length > 2) {
					// synonymの値に設定できるレコードの階層は２つまで
					addFmtError(SYNONYM_ERROR_KEY, recordKey, colName, SYNONYM_KEY);
					continue;
				}
				Map<String, Object> refCol = null;
				// レコード名省略または処理中のレコード名が指定されている場合
				if (keys.length == 1 || recordKey.equals(keys[0])) {
					// レコード名省略の場合は補完しておく
					if (keys.length == 1) {
						StringBuilder sb = new StringBuilder();
						sb.append(recordKey).append(".").append(keys[0]);
						column.put(SYNONYM_KEY, sb.toString());
					}
					
					// 処理中のカラム定義の中の自カラムより前にあるか
					if (!nameList.contains(keys[0])) {
						addFmtError(SYNONYM_ERROR_KEY, recordKey, colName, SYNONYM_KEY);
						continue;
					}
					refCol = columnL.get(keys[0]);
				}
				else {
					// 先に読み込み済みのカラム定義に参照先が存在するか
					refCol = chkRefColumn(keys);
					if (refCol == null) {
						addFmtError(SYNONYM_ERROR_KEY, recordKey, colName, SYNONYM_KEY);
						continue;
					}
				}
				
				// 参照先カラムがシノニムの場合はエラー
				if (PFBZL_FixLenFileInfo.isSynonymColumn(refCol)) {
					addFmtError(SYNONYM_ERROR_KEY, recordKey, colName, SYNONYM_KEY);
					continue;
				}
				
				// 参照先が存在した場合はカラム定義を保持しておく
				column.put(SYNONYM_REF_COL_KEY, refCol);
			}
			
			// mapping参照先存在チェック
			if (PFBZL_FixLenFileInfo.hasMappingColumn(column)) {
				// ex) mapping構造  {"name" : "dtl1", "length":10, "dataType":"N", "mapping" : {"number" : {"decimalLength" : "header.attr1"} }}

				Map<String, Object> mapping = PFBZL_FixLenFileInfo.getAttribute(column, MAPPING_KEY);	//ex) {"number" : {"decimalLength" : "header.attr1"}}
				boolean ret = true;
				for (Entry<String, Object> mapEn : mapping.entrySet()) {
					if (!mapEn.getKey().equals(attrKey)) {							//ex) "number"
						// 自身の型(dataType)と違う型の属性値を参照しようとしている
						addFmtError(MAPPGIN_TYPE_ERROR_KEY, recordKey, colName, MAPPING_KEY);
						ret = false;
						break;
					}
					Map<String, Object> attrMap = (Map<String, Object>) mapEn.getValue();
																					//ex) {"decimalLength" : "header.attr1"}
					
					// mapping対象の属性名ごとに参照先をチェックする
					for (Entry<String, Object> attrEn : attrMap.entrySet()) {
						String attrName = attrEn.getKey();							//ex) "decimalLength"
						String refColName = (String)attrEn.getValue();				//ex) "header.attr1"
						String[] keys = refColName.split(Pattern.quote("."));
						
						if (keys.length > 2) {
							// mappingの値に設定できるレコードの階層は２つまで
							addFmtError(MAPPGIN_ERROR_KEY, recordKey, colName, MAPPING_KEY, mapEn.getKey(), attrName);
							ret = false;
							break;
						}
						// レコード名省略または処理中のレコード名が指定されている場合
						if (keys.length == 1 || recordKey.equals(keys[0])) {
							// レコード名省略の場合は補完しておく
							if (keys.length == 1) {
								StringBuilder sb = new StringBuilder();
								sb.append(recordKey).append(".").append(keys[0]);
								attrMap.put(attrName, sb.toString());
							}

							// 処理中のカラム定義の中の自カラムより前にあるか
							if (!nameList.contains(keys[0])) {
								addFmtError(MAPPGIN_ERROR_KEY, recordKey, colName, MAPPING_KEY, mapEn.getKey(), attrName);
								ret = false;
								break;
							}
						}
						else {
							// 先に読み込み済みのカラム定義に参照先が存在するか
							if (chkRefColumn(keys) == null) {
								addFmtError(MAPPGIN_ERROR_KEY, recordKey, colName, MAPPING_KEY, mapEn.getKey(), attrName);
								ret = false;
								break;
							}
						}
					}
					if (!ret) {
						// エラーがあった場合は次のカラムへ
						break;
					}
				}
				if (!ret) {
					// エラーがあった場合は次のカラムへ
					continue;
				}
			}
			
			// 固定値を補完
			setFixedValue(column);
			
			// 改行項目は属性値を補完
			if (isReturnColumn(colName)) {
				column.put(DATATYPE_KEY, TYPE_STRING);
				// 改行コードは文字コードに依存しないのでデフォルトcharsetのバイト数をセット
				column.put(LENGTH_KEY, ((String)DEF_RETRUN.get("code")).getBytes().length);
			}
			
			length += PFBZL_FixLenFileInfo.getLength(column);
			nameList.add(colName);
		}
		
		return length;
	}
	
	/**
	 * 参照先レコードおよびカラム名が存在するか判定。
	 * <p>
	 * 参照先レコードは（JSONファイル上）先に読み込んでおく必要があります。
	 * 
	 * @param keys synonym参照先キー配列
	 * @return 参照先カラム定義。見つからない場合null
	 */
	protected Map<String, Object> chkRefColumn(String[] keys) {

		boolean ret = false;
		Map<String, Object> refCol = null;
		// skipレコード以外はcontrol.columnをマージ前のためcontrol.columnも参照する
		if (HEADER_KEY.equals(keys[0])) {
			if (HEADER_COL_L != null) {
				if (ret = HEADER_COL_L.containsKey(keys[1])) {
					refCol = HEADER_COL_L.get(keys[1]);
				}
			}
			if (!ret && CTRL_COL_L != null) {
				if (ret = CTRL_COL_L.containsKey(keys[1])) {
					refCol = CTRL_COL_L.get(keys[1]);
				}
			}
		}
		else if (SKIP_KEY.equals(keys[0])) {
			if (SKIP_COL_L != null) {
				if (ret = SKIP_COL_L.containsKey(keys[1])) {
					refCol = SKIP_COL_L.get(keys[1]);
				}
			}
		}
		else if (TRAILER_KEY.equals(keys[0])) {
			if (TRAILER_COL_L != null) {
				if (ret = TRAILER_COL_L.containsKey(keys[1])) {
					refCol = TRAILER_COL_L.get(keys[1]);
				}
			}
			if (!ret && CTRL_COL_L != null) {
				if (ret = CTRL_COL_L.containsKey(keys[1])) {
					refCol = CTRL_COL_L.get(keys[1]);
				}
			}
		}
		else if (END_KEY.equals(keys[0])) {
			if (END_COL_L != null) {
				if (ret = END_COL_L.containsKey(keys[1])) {
					refCol = END_COL_L.get(keys[1]);
				}
			}
			if (!ret && CTRL_COL_L != null) {
				if (ret = CTRL_COL_L.containsKey(keys[1])) {
					refCol = CTRL_COL_L.get(keys[1]);
				}
			}
		}
		else {
			return null;
		}
		return refCol;
	}
	
	/**
	 * フォーマット解析エラー情報を設定します。
	 * 
	 * @param errId エラーID
	 * @param keys 解析エラーの項目キー
	 */
	protected void addFmtError(String errId, String... keys) {
		List<String> errorValue;
		if (FMT_ERROR.containsKey(errId)) {
			errorValue = FMT_ERROR.get(errId);
		}
		else {
			errorValue = new ArrayList<String>();
			FMT_ERROR.put(errId, errorValue);
		}
		
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String k : keys) {
			if (first) {
				first = false;
			}
			else {
				sb.append(".");
			}
			sb.append(k);
		}
		errorValue.add(sb.toString());
	}
	
	/**
	 * control.columnを各columnの先頭に追加します。
	 * 
	 * @param columnL カラムリスト
	 * @param recordKey レコードキー
	 */
	protected void addControlColumn(Map<String, Map<String, Object>> columnL, String recordKey) {
		if (CTRL_COL_L == null || CTRL_COL_L.isEmpty()) {
			return;
		}
		
		boolean isErr = false;
		// control.column.nameとcolumn.nameの重複チェック
		// control.columnの方がカラム数が少ないはずなのでこちらを基準にループ
		for (Entry<String, Map<String, Object>> ctrlEntry : CTRL_COL_L.entrySet()) {
			if (columnL.containsKey(ctrlEntry.getKey())) {
				List<String> errorValue;
				if (FMT_ERROR.containsKey(NAME_DUP_ERROR_KEY)) {
					errorValue = FMT_ERROR.get(NAME_DUP_ERROR_KEY);
				}
				else {
					errorValue = new ArrayList<String>();
					FMT_ERROR.put(NAME_DUP_ERROR_KEY, errorValue);
				}

				StringBuilder sb = new StringBuilder();
				sb.append(recordKey).append(".").append(ctrlEntry.getKey());
				errorValue.add(sb.toString());
				isErr = true;
			}
		}
		if (isErr) {
			return;
		}
		
		Map<String, Map<String, Object>> tmp = new LinkedHashMap<String, Map<String, Object>>(CTRL_COL_L);
		tmp.putAll(columnL);
		columnL.clear();
		columnL.putAll(tmp);
	}

	/**
	 * columnにデフォルト値を補完します。
	 * @param key レコードキー
	 * @param column カラム定義
	 * @param def デフォルト属性カラム定義
	 */
	@SuppressWarnings("unchecked")	// mapのキャスト
	protected void setDefaultColumn(String key, Map<String, Object> column, Map<String, Object> def) {
		Map<String, Object> defTmp = new HashMap<String, Object>(def);
		// 以下の4属性は定義する階層がdefaultと個別のcolumnで違うため、column直下の値に補完する
		if (!column.containsKey("align") && def.containsKey("align")) {
			column.put("align", def.get("align"));
		}
		if (!column.containsKey("paddingStr") && def.containsKey("paddingStr")) {
			column.put("paddingStr", def.get("paddingStr"));
		}
		if (!column.containsKey("trim") && def.containsKey("trim")) {
			column.put("trim", def.get("trim"));
		}
		if (!column.containsKey("nullStr") && def.containsKey("nullStr")) {
			column.put("nullStr", def.get("nullStr"));
		}
		
		// column.stringの属性は現仕様にはないためここで終了
		if (COL_C_KEY.equals(key)) {
			return;
		}
		// columnに移動した属性を削除
		defTmp.remove("align");
		defTmp.remove("paddingStr");
		defTmp.remove("trim");
		defTmp.remove("nullStr");
		
		// 属性値を補完
		if (column.containsKey(key)) {
			// .columnの属性レコード(.string|.number|.data|.timestamp|.boolean)配下の要素をdefaultへ上書き
			defTmp.putAll((Map<String, Object>)column.get(key));
		}
		if (!defTmp.isEmpty()) {
			column.put(key, defTmp);
		}
	}
	
	/**
	 * column.optionにデフォルト値を補完します。
	 * 
	 * @param column カラム定義
	 * @param opDef デフォルト属性オプションカラム定義
	 */
	@SuppressWarnings("unchecked")	// mapのキャスト
	protected void setOpDefaultColumn(Map<String, Object> column, Map<String, Object> opDef) {
		// 【date/timestampのみ】defaultレコードの初期値を設定
		if (opDef != null) {
			Map<String, Object> tmp = new HashMap<String, Object>(opDef);
			// column.optionレコードを補完
			if (column.containsKey(COL_OP_KEY)) {
				tmp.putAll((Map<String, Object>)column.get(COL_OP_KEY));
			}
			column.put(COL_OP_KEY, tmp);
		}
		
		// 【共通】 edit.formatを補完
		Map<String, Object>[] edit = PFBZL_FixLenFileInfo.getOptionAttrArray(column, COL_EDIT_KEY);
		if (edit != null) {
			for (Map<String, Object> el : edit) {
				if (!el.containsKey(COL_FORMAT_KEY)) {
					el.put(COL_FORMAT_KEY, getDefaultFormat(column));
				}
			}
		}
	}

	/**
	 * column.dataTypeに従ってformatのデフォルト値を取得します。
	 * <p>
	 * dataTypeがD(Date)またはTS(Timestamp)のみ有効です。
	 * それ以外はnullを返します。

	 * @param column カラム定義
	 * @return format
	 */
	protected String getDefaultFormat(Map<String, Object> column) {
		String dataType = (String)column.get(DATATYPE_KEY);
		if (TYPE_DATE.equals(dataType)) {
			return DEF_DATE_FORMAT;
		}
		else if (TYPE_TIMESTAMP.equals(dataType)) {
			return DEF_TIMESTAMP_FORMAT;
		}
		return null;
	}
	
	/**
	 * 固定値の補完
	 * <p>
	 * @param column カラム定義
	 */
	protected void setFixedValue(Map<String, Object> column) {
		// fixedValueTypeを補完
		if (!column.containsKey("fixedValueType") &&
			column.containsKey("fixedValue") && column.get("fixedValue") != null) {
			column.put("fixedValueType", "fixedValue");
		}

		// fixedValueFormatを補完
		if (column.get("fixedValue") != null && !column.containsKey("fixedValueFormat")) {
			column.put("fixedValueFormat", getDefaultFormat(column));
		}
	}
}