package mcframe.serverPFBZ.PFBZL9070;

import mcframe.commonCore.io.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import mcframe.serverPFUD.PFUDL0050.PFUDL_AbstFmt;


abstract public class PFBZL_AbstFixLenFileFmt_MC extends PFUDL_AbstFmt {
	
	/**
	 * 固定長ファイルフォーマット情報
	 */
	protected PFBZL_FixLenFileInfo _fileInfo = null;
	
	/**
	 * 固定長ファイルフォーマット情報の設定
	 * @param info 固定長ファイルフォーマット情報
	 */
	public void setFileInfo(PFBZL_FixLenFileInfo info) {
		_fileInfo = info;
	}
	
	/**
	 * 固定長ファイルフォーマット情報の取得
	 * @return 固定長ファイルフォーマット情報
	 */
	public PFBZL_FixLenFileInfo getFileInfo() {
		return _fileInfo;
	}
	
	@Override
	protected void checkFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		super.checkFmtSub(root, msgList, causeRow);

		// 共通・個別フォーマットファイルの共通処理
		// defaultブロックの解析とチェックを行う
		analyzeDefaultFormat();
		checkDefaultFmtSub(root, msgList, causeRow);
	}
	
	/**
	 * defaultブロックのフォーマット解析
	 */
	protected void analyzeDefaultFormat() {
		if (_root == null) {
			return;
		}
		if (_fileInfo == null) {
			_fileInfo = createPFBZL_FixLenFileInfo();
		}
		_fileInfo.setup();
		if (_root.containsKey(DEFAULT_KEY)) {
			MCNode def = _root.getNode(DEFAULT_KEY);
			_fileInfo.setDefault(def.toMap());
		}
	}
	
	protected PFBZL_FixLenFileInfo createPFBZL_FixLenFileInfo() {
		return new PFBZL_FixLenFileInfo();
	}
	
	/**
	 * defaultブロックのフォーマットチェック
	 */
	protected void checkDefaultFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		if (_fileInfo == null) {
			return;
		}
		if (hasErr()) {
			return;
		}
		chkStringDefault(root, msgList, causeRow);
		chkNumberDefault(root, msgList, causeRow);
		chkBooleanDefault(root, msgList, causeRow);
		chkDateDefault(root, msgList, causeRow);
		chkTimestampDefault(root, msgList, causeRow);
	}

	protected void chkStringDefault(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> attrMap = _fileInfo.getColStringDefault();
		chkStringAttr(attrMap, attrMap, DEFAULT_KEY);
	}
	
	protected void chkNumberDefault(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> attrMap = _fileInfo.getColNumberDefault();
		chkNumberAttr(attrMap, attrMap, DEFAULT_KEY);
	}
	
	protected void chkBooleanDefault(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> attrMap = _fileInfo.getColBooleanDefault();
		chkBooleanAttr(attrMap, attrMap, DEFAULT_KEY);
	}

	protected void chkDateDefault(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> attrMap = _fileInfo.getColDateDefault();
		chkDateTsAttr(attrMap, attrMap, COL_D_KEY, DEFAULT_KEY);

	}

	protected void chkTimestampDefault(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> attrMap = _fileInfo.getColTimestampDefault();
		chkDateTsAttr(attrMap, attrMap, COL_TS_KEY, DEFAULT_KEY);
	}

	public void chkStringAttr(Map<String, Object> column, Map<String, Object> attrMap, String recordKey) {
		// recordKey.column.stringのチェック
		String colName = DEFAULT_KEY.equals(recordKey) ? COLUMN_KEY : getString(column, NAME_KEY);
		String attrKey = joinKeyName(recordKey, colName, COL_C_KEY);
		
		String paddingStr = getString(column, "paddingStr");
		if (!chkLengthLE(paddingStr, 1)) {
			addMsg(PFBZL0115, joinKeyName(attrKey, "paddingStr"), paddingStr, 1);
		}
	}

	public void chkNumberAttr(Map<String, Object> column, Map<String, Object> attrMap, String recordKey) {
		// recordKey.column.numberのチェック
		String colName = DEFAULT_KEY.equals(recordKey) ? COLUMN_KEY : getString(column, NAME_KEY);
		String attrKey = joinKeyName(recordKey, colName, COL_N_KEY);
		String colKey = DEFAULT_KEY.equals(recordKey) ? attrKey : joinKeyName(recordKey, colName);

		String paddingStr = getString(column, "paddingStr");
		if (!chkLengthLE(paddingStr, 1)) {
			addMsg(PFBZL0115, joinKeyName(attrKey, "paddingStr"), paddingStr, 1);
		}
		// column.number.decimalStr
		String decimalStr = getString(attrMap, "decimalStr");
		if (!chkLength(decimalStr, 1)) {
			addMsg(PFBZL0115, joinKeyName(attrKey, "decimalStr"), decimalStr, 1);
		}
		if (!isNull(decimalStr)) {
			if (chkIntChar(decimalStr.charAt(0))) {
				addMsg(PFBZL0088, joinKeyName(attrKey, "decimalStr"), decimalStr);
			}
			if (isSame(decimalStr, paddingStr)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "decimalStr"), decimalStr, joinKeyName(colKey, "paddingStr"));
			}
		}
		
		// column.number.decimalLength
		int length = getLength(column);
		int decimalLength = getInt(attrMap, "decimalLength");
		if (COLUMN_KEY.equals(recordKey)) {
			if (length < decimalLength) {
				addMsg(PFBZL0088, joinKeyName(attrKey, "decimalLength"), decimalLength);
			}
		}

		// column.number.signPlus
		String signPlus = getString(attrMap, "signPlus");
		if (!isNull(signPlus)) {
			if (!chkLengthLE(signPlus, 1)) {
				addMsg(PFBZL0115, joinKeyName(attrKey, "signPlus"), signPlus, 1);
			}
			if (isSame(decimalStr, signPlus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "signPlus"), signPlus, joinKeyName(attrKey, "decimalStr"));
			}
		}
		// column.number.signZero
		String signZero = getString(attrMap, "signZero");
		if (!isNull(signZero)) {
			if (!chkLengthLE(signZero, 1)) {
				addMsg(PFBZL0115, joinKeyName(attrKey, "signZero"), signZero, 1);
			}
			if (isSame(decimalStr, signZero)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "signZero"), signZero, joinKeyName(attrKey, "decimalStr"));
			}
		}
		// column.number.signMinus
		String signMinus = getString(attrMap, "signMinus");
		if (!isNull(signMinus)) {
			if (!chkLengthLE(signMinus, 1)) {
				addMsg(PFBZL0115, joinKeyName(attrKey, "signMinus"), signMinus, 1);
			}
			if (isSame(decimalStr, signMinus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "signMinus"), signMinus, joinKeyName(attrKey, "decimalStr"));
			}
		}
		
		if (!isNull(signPlus) && !isNull(signMinus)) {
			if (isSame(signPlus, signMinus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "signMinus"), signMinus, joinKeyName(attrKey, "signPlus"));
			}
		}
		
		// column.number.separatorInteger
		String separatorInteger = getString(attrMap, "separatorInteger");
		if (!isNull(separatorInteger)) {
			if (!chkLengthLE(separatorInteger, 1)) {
				addMsg(PFBZL0115, joinKeyName(attrKey, "separatorInteger"), separatorInteger, 1);
			}
			if (chkIntChar(separatorInteger.charAt(0))) {
				addMsg(PFBZL0088, joinKeyName(attrKey, "separatorInteger"), separatorInteger);
			}
			if (isSame(decimalStr, separatorInteger)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorInteger"), separatorInteger, joinKeyName(attrKey, "decimalStr"));
			}
		}
		// column.number.separatorDecimal
		String separatorDecimal = getString(attrMap, "separatorDecimal");
		if (!isNull(separatorDecimal)) {
			if (!chkLengthLE(separatorDecimal, 1)) {
				addMsg(PFBZL0115, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal, 1);
			}
			if (chkIntChar(separatorDecimal.charAt(0))) {
				addMsg(PFBZL0088, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal);
			}
			if (isSame(decimalStr, separatorDecimal)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal, joinKeyName(attrKey, "decimalStr"));
			}
		}

		boolean decimalDisplayFlg = getBoolean(attrMap, "decimalDisplayFlg");
		if (!isNull(separatorInteger)) {
			if (isSame(separatorInteger, signPlus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorInteger"), separatorInteger, joinKeyName(attrKey, "signPlus"));
			}
			if (isSame(separatorInteger, signZero)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorInteger"), separatorInteger, joinKeyName(attrKey, "signZero"));
			}
			if (isSame(separatorInteger, signMinus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorInteger"), separatorInteger, joinKeyName(attrKey, "signMinus"));
			}
			if (!decimalDisplayFlg) {
				addMsg(PFBZL0090, joinKeyName(attrKey, "decimalDisplayFlg"), decimalDisplayFlg,
								  joinKeyName(attrKey, "separatorInteger"), separatorInteger);
			}
		}
		
		if (!isNull(separatorDecimal)) {
			if (isSame(separatorDecimal, signPlus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal, joinKeyName(attrKey, "signPlus"));
			}
			if (isSame(separatorDecimal, signZero)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal, joinKeyName(attrKey, "signZero"));
			}
			if (isSame(separatorDecimal, signMinus)) {
				addMsg(PFBZL0089, joinKeyName(attrKey, "separatorDecimal"), separatorDecimal, joinKeyName(attrKey, "signMinus"));
			}
			if (!decimalDisplayFlg) {
				addMsg(PFBZL0090, joinKeyName(attrKey, "decimalDisplayFlg"), decimalDisplayFlg,
						  		  joinKeyName(attrKey, "separatorDecimal"), separatorDecimal);
			}
		}
		
		String align = getString(column, "align");
		if (!decimalDisplayFlg) {
			if (isSame(ALIGN_LEFT, align)) {
				addMsg(PFBZL0090, joinKeyName(colKey, "align"), align,
				  		  		  joinKeyName(attrKey, "decimalDisplayFlg"), decimalDisplayFlg);
			}
		}
		
		// column.number.signPosition
		String signPosition = getString(attrMap, "signPosition");
		if (isSame(POSITION_FIT, signPosition)) {
			if (!isNull(signPlus) && signPlus.length() == 1 && chkIntChar(signPlus.charAt(0))) {
				addMsg(PFBZL0090, joinKeyName(attrKey, "signPosition"), signPosition,
			  		  			  joinKeyName(attrKey, "signPlus"), signPlus);
			}
			if (!isNull(signZero) && signZero.length() == 1 && chkIntChar(signZero.charAt(0))) {
				addMsg(PFBZL0090, joinKeyName(attrKey, "signPosition"), signPosition,
			  		  			  joinKeyName(attrKey, "signZero"), signZero);
			}
			if (!isNull(signMinus) && signMinus.length() == 1 && chkIntChar(signMinus.charAt(0))) {
				addMsg(PFBZL0090, joinKeyName(attrKey, "signPosition"), signPosition,
			  		  			  joinKeyName(attrKey, "signMinus"), signMinus);
			}
			if (!isNull(paddingStr)) {
				if (isSame(paddingStr, signPlus)) {
					addMsg(PFBZL0091, joinKeyName(attrKey, "signPosition"), signPosition,
									  joinKeyName(attrKey, "signPlus"), signPlus,
		  		  			  		  joinKeyName(colKey, "paddingStr"), paddingStr);
				}
				if (isSame(paddingStr, signZero)) {
					addMsg(PFBZL0091, joinKeyName(attrKey, "signPosition"), signPosition,
									  joinKeyName(attrKey, "signZero"), signZero,
		  		  			  		  joinKeyName(colKey, "paddingStr"), paddingStr);
				}
				if (isSame(paddingStr, signMinus)) {
					addMsg(PFBZL0091, joinKeyName(attrKey, "signPosition"), signPosition,
									  joinKeyName(attrKey, "signMinus"), signMinus,
		  		  			  		  joinKeyName(colKey, "paddingStr"), paddingStr);
				}
			}
		}
		
		if (isSame(POSITION_HEAD, signPosition)) {
			Matcher mP = NUM_PTN.matcher(signPlus);
			Matcher mZ = signZero != null ? NUM_PTN.matcher(signZero) : null;
			Matcher mM = NUM_PTN.matcher(signMinus);
			if (mP.matches() || (mZ != null && mZ.matches()) ||  mM.matches()) {
				int signZeroLen = signZero != null ? signZero.length() : signPlus.length();
				if (!(signPlus.length() == signMinus.length() && signPlus.length() == signZeroLen)) {
					addMsg(PFBZL0092, joinKeyName(attrKey, "signPosition"), signPosition,
									  joinKeyName(attrKey, "signPlus"), signPlus,
									  joinKeyName(attrKey, "signZero"), signZero,
									  joinKeyName(attrKey, "signMinus"), signMinus);
				}
			}
		}
	}
	
	public void chkBooleanAttr(Map<String, Object> column, Map<String, Object> attrMap, String recordKey) {
		// recordKey.column.booleanのチェック
		String colName = DEFAULT_KEY.equals(recordKey) ? COLUMN_KEY : getString(column, NAME_KEY);
		String attrKey = joinKeyName(recordKey, colName, COL_F_KEY);

		String paddingStr = getString(column, "paddingStr");
		if (!chkLengthLE(paddingStr, 1)) {
			addMsg(PFBZL0115, joinKeyName(attrKey, "paddingStr"), paddingStr, 1);
		}

		if (isSame(getString(attrMap, "trueStr"), (getString(attrMap, "falseStr")))) {
			addMsg(PFBZL0089, joinKeyName(attrKey, "falseStr"), getString(attrMap, "falseStr"),
					joinKeyName(attrKey, "trueStr"));
		}
	}
	
	public void chkDateTsAttr(Map<String, Object> column, Map<String, Object> attrMap, String type, String recordKey) {
		// recordKey.column.date/timestampのチェック
		String colName = DEFAULT_KEY.equals(recordKey) ? COLUMN_KEY : getString(column, NAME_KEY);
		String attrKey = joinKeyName(recordKey, colName, type);

		String paddingStr = getString(column, "paddingStr");
		if (!chkLengthLE(paddingStr, 1)) {
			addMsg(PFBZL0115, joinKeyName(attrKey, "paddingStr"), paddingStr, 1);
		}

		int omitMonth = getInt(attrMap, "omitMonth");
		if (!(1 <= omitMonth && omitMonth <= 12)) {
			addMsg(PFBZL0088, joinKeyName(attrKey, "omitMonth"), omitMonth);
		}

		int omitDay =  getInt(attrMap, "omitDay");
		if (!(1 <= omitDay && omitDay <= 31) && omitDay != 99) {
			addMsg(PFBZL0088, joinKeyName(attrKey, "omitDay"), omitDay);
		}

		int omitHour =  getInt(attrMap, "omitHour");
		if (!(0 <= omitHour && omitHour <= 23)) {
			addMsg(PFBZL0088, joinKeyName(attrKey, "omitHour"), omitHour);
		}

		int omitMinutes =  getInt(attrMap, "omitMinutes");
		if (!(0 <= omitMinutes && omitMinutes <= 59)) {
			addMsg(PFBZL0088, joinKeyName(attrKey, "omitMinutes"), omitMinutes);
		}

		int omitSecond =  getInt(attrMap, "omitSecond");
		if (!(0 <= omitSecond && omitSecond <= 59)) {
			addMsg(PFBZL0088, joinKeyName(attrKey, "omitSecond"), omitSecond);
		}
		
		if (COL_TS_KEY.equals(type)) {
			int omitMilliSecond =  getInt(attrMap, "omitMilliSecond");
			if (!(0 <= omitMilliSecond && omitMilliSecond <= 999)) {
				addMsg(PFBZL0088, joinKeyName(attrKey, "omitMilliSecond"), omitMilliSecond);
			}
		}
		
	}
	
	protected boolean chkIntChar(char c) {
		// 48:"0"、57:"9"
		return 48 <= c && c <= 57;
	}
	
	protected boolean chkLength(String v, int len) {
		return v == null || v.length() == len;
	}

	protected boolean chkLengthLE(String v, int len) {
		return v == null || v.length() <= len;
	}
	
	/**
	 * マッピングの参照先の値が、参照元の属性情報に設定可能か否か。相関チェックは行わない。
	 * @param refVal 参照先の値
	 * @param attrName "number", "date", "timestamp", "boolean"
	 * @param attrElName "decimalStr", etc.
	 * @return true: attrName.attrAlNameに検査値が設定できる場合
	 */
	public boolean acceptableMappingValue(Comparable<?> refVal, String attrName, String attrElName) {
		// データ型のチェックまでは、フォーマットのチェックで行われている
		if (refVal == null) {
			ArrayList<String> notNullL = new ArrayList<>();
			notNullL.add("number.signZero");
			notNullL.add("number.separatorInteger");
			notNullL.add("number.separatorDecimal");
			if (notNullL.contains(attrName + "." + attrElName)) {
				return false;
			}
		}
		return true;
	}
	//////////////////////////////////
	// データ変換
	//////////////////////////////////
	/**
	 * node値をjava型に変換する。
	 * <p>
	 * node型とdataType型が不一致の場合はnullを返す。
	 * 
	 * @param node ノード
	 * @param dataType データ型
	 * @param format フォーマット(dataTypeが"D"または"TS"の場合指定)
	 * @return 変換したjava型の値
	 */
	protected Comparable<?> toJava(MCNode node, String dataType, Map<String, Object> format) {
		Comparable<?> value = null;
		switch (dataType) {
			case TYPE_STRING:
				if (node.isString()) {
					value = node.getString();
				}
				break;
			case TYPE_NUMBER:
				if (node.isNumber()) {
					value = node.getNumber();
				}
				break;
			case TYPE_BOOL:
				if (node.isBoolean()) {
					value = node.getBoolean();
				}
				break;
			default:
				break;
		}
		return value;
	}
	
	/**
	 * node値をjava型の配列に変換する
	 * <p>
	 * node型とdataType型が不一致の場合はnullを返す。
	 *
	 * @param node ノード
	 * @param dataType データ型
	 * @param format フォーマット(dataTypeが"D"または"TS"の場合指定)
	 * @return 変換したjava型の配列
	 */
	protected Comparable<?>[] toJavaArray(MCNode node, String dataType, Map<String, Object> format) {
		Comparable<?>[] value = null;
		switch (dataType) {
			case TYPE_STRING:
				if (node.isStringArray()) {
					value = node.getStringArray();
				}
				break;
			case TYPE_NUMBER:
				if (node.isNumberArray()) {
					value = node.getNumberArray();
				}
				break;
			case TYPE_BOOL:
				if (node.isBooleanArray()) {
					boolean[] bArray = node.getBooleanArray();
					value = new Boolean[bArray.length];
					for (int i=0; i<bArray.length; i++) {
						value[i] = Boolean.valueOf(bArray[i]);
					}
				}
				break;
			default:
				break;
		}
		return value;
	}
	
	public String joinKeyName(String... values) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String v : values) {
			if (!isNull(v)) {
				if (first) {
					first = false;
				}
				else {
					sb.append(".");
				}
				sb.append(v);
			}
		}
		return sb.toString();
	}

	public String joinBind(Comparable<?>... values) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (Comparable<?> v : values) {
			if (first) {
				first = false;
			}
			else {
				sb.append(" : ");
			}
			if (!isNull(v)) {
				sb.append(v);
			}
			else {
				sb.append("");
			}
		}
		return sb.toString();
	}

	public String joinBind(ArrayList<String> valL) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String v : valL) {
			if (!isNull(v)) {
				if (first) {
					first = false;
				}
				else {
					sb.append(RTN_CODE_LF);
				}
				sb.append(v);
			}
		}
		return sb.toString();
	}

}