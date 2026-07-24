package mcframe.clientMABG.MABGP0040;

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
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_CalcGrpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_CalcGrpReg_MC extends MABGP_CalcGrpReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CalcGrpReg_MC() {
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
	public MABGP_CalcGrpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0040_Srch01Caller<P extends MABGP_CalcGrpReg, B extends MA_MABGL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABGL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0040_Upd01Caller<P extends MABGP_CalcGrpReg, B extends MA_MABGL0040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABGL0040_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0040_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0040_Del01Caller<P extends MABGP_CalcGrpReg, B extends MA_MABGL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABGL0040_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0040_Srch01();
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
	 * Panel[Btn]のボタン[open_MABGP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0060(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0060");
		MCRow asoRow = crtOpenMABGP0060CndR(aso);
		if (!isNull(asoRow.getValueNE(mcframe.clientMABG.MABGP0060.CndR.$calc_grp_cd))) {
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0070(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0070");
		MCRow asoRow = crtOpenMABGP0070CndR(aso);
		if (!isNull(asoRow.getValueNE(mcframe.clientMABG.MABGP0070.CndR.$calc_grp_cd))) {
			aso.putCnd(asoRow);
			aso.runValueInit();
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0040_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0040_Del01();
	}
	/**
	 * 遷移先[MABGP0060]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0060.CndR crtOpenMABGP0060CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0060.CndR to =
			mcframe.clientMABG.MABGP0060.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.calc_grp_cd(fr.calc_grp_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0070]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0070.CndR crtOpenMABGP0070CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0070.CndR to =
			mcframe.clientMABG.MABGP0070.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.calc_grp_cd(fr.calc_grp_cd());
		}
		return to;
	}

	@Override
	public boolean doDtl_max_mons_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isMon(n)){
			return false;
		}
		return super.doDtl_max_mons_VC(info);
	}

	/**
	 * 月として妥当かどうか（0-12）
	 * @param n 評価対象の値
	 * @return 評価値
	 */
	protected boolean isMon(MCNumber n){		
		return MCNumber.ZERO.lte(n) && new MCNumber(12).gte(n);
	}

	@Override
	public void doDtl_calc_grp_cd_NC(MCEventInfo info) {
		super.doDtl_calc_grp_cd_NC(info);

		int idx = info.getEventIndex();
		DtlR dtl = getDtlL().get(idx);
		if (isNull(dtl)) return;
		if (dtl.isStatusCreate() && isNull(dtl.calc_cnt())) {
			dtl.calc_cnt(1);
		}
		setOpenButtonMode();
	}

	@Override
	public void doDtl_calc_seq_grp_NC(MCEventInfo info) {
		super.doDtl_calc_seq_grp_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.calc_seq_grp())) {
			setValueEx(columnDtl_calc_seq, idx, null);
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}

	@Override
	public void doDtl_cost_calc_typ_LC(MCEventInfo info) {
		super.doDtl_cost_calc_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (MAC_COST_CALC_TYP.isCALC_STK(r.cost_calc_typ()) == false) {
			setValueEx(columnDtl_eval_typ,idx, null);
		}
		setValueEx(columnDtl_xfr_calc_flg, idx, false);
	}

	@Override
	public void doDtl_exp_calc_typ_LC(MCEventInfo info) {
		super.doDtl_exp_calc_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_EXP_CALC_TYP.isNON(r.exp_calc_typ()) == true) {
			setValueEx(columnDtl_xfr_calc_flg, idx, false);
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細に優先して利用させるCellConfigを作成するメソッド
	 * 
	 * @return
	 */
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			// 非表示のカラムはモードを変更しない
			if (MCMode.INVISIBLE_STATUS == column.getModeInfo().getStatus()) {
				return super.getPriorMode(index, column, table);
			}

			return getPriorModeSub(index, column, table);
		}

		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 * @param index
		 * @param column
		 * @param table
		 * @return 
		 */
		@SuppressWarnings("unchecked")
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(), UPD)) {
				DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_eval_typ) {
					if(MAC_COST_CALC_TYP.isCALC_STK(dtl.cost_calc_typ()) == false){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_calc_seq) {
					if (isNull(dtl.calc_seq_grp())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_xfr_calc_flg) {
					if (isNull(dtl.cost_calc_typ()) || MAC_COST_CALC_TYP.isCALC_STK(dtl.cost_calc_typ()) == false) {
						return MCMode.READ_ONLY;
					}
					if (isNull(dtl.exp_calc_typ()) || MAC_EXP_CALC_TYP.isNON(dtl.exp_calc_typ()) == true) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		 }
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null
				|| isNull(r.calc_grp_cd())) {
			Btn_open_MABGP0060.setMode(MCMode.DISABLE);
			Btn_open_MABGP0070.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0060);
			setDefaultMode(Btn_open_MABGP0070);
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setOpenButtonMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setOpenButtonMode();
	}

}