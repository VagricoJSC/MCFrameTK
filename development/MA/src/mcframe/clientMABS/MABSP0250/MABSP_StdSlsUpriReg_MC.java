package mcframe.clientMABS.MABSP0250;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5060.*;

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
import mcframe.clientCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_StdSlsUpriReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_StdSlsUpriReg_MC extends MABSP_StdSlsUpriReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_StdSlsUpriReg_MC() {
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
	public MABSP_StdSlsUpriReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Srch01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0250_Srch01Caller(P p, B b) {
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
			setBulkDtMode();
			setBulkUpriMode();
			clearDtl2Down();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setBulkDtMode();
			setBulkUpriMode();
			clearDtl2Down();
		}

	}

	/**
	 * [MA_MABSL0250_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Sprt01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0250_Sprt01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MA_MABSL0250_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Upd01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0250_Upd01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MA_MABSL0250_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Del01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0250_Del01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MA_MABSL0250_Aprv_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Aprv_Srch01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Aprv_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0250_Aprv_Srch01Caller(P p, B b) {
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
			setBulkDtMode();
			setBulkUpriMode();
			setCndMode();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setBulkDtMode();
			setBulkUpriMode();
			setCndMode();
		}

	}

	/**
	 * [MA_MABSL0250_Aprv_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Aprv_Upd01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Aprv_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0250_Aprv_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			if (!super.checkForCall()) {
				return false;
			}
			int pickedCnt = 0;
			for (MCContainer c : getAllUpBlocks()) {
				if (c instanceof MCList && isCheckList(c)) {
					pickedCnt = pickedCnt + getPickedList(c).size();
				}
			}
			if (pickedCnt == 0) {
				panel.dialog(msgNoDataChange());
				return false;
			}
			return true;
		}

		@Override
		protected void setupParam() {
			// サーバ処理で申請枠のステータスによる分岐を行うための設定
			if (Cnd_ope_APL.isSelected()) {
				getDtl2R().setStatus(MCRow.MODIFY);
			}
			else {
				getDtl2R().setStatus(MCRow.NONE);
			}

			super.setupParam();
		}
	}

	/**
	 * [MA_MABSL0250_Aprv_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0250_Aprv_Del01Caller<P extends MABSP_StdSlsUpriReg, B extends MA_MABSL0250_Aprv_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0250_Aprv_Del01Caller(P p, B b) {
			super(p, b);
		}

	}

	@Override
	public <E extends MCConstRow> void checkDuplicate(MCMessageList msgList,
			MCTable<E> tbl, String... cols) {
		String[] revCols = cols;
		String[] addlCols = new String[] {DtlR.$apl_no};
		if (MCCollectionUtil.contains(getStatus(), UPD_MOD_APL, DEL_APL)) {
			revCols = MCCollectionUtil.concat(cols, addlCols);
		}
		super.checkDuplicate(msgList, tbl, revCols);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_UPD.isSelected() ||
				Cnd_ope_DEL.isSelected() ||
				Cnd_ope_REF.isSelected() ||
				Cnd_ope_APL.isSelected()) {
			callMA_MABSL0250_Srch01();
		}
		else if (Cnd_ope_MOD_APL.isSelected() ||
				Cnd_ope_DEL_APL.isSelected() ||
				Cnd_ope_REF_APL.isSelected()) {
			callMA_MABSL0250_Aprv_Srch01();
		}
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
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt,
				DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	/**
	 * Panel[BulkSet]のボタン[rev_upri]の押下時の処理
	 */
	@Override
	public void doBulkSet_rev_upri(MCEventInfo info) {
		MCNumber revRate = getBulkSetR().rev_rate();
		String rndTyp = getBulkSetR().rnd_typ();
		MCDate revDate = getBulkSetR().rev_date();
		if (isNullOr(revRate, rndTyp, revDate)) {
			return;
		}
		MCList<DtlR> chkL = getDtlL().subList(DtlR.$check, true);
		for (DtlR chkR : chkL) {
			// chkR.st_dt() と chkR.end_dt() の null チェックも含む。
			if (!revDate.gt(chkR.st_dt()) || !revDate.lt(chkR.end_dt())) {
				continue;
			}
			int idx = chkR.getGUIIndex();
			DtlR insR = getDtlL().createRow();
			MCConstRow.copyvalue(insR, chkR);
			MCNumber revUpri = getRevUpri(
					insR.upri(), revRate, insR.upri_dec_place(), rndTyp);
			insR.st_dt(revDate);
			insR.upri_bf(insR.upri());
			insR.upri(revUpri);
			insR.setStatus(Status.CREATE);
			DtlTable.insertRow(idx + 1, insR);
			copyRowSub(insR);
			// 既存行については、適用日反映ボタンと同様に setValueEx で値を設定する。
			setValueEx(columnDtl_end_dt, idx, revDate.addDay(-1));
		}
	}

	protected MCNumber getRevUpri(MCNumber upri,
			MCNumber revRate, MCNumber decPlace, String rndTyp) {
		if (isNullOr(upri, revRate, decPlace, rndTyp)) {
			return null;
		}
		MCNumber multiplier = revRate.divide(MCNumber.valueOf(100));
		return upri.multiply(
				multiplier, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
	}

	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0250_Sprt01();
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
		callMA_MABSL0250_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0250_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_apl_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_apl_cmn(MCEventInfo info) {
		callMA_MABSL0250_Aprv_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_apl_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_apl_wg(MCEventInfo info) {
		callMA_MABSL0250_Aprv_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0250_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0250_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_apl_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_apl_cmn(MCEventInfo info) {
		callMA_MABSL0250_Aprv_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_apl_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_apl_wg(MCEventInfo info) {
		callMA_MABSL0250_Aprv_Del01();
	}

	protected void setBulkDtMode() {
		Comparable<?>[] vals = new Comparable<?>[] {
			getBulkSetR().st_dt(),
			getBulkSetR().end_dt()
		};
		if (isNullAnd(vals)) {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
	}

	protected void setBulkUpriMode() {
		Comparable<?>[] vals = new Comparable<?>[] {
			getBulkSetR().rev_rate(),
			getBulkSetR().rnd_typ(),
			getBulkSetR().rev_date()
		};
		if (isNullOr(vals) ||
				!MCCollectionUtil.contains(getStatus(), UPD, UPD_APL)) {
			BulkSet_rev_upri.setMode(MCMode.DISABLE);
		}
		else {
			BulkSet_rev_upri.setMode(MCMode.ENABLE);
		}
	}

	protected void clearDtl2Down() {
		setValueEx(Dtl2_apl_no, null);
		setValueEx(Dtl2_aprv_no, null);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		if (Cnd_ope_APL.isSelected()) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (r != null && isNull(r.upd_cntr())) {
				setDefaultMode(DtlBtn_rdel);
			}
			else {
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
		}
	}

	@Override
	protected boolean doCndOpeVC(MCEventInfo info) {
		return getDtlL().isStatusNone() || confirmRegDataClear();
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setCndValue();
		setCndMode();
		setRegTgtValue(info);
		setModeByRegTgt();

		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}

	protected void setCndValue() {
		if (MCCollectionUtil.contains(getStatus(), UPD_MOD_APL, DEL_APL)) {
			setValueEx(Cnd_aprv_sts_typ, MAC_APRV_STS_TYP.OPN.value());
		}
		else {
			setValueEx(Cnd_aprv_sts_typ, null);
		}
	}

	protected void setCndMode() {
		if (MCCollectionUtil.contains(getStatus(), UPD_MOD_APL, DEL_APL)) {
			Cnd_aprv_sts_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_aprv_sts_typ.setMode(MCMode.ENABLE);
		}
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}
		boolean ref = MCCollectionUtil.contains(getStatus(), REF, REF_APL);
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
		boolean ref = MCCollectionUtil.contains(getStatus(), REF, REF_APL);
		if (getCndR().wg_flg()) {
			Cnd_wg_cd.setMode(MCMode.ENABLE);
			Cnd_wg_nm.setMode(MCMode.ENABLE);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}
			setDefaultMode(DtlBtn_upd_wg);
			setDefaultMode(DtlBtn_upd_apl_wg);
			setDefaultMode(DtlBtn_del_wg);
			setDefaultMode(DtlBtn_del_apl_wg);
			DtlBtn_upd_cmn.setMode(MCMode.INVISIBLE);
			DtlBtn_upd_apl_cmn.setMode(MCMode.INVISIBLE);
			DtlBtn_del_cmn.setMode(MCMode.INVISIBLE);
			DtlBtn_del_apl_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			setDefaultMode(DtlBtn_upd_cmn);
			setDefaultMode(DtlBtn_upd_apl_cmn);
			setDefaultMode(DtlBtn_del_cmn);
			setDefaultMode(DtlBtn_del_apl_cmn);
			DtlBtn_upd_wg.setMode(MCMode.INVISIBLE);
			DtlBtn_upd_apl_wg.setMode(MCMode.INVISIBLE);
			DtlBtn_del_wg.setMode(MCMode.INVISIBLE);
			DtlBtn_del_apl_wg.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		fillSpace();
		setRegTgtValue(info);
		setModeByRegTgt();
		getBulkSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		fillSpace();
		setRegTgtValue(info);
		setModeByRegTgt();
		getBulkSetR().clearAll();
	}
	@Override
	public void fillSpace() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_APL.isSelected()) {
			DtlTable.fillSpace();
		}
	}

	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		setBulkDtMode();
	}

	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		setBulkDtMode();
	}

	@Override
	public void doBulkSet_rev_rate_NC(MCEventInfo info) {
		super.doBulkSet_rev_rate_NC(info);
		setBulkUpriMode();
	}

	@Override
	public void doBulkSet_rnd_typ_NC(MCEventInfo info) {
		super.doBulkSet_rnd_typ_NC(info);
		setBulkUpriMode();
	}

	@Override
	public void doBulkSet_rev_date_NC(MCEventInfo info) {
		super.doBulkSet_rev_date_NC(info);
		setBulkUpriMode();
	}

	@Override
	public void doDtl2_apl_dt_LC(MCEventInfo info) {
		super.doDtl2_apl_dt_LC(info);

		if (!isNull(getDtl2R().apl_dt()) && isNull(getDtl2R().apl_usr_cd())) {
			setValueEx(Dtl2_apl_usr_cd, MCSys.user.ID());
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {

		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		protected boolean isUpdMode() {
			return MCCollectionUtil.contains(
					getStatus(), UPD, UPD_APL, UPD_MOD_APL);
		}

	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getBulkSetR().clearAll();
		setValueEx(Dtl2_apl_no, null);
		setValueEx(Dtl2_aprv_no, null);
		setValueEx(Dtl2_mst_apl_memo, null);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		DtlTable.setStatusColumnVisible(true);
		DtlTable.fillSpace();
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		DtlTable.setStatusColumnVisible(false);
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setUPD_APLStatus() {
		super.setUPD_APLStatus();
		DtlTable.setStatusColumnVisible(true);
		DtlTable.fillSpace();
		adjustDtl2SplitPane(0.5);
	}

	@Override
	public void setUPD_MOD_APLStatus() {
		super.setUPD_MOD_APLStatus();
		DtlTable.setStatusColumnVisible(false);
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setDEL_APLStatus() {
		super.setDEL_APLStatus();
		DtlTable.setStatusColumnVisible(false);
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setREF_APLStatus() {
		super.setREF_APLStatus();
		DtlTable.setStatusColumnVisible(false);
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.setStatusColumnVisible(false);
		adjustDtl2SplitPane(1.0);
	}

	@Override
	public void setFIXStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			super.setFIXStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			super.setFIXStatus();
		}
		else if (Cnd_ope_APL.isSelected()) {
			setFIX_APLStatus();
		}
		else if (Cnd_ope_MOD_APL.isSelected()) {
			setFIX_MOD_APLStatus();
		}
		else if (Cnd_ope_DEL_APL.isSelected()) {
			setFIX_MOD_APLStatus();
		}
		setRegTgtMode();
		setModeByRegTgt();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
		setTabMode();
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

	protected void setTabMode() {
		boolean flg = Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()
				|| Cnd_ope_APL.isSelected();
		CndTabTab.setEnabledAt(CndTabTab.indexOfComponent(Tab3Panel), !flg);

		// 表示中のタブが非表示になったら別のタブに切り替える
		if (!CndTabTab.isEnabledAt(CndTabTab.getSelectedIndex())) {
			for (int i=0; i < CndTabTab.getTabCount(); i++) {
				if (CndTabTab.isEnabledAt(i)) {
					CndTabTab.setSelectedIndex(i);
					break;
				}
			}
		}
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
		else if (Cnd_ope_APL.isSelected()) {
			setStatus(UPD_APL);
		}
		else if (Cnd_ope_MOD_APL.isSelected()) {
			setStatus(UPD_MOD_APL);
		}
		else if (Cnd_ope_DEL_APL.isSelected()) {
			setStatus(DEL_APL);
		}
		else if (Cnd_ope_REF_APL.isSelected()) {
			setStatus(REF_APL);
		}
		setModeByRegTgt();
	}

	protected void adjustDtl2SplitPane(double location) {
		MCSplitPane sp = getClosestSplitPane(Dtl2Panel);
		if (sp != null) {
			sp.setDividerLocation(location);
		}
	}

	protected MCSplitPane getClosestSplitPane(Container p) {
		if (p == null) {
			return null;
		}
		if (p instanceof MCSplitPane) {
			return (MCSplitPane) p;
		}
		return getClosestSplitPane(p.getParent());
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		initCnd();
		initRegTgt();
		initApl();
	}

	protected void initCnd() {

	}

	protected void initRegTgt() {
		if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		else if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void initApl() {
		setValueEx(Dtl2_apl_dt, getToday());
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_upri_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_upri_dec_place);
		Dtl_upribf_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_upri_dec_place);
		Dtl_upri1_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_upri_dec_place);
		Dtl_upri2_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_upri_dec_place);
		Dtl_upri3_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_upri_dec_place);
		Dtl2_usr_dpt_p_PPanel.setRelateBeans(Dtl2_apl_dt);
	}

}