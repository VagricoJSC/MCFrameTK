package mcframe.serverPFBZ.PFBZL9070;

import mcframe.commonCore.io.*;
import mcframe.commonCore.notice.*;
import mcframe.serverPFUD.PFUDL0050.PFUDL_KeyInfo;
import mcframe.commonCore.container.*;

import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;

/**
 * 共通の固定長ファイルフォーマットの情報を読み込むクラスです。
 *
 */
abstract public class PFBZL_FixLenFileDefaultFmt_MC extends PFBZL_AbstFixLenFileFmt {

	//////////////////////////////////
	// フォーマット情報の生成、整合性チェック
	//////////////////////////////////
	@Override
	protected void createFmt() {
		createKeyInfo("default").isReq(true).dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
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

	@Override
	protected void checkFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		super.checkFmtSub(root, msgList, causeRow);
	}
}
