package mcframe.serverPFBZ.PFBZL9060;

import mcframe.commonCore.io.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.serverPFUD.PFUDL0050.PFUDL_AbstFmt;
import mcframe.serverPFUD.PFUDL0050.PFUDL_KeyInfo;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

abstract public class PFBZL_CSVFmt_MC extends PFUDL_AbstFmt {

	//////////////////////////////////
	// フォーマット情報の生成、整合性チェック
	//////////////////////////////////
	@Override
	protected void createFmt() {
		
		createKeyInfo("header").dataType(PFUDL_KeyInfo.DATA_TYP_STRs).isNotNull(true).isTrim(true).isArrayNotNull(true).isArrayNotDupVal(true);
		createKeyInfo("headers").dataType(PFUDL_KeyInfo.DATA_TYP_OBJ).isNotNull(true);
		createKeyInfo("headers", anyKey()).dataType(PFUDL_KeyInfo.DATA_TYP_STRs).isNotNull(true).isTrim(true).isArrayNotNull(true).isArrayNotDupVal(true);

	}

	@Override
	protected void checkFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		super.checkFmtSub(root, msgList, causeRow);
		addMsg(checkAtLeastOneKey(root, "header", "headers"));
	}
	
	
	//////////////////////////////////
	// フォーマット情報の利用
	//////////////////////////////////
	/**
	 * ファイルの見出し行の項目の配列を取得する。未定義の場合、nullを返す。
	 * @param bType ブロック種別
	 */
	public String[] getHeader(String bType) {
		if (_root == null) {
			return null;
		}
		
		String key = null;
		if (!isNull(bType)) {
			key = createKey("headers", bType);
			if (_root.containsKey(key)) {
				return _root.getNodeStringArray(key);
			}
		}
		
		key = createKey("header");
		if (_root.containsKey(key)) {
			return _root.getNodeStringArray(key);
		}
		
		return null;
	}
	
}