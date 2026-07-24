package mcframe.clientMABS.MABSP0070;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5250.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_AltItmLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_AltItmLst_MC extends MABSP_AltItmLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_AltItmLst_MC() {
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
	public MABSP_AltItmLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0070_Srch01Caller<P extends MABSP_AltItmLst, B extends MA_MABSL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0070_Srch01Caller(P p, B b) {
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
	 * [MA_MABSL0070_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0070_Sprt01Caller<P extends MABSP_AltItmLst, B extends MA_MABSL0070_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0070_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0070_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0070_Upd01Caller<P extends MABSP_AltItmLst, B extends MA_MABSL0070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0070_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0070_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0070_Del01Caller<P extends MABSP_AltItmLst, B extends MA_MABSL0070_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0070_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0070_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0070_Sprt01();
	}
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
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0070_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0070_Del01();
	}

	//----------画面起動時Start----------
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

		Dtl_fxd_chd_rqmt_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_ver_no_p_PPanel.setRelateBeans(Dtl_chd_itm_p_PPanel.columnItm_itm_cd, 
						Dtl_chd_itm_p_PPanel.columnItm_itm_sub1, 
						Dtl_chd_itm_p_PPanel.columnItm_itm_sub2, 
						Dtl_chd_itm_p_PPanel.columnItm_itm_sub3, 
						null, columnDtl_ver_flg);
	}
	//----------画面起動時End------------
	//----------種別変更Start------------
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
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

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
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}
			setDefaultMode(DtlBtn_upd_wg);
			setDefaultMode(DtlBtn_del_wg);
			DtlBtn_upd_cmn.setMode(MCMode.INVISIBLE);
			DtlBtn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			setDefaultMode(DtlBtn_upd_cmn);
			setDefaultMode(DtlBtn_del_cmn);
			DtlBtn_upd_wg.setMode(MCMode.INVISIBLE);
			DtlBtn_del_wg.setMode(MCMode.INVISIBLE);
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
	//----------種別変更End--------------
	//----------ステータス変更Start----------
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
	//----------ステータス変更End------------

	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_alt_grp_cd, idx, null);
	}

	/**
	 * 操作種別によってステータスをセットする
	 */
	@Override
	protected void setStatusByOpe() {
		super.setStatusByOpe();

		setRegTgtMode();
		setModeByRegTgt();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Dtl_chd_itm_p_PPanel.addItmLCListner(this);
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Dtl_chd_itm_p_PPanel.isItm(lc)) {
			doDtl_chd_itm_cd_LC(info);
		}
	}

	protected void doDtl_chd_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.chd_itm_cd())) {
			if (!isNull(r.dec_place()) && isNull(r.fxd_chd_rqmt_qty())){
				setValueEx(columnDtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
		}
	}

	//--------------------セルコンフィグstart-------------------------
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
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_alt_grp_cd) {
					if (getCndR().wg_flg() && isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_st_dt) {
					return MCMode.REQUIRED;
				}
				else if (column == columnDtl_fxd_chd_rqmt_qty) {
					if (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())
							&& !isNull(r.fxd_chd_rqmt_qty()) && r.fxd_chd_rqmt_qty().isZero()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
	}
	//--------------------セルコンフィグend---------------------------

	@Override
	public MCList getCnd_alt_grp_cd(MCRow row, MCEventInfo info) {
		if (isNull(getCndR().getString(AltGrpCols.$i_wg_cd))) {
			row.addStringColumn(AltGrpCols.$i_wg_cd, MAC_STR.NULL_VAL.value());
		}
		return super.getCnd_alt_grp_cd(row, info);
	}

	@Override
	public MCList getDtl_alt_grp_cd(MCRow row, MCEventInfo info) {
		if (isNull(row.getString(AltGrpCols.$i_wg_cd))) {
			row.addStringColumn(AltGrpCols.$i_wg_cd, MAC_STR.NULL_VAL.value());
		}
		return super.getDtl_alt_grp_cd(row, info);
	}

}