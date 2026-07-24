package mcframe.clientMABC.MABCP0810;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;

import mcframe.clientCore.container.MCRowEvent;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.NumPtnCols;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.ElmTypCols;
import javax.swing.Timer;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_NumPtnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_NumPtnReg_MC extends MABCP_NumPtnReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	MCScrollPane _dtlSubPanelS;
	MABCP_DivPropChangeListener _lcltabDivPropChangeListener;
	Timer _lcltabSelector = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_NumPtnReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_NumPtnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0810_Srch01();
	}
	/**
	 * [MA_MABCL0810_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Srch01Caller<P extends MABCP_NumPtnReg, B extends MA_MABCL0810_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0810_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRowR());
		}
		
		@Override
		protected boolean isDownBlockChanged() {
			
			if(panel.isDtlChanged()){
				return true;
			}
			return super.isDownBlockChanged();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void show() {
			super.show();

			for (DtlR r : getDtlL()) {
				setNumImg(r);
			}
		}
	}

	@Override
	public boolean isChanged() {
		
		if(isDtlChanged()){
			return true;
		}
		return super.isChanged();
	}
	
	protected boolean isDtlChanged(){
		return UPD == getStatus() && !getDtlL().isStatusNone();	
	}

	/**
	 * [MA_MABCL0810_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Upd01Caller<P extends MABCP_NumPtnReg, B extends MA_MABCL0810_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0810_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getRowR()));
		}
		
	}

	/**
	 * [MA_MABCL0810_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Del01Caller<P extends MABCP_NumPtnReg, B extends MA_MABCL0810_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0810_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MABCP0800]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0800(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0800");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0800CndR(aso));
		aso.show();
	}
	
	/**
	 * 遷移先[MABCP0800]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0800.CndR crtOpenMABCP0800CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0800.CndR to = mcframe.clientMABC.MABCP0800.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.num_biz_typ(r.num_biz_typ());
			to.num_ptn_cd(r.num_ptn_cd());
			if (!isNull(to.num_biz_typ())) {
				aso.putSearchAction();
			}
		}
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
		getRowR().num_ptn_nm_lcl(null);
		setRowMode();
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0810_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0810_Del01();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		for(MCRowBeans b:getRowColMap().keySet()){
			((MCNCBeans)b).addNCListener(this);
		}
		Cnd_num_biz_typ.addNCListener(this);
	}

	@Override
	protected void listInit() {
		super.listInit();
		getCnd_num_ptn_cd_ListPutter().putBind(NumPtnCols.$i_num_biz_typ, Cnd_num_biz_typ);
	}

	/**
	 * 行コピー時にカウントアップしたDtl行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = row;
		if (isExistsTable(getDtlL())) {
			dest = getRLUtil().defCopyRowSub(row);
		}
		else {
			updColToNull(row);
		}
		if (dest != null && getLclL().contains(dest)) {
			getLclRdelBtn().setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			MCNumber no = getCntDtlRowNo();
			setDtlRowNo(row, no);
			getDtlRdelBtn().setMode(this, getStatus());
			getLclTable().clear();
			getLclTable().fillSpace();
			getLclTable().adjustWidth();
		}
		return dest;
	}

	public void doRow_num_biz_typ_NC(MCEventInfo info){
		super.doRow_num_biz_typ_NC(info);
		
		if (!isNull(getRowR().num_biz_typ())) {
			MAC_NUM_BIZ_TYP bizTyp = MAC_NUM_BIZ_TYP.get(getRowR().num_biz_typ());

			setValueEx(Row_max_digit, bizTyp.length());

			if(!bizTyp.is_using_ptn_cd()){
				setValueEx(Row_num_ptn_cd, MAC_STR.DEF_NUM_PTN_CD.value());
				Row_num_ptn_cd.setMode(MCMode.READ_ONLY);
				Row_num_ptn_nm.setMode(MCMode.ENABLE);
			}
			else {
				Row_num_ptn_cd.setMode(MCMode.REQUIRED);
				Row_num_ptn_nm.setMode(MCMode.REQUIRED);
			}
		}
		for (MCModeBeans b: getEmpTypModeBeans()) {
			setValueEx((MCRowBeans)b, null);
		}
	}
	
	@Override
	public void doRow_elm_typ1_LC(MCEventInfo info) {
		super.doRow_elm_typ1_LC(info);

		String elmV = getRowR().elm_typ1();
		setBeansWithElmTyp(elmV, Row_elm_dgt1, Row_fix1, Row_num_pad_str1);
		setUndispFlg(elmV, Row_undisp_flg1, 1);
		setClearElmTyp(elmV, Row_elm_typ2);
	}

	@Override
	public void doRow_elm_typ2_LC(MCEventInfo info) {
		super.doRow_elm_typ2_LC(info);

		String elmV = getRowR().elm_typ2();
		setBeansWithElmTyp(elmV, Row_elm_dgt2, Row_fix2, Row_num_pad_str2);
		setUndispFlg(elmV, Row_undisp_flg2, 2);
		setClearElmTyp(elmV, Row_elm_typ3);
	}

	@Override
	public void doRow_elm_typ3_LC(MCEventInfo info) {
		super.doRow_elm_typ3_LC(info);

		String elmV = getRowR().elm_typ3();
		setBeansWithElmTyp(elmV, Row_elm_dgt3, Row_fix3, Row_num_pad_str3);
		setUndispFlg(elmV, Row_undisp_flg3, 3);
		setClearElmTyp(elmV, Row_elm_typ4);
	}

	@Override
	public void doRow_elm_typ4_LC(MCEventInfo info) {
		super.doRow_elm_typ4_LC(info);

		String elmV = getRowR().elm_typ4();
		setBeansWithElmTyp(elmV, Row_elm_dgt4, Row_fix4, Row_num_pad_str4);
		setUndispFlg(elmV, Row_undisp_flg4, 4);
		setClearElmTyp(elmV, Row_elm_typ5);
	}

	@Override
	public void doRow_elm_typ5_LC(MCEventInfo info) {
		super.doRow_elm_typ5_LC(info);

		String elmV = getRowR().elm_typ5();
		setBeansWithElmTyp(elmV, Row_elm_dgt5, Row_fix5, Row_num_pad_str5);
		setUndispFlg(elmV, Row_undisp_flg5, 5);
		setClearElmTyp(elmV, Row_elm_typ6);
	}

	@Override
	public void doRow_elm_typ6_LC(MCEventInfo info) {
		super.doRow_elm_typ6_LC(info);

		String elmV = getRowR().elm_typ6();
		setBeansWithElmTyp(elmV, Row_elm_dgt6, Row_fix6, Row_num_pad_str6);
		setUndispFlg(elmV, Row_undisp_flg6, 6);
		setClearElmTyp(elmV, Row_elm_typ7);
	}

	@Override
	public void doRow_elm_typ7_LC(MCEventInfo info) {
		super.doRow_elm_typ7_LC(info);

		String elmV = getRowR().elm_typ7();
		setBeansWithElmTyp(elmV, Row_elm_dgt7, Row_fix7, Row_num_pad_str7);
		setUndispFlg(elmV, Row_undisp_flg7, 7);
		setClearElmTyp(elmV, Row_elm_typ8);
	}

	@Override
	public void doRow_elm_typ8_LC(MCEventInfo info) {
		super.doRow_elm_typ8_LC(info);

		String elmV = getRowR().elm_typ8();
		setBeansWithElmTyp(elmV, Row_elm_dgt8, Row_fix8, Row_num_pad_str8);
		setUndispFlg(elmV, Row_undisp_flg8, 8);
		setClearElmTyp(elmV, Row_elm_typ9);
	}

	@Override
	public void doRow_elm_typ9_LC(MCEventInfo info) {
		super.doRow_elm_typ9_LC(info);

		String elmV = getRowR().elm_typ9();
		setBeansWithElmTyp(elmV, Row_elm_dgt9, Row_fix9, Row_num_pad_str9);
		setUndispFlg(elmV, Row_undisp_flg9, 9);
		setClearElmTyp(elmV, Row_elm_typ10);
	}

	@Override
	public void doRow_elm_typ10_LC(MCEventInfo info) {
		super.doRow_elm_typ10_LC(info);

		String elmV = getRowR().elm_typ10();
		setBeansWithElmTyp(elmV, Row_elm_dgt10, Row_fix10, Row_num_pad_str10);
		setUndispFlg(elmV, Row_undisp_flg10, 10);
	}

	@Override
	public void doRow_key_dgt_LC(MCEventInfo info) {
		super.doRow_key_dgt_LC(info);
		if(!isNull(getRowR().key_dgt())){
			setUndispFlg(getRowR().elm_typ1(), Row_undisp_flg1, 1);
			setUndispFlg(getRowR().elm_typ2(), Row_undisp_flg2, 2);
			setUndispFlg(getRowR().elm_typ3(), Row_undisp_flg3, 3);
			setUndispFlg(getRowR().elm_typ4(), Row_undisp_flg4, 4);
			setUndispFlg(getRowR().elm_typ5(), Row_undisp_flg5, 5);
			setUndispFlg(getRowR().elm_typ6(), Row_undisp_flg6, 6);
			setUndispFlg(getRowR().elm_typ7(), Row_undisp_flg7, 7);
			setUndispFlg(getRowR().elm_typ8(), Row_undisp_flg8, 8);
			setUndispFlg(getRowR().elm_typ9(), Row_undisp_flg9, 9);
			setUndispFlg(getRowR().elm_typ10(), Row_undisp_flg10, 10);
		}
	}
	
	protected void setClearElmTyp(String beforeElmTyp, MCRowBeans nextElmTyp){
		if(!isNull(beforeElmTyp)){
			setDefaultMode((MCModeBeans)nextElmTyp);
		}
		else {
			((MCModeBeans)nextElmTyp).setMode(MCMode.READ_ONLY);
			setValueEx(nextElmTyp,null);
		}
	}
	/**要素区分に応じたの入力制御を行います。*/
	protected void setBeansWithElmTyp(String elmValue, MCRowBeans elmDgt, MCRowBeans fix, MCRowBeans num_pad_str){

		setDefaultMode((MCModeBeans)elmDgt);
		setDefaultMode((MCModeBeans)fix);
		setDefaultMode((MCModeBeans)num_pad_str);

		MAC_ELM_TYP et = MAC_ELM_TYP.getNE(elmValue);
		if(et == null){
			((MCModeBeans)elmDgt).setMode(MCMode.READ_ONLY);
			setValueEx(elmDgt,null);
			((MCModeBeans)fix).setMode(MCMode.READ_ONLY);
			setValueEx(fix,null);
			((MCModeBeans)num_pad_str).setMode(MCMode.READ_ONLY);
			setValueEx(num_pad_str,null);
		}
		else{
			// elm_dgt,num_pad_strの制御
			if (!MAC_DGT_TYP.isELM_DGT(et.dgt_typ())) {
				((MCModeBeans)elmDgt).setMode(MCMode.READ_ONLY);
				setValueEx(elmDgt,null);
				((MCModeBeans)num_pad_str).setMode(MCMode.READ_ONLY);
				setValueEx(num_pad_str,null);
			}
			else {
				if (MAC_ELM_TYP.isNUM(elmValue) || MAC_ELM_TYP.isSEQ(elmValue)) {
					((MCModeBeans)num_pad_str).setMode(MCMode.READ_ONLY);
					setValueEx(num_pad_str,null);
				}
			}
			// fixの制御
			if (!MAC_DGT_TYP.isCHAR_CNT(et.dgt_typ())) {
				((MCModeBeans)fix).setMode(MCMode.READ_ONLY);
				setValueEx(fix,null);
			}
		}
	}

	/**
	 * 非表示の設定を行います。
	 */
	protected void setUndispFlg(String elmTyp, MCRowBeans undispFlg, int elmNumber){
		MCNumber keyDigit = getKeyDigit();
		
		if(isNull(elmTyp) || keyDigit.lte(getBeforeSumDigit(elmNumber))){
			setValueEx(undispFlg, false);
			((MCModeBeans)undispFlg).setMode(MCMode.READ_ONLY);
		}
		else{
			setDefaultMode((MCModeBeans)undispFlg);
			
		}
	}

	/**
	 * 一つ前要素までの合計桁数を返します。
	 * @return 桁数の合計
	 */
	protected MCNumber getBeforeSumDigit(int elmNumber){
		if(elmNumber == 1){
			return MCNumber.ZERO;
		}

		MCNumber sum = MCNumber.ZERO;
		for(int i = 1 ; i < elmNumber ; i++){
			// 要素区分
			StringBuilder sbElm = new StringBuilder();
			sbElm.append("elm_typ");
			sbElm.append(i);
			String columnElm = sbElm.toString();
			// 桁数
			StringBuilder sbDgt = new StringBuilder();
			sbDgt.append("elm_dgt");
			sbDgt.append(i);
			String columnDgt = sbDgt.toString();
			// 固定値
			StringBuilder sbFix = new StringBuilder();
			sbFix.append("fix");
			sbFix.append(i);
			String columnFix = sbFix.toString();
			
			String elmValue = getRowR().getString(columnElm);
			MCNumber dgtValue = getRowR().getNumber(columnDgt);
			String fixValue = getRowR().getString(columnFix);
			
			sum = sum.add(getDigit(elmValue, dgtValue, fixValue));
		}
		return sum;
	}	

	/**
	 * elm_typeに対応する桁数を返します。<p>
	 * 定数グループ発番パタン (MUN_PTN)のdigit_typeに対応した
	 * 処理方法で桁数を取得し、対応する処理方法が無い場合、0 を返します。<p>
	 * 
	 * @return 桁数
	 */
	public MCNumber getDigit(String elmTypValue, MCNumber dgt, String fixS) {

		final MCNumber noMatchValue = MCNumber.ZERO;

		/*
		 * elm_typがnullの場合 0を返す。
		 */
		if (elmTypValue == null){
			return noMatchValue;
		}
		
		MAC_ELM_TYP ptn = MAC_ELM_TYP.get(elmTypValue);

		/*
		 * 固定桁指定のelm_typであれば、 MAC_ELM_TYPに設定された桁を返す。 例（YYYYだと4を返す）
		 */
		if (MAC_DGT_TYP.isFIX_DGT(ptn.dgt_typ())) {
			return ptn.fix_dgt();
		}
		/*
		 * elm_digit指定のelm_typであれば、 elm_digitを返す。
		 */
		else if (MAC_DGT_TYP.isELM_DGT(ptn.dgt_typ())) {
			
			if (!isNull(dgt)) {
				return dgt;
			}
			else {
				return noMatchValue;
			}
		}
		/*
		 * 文字数桁のelm_typであれば、 文字数を返す。 例(FIXでAAAだと3を返す）
		 */
		else if (MAC_DGT_TYP.isCHAR_CNT(ptn.dgt_typ())) {

			if (!isNull(fixS)) {
				return new MCNumber(fixS.length());
			}
			else {
				return noMatchValue;
			}
		}
		/*
		 * それ以外は、0を返す。
		 */
		else {
			return noMatchValue;
		}
	}

	/**
	 * キー項目桁数を返します。<p>
	 * キー項目桁数フィールドの値がnullの場合はMCNumber.ZEROを返します。
	 * @return MCNumber
	 */
	protected MCNumber getKeyDigit(){
		MCNumber n = getRowR().key_dgt();
		if(isNull(n)){
			return MCNumber.ZERO;
		}
		return n;
	}

	@Override
	public void doRow_elm_typ1_NC(MCEventInfo info) {
		super.doRow_elm_typ1_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ2_NC(MCEventInfo info) {
		super.doRow_elm_typ2_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ3_NC(MCEventInfo info) {
		super.doRow_elm_typ3_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ4_NC(MCEventInfo info) {
		super.doRow_elm_typ4_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ5_NC(MCEventInfo info) {
		super.doRow_elm_typ5_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ6_NC(MCEventInfo info) {
		super.doRow_elm_typ6_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ7_NC(MCEventInfo info) {
		super.doRow_elm_typ7_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ8_NC(MCEventInfo info) {
		super.doRow_elm_typ8_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ9_NC(MCEventInfo info) {
		super.doRow_elm_typ9_NC(info);
		setElmTypMode(info);
	}
	@Override
	public void doRow_elm_typ10_NC(MCEventInfo info) {
		super.doRow_elm_typ10_NC(info);
		setElmTypMode(info);
	}
	public void setElmTypMode(MCEventInfo info){
		
		String nv = (String)info.getNewValue();
		String ov = (String)info.getOldValue();
		
		if(MAC_ELM_TYP.isSEQ(nv)){	
			setDefaultMode(Row_def_seq_typ);
		}
		else if(MAC_ELM_TYP.isSEQ(ov)){
			Row_def_seq_typ.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * Rowの値をDtlに移す処理を行います。
	 * @param compo 
	 * @param info
	 */
	public void doRow_rowBeans_NC(MCNCBeans compo, MCEventInfo info) {
		Map<MCRowBeans, MCColumnConfig> m = getRowColMap();
		if (m.containsKey(compo)) {
			
			int i = DtlTable.getMCSelectedRow();
			
			if(i != -1 ){
				MCColumnConfig c = m.get(compo);
				setValueEx(c, i, info.getNewValue());

				setNumImg(getRowR());
				setValueEx(columnDtl_num_img, i, getRowR().num_img());
			}
		}
	}
	
	protected Map<MCRowBeans, MCColumnConfig> _RowColBeansMap;
	
	/**
	 * RowブロックのMCRowBeansとDtlブロックのMCColumnConfigの関係マップを返します。<p>
	 * @return
	 */
	protected Map<MCRowBeans, MCColumnConfig> getRowColMap(){
		if(_RowColBeansMap == null){
			_RowColBeansMap = new HashMap<MCRowBeans, MCColumnConfig>();
			_RowColBeansMap.put(Row_del_flg,columnDtl_del_flg);
			_RowColBeansMap.put(Row_num_biz_typ,columnDtl_num_biz_typ);
			_RowColBeansMap.put(Row_num_biz_typ_nm,columnDtl_num_biz_typ_nm);
			_RowColBeansMap.put(Row_max_digit,columnDtl_max_digit);
			_RowColBeansMap.put(Row_num_ptn_cd,columnDtl_num_ptn_cd);
			_RowColBeansMap.put(Row_num_ptn_nm,columnDtl_num_ptn_nm);
			_RowColBeansMap.put(Row_num_ptn_nm_lcl,columnDtl_num_ptn_nm_lcl);
			_RowColBeansMap.put(Row_elm_typ1,columnDtl_elm_typ1);
			_RowColBeansMap.put(Row_elm_typ_nm1,columnDtl_elm_typ_nm1);
			_RowColBeansMap.put(Row_elm_dgt1,columnDtl_elm_dgt1);
			_RowColBeansMap.put(Row_fix1,columnDtl_fix1);
			_RowColBeansMap.put(Row_undisp_flg1,columnDtl_undisp_flg1);
			_RowColBeansMap.put(Row_num_pad_str1,columnDtl_num_pad_str1);
			_RowColBeansMap.put(Row_elm_typ2,columnDtl_elm_typ2);
			_RowColBeansMap.put(Row_elm_typ_nm2,columnDtl_elm_typ_nm2);
			_RowColBeansMap.put(Row_elm_dgt2,columnDtl_elm_dgt2);
			_RowColBeansMap.put(Row_fix2,columnDtl_fix2);
			_RowColBeansMap.put(Row_undisp_flg2,columnDtl_undisp_flg2);
			_RowColBeansMap.put(Row_num_pad_str2,columnDtl_num_pad_str2);
			_RowColBeansMap.put(Row_elm_typ3,columnDtl_elm_typ3);
			_RowColBeansMap.put(Row_elm_typ_nm3,columnDtl_elm_typ_nm3);
			_RowColBeansMap.put(Row_elm_dgt3,columnDtl_elm_dgt3);
			_RowColBeansMap.put(Row_fix3,columnDtl_fix3);
			_RowColBeansMap.put(Row_undisp_flg3,columnDtl_undisp_flg3);
			_RowColBeansMap.put(Row_num_pad_str3,columnDtl_num_pad_str3);
			_RowColBeansMap.put(Row_elm_typ4,columnDtl_elm_typ4);
			_RowColBeansMap.put(Row_elm_typ_nm4,columnDtl_elm_typ_nm4);
			_RowColBeansMap.put(Row_elm_dgt4,columnDtl_elm_dgt4);
			_RowColBeansMap.put(Row_fix4,columnDtl_fix4);
			_RowColBeansMap.put(Row_undisp_flg4,columnDtl_undisp_flg4);
			_RowColBeansMap.put(Row_num_pad_str4,columnDtl_num_pad_str4);
			_RowColBeansMap.put(Row_elm_typ5,columnDtl_elm_typ5);
			_RowColBeansMap.put(Row_elm_typ_nm5,columnDtl_elm_typ_nm5);
			_RowColBeansMap.put(Row_elm_dgt5,columnDtl_elm_dgt5);
			_RowColBeansMap.put(Row_fix5,columnDtl_fix5);
			_RowColBeansMap.put(Row_undisp_flg5,columnDtl_undisp_flg5);
			_RowColBeansMap.put(Row_num_pad_str5,columnDtl_num_pad_str5);
			_RowColBeansMap.put(Row_elm_typ6,columnDtl_elm_typ6);
			_RowColBeansMap.put(Row_elm_typ_nm6,columnDtl_elm_typ_nm6);
			_RowColBeansMap.put(Row_elm_dgt6,columnDtl_elm_dgt6);
			_RowColBeansMap.put(Row_fix6,columnDtl_fix6);
			_RowColBeansMap.put(Row_undisp_flg6,columnDtl_undisp_flg6);
			_RowColBeansMap.put(Row_num_pad_str6,columnDtl_num_pad_str6);
			_RowColBeansMap.put(Row_elm_typ7,columnDtl_elm_typ7);
			_RowColBeansMap.put(Row_elm_typ_nm7,columnDtl_elm_typ_nm7);
			_RowColBeansMap.put(Row_elm_dgt7,columnDtl_elm_dgt7);
			_RowColBeansMap.put(Row_fix7,columnDtl_fix7);
			_RowColBeansMap.put(Row_undisp_flg7,columnDtl_undisp_flg7);
			_RowColBeansMap.put(Row_num_pad_str7,columnDtl_num_pad_str7);
			_RowColBeansMap.put(Row_elm_typ8,columnDtl_elm_typ8);
			_RowColBeansMap.put(Row_elm_typ_nm8,columnDtl_elm_typ_nm8);
			_RowColBeansMap.put(Row_elm_dgt8,columnDtl_elm_dgt8);
			_RowColBeansMap.put(Row_fix8,columnDtl_fix8);
			_RowColBeansMap.put(Row_undisp_flg8,columnDtl_undisp_flg8);
			_RowColBeansMap.put(Row_num_pad_str8,columnDtl_num_pad_str8);
			_RowColBeansMap.put(Row_elm_typ9,columnDtl_elm_typ9);
			_RowColBeansMap.put(Row_elm_typ_nm9,columnDtl_elm_typ_nm9);
			_RowColBeansMap.put(Row_elm_dgt9,columnDtl_elm_dgt9);
			_RowColBeansMap.put(Row_fix9,columnDtl_fix9);
			_RowColBeansMap.put(Row_undisp_flg9,columnDtl_undisp_flg9);
			_RowColBeansMap.put(Row_num_pad_str9,columnDtl_num_pad_str9);
			_RowColBeansMap.put(Row_elm_typ10,columnDtl_elm_typ10);
			_RowColBeansMap.put(Row_elm_typ_nm10,columnDtl_elm_typ_nm10);
			_RowColBeansMap.put(Row_elm_dgt10,columnDtl_elm_dgt10);
			_RowColBeansMap.put(Row_fix10,columnDtl_fix10);
			_RowColBeansMap.put(Row_undisp_flg10,columnDtl_undisp_flg10);
			_RowColBeansMap.put(Row_num_pad_str10,columnDtl_num_pad_str10);
			_RowColBeansMap.put(Row_key_dgt,columnDtl_key_dgt);
			_RowColBeansMap.put(Row_def_seq_typ,columnDtl_def_seq_typ);
			_RowColBeansMap.put(Row_def_seq_typ_nm,columnDtl_def_seq_typ_nm);
			_RowColBeansMap.put(Row_memo1,columnDtl_memo1);
			_RowColBeansMap.put(Row_memo2,columnDtl_memo2);
			_RowColBeansMap.put(Row_memo3,columnDtl_memo3);
		}
		return _RowColBeansMap;
	}

	/**
	 * NCイベント時のイベント処理です。
	 */
	@Override
	public void doNCEvent(MCNCBeans compo, MCEventInfo info) {
		super.doNCEvent(compo, info);
		
		if (compo == Cnd_num_biz_typ) {doCnd_num_biz_typ_NC(info);}
		if (compo == Row_num_biz_typ) {doRow_num_biz_typ_NC(info);}
		if (compo == Row_num_ptn_cd) {doRow_num_ptn_cd_NC(info);}
		if (isRowElmTyp(compo)) {doRow_elm_typ_NC(compo, info);}
		doRow_rowBeans_NC(compo, info);
		ctrlBtnMode();
	}
	
	protected boolean isRowElmTyp(MCNCBeans compo){
		
		if ((compo == Row_elm_typ1) 
				|| (compo == Row_elm_typ2)
				|| (compo == Row_elm_typ3)
				|| (compo == Row_elm_typ4)
				|| (compo == Row_elm_typ5)
				|| (compo == Row_elm_typ6)
				|| (compo == Row_elm_typ7)
				|| (compo == Row_elm_typ8)
				|| (compo == Row_elm_typ9)
				|| (compo == Row_elm_typ10)) {
			return true;
		}
		return false;	
	}

	public void doRow_elm_typ_NC(MCNCBeans compo, MCEventInfo info) {
		
		String nv = (String)info.getNewValue();
		String ov = (String)info.getOldValue();
		if(MAC_ELM_TYP.isSEQ(nv)){	
			setDefaultMode(Row_def_seq_typ);
		}
		else if(MAC_ELM_TYP.isSEQ(ov)){
			Row_def_seq_typ.setMode(MCMode.ENABLE);
		}

		setNumImg(getRowR());
	}

	public void doCnd_num_biz_typ_NC(MCEventInfo info) {
		setValueEx(Cnd_num_ptn_cd, null);
	}
	
	/**選択行変更時のイベント*/
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRow();

		ctrlBtnMode();
	}

	protected void setRow(){
		getRowR().clear();
		DtlR r = DtlTable.getSelectedMCRow();
		if(r != null){
			getRowR().setValuesByName(r);
		}
		if(UPD.equals(getStatus())) {
			setRowMode();
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getRowR().clear();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setRowMode();
		ctrlBtnMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setRowMode();
		ctrlBtnMode();
	}
	
	protected void setRowMode(){
		DtlR r = DtlTable.getSelectedMCRow();
		if(FIX.equals(getStatus()) || r == null ||r.isStatusDelete()){
			setFix(RowPanel);
		}
		else{
			setDefaultMode(RowPanel);
			
			if(!isNull(r.ins_ts())){
				Row_num_biz_typ.setMode(MCMode.READ_ONLY);
			}
			
			if (!isNull(getRowR().num_biz_typ()) && isNull(r.ins_ts())) {
				MAC_NUM_BIZ_TYP bizTyp = MAC_NUM_BIZ_TYP.getNE(getRowR().num_biz_typ());
				if(bizTyp != null && bizTyp.is_using_ptn_cd()){
					Row_num_ptn_cd.setMode(MCMode.REQUIRED);
					Row_num_ptn_nm.setMode(MCMode.REQUIRED);
				}
				else {
					Row_num_ptn_cd.setMode(MCMode.READ_ONLY);
					Row_num_ptn_nm.setMode(MCMode.ENABLE);
				}
			}
			else {
				Row_num_ptn_cd.setMode(MCMode.READ_ONLY);
				Row_num_ptn_nm.setMode(MCMode.ENABLE);
			}
			
			if (!isNull(getRowR().elm_typ1())) {
				if(!hasSeq(r)){
					Row_def_seq_typ.setMode(MCMode.ENABLE);
				}
				else{
					setDefaultMode(Row_def_seq_typ);
				}
			}
			else {
				Row_def_seq_typ.setMode(MCMode.ENABLE);
			}
			setBeansNotFirst();
		}
	}

	protected void setBeansNotFirst(){
		
		// 要素区分の制御
		int i = 1;
		for(String d: getColsForEmpTyp()){
			int k = 1;
			if(isNull(getRowR().getString(d))){
				for (MCModeBeans b: getEmpTypModeBeans()) {
					if (k > i) {
						b.setMode(MCMode.READ_ONLY);
					}
					k++;
				}
			}
			i++;
		}
		setBeansWithElmTyp(getRowR().elm_typ1(), Row_elm_dgt1, Row_fix1, Row_num_pad_str1);
		setBeansWithElmTyp(getRowR().elm_typ2(), Row_elm_dgt2, Row_fix2, Row_num_pad_str2);
		setBeansWithElmTyp(getRowR().elm_typ3(), Row_elm_dgt3, Row_fix3, Row_num_pad_str3);
		setBeansWithElmTyp(getRowR().elm_typ4(), Row_elm_dgt4, Row_fix4, Row_num_pad_str4);
		setBeansWithElmTyp(getRowR().elm_typ5(), Row_elm_dgt5, Row_fix5, Row_num_pad_str5);
		setBeansWithElmTyp(getRowR().elm_typ6(), Row_elm_dgt6, Row_fix6, Row_num_pad_str6);
		setBeansWithElmTyp(getRowR().elm_typ7(), Row_elm_dgt7, Row_fix7, Row_num_pad_str7);
		setBeansWithElmTyp(getRowR().elm_typ8(), Row_elm_dgt8, Row_fix8, Row_num_pad_str8);
		setBeansWithElmTyp(getRowR().elm_typ9(), Row_elm_dgt9, Row_fix9, Row_num_pad_str9);
		setBeansWithElmTyp(getRowR().elm_typ10(), Row_elm_dgt10, Row_fix10, Row_num_pad_str10);
		setUndispFlg(getRowR().elm_typ1(), Row_undisp_flg1, 1);
		setUndispFlg(getRowR().elm_typ2(), Row_undisp_flg2, 2);
		setUndispFlg(getRowR().elm_typ3(), Row_undisp_flg3, 3);
		setUndispFlg(getRowR().elm_typ4(), Row_undisp_flg4, 4);
		setUndispFlg(getRowR().elm_typ5(), Row_undisp_flg5, 5);
		setUndispFlg(getRowR().elm_typ6(), Row_undisp_flg6, 6);
		setUndispFlg(getRowR().elm_typ7(), Row_undisp_flg7, 7);
		setUndispFlg(getRowR().elm_typ8(), Row_undisp_flg8, 8);
		setUndispFlg(getRowR().elm_typ9(), Row_undisp_flg9, 9);
		setUndispFlg(getRowR().elm_typ10(), Row_undisp_flg10, 10);
	}

	protected boolean hasSeq(DtlR row){
		return 0 < seqCnt(row);
	}
	
	protected int seqCnt(DtlR row){
		int cnt = 0;
		for(String d: getColsForEmpTyp()){
			if(MAC_ELM_TYP.isSEQ(row.getString(d))){
				cnt++;
			}
		}
		return cnt;
	}
	
	protected String[] getColsForEmpTyp() {
		return new String[] {
				"elm_typ1",
				"elm_typ2",
				"elm_typ3",
				"elm_typ4",
				"elm_typ5",
				"elm_typ6",
				"elm_typ7",
				"elm_typ8",
				"elm_typ9",
				"elm_typ10"
		};
	}

	protected MCModeBeans[] getEmpTypModeBeans() {
		return new MCModeBeans[] {
				Row_elm_typ1,
				Row_elm_typ2,
				Row_elm_typ3,
				Row_elm_typ4,
				Row_elm_typ5,
				Row_elm_typ6,
				Row_elm_typ7,
				Row_elm_typ8,
				Row_elm_typ9,
				Row_elm_typ10
		};
	}

	protected void ctrlBtnMode() {

		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			Btn_open_MABCP0800.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MABCP0800.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 発番イメージをセットします。
	 */
	protected void setNumImg(MCRow r) {
		String num = "";
		for (int i=1; i<=10; i++) {
			num = num + getElmStr(r, i);
		}
		r.setString(DtlR.$num_img, num);
	}
	protected String getElmStr(MCRow r, int idx) {
		String elmTyp = r.getStringNE("elm_typ"+idx);
		
		// 要素区分=NULLまたは非表示時は空文字を返す
		if (isNull(elmTyp) || r.getBooleanNE("undisp_flg"+idx)) {
			return "";
		}
		// 要素区分＝固定値は固定値をそのまま返す
		if (MAC_ELM_TYP.isFIX(elmTyp)) {
			String fix = r.getStringNE("fix"+idx);
			if (isNull(fix)) {
				return "";
			}
			else {
				return fix;
			}
		}
		else if (MAC_ELM_TYP.isYYYY(elmTyp)) {
			return "YYYY";
		}
		else if (MAC_ELM_TYP.isYY(elmTyp)) {
			return "YY";
		}
		else if (MAC_ELM_TYP.isY(elmTyp)) {
			return "Y";
		}
		else if (MAC_ELM_TYP.isMM(elmTyp)) {
			return "MM";
		}
		else if (MAC_ELM_TYP.isDD(elmTyp)) {
			return "DD";
		}
		else if (MAC_ELM_TYP.isM(elmTyp)) {
			return "C";
		}
		else if (MAC_ELM_TYP.isMA(elmTyp)) {
			return "L";
		}
		
		// 使用する文字は要素のインデックス（例外：連番「*」半角スペース「_」）
		String c = String.valueOf(idx);
		if (MAC_ELM_TYP.isSEQ(elmTyp)) {
			c = "*";
		}
		else if (MAC_ELM_TYP.isSP(elmTyp)) {
			c = "_";
		}
		else if (idx == 10) {
			c = "X";
		}
		// 桁数は次の優先順で決定する
		// 「fix_dgt（定数の属性値）」＞要素桁数
		MAC_ELM_TYP typ = MAC_ELM_TYP.get(elmTyp);
		MCNumber digit;
		if (!isNull(typ.fix_dgt())) {
			digit = typ.fix_dgt();
		}
		else {
			digit = r.getNumberNE("elm_dgt"+idx);
		}
		// 桁数が取得できないときは空文字を返す
		if (isNull(digit)) {
			return "";
		}
		// 文字列を作成して返す
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<digit.intValue(); i++) {
			sb.append(c);
		}
		return sb.toString();
	}
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 発番イメージをセットしたときに「選択」チェックをオンにしない
		if (isSame(event.getColumn(), DtlR.$num_img)) {
			return;
		}
		super.dtlRowValueChanged(event);
	}

	//----------<要素区分１～１０ リストロジック・表示制御 Start>----------
	@Override
	public MCList getRow_elm_typ1(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ1(row, info));
	}

	@Override
	public MCList getRow_elm_typ2(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ2(row, info));
	}

	@Override
	public MCList getRow_elm_typ3(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ3(row, info));
	}

	@Override
	public MCList getRow_elm_typ4(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ4(row, info));
	}

	@Override
	public MCList getRow_elm_typ5(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ5(row, info));
	}

	@Override
	public MCList getRow_elm_typ6(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ6(row, info));
	}

	@Override
	public MCList getRow_elm_typ7(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ7(row, info));
	}

	@Override
	public MCList getRow_elm_typ8(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ8(row, info));
	}

	@Override
	public MCList getRow_elm_typ9(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ9(row, info));
	}

	@Override
	public MCList getRow_elm_typ10(MCRow row, MCEventInfo info) {
		return getElmTypLst(super.getRow_elm_typ10(row, info));
	}

	@SuppressWarnings("unchecked")
	protected MCList getElmTypLst(MCList elmTypL) {
		if (isNull(getRowR().num_biz_typ())) {
			return elmTypL;
		}

		MAC_NUM_BIZ_TYP nbTyp = MAC_NUM_BIZ_TYP.get(getRowR().num_biz_typ());

		int i = 0;
		String[] eTyp = new String[MAC_ELM_TYP.array().length];

		if (nbTyp.is_num_elm() == false) {
			eTyp[i++] = MAC_ELM_TYP.FIX.value();
			eTyp[i++] = MAC_ELM_TYP.SP.value();
		}
		eTyp[i++] = MAC_ELM_TYP.SEQ.value();

		if (nbTyp.is_using_itm_cd()) {
			eTyp[i++] = MAC_ELM_TYP.ITM.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_SUB1.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_SUB2.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_SUB3.value();
		}
		if (nbTyp.is_using_loc_cd()) {
			eTyp[i++] = MAC_ELM_TYP.LOC.value();
		}
		if (nbTyp.is_using_dpt_cd()) {
			eTyp[i++] = MAC_ELM_TYP.DPT.value();
		}
		if (nbTyp.is_using_co_cd()) {
			eTyp[i++] = MAC_ELM_TYP.CO.value();
		}
		if (nbTyp.is_using_bp_cd()) {
			eTyp[i++] = MAC_ELM_TYP.BP.value();
		}
		if (nbTyp.is_using_wg_cd()) {
			eTyp[i++] = MAC_ELM_TYP.WG.value();
		}
		if (nbTyp.is_using_trd()) {
			eTyp[i++] = MAC_ELM_TYP.TRD.value();
		}
		if (nbTyp.is_using_itm_grp()) {
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP01.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP02.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP03.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP04.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP05.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP06.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP07.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP08.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP09.value();
			eTyp[i++] = MAC_ELM_TYP.ITM_GRP10.value();
		}
		if (nbTyp.is_using_bp_grp()) {
			eTyp[i++] = MAC_ELM_TYP.BP_GRP01.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP02.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP03.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP04.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP05.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP06.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP07.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP08.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP09.value();
			eTyp[i++] = MAC_ELM_TYP.BP_GRP10.value();
		}
		if (nbTyp.is_using_site()) {
			eTyp[i++] = MAC_ELM_TYP.SITE.value();
		}
		if (nbTyp.is_using_itm_site()) {
			eTyp[i++] = MAC_ELM_TYP.ITM_SITE.value();
		}
		if (nbTyp.is_using_lot()) {
			eTyp[i++] = MAC_ELM_TYP.LOT.value();
		}
		if (nbTyp.is_using_chd_lot()) {
			eTyp[i++] = MAC_ELM_TYP.CHD_LOT.value();
		}
		if (nbTyp.is_using_chd_sublot()) {
			eTyp[i++] = MAC_ELM_TYP.CHD_SUBLOT.value();
		}
		if (nbTyp.is_using_bp_lot()) {
			eTyp[i++] = MAC_ELM_TYP.BP_LOT.value();
		}
		if (nbTyp.is_using_sno1()) {
			eTyp[i++] = MAC_ELM_TYP.SNO1.value();
		}
		if (nbTyp.is_using_sno2()) {
			eTyp[i++] = MAC_ELM_TYP.SNO2.value();
		}
		if (nbTyp.is_using_sno3()) {
			eTyp[i++] = MAC_ELM_TYP.SNO3.value();
		}
		if (nbTyp.is_using_sno4()) {
			eTyp[i++] = MAC_ELM_TYP.SNO4.value();
		}
		if (nbTyp.is_using_dt()) {
			eTyp[i++] = MAC_ELM_TYP.YYYY.value();
			eTyp[i++] = MAC_ELM_TYP.YY.value();
			eTyp[i++] = MAC_ELM_TYP.Y.value();
			if (nbTyp.is_num_elm() == false) {
				eTyp[i++] = MAC_ELM_TYP.M.value();
				eTyp[i++] = MAC_ELM_TYP.MA.value();
			}
			eTyp[i++] = MAC_ELM_TYP.MM.value();
			eTyp[i++] = MAC_ELM_TYP.DD.value();
		}
		if (nbTyp.is_using_str()) {
			eTyp[i++] = MAC_ELM_TYP.STR.value();
		}
		if (nbTyp.is_using_str2()) {
			eTyp[i++] = MAC_ELM_TYP.STR2.value();
		}
		if (nbTyp.is_using_str3()) {
			eTyp[i++] = MAC_ELM_TYP.STR3.value();
		}
		if (nbTyp.is_using_num()) {
			eTyp[i++] = MAC_ELM_TYP.NUM.value();
		}

		elmTypL.addBooleanColumn("add_flg", false);
		MCIndexKey key = elmTypL.createIndex(ElmTypCols.$o_elm_typ);

		for (int j = 0; j < i; j++) {
			MCRow r = elmTypL.getFirst(key, eTyp[j]);
			if (!isNull(r)) {
				r.setBoolean("add_flg", true);
			}
		}

		return elmTypL.subList("add_flg", true);
	}
	//----------<要素区分１～１０ リストロジック・表示制御 End>----------

	@Override
	public void layoutInit() {

		int selectedtab = LclTabTab.getSelectedIndex();

		if (isRelayout()) {
			// 一度ビューポートに設定しなおしてからクリアすることで、パネルからドラッグスクロールリスナーを除去
			_dtlSubPanelS.setViewportView(DtlSubPanel);
			_dtlSubPanelS.setViewportView(null);

			// 再レイアウト中のディバイダ位置は保存しないようにするため、いったんリムーブする。
			_lcltabDivPropChangeListener.removeOwner();

			// 検索枠展開部品のディバイダサイズを初期化して、太くならないようにする（getter内で初期化される）
			Ctrl_ctrl_PPanel.getExpandSplitPane();
		}

		super.layoutInit();
		_dtlSubPanelS = beansFactory.createScrollPane("LclTab.DtlSubPanel.tab");
		_dtlSubPanelS.setViewportView(DtlSubPanel);
		LclTabTab.removeAll();
		LclTabTab.add(_dtlSubPanelS, "LclTab.tab1");
		LclTabTab.add(LclWrkPanel, "LclTab.tab2");
		LclTabTab.updateResource();

		DtlSubPanel.setMinimumSize(new Dimension(0, 0));
		LclWrkPanel.setMinimumSize(new Dimension(0, 0));

		if (isRelayout() && selectedtab > -1) {
			boolean enabled = LclTabTab.isEnabled();
			LclTabTab.validate();
			if (!enabled) {
				LclTabTab.setEnabled(true);
			}
			// 項目配置変更画面はModalのため、「更新後適用する」での適用では裏のタブを選択できない。
			// そのため、項目配置変更画面が閉じた後に選択されるように実装する。
			if (!selectLclTabTab(selectedtab, enabled)) {
				if (_lcltabSelector == null) {
					_lcltabSelector = new Timer(500, (event) -> {
						if (selectLclTabTab(selectedtab, enabled)) {
							MCSplitPane sp = getSplitPane(LclTabPanel);
							_lcltabDivPropChangeListener.updOwner(sp);
							((Timer) event.getSource()).stop();
							_lcltabSelector = null;
						}
					});
					_lcltabSelector.start();
				}
			}
		}
	}

	@Override
	public void resetDividerLocation(boolean needsUpdate) {
		super.resetDividerLocation(needsUpdate);
		//再レイアウト完了後にディバイダ位置を戻す
		if (needsUpdate && _lcltabDivPropChangeListener != null) {
			MCSplitPane sp = getSplitPane(LclTabPanel);
			_lcltabDivPropChangeListener.updOwner(sp);
		}
	}

	protected boolean selectLclTabTab(int i, boolean befEnabled) {
		if (LclTabTab.isRequestFocusEnabled()) {
			LclTabTab.setSelectedIndex(i);
			LclTabTab.setEnabled(befEnabled);
			return true;
		}
		return false;
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		dividerLocationLayoutAfterOpen();
	}

	/**
	 * 下部に配置しているディバイダーの初期表示位置を調整する。
	 */
	protected void dividerLocationLayoutAfterOpen() {
		MCSplitPane sp = getSplitPane(LclTabPanel);
		MCScrollPane scroll = DtlTable.getScrollPane();
		if (scroll != null) {
			// 2行分の高さになるように差を調整する
			int r2hdiff = scroll.getViewport().getViewRect().height
					- (DtlTable.getRowMargin() + DtlTable.getRowHeight() * 2);
			if (r2hdiff >= 0) {
				sp.setDividerLocationWithoutRatio(
						sp.getDividerLocationWithRatio() - r2hdiff);
			}
		}

		_lcltabDivPropChangeListener = createSplitPanePropertyChangeListener();
		_lcltabDivPropChangeListener.setOwner(sp);
	}

	protected MABCP_DivPropChangeListener createSplitPanePropertyChangeListener() {
		return new MABCP_DivPropChangeListener();
	}

	/**
	 * ディバイダ位置を管理するリスナー。<p>
	 * 再レイアウトによって、ディバイダ位置がずれることを防ぐために使用する。
	 * 画面１インスタンスにつき１インスタンスを使用する。
	 */
	protected class MABCP_DivPropChangeListener
			implements java.beans.PropertyChangeListener {

		protected int _curpos = -1;

		protected MCSplitPane _owner = null;

		/**
		 * リスナー所有者を設定する。
		 * リスナーにリスナー所有者のディバイダ位置が保存される。
		 * @param sp リスナー所有者
		 */
		protected void setOwner(MCSplitPane sp) {
			removeOwner();
			_owner = sp;
			setCurrentPosition(sp.getDividerLocationWithRatio());
			sp.addPropertyChangeListener("dividerLocation", this);
		}

		/**
		 * リスナー所有者を更新する。
		 * リスナーの保持しているディバイダの位置情報は、所有者に反映される。
		 * @param sp リスナー所有者
		 */
		protected void updOwner(MCSplitPane sp) {
			removeOwner();
			_owner = sp;
			boolean isd = isDisableLayoutInit();
			setDisableLayoutInit(false);
			sp.setDividerLocationWithoutRatio(this.getCurrentPosition());
			setDisableLayoutInit(isd);
			sp.addPropertyChangeListener("dividerLocation", this);

			//変更をUIに反映させる。反映させないと、項目配置変更の「初期値に戻す」実行時に元の位置に戻らない。
			revalidate();
			repaint();
		}

		/**
		 * リスナー所有者を削除する。
		 * リスナーの保持しているディバイダの位置情報はクリアされない。
		 */
		protected void removeOwner() {
			if (_owner != null) {
				_owner.removePropertyChangeListener("dividerLocation", this);
			}
			_owner = null;
		}

		protected void setCurrentPosition(int pos) {
			_curpos = pos;
		}

		@Override
		public void propertyChange(java.beans.PropertyChangeEvent evt) {
			setCurrentPosition((int) evt.getNewValue());
		}

		/**
		 * 現在のディバイダ位置を返す。
		 * @return　ディバイダ位置
		 */
		public int getCurrentPosition() {
			return _curpos;
		}
	}

	@Override
	public boolean beforeClose() {
		// 閉じる前に_lcltabDivPropChangeListenerをクリア。
		if (super.beforeClose() && _lcltabDivPropChangeListener != null) {
			_lcltabDivPropChangeListener.removeOwner();
			return true;
		}
		return false;
	}

}