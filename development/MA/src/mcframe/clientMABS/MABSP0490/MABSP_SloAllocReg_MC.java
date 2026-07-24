package mcframe.clientMABS.MABSP0490;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_SloAllocReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_SloAllocReg_MC extends MABSP_SloAllocReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SloAllocReg_MC() {
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
	public MABSP_SloAllocReg_MC(String name) {
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
	 * [MA_MABSL0490_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0490_Srch01Caller<P extends MABSP_SloAllocReg, B extends MA_MABSL0490_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0490_Srch01Caller(P p, B b) {
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
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0490_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0490_Upd01Caller<P extends MABSP_SloAllocReg, B extends MA_MABSL0490_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0490_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0490_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0490_Del01Caller<P extends MABSP_SloAllocReg, B extends MA_MABSL0490_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0490_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0490_Srch01();
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
	 * Panel[DtlBtn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0490_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0490_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0490_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0490_Del01();
	}


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
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
	}
	
	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}
	
	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	protected class DtlConf extends MAUDP_RLBaseCellConfig {
		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				if (column == columnDtl_lg_grp_cd) {
					if (!isNull(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_loc_cd) {
					if (!isNull(r.lg_grp_cd()) || !isNull(r.alloc_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alloc_grp_cd) {
					if (!isNull(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ship_loc_cd) {
					if (!isNull(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}	
			return super.getPriorMode(index, column, table);
		}	
	}
	
	@Override
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info) {
		super.doDtl_alloc_grp_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.alloc_grp_cd())){
			setValueEx(columnDtl_loc_cd, idx, null);
		}
		
		if (isNull(r.alloc_grp_cd())
		 || !isNull(r.loc_cd())
		 || !isNull(r.lg_grp_cd())) {
			setValueEx(columnDtl_alloc_scope_typ, idx, null);
		}
		
		if (isNull(r.loc_cd())) {
			setValueEx(columnDtl_ship_loc_cd, idx, null);
		}
	}

	@Override
	public void doDtl_lg_grp_cd_LC(MCEventInfo info) {
		super.doDtl_lg_grp_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.loc_cd())) {
			setValueEx(columnDtl_loc_cd, idx, null);
		}
		if (!isNull(r.alloc_grp_cd())) {
			setValueEx(columnDtl_alloc_scope_typ, idx, null);
		}
		setValueEx(columnDtl_ship_loc_cd, idx, null);
	}
	
	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.loc_cd())) {
			setValueEx(columnDtl_alloc_grp_cd, idx, null);
			setValueEx(columnDtl_ship_loc_cd, idx, r.loc_cd());
		}
		
		if (!isNull(r.lg_grp_cd())) {
			setValueEx(columnDtl_lg_grp_cd, idx, null);
		}
		if (!isNull(r.alloc_grp_cd())) {
			setValueEx(columnDtl_alloc_scope_typ, idx, null);
		}
		
	}
	
	@Override
	public void doDtl_alloc_scope_typ_LC(MCEventInfo info) {
		super.doDtl_alloc_scope_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.loc_cd())) {
			setValueEx(columnDtl_ship_loc_cd, idx, r.loc_cd());
		}
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getDtl_alloc_scope_typ(MCRow row,MCEventInfo info) {
		addListLogicCnd(row, getAllocScopeTyp(info));
		return super.getDtl_alloc_scope_typ(row, info);
	}
	
	/**
	 * 表示する引当範囲区分を取得する
	 */
	protected MAC_ALLOC_SCOPE_TYP[] getAllocScopeTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.alloc_grp_cd())) {
			return new MAC_ALLOC_SCOPE_TYP[] { MAC_ALLOC_SCOPE_TYP.LOC };
		} else if (!isNull(r.loc_cd()) || !isNull(r.lg_grp_cd())) {
			return new MAC_ALLOC_SCOPE_TYP[] { MAC_ALLOC_SCOPE_TYP.ALLOC_GRP };
		}
		return new MAC_ALLOC_SCOPE_TYP[] { MAC_ALLOC_SCOPE_TYP.LOC, MAC_ALLOC_SCOPE_TYP.ALLOC_GRP };
	}

	//--------------------リストロジック表示制御End-----------------------

}