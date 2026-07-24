package mcframe.clientMABS.MABSP0090;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmOperReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmOperReg_MC extends MABSP_ItmOperReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmOperReg_MC() {
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
	public MABSP_ItmOperReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[RPnl]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MA_MABSL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0090_Srch01Caller<P extends MABSP_ItmOperReg, B extends MA_MABSL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (isUpdOpe()) {
				Btn_correct_dup_dt.setMode(MCMode.ENABLE);
			}
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
		
	}

	/**
	 * [MA_MABSL0090_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0090_Sprt01Caller<P extends MABSP_ItmOperReg, B extends MA_MABSL0090_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0090_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0090_Upd01Caller<P extends MABSP_ItmOperReg, B extends MA_MABSL0090_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0090_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0090_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0090_Del01Caller<P extends MABSP_ItmOperReg, B extends MA_MABSL0090_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0090_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0090_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0090_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0090_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0090_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0090_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0090_Del01();
	}
	
	//------------------ 初期化 Start ------------------//
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_qty1_p_PPanel.setRelateBeans(columnDtl_itm_unit_cd, columnDtl_itm_dec_place);
		Dtl_qty2_p_PPanel.setRelateBeans(columnDtl_oper_unit_cd, columnDtl_dec_place);
		Dtl_qty3_p_PPanel.setRelateBeans(columnDtl_itm_unit_cd, columnDtl_itm_dec_place);
		Dtl_qty4_p_PPanel.setRelateBeans(columnDtl_itm_unit_cd, columnDtl_itm_dec_place);
		Dtl_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
                , columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ
                , columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
	}
	
	//------------------ 初期化 End ------------------//
	
	//------------------ ステータス Start ------------------//
	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			setStatus(UPD);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setStatus(DEL);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setStatus(REF);
		}
		setModeByRegTgt();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
	}

	protected void setRegTgtMode() {
		if (RPnl_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (RPnl_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	//------------------ ステータス End ------------------//
	
	//------------------ イベント Start ------------------//
	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setRegTgtValue(info);
		setModeByRegTgt();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (info.getComponent() == Cnd_ope_Group) {
			if (!ref && getCndR().cmn_flg() && getCndR().wg_flg()) {
				initRegTgt();
			}
		}
		else if (info.getComponent() == Cnd_cmn_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().wg_flg(false);
			}
		}
		else if (info.getComponent() == Cnd_wg_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().cmn_flg(false);
			}
		}
	}

	protected void setModeByRegTgt() {
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			setDefaultMode(Cnd_loc_cd);
			setDefaultMode(Cnd_loc_nm);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
				setDefaultMode(columnDtl_loc_cd);
				setDefaultMode(columnDtl_loc_nm);
				setDefaultMode(columnDtl_oper_loc_cd);
				setDefaultMode(columnDtl_oper_loc_nm);
			}
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			
			if (!isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
				setDefaultMode(Cnd_loc_cd);
				setDefaultMode(Cnd_loc_nm);
				if (!ref) {
					columnDtl_loc_cd.setMode(MCMode.ENABLE);
					columnDtl_loc_nm.setMode(MCMode.READ_ONLY);
					columnDtl_oper_loc_cd.setMode(MCMode.ENABLE);
					columnDtl_oper_loc_nm.setMode(MCMode.READ_ONLY);
				}
			}
			else {
				setValueEx(Cnd_loc_cd, null);
				Cnd_loc_cd.setMode(MCMode.READ_ONLY);
				Cnd_loc_nm.setMode(MCMode.READ_ONLY);
				if (!ref) {
					columnDtl_loc_cd.setMode(MCMode.INVISIBLE);
					columnDtl_loc_nm.setMode(MCMode.INVISIBLE);
					columnDtl_oper_loc_cd.setMode(MCMode.INVISIBLE);
					columnDtl_oper_loc_nm.setMode(MCMode.INVISIBLE);
				}
			}
			
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setRegTgtMode();
		setModeByRegTgt();
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}
	
	@Override
	public void doDtl_oper_cd_LC(MCEventInfo info) {
		super.doDtl_oper_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.oper_cd())) {
			setValueEx(columnDtl_oper_seq, idx, null);
		}
		else if (isNull(r.oper_seq())) {
			setValueEx(columnDtl_oper_seq, idx, MCNumber.ONE);
		}
	}
	
	@Override
	public void doDtl_yield_oper_flg_NC(MCEventInfo info) {
		super.doDtl_yield_oper_flg_NC(info);
		// 出来高計上工程ＦＬＧが変更されたとき、下記項目をクリアする。
		// 出来高工程比率
		setValueEx(columnDtl_yield_oper_ratio, info.getEventIndex(), null);
	}

	/**
	 * Panel[BulkSet]のボタン[upd_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_upd_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt()) || !isNull(getBulkSetR().end_dt())) {
			BulkSet_upd_dt.setMode(MCMode.ENABLE);
		} else {
			BulkSet_upd_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}
	
	//------------------ イベント End ------------------//
	
	// //////////////////////////////////////////////
	// セルコンフィグ/////////////////////////////////////
	// //////////////////////////////////////////////
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}
	
	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR row = (DtlR) table.getBaseTable().getRow(index);
				// 工程管理単位ＣＤを入力したとき、下記項目は入力可能（必須）
				// 工程基準単位数量、工程換算単位数量、小数部有効桁数、換算端数処理区分
				if (column == columnDtl_oper_std_qty 
				 || column == columnDtl_oper_conv_qty
				 || column == columnDtl_dec_place
				 || column == columnDtl_unit_conv_rnd_typ) {
					if (isNull(row.oper_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 出来高計上工程ＦＬＧが設定されている場合に下記項目は入力可能（必須）
				// 出来高工程比率
				else if (column == columnDtl_yield_oper_ratio) {
					if (!row.yield_oper_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
				else if (column == columnDtl_sno1){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno1_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno2){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno2_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno3){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno3_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno4){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno4_mng_typ())){
						return MCMode.ENABLE;
					}
				}

			}

			return super.getPriorMode(index, column, table);
		}
	}

}