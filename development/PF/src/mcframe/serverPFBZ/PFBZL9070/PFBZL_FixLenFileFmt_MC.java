package mcframe.serverPFBZ.PFBZL9070;

import mcframe.commonCore.io.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonMA.constant.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import mcframe.serverPFUD.PFUDL0050.PFUDL_KeyInfo;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo.*;
import static mcframe.commonPF.notice.PF_Msg.*;

/**
 * 固定長ファイルフォーマットの情報を読み込むクラスです。
 *
 */
abstract public class PFBZL_FixLenFileFmt_MC extends PFBZL_AbstFixLenFileFmt {

	public static PFBZL_FixLenFileFmt createRead(String extSysCd, String ifProcTyp, String fmtPath, String settingPath, MCRow causeRow) {
		return PFBZL_FixLenFileFmt.createRead(extSysCd, ifProcTyp, fmtPath, settingPath, causeRow, null, null);
	}
	
	public static PFBZL_FixLenFileFmt createRead(String extSysCd, String ifProcTyp, String fmtPath, String settingPath, MCRow causeRow, PFBZL_FixLenFileFmt fmt, PFBZL_FixLenFileDefaultFmt defaultFmt) {
		return PFBZL_FixLenFileFmt.create(extSysCd, ifProcTyp, fmtPath, settingPath, causeRow, true, fmt, defaultFmt);
	}
	
	public static PFBZL_FixLenFileFmt createWrite(String extSysCd, String ifProcTyp, String fmtPath, String settingPath, MCRow causeRow) {
		return PFBZL_FixLenFileFmt.createWrite(extSysCd, ifProcTyp, fmtPath, settingPath, causeRow, null, null);
	}

	public static PFBZL_FixLenFileFmt createWrite(String extSysCd, String ifProcTyp, String fmtPath, String settingPath, MCRow causeRow, PFBZL_FixLenFileFmt fmt, PFBZL_FixLenFileDefaultFmt defaultFmt) {
		return PFBZL_FixLenFileFmt.create(extSysCd, ifProcTyp, fmtPath, settingPath, causeRow, false, fmt, defaultFmt);
	}
	
	protected static PFBZL_FixLenFileFmt create(String extSysCd, String ifProcTyp, String fmtPath, String settingPath, MCRow causeRow, boolean isRead, PFBZL_FixLenFileFmt fmt, PFBZL_FixLenFileDefaultFmt defaultFmt) {
		// 個別フォーマットファイルの存在チェック
		if (isNull(fmtPath)) {
			throw new MCAppException(causeRow, null, PFBZL0087, extSysCd, ifProcTyp, MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH.value());
		}
		
		File file = new File(fmtPath);
		if (!file.exists()) {
			throw new MCAppException(causeRow, null, PFBZL0003, file.getParent(), file.getName());
		}
		else if (file.length() <= 0) {
			throw new MCAppException(causeRow, null, PFBZL0011, ifProcTyp, file.getParent(), file.getName());
		}
	
		// 共通フォーマット読込み
		PFBZL_FixLenFileInfo fileInfo = null;
		if (!isNull(settingPath)) {
			// 共通フォーマットファイルの存在チェック
			File settingFile = new File(settingPath);
			if (!settingFile.exists()) {
				throw new MCAppException(causeRow, null, PFBZL0003, settingFile.getParent(), settingFile.getName());
			}
			else if (settingFile.length() <= 0) {
				throw new MCAppException(causeRow, null, PFBZL0011, ifProcTyp, settingFile.getParent(), settingFile.getName());
			}
			
			if (defaultFmt == null) {
				defaultFmt = new PFBZL_FixLenFileDefaultFmt();
			}
			defaultFmt.init();
			defaultFmt.checkFmt(settingPath, causeRow);
			if (defaultFmt.hasErr()) {
				MCAppException ex = new MCAppException(causeRow, null, PFBZL0118, extSysCd, ifProcTyp, settingFile.getParent(), settingFile.getName());
				ex.addCauseMessageList(defaultFmt.getErrMsgList());
				throw ex;
			}
			// 解析した共通フォーマット情報を取得
			fileInfo = defaultFmt.getFileInfo();
		}
		
		// 個別フォーマットファイルの読込み
		if (fmt == null) {
			fmt = new PFBZL_FixLenFileFmt();
		}
		fmt.isRead(isRead);
		// 読み込み済みの共通フォーマット情報をセット
		fmt.setFileInfo(fileInfo);
		fmt.init();
		fmt.checkFmt(fmtPath, causeRow);
		if (fmt.hasErr()) {
			MCAppException ex = new MCAppException(causeRow, null, PFBZL0118, extSysCd, ifProcTyp, file.getParent(), file.getName());
			ex.addCauseMessageList(fmt.getErrMsgList());
			throw ex;
		}
		return fmt;
	}
	
	//////////////////////////////////
	// フォーマット情報の生成、整合性チェック
	//////////////////////////////////
	protected boolean _isRead;
	
	public void isRead(boolean isRead) {
		_isRead = isRead;
	}
	
	protected Set<String> _extKeyL = new HashSet<>();
	
	protected String _extPtn;
	
	public void setExtFmt(String extPtn) {
		_extPtn = extPtn;
	}
	
	@Override
	protected void createFmt() {
		// デフォルトブロックのチェック
		createFmtDefault();
		// 各レコード直下の構造チェック
		createFmtRecord();
		// 各レコードのcolumn配下のチェック
		createFmtRecordColumn("skip", null);
		createFmtRecordColumn("control", null);
		createFmtRecordColumn("header", null);
		createFmtRecordColumn("data", anyKey());
		createFmtRecordColumn("trailer", null);
		createFmtRecordColumn("end", null);
		
		// 呼出元固有のチェック
		createFmtExt();
	}
	
	protected void createFmtRecordColumn(String key, String any) {
		// column配下の構造チェック
		createFmtColumnRecord(key, any);
		// column直下の属性チェック
		createFmtColumnAttr(key, any);
		// columnの属性オプションチェック
		createFmtColumnAttrOp(key, any);
		// columnのmapping構造・属性チェック
		createFmtColumnMapping(key, any);
	}
	
	protected void createFmtDefault() {
		createKeyInfo("default").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "return").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "return","pattern").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "return","code").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(RTN_CODE_CR, RTN_CODE_LF, RTN_CODE_CRLF);

		createKeyInfo("default", "column").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "string").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "number").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "date").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "timestamp").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "boolean").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "date","option").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "timestamp","option").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("default", "column", "number","align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo("default", "column", "number","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "string","align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo("default", "column", "string","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "date","align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo("default", "column", "date","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "timestamp","align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo("default", "column", "timestamp","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "boolean","align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo("default", "column", "boolean","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);

		createKeyInfo("default", "column", "string","trim").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(TRIM_TYPE_BOTH, TRIM_TYPE_NONE);

		createKeyInfo("default", "column", "number","nullStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "string","nullStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "date","nullStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "timestamp","nullStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);

		createKeyInfo("default", "column", "number","signPlus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).isSameNullBlank(false);
		createKeyInfo("default", "column", "number","signZero").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isSameNullBlank(false);
		createKeyInfo("default", "column", "number","signMinus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).isSameNullBlank(false);
		createKeyInfo("default", "column", "number","signPosition").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(POSITION_HEAD, POSITION_FIT);
		createKeyInfo("default", "column", "number","separatorInteger").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "number","separatorDecimal").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo("default", "column", "number","decimalStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo("default", "column", "number","decimalDisplayFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo("default", "column", "number","decimalFloatFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo("default", "column", "number","decimalLength").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isInt(true);

		createKeyInfo("default", "column", "boolean","trueStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo("default", "column", "boolean","falseStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);

		createKeyInfo("default", "column", "date","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo("default", "column", "date","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "date","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);

		createKeyInfo("default", "column", "timestamp","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo("default", "column", "timestamp","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo("default", "column", "timestamp","omitMilliSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
	}
	
	protected void createFmtRecord() {
		createKeyInfo("skip").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("skip", "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("control").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("control", "name").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo("control", "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("control", "header").isReq(true).isNotNull(true);
		createKeyInfo("control", "data").isNotNull(true);
		createKeyInfo("control", "trailer").isNotNull(true);
		createKeyInfo("control", "end").isNotNull(true);
		createKeyInfo("header").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("header", "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("header", "key").dataType(PFUDL_KeyInfo.DATA_TYP_STRs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("data").dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("data", anyKey(), "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("trailer").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("trailer", "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("trailer", "calc").dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("end").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("end", "column").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
		createKeyInfo("end", "calc").dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
	}
	
	protected void createFmtColumnRecord(String key, String any) {
		createKeyInfo(key, any, "column", anyKey(),"number").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"boolean").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"date").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"date","option").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","option").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option","numPtn").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option","sequence").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option","edit").dataType(PFUDL_KeyInfo.DATA_TYP_OBJs).isNotNull(true).isArrayNotNull(true);
	}

	protected void createFmtColumnAttr(String key, String any) {
		createKeyInfo(key, any, "column", anyKey(),"name").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"dataType").dataType(PFUDL_KeyInfo.DATA_TYP_STR).selectStr(TYPE_STRING, TYPE_NUMBER, TYPE_DATE, TYPE_TIMESTAMP, TYPE_BOOL);
		createKeyInfo(key, any, "column", anyKey(),"length").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"dupNameAllowFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo(key, any, "column", anyKey(),"dummyFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo(key, any, "column", anyKey(),"fixedValueType").dataType(PFUDL_KeyInfo.DATA_TYP_STR).selectStr(FIX_TYPE_VALUE, FIX_TYPE_H_ROWS, FIX_TYPE_D_ROWS);
		createKeyInfo(key, any, "column", anyKey(),"fixedValueCheckFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo(key, any, "column", anyKey(),"fixedValueFormat").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"align").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(ALIGN_LEFT, ALIGN_RIGHT);
		createKeyInfo(key, any, "column", anyKey(),"paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"trim").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(TRIM_TYPE_BOTH, TRIM_TYPE_NONE);
		createKeyInfo(key, any, "column", anyKey(),"nullStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"mapping").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"synonym").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
	}

	protected void createFmtColumnAttrOp(String key, String any) {
		createKeyInfo(key, any, "column", anyKey(),"number","signPlus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).isSameNullBlank(false);
		createKeyInfo(key, any, "column", anyKey(),"number","signZero").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isSameNullBlank(false);
		createKeyInfo(key, any, "column", anyKey(),"number","signMinus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).isSameNullBlank(false);
		createKeyInfo(key, any, "column", anyKey(),"number","signPosition").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(POSITION_HEAD, POSITION_FIT);
		createKeyInfo(key, any, "column", anyKey(),"number","separatorInteger").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"number","separatorDecimal").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"number","decimalStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"number","decimalDisplayFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo(key, any, "column", anyKey(),"number","decimalFloatFlg").dataType(PFUDL_KeyInfo.DATA_TYP_BOO);
		createKeyInfo(key, any, "column", anyKey(),"number","decimalLength").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isInt(true);

		createKeyInfo(key, any, "column", anyKey(),"boolean","trueStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"boolean","falseStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);

		createKeyInfo(key, any, "column", anyKey(),"date","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"date","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"date","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);

		createKeyInfo(key, any, "column", anyKey(),"timestamp","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"timestamp","omitMilliSecond").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isNotNull(true).isInt(true);

		createKeyInfo(key, any, "column", anyKey(),"option","numPtn","numPtnCd").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option","sequence","name").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"option","sequence","length").dataType(PFUDL_KeyInfo.DATA_TYP_NUM).isInt(true);
		createKeyInfo(key, any, "column", anyKey(),"option","sequence","head").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		createKeyInfo(key, any, "column", anyKey(),"option","sequence","paddingStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR);
		
		createKeyInfo(key, any, "column", anyKey(),"option","edit", anyKey(), "file").isReq(true);
		createKeyInfo(key, any, "column", anyKey(),"option","edit", anyKey(),"table").isReq(true);
		createKeyInfo(key, any, "column", anyKey(),"option","edit", anyKey(),"format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
	}

	protected void createFmtColumnMapping(String key, String any) {
		createKeyInfo(key, any, "column", anyKey(),"mapping","number").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","signPlus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","signZero").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","signMinus").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","signPosition").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true).selectStr(POSITION_HEAD, POSITION_FIT);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","separatorInteger").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","separatorDecimal").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","decimalStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","decimalDisplayFlg").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","decimalFloatFlg").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","number","decimalLength").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);

		createKeyInfo(key, any, "column", anyKey(),"mapping","boolean").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","boolean","trueStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","boolean","falseStr").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);

		createKeyInfo(key, any, "column", anyKey(),"mapping","date").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","date","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);

		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","format").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","shiftYear").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitYear").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitMonth").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitDay").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitHour").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitMinutes").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitSecond").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
		createKeyInfo(key, any, "column", anyKey(),"mapping","timestamp","omitMilliSecond").dataType(PFUDL_KeyInfo.DATA_TYP_STR).isNotNull(true);
	}

	protected void createFmtExt() {
		if (isNull(_extPtn)) {
			return ;
		}
		
		ArrayList<String> keyL = new ArrayList<>();
		for (String key : _extPtn.split("\\.")) {
			keyL.add(key);
			createKeyInfo(keyL.toArray(new String[0])).dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		}
		
		if (isSame(_extPtn, "PF.PFUDL5010.ConvBase08")) {
			_extKeyL.add("sort");
			createKeyInfo("PF", "PFUDL5010", "ConvBase08", "sort").dataType(PFUDL_KeyInfo.DATA_TYP_STRs).isNotNull(true).isArrayNotNull(true).isArrayNotDupVal(true).isTrim(true);
		}
		if (isSame(_extPtn, "PF.PFBZL9020.writer")) {
			_extKeyL.add("sort");
			createKeyInfo("PF", "PFBZL9020", "writer", "sort").dataType(PFUDL_KeyInfo.DATA_TYP_STRs).isNotNull(true).isArrayNotNull(true).isArrayNotDupVal(true).isTrim(true);
		}
	}

	@Override
	protected void checkFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		super.checkFmtSub(root, msgList, causeRow);
		if (hasErr()) {
			return;
		}
		
		analyzeFormat();
		if (hasErr()) {
			return;
		}

		/////// 相関チェック
		// skipレコードのチェック
		chkColumnL(_fileInfo.getSkipColumn(), SKIP_KEY, root, msgList, causeRow);
		// controlレコードチェック
		chkCtrl(root, msgList, causeRow);
		// header.column[]チェック
		chkColumnL(_fileInfo.getHeaderColumn(), HEADER_KEY, root, msgList, causeRow);
		// data[].column[]チェック
		List<Map<String, Map<String, Object>>> dataL = _fileInfo.getDataColumn();
		if (dataL != null) {
			for (Map<String, Map<String, Object>> columnL : dataL) {
				chkColumnL(columnL, DATA_KEY, root, msgList, causeRow);
			}
		}
		// trailer.column[]チェック
		chkColumnL(_fileInfo.getTrailerColumn(), TRAILER_KEY, root, msgList, causeRow);
		// end.column[]チェック
		chkColumnL(_fileInfo.getEndColumn(), END_KEY, root, msgList, causeRow);
		// headerとdata、data[i]とdate[j]のname重複チェック
		chkDuplicateName(_fileInfo.getSkipColumn(), dataL);
		
	}
	
	//////////////////////////////////
	// フォーマット情報の解析
	//////////////////////////////////
	protected void analyzeFormat() {
		if (_root == null) {
			return;
		}
		if (_fileInfo == null) {
			_fileInfo = createPFBZL_FixLenFileInfo();
		}
		_fileInfo.setup();
		
		// rootノード直下のノードを受信ファイルのレコードの読込順どおりに処理する
		String[] rootKeys = {SKIP_KEY, CONTROL_KEY, HEADER_KEY, DATA_KEY, TRAILER_KEY, END_KEY};
		
		for (String key : rootKeys) {
			if (!_root.containsKey(key)) {
				continue;
			}
			else if (SKIP_KEY.equals(key)) {
				analyzeSkip(_root.getNode(SKIP_KEY));
			}
			else if (CONTROL_KEY.equals(key)) {
				analyzeCtrl(_root.getNode(CONTROL_KEY));
			}
			else if (HEADER_KEY.equals(key)) {
				analyzeHeader(_root.getNode(HEADER_KEY));
			}
			else if (DATA_KEY.equals(key)) {
				analyzeData(_root.getNodeArray(DATA_KEY));
			}
			else if (TRAILER_KEY.equals(key)) {
				analyzeTrailer(_root.getNode(TRAILER_KEY));
			}
			else if (END_KEY.equals(key)) {
				analyzeEnd(_root.getNode(END_KEY));
			}

			chkColumnFmt();
		}
		
		analyzeExt();
	}
	
	/**
	 * controlレコードを解析して保持する
	 */
	protected void analyzeCtrl(MCNode ctrlNode) {
		
		Map<String, Object> ctrl = new HashMap<String, Object>();
		
		// control.nameの値(default:ctl)
		String name = "ctl";
		if (ctrlNode.containsKey(NAME_KEY)) {
			MCNode n = ctrlNode.getNode(NAME_KEY);
			name = n.getString();  // nameが存在すればその値を使う
		}
		ctrl.put(NAME_KEY, name);

		// control.columnの取り出し
		Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
		MCNode[] colL = ctrlNode.getNodeArray(COLUMN_KEY);

		String dataType = null;  // header等の項目の型(control.nameとcolumn.nameが一致するのdataType)
		boolean isNameFound = false;
		for (MCNode n : colL) {
			if (isSame(name, n.getNodeString(new String[] {NAME_KEY}))) {
				isNameFound = true;
				dataType = n.getNodeString(new String[] {DATATYPE_KEY});
			}
			Map<String, Object> col = n.toMap();
			// name属性の重複チェック
			String colName = (String)col.get(NAME_KEY);
			if (columnL.containsKey(colName)) {
				addMsg(PFBZL0081, joinKeyName(CONTROL_KEY, colName));
				return;
			}
			columnL.put(colName, col);
		}
		if (isNameFound == false) {
			addMsg(PFBZL0111, name);
		}
		else {
			if (!isSame(dataType, TYPE_STRING)) {
				addMsg(PFBZL0112, joinKeyName(CONTROL_KEY, name), DATATYPE_KEY);
			}
		}
		_fileInfo.setControlColumn(columnL);

		// header等の値は、java型に変換した状態で保持する
		
		if (ctrlNode.containsKey(HEADER_KEY)) {
			Object v = toJava(ctrlNode.getNode(HEADER_KEY), dataType, null);
			if (v == null) {
				addMsg(PFBZL0086, joinKeyName(CONTROL_KEY, HEADER_KEY), dataType);
			}
			ctrl.put(HEADER_KEY, v);
		}
		if (ctrlNode.containsKey(DATA_KEY)) {
			Object v = toJavaArray(ctrlNode.getNode(DATA_KEY), dataType, null);
			if (v == null) {
				addMsg(PFBZL0086, joinKeyName(CONTROL_KEY, DATA_KEY), dataType);
			}
			ctrl.put(DATA_KEY, v);
		}
		if (ctrlNode.containsKey(TRAILER_KEY)) {
			Object v = toJava(ctrlNode.getNode(TRAILER_KEY), dataType, null);
			if (v == null) {
				addMsg(PFBZL0086, joinKeyName(CONTROL_KEY, TRAILER_KEY), dataType);
			}
			ctrl.put(TRAILER_KEY, v);
		}
		if (ctrlNode.containsKey(END_KEY)) {	
			Object v = toJava(ctrlNode.getNode(END_KEY), dataType, null);
			if (v == null) {
				addMsg(PFBZL0086, joinKeyName(CONTROL_KEY, END_KEY), dataType);
			}
			ctrl.put(END_KEY, v);
		}
		
		_fileInfo.setControl(ctrl);
	}
	
	/**
	 * skipレコードを解析して保持する
	 */
	protected void analyzeSkip(MCNode skipNode) {
		// skip.columnの取り出し
		Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
		MCNode[] columnNode = skipNode.getNodeArray(COLUMN_KEY);
		for (MCNode n : columnNode) {
			Map<String, Object> col = n.toMap();
			// name属性の重複チェック
			String colName = (String)col.get(NAME_KEY);
			if (columnL.containsKey(colName)) {
				addMsg(PFBZL0081, joinKeyName(SKIP_KEY, colName));
				return;
			}
			columnL.put(colName, col);
		}
		_fileInfo.setSkipColumn(columnL);
	}
	
	/**
	 * headerレコードを解析して保持する
	 */
	protected void analyzeHeader(MCNode headerNode) {
		// header.keyの取り出し
		if (headerNode.containsKey("key")) {
			Comparable<?>[] keys = toJavaArray(headerNode.getNode("key"), TYPE_STRING, null);
			_fileInfo.setHeaderKey((String[])keys);
		}
		
		// header.columnの取り出し
		Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
		MCNode[] columnNode = headerNode.getNodeArray(COLUMN_KEY);
		for (MCNode n : columnNode) {
			Map<String, Object> col = n.toMap();
			// name属性の重複チェック
			String colName = (String)col.get(NAME_KEY);
			if (columnL.containsKey(colName)) {
				addMsg(PFBZL0081, joinKeyName(HEADER_KEY, colName));
				return;
			}
			columnL.put(colName, col);
		}
		_fileInfo.setHeaderColumn(columnL);
	}
	
	/**
	 * dataレコードを解析して保持する
	 */
	protected void analyzeData(MCNode[] dataNodes) {
		List<Map<String, Map<String, Object>>> dataL = new ArrayList<Map<String, Map<String, Object>>>();
		// data.columnの取り出し
		for (MCNode dataNode : dataNodes) {
			Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
			MCNode[] columnNode = dataNode.getNodeArray(COLUMN_KEY);
			for (MCNode n : columnNode) {
				Map<String, Object> col = n.toMap();
				// name属性の重複チェック
				String colName = (String)col.get(NAME_KEY);
				if (columnL.containsKey(colName)) {
					addMsg(PFBZL0081, joinKeyName(DATA_KEY, colName));
					return;
				}
				columnL.put(colName, col);
			}
			dataL.add(columnL);
		}
		
		_fileInfo.setDataColumn(dataL);
	}
	
	/**
	 * trailerレコードを解析して保持する
	 */
	protected void analyzeTrailer(MCNode trailerNode) {
		// trailer.columnの取り出し
		Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
		MCNode[] columnNode = trailerNode.getNodeArray(COLUMN_KEY);
		for (MCNode n : columnNode) {
			Map<String, Object> col = n.toMap();
			// name属性の重複チェック
			String colName = (String)col.get(NAME_KEY);
			if (columnL.containsKey(colName)) {
				addMsg(PFBZL0081, joinKeyName(TRAILER_KEY, colName));
				return;
			}
			columnL.put(colName, col);
		}
		_fileInfo.setTrailerColumn(columnL);

		// trailer.calcの取り出し
		if (trailerNode.containsKey("calc")) {
			Map<String, Map<String, Object>> calcL = new LinkedHashMap<String, Map<String, Object>>();
			MCNode[] calcNode = trailerNode.getNodeArray("calc");
			for (MCNode n : calcNode) {
				Map<String, Object> col = n.toMap();
				String colName = (String)col.get(NAME_KEY);
				if (calcL.containsKey(colName)) {
					addMsg(PFBZL0081, joinKeyName(TRAILER_KEY, "calc", colName));
					return;
				}
				calcL.put(colName, col);
			}
			_fileInfo.setTrailerCalc(calcL);
		}
	}
	
	/**
	 * endレコードを解析して保持する
	 */
	protected void analyzeEnd(MCNode endNode) {
		// end.columnの取り出し
		Map<String, Map<String, Object>> columnL = new LinkedHashMap<String, Map<String, Object>>();
		MCNode[] columnNode = endNode.getNodeArray(COLUMN_KEY);
		for (MCNode n : columnNode) {
			Map<String, Object> col = n.toMap();
			// name属性の重複チェック
			String colName = (String)col.get(NAME_KEY);
			if (columnL.containsKey(colName)) {
				addMsg(PFBZL0081, joinKeyName(END_KEY, colName));
				return;
			}
			columnL.put(colName, col);
		}
		_fileInfo.setEndColumn(columnL);

		// end.calcの取り出し
		if (endNode.containsKey("calc")) {
			Map<String, Map<String, Object>> calcL = new LinkedHashMap<String, Map<String, Object>>();
			MCNode[] calcNode = endNode.getNodeArray("calc");
			for (MCNode n : calcNode) {
				Map<String, Object> col = n.toMap();
				String colName = (String)col.get(NAME_KEY);
				if (calcL.containsKey(colName)) {
					addMsg(PFBZL0081, joinKeyName(END_KEY, "calc", colName));
					return;
				}
				calcL.put(colName, col);
			}
			_fileInfo.setEndCalc(calcL);
		}
	}
	
	/**
	 * 呼出元固有の情報を解析して保持する
	 */
	protected void analyzeExt() {
		if (isNull(_extPtn) || !_root.containsKey(_extPtn.split("\\."))) {
			return ;
		}
		Map<String, Object> extInfo = new HashMap<>();
		MCNode infoNode = _root.getNode(_extPtn.split("\\."));
		if (infoNode != null) {
			for (String key : _extKeyL) {
				if (infoNode.isString(key)) {
					extInfo.put(key, infoNode.getNodeString(new String[] {key}));
				}
				else if (infoNode.isNumber(key)) {
					extInfo.put(key, infoNode.getNodeNumber(key));
				}
				else if (infoNode.isBoolean(key)) {
					extInfo.put(key, infoNode.getNodeBoolean(key));
				}
				else if (infoNode.isStringArray(key)) {
					extInfo.put(key, infoNode.getNodeStringArray(new String[] {key}));
				}
				else if (infoNode.isNumberArray(key)) {
					extInfo.put(key, infoNode.getNodeNumberArray(key));
				}
				else if (infoNode.isBooleanArray(key)) {
					extInfo.put(key, infoNode.getNodeBooleanArray(key));
				}
			}
		}
		_fileInfo.setExtInfo(_extPtn, extInfo);
	}
	
	/**
	 * カラムレコードを読み込んだ際のエラーの有無を確認します。
	 */
	protected void chkColumnFmt() {
		Map<String, List<String>> errorMap = _fileInfo.getFmtError();
		if (errorMap.isEmpty()) {
			return;
		}
		
		// synonym参照エラー
		if (errorMap.containsKey(SYNONYM_ERROR_KEY)) {
			List<String> errorVal = errorMap.get(SYNONYM_ERROR_KEY);
			for (String val : errorVal) {
				addMsg(PFBZL0078, val);
			}
			
		}
		// mapping参照エラー
		if (errorMap.containsKey(MAPPGIN_ERROR_KEY)) {
			List<String> errorVal = errorMap.get(MAPPGIN_ERROR_KEY);
			for (String val : errorVal) {
				addMsg(PFBZL0079, val);
			}
		}
		// mapping型違いエラー
		if (errorMap.containsKey(MAPPGIN_TYPE_ERROR_KEY)) {
			List<String> errorVal = errorMap.get(MAPPGIN_TYPE_ERROR_KEY);
			for (String val : errorVal) {
				addMsg(PFBZL0080, val);
			}
		}
		// name重複エラー
		if (errorMap.containsKey(NAME_DUP_ERROR_KEY)) {
			List<String> errorVal = errorMap.get(NAME_DUP_ERROR_KEY);
			for (String val : errorVal) {
				addMsg(PFBZL0081, val);
			}
		}
		
		_fileInfo.clearFmtError();
	}
	
	/**
	 * カラムレコードの情報をチェックします。
	 * 
	 * @param columnL カラムレコード
	 * @param recordKey キー
	 * @param root ルートノード
	 * @param msgList msgList
	 * @param causeRow causeRow
	 */
	protected void chkColumnL(Map<String, Map<String, Object>> columnL, String recordKey, MCNode root, MCMessageList msgList, MCRow causeRow) {
		if (columnL == null) {
			return ;
		}
		
		for(Entry<String, Map<String, Object>> entry : columnL.entrySet()) {
			String colName = entry.getKey();
			Map<String, Object> column = entry.getValue();

			chkRequired(colName, column, recordKey);
			
			// データ型ごとのチェック
			String dataType = getString(column, DATATYPE_KEY);
			if (isStringType(column)) {
				chkStringAttr(column, getAttribute(column, COL_C_KEY), recordKey);
			}
			else if (isNumberType(column)) {
				chkNumberAttr(column, getAttribute(column, COL_N_KEY), recordKey);
			}
			else if (isDateType(column)) {
				Map<String, Object> attrMap = getAttribute(column, COL_D_KEY);
				chkDateTsAttr(column, attrMap, COL_D_KEY, recordKey);
			}
			else if (isTimestampType(column)) {
				Map<String, Object> attrMap = getAttribute(column, COL_TS_KEY);
				chkDateTsAttr(column, attrMap, COL_TS_KEY, recordKey);
			}
			else if (isBoolType(column)) {
				Map<String, Object> attrMap = getAttribute(column, COL_F_KEY);
				chkBooleanAttr(column, attrMap, recordKey);
			}
			
			// column.lengthのチェック
			if (getLength(column) < 0) {
				addMsg(PFBZL0085, joinKeyName(recordKey, colName, LENGTH_KEY), getLength(column));
			}
			
			// column.fixedValueの型チェック
			chkAndSetFixedValue(colName, column, dataType, recordKey);
			
			// column.optionのチェック
			chkOption(colName, column, dataType, recordKey);
			
			// column.option.edit.file/tableの型チェック
			chkAndSetOptionEditValue(colName, column, dataType, recordKey);
			
		}
		
		return ;
	}
	
	/**
	 * 条件付き必須チェック
	 * @param column カラム定義
	 * @param root ルートノード
	 * @param msgList メッセージリスト
	 * @param causeRow row
	 */
	protected void chkRequired(String colName, Map<String, Object> column, String recordKey) {
		
		// column.dataType
		if (!isSynonymColumn(column)) {
			if (isNull((String)column.get(DATATYPE_KEY))) {
				addMsg(PFBZL0084, joinKeyName(recordKey, colName, DATATYPE_KEY));
			}
		}
		else {
			if (!isNull((String)column.get(DATATYPE_KEY))) {
				addMsg(PFBZL0094, joinKeyName(recordKey, colName, DATATYPE_KEY));
			}
		}
		// column.length
		if (isDummyColumn(column) || _isRead && isSynonymColumn(column)) {
			if (getLength(column) != 0) {
				addMsg(PFBZL0094, joinKeyName(recordKey, colName, LENGTH_KEY));
			}
		}
		else {
			if (getLength(column) == 0) {
				addMsg(PFBZL0084, joinKeyName(recordKey, colName, LENGTH_KEY));
			}
		}
	}
	
	protected void chkAndSetFixedValue(String colName, Map<String, Object> column, String dataType, String recordKey) {
		String fixedValueType = getString(column, "fixedValueType");
		if (isSame(fixedValueType, FIX_TYPE_D_ROWS) || isSame(fixedValueType, FIX_TYPE_H_ROWS)) {
			if (!isNumberType(column) || isSame(recordKey, SKIP_KEY)) {
				addMsg(PFBZL0090, joinKeyName(recordKey, colName, "fixedValueType"), fixedValueType, joinKeyName(recordKey, colName, "dataType"), dataType);
			}
			else {
				if (isSame(fixedValueType, FIX_TYPE_D_ROWS)) {
					if (isSame(recordKey, HEADER_KEY) || isSame(recordKey, END_KEY)) {
						addMsg(PFBZL0090, joinKeyName(recordKey, colName, "fixedValueType"), fixedValueType, joinKeyName(recordKey, colName, "dataType"), dataType);
					}
				}
			}
		}
		
		if (getBoolean(column, "fixedValueCheckFlg") && isDummyColumn(column)) {
			addMsg(PFBZL0090, joinKeyName(recordKey, colName, "fixedValueCheckFlg"), true, joinKeyName(recordKey, colName, "dummyFlg"), true);
		}
		
		Object fixedValue = column.get("fixedValue");
		if (fixedValue == null) {
			return ;
		}
		
		String format = (String)column.get("fixedValueFormat");
		Comparable<?> ret = chkValueType(dataType, fixedValue, column, format);
		if (ret == null) {
			addMsg(PFBZL0086, joinKeyName(recordKey, colName, "fixedValue"), dataType);
		}
		else {
			// 型が一致場合は変換後の値で上書き
			column.put("fixedValue", ret);
		}
	}

	/**
	 * 引数valueがdataTypeが示すjava型と一致するか判定し、
	 * 一致する場合はjava型に変換して返します。
	 * <p>
	 * 下記の組み合わせ以外はnullが返ります。<br>
	 * dataType：C value:java.lang.String<br>
	 * dataType：N value:java.lang.Number<br>
	 * dataType：F value:java.lang.Boolean<br>
	 * dataType:DまたはTS value:java.lang.String、かつフォーマットが引数formatと一致する<br>
	 * <p>
	 * dataTypeまたはobjがnullの場合はnullが返ります。
	 * 
	 * @param dataType データ型
	 * @param value 判定対象のObject型
	 * @param column カラム定義
	 * @param format date/timestampのフォーマット文字列
	 * @return 一致する場合変換後の値
	 */
	protected Comparable<?> chkValueType(String dataType, Object value, Map<String, Object> column, String format) {
		if (isNull(dataType) || value == null) {
			return null;
		}
		
		if (TYPE_STRING.equals(dataType) && value instanceof String) {
			return (String)value;
		}
		
		if (TYPE_NUMBER.equals(dataType) && isNumber(value)) {
			return getNumber(value);
		}

		if (TYPE_DATE.equals(dataType)) {
			if (value instanceof String && !isNull(format)) {
				try {
					return MCDate.valueOf((String)value, format);
				}
				catch (MCException e) {
				}
			}
		}
		
		if (TYPE_TIMESTAMP.equals(dataType)) {
			if (value instanceof String && !isNull(format)) {
				try {
					return MCTimestamp.valueOf((String)value, format);
				}
				catch (MCException e) {
				}
			}
		}
		
		if (TYPE_BOOL.equals(dataType) && value instanceof Boolean) {
			return (Boolean)value;
		}

		return null;
	}
	
	protected void chkOption(String colName, Map<String, Object> column, String dataType, String recordKey) {
		if (column.get(COL_OP_KEY) == null) {
			return;
		}
		
		Map<String, Object> op = PFBZL_FixLenFileInfo.getAttribute(column, COL_OP_KEY);
		if (op.containsKey(COL_SEQ_KEY)) {
			if (isDummyColumn(column) && isStringType(column)) {
				Map<String, Object> seq = PFBZL_FixLenFileInfo.getAttribute(op, COL_SEQ_KEY);
				if (seq != null && getLength(seq) < 1) {
					addMsg(PFBZL0084, joinKeyName(recordKey, colName, COL_OP_KEY, COL_SEQ_KEY, LENGTH_KEY));
				}
			}
		}
	}
	
	protected void chkAndSetOptionEditValue(String colName, Map<String, Object> column, String dataType, String recordKey) {
		Map<String, Object>[] edit = getOptionAttrArray(column, COL_EDIT_KEY);
		if (edit == null) {
			return ;
		}
		for (Map<String, Object> editElm : edit) {
			String editformat = (String)editElm.get(COL_FORMAT_KEY);
			Object value = editElm.get("file");
			if (value != null) {
				Comparable<?> ret = chkValueType(dataType, value, column, editformat);
				if (ret == null) {
					addMsg(PFBZL0086, joinKeyName(recordKey, colName, COL_OP_KEY, COL_EDIT_KEY, "file"), dataType);
				}
				else {
					// 型が一致場合は変換後の値で上書き
					editElm.put("file", ret);
				}
			}
			
			value = editElm.get("table");
			if (value != null) {
				Comparable<?> ret = chkValueType(dataType, value, column, editformat);
				if (ret == null) {
					addMsg(PFBZL0086, joinKeyName(recordKey, colName, COL_OP_KEY, COL_EDIT_KEY, "table"), dataType);
				}
				else {
					// 型が一致場合は変換後の値で上書き
					editElm.put("table", ret);
				}
			}
		}
	}
	
	protected void chkCtrl(MCNode root, MCMessageList msgList, MCRow causeRow) {
		Map<String, Object> ctrl = _fileInfo.getControl();
		if (ctrl == null) {
			return;
		}
		
		// control.header/data/trailer/endの値が重複していないかチェック
		// 型は格納時に変換済み。型の判定は必須のheaderで行う
		Object head = ctrl.get(HEADER_KEY);
		if (head instanceof String) {
			HashSet<String> set = new HashSet<String>();
			set.add((String)head);
			if (ctrl.containsKey(DATA_KEY)) {
				String[] data = (String[])ctrl.get(DATA_KEY);
				for (String d : data) {
					if (!set.add(d)) {
						addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, DATA_KEY));
						break;
					}
				}
			}
			if (ctrl.containsKey(TRAILER_KEY)) {
				if (!set.add((String)ctrl.get(TRAILER_KEY))) {
					addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, TRAILER_KEY));
				}
			}
			if (ctrl.containsKey(END_KEY)) {
				if (!set.add((String)ctrl.get(END_KEY))) {
					addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, END_KEY));
				}
			}
		}
		else if (head instanceof MCNumber) {
			HashSet<MCNumber> set = new HashSet<MCNumber>();
			set.add((MCNumber)head);
			if (ctrl.containsKey(DATA_KEY)) {
				MCNumber[] data = (MCNumber[])ctrl.get(DATA_KEY);
				for (MCNumber d : data) {
					if (!set.add(d)) {
						addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, DATA_KEY));
						break;
					}
				}
			}
			if (ctrl.containsKey(TRAILER_KEY)) {
				if (!set.add((MCNumber)ctrl.get(TRAILER_KEY))) {
					addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, TRAILER_KEY));
				}
			}
			if (ctrl.containsKey(END_KEY)) {
				if (!set.add((MCNumber)ctrl.get(END_KEY))) {
					addMsg(PFBZL0082, joinKeyName(CONTROL_KEY, END_KEY));
				}
			}
		}
		
		// controlの制御項目とレコード数が一致するか
		if ((_fileInfo.hasData() && !ctrl.containsKey(DATA_KEY)) ||
			(!_fileInfo.hasData() && ctrl.containsKey(DATA_KEY))) {
			addMsg(PFBZL0093, joinKeyName(CONTROL_KEY, DATA_KEY));
		}
		else if (_fileInfo.hasData()) {
			int d1 = _fileInfo.getDataColumn().size();
			int d2 = ((Object[])ctrl.get(DATA_KEY)).length;
			if (d1 != d2) {
				addMsg(PFBZL0093, joinKeyName(CONTROL_KEY, DATA_KEY));
			}
		}
		
		if ((_fileInfo.hasTrailer() && !ctrl.containsKey(TRAILER_KEY)) ||
			(!_fileInfo.hasTrailer() && ctrl.containsKey(TRAILER_KEY))){
			addMsg(PFBZL0093, joinKeyName(CONTROL_KEY, TRAILER_KEY));
		}
		
		if ((_fileInfo.hasEnd() && !ctrl.containsKey(END_KEY)) ||
			(!_fileInfo.hasEnd() && ctrl.containsKey(END_KEY))){
			addMsg(PFBZL0093, joinKeyName(CONTROL_KEY, END_KEY));
		}
	}
	
	protected void chkDuplicateName(Map<String,Map<String,Object>> hColL, List<Map<String,Map<String,Object>>> dColLs) {
		if (hColL == null || hColL.isEmpty() || dColLs == null || dColLs.isEmpty()) {
			return ;
		}
		
		List<String> ctrlNames = _fileInfo.getControlColNames();
		List<String> dupNameL = new ArrayList<>();
		
		// header vs data
		for (String hName : hColL.keySet()) {
			if (ctrlNames.contains(hName) || _fileInfo.isReturnColumn(hName)) {
				continue;
			}
			for (int i = 0; i < dColLs.size(); i++) {
				Map<String,Map<String,Object>> dColL = dColLs.get(i);
				if (dColL.containsKey(hName) && !dupNameL.contains(hName)) {
					addMsg(PFBZL0081, joinKeyName(HEADER_KEY, hName));
					dupNameL.add(hName);
				}
			}
		}
		
		// data[i] vs data[j]
		int dsize = dColLs.size();
		if (dsize > 1) {
			for (int i = 0; i < dsize -1; i++) {
				Map<String,Map<String,Object>> dColLi = dColLs.get(i);
				for (String dname : dColLi.keySet()) {
					if (ctrlNames.contains(dname) || _fileInfo.isReturnColumn(dname)) {
						continue;
					}
					for (int j = i + 1; j < dsize; j++) {
						Map<String,Map<String,Object>> dColLj = dColLs.get(j);
						Map<String,Object> dColj = dColLj.get(dname);
						if (dColj != null) {
							Map<String,Object> dColi = dColLi.get(dname);
							if (getBoolean(dColi, "dupNameAllowFlg") && getBoolean(dColj, "dupNameAllowFlg")) {
								continue;
							}
							if (!dupNameL.contains(dname)) {
								addMsg(PFBZL0081, joinKeyName(DATA_KEY, dname));
								dupNameL.add(dname);
							}
						}
					}
				}
			}
		}
	}
	
}