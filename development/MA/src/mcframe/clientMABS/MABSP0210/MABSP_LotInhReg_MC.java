package mcframe.clientMABS.MABSP0210;

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
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.sys.MCSys;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_LotInhReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_LotInhReg_MC extends MABSP_LotInhReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_LotInhReg_MC() {
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
	public MABSP_LotInhReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Srch01Caller<P extends MABSP_LotInhReg, B extends MA_MABSL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getHdrR(), getHdrAllL().get(0));
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			chkSrchBtnMode();
		}
	}

	/**
	 * [MA_MABSL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Upd01Caller<P extends MABSP_LotInhReg, B extends MA_MABSL0210_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0210_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void checkStEndDtValid(MCMessageList list) {
			// 何もしない
		}

		@Override
		protected void checkReq(mcframe.commonCore.notice.MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getHdrR()));
		}

		@Override
		protected boolean checkForCall() {
			setupDtl();
			return super.checkForCall();
		}

		protected void setupDtl() {
			getHdrAllL().clear();
			
			if (!getHdrR().isStatusNone()) {
				HdrR r = getHdrR().clone();
				if (isUpdOpe()) {
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStatus(MCRow.MODIFY);
				}
				getHdrAllL().add(r);
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			for(DtlR r : bridge.up0()) {
				if (isNull(r.upd_cntr())) {
					r.par_itm_cd(getHdrR().par_itm_cd());
					r.par_itm_sub1(getHdrR().par_itm_sub1());
					r.par_itm_sub2(getHdrR().par_itm_sub2());
					r.par_itm_sub3(getHdrR().par_itm_sub3());
					r.bom_ptn(getHdrR().bom_ptn());
					r.lot_inh_col_typ(getHdrR().lot_inh_col_typ());
					r.wg_cd(getHdrR().wg_cd());
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isUpdOpe()) {
				setFIX_UStatus();
				setValueEx(Cnd_par_itm_cd, getHdrR().par_itm_cd());
				if (isNull(getCndR().par_itm_sub1())) {
					setValueEx(Cnd_par_itm_sub1, getHdrR().par_itm_sub1());
				}
				if (isNull(getCndR().par_itm_sub2())) {
					setValueEx(Cnd_par_itm_sub2, getHdrR().par_itm_sub2());
				}
				if (isNull(getCndR().par_itm_sub3())) {
					setValueEx(Cnd_par_itm_sub3, getHdrR().par_itm_sub3());
				}
				if (getCndR().wg_flg()) {
					setValueEx(Cnd_wg_cd, getHdrR().wg_cd());
				}
				setValueEx(Cnd_bom_ptn, getHdrR().bom_ptn());
				setValueEx(Cnd_lot_inh_col_typ, getHdrR().lot_inh_col_typ());
			}
		}
	}

	/**
	 * [MA_MABSL0210_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Del01Caller<P extends MABSP_LotInhReg, B extends MA_MABSL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0210_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Sprt01Caller<P extends MABSP_LotInhReg, B extends MA_MABSL0210_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0210_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean execConfirm() {
			return true;
		}

		@Override
		protected void clear() {
			// 何もしない
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			
			for (DtlR r : bridge.down0()) {
				r.check(true);
				r.setStatus(Status.CREATE);
			}
		}

		MCList<DtlR> _l = MCList.create(DtlR.class);

		@Override
		protected void show() {
			// 画面上の内容を退避
			_l = getDtlL().clone();

			// 画面上の内容を下り電文（子品目展開結果）で置き換え、退避データとマージし、画面上に反映する
			showReplace();
			MCIndexKey key = _l.createIndex(DtlR.$chd_itm_cd, DtlR.$chd_itm_sub1, DtlR.$chd_itm_sub2, DtlR.$chd_itm_sub3);
			MCList<DtlR> addL = _l.createInstance();
			for (DtlR r : getDtlL()) {
				DtlR rec =_l.getFirst(key, r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());
				if (rec == null) {
					addL.add(r);
				}
				else {
					rec.chd_itm_nm(r.chd_itm_nm());
					rec.chd_itm_typ(r.chd_itm_typ());
					rec.chd_itm_typ_nm(r.chd_itm_typ_nm());
					rec.chd_itm_typ_d_cd(r.chd_itm_typ_d_cd());
					rec.chd_itm_typ_d_nm(r.chd_itm_typ_d_nm());
					rec.st_dt(r.st_dt());
					rec.end_dt(r.end_dt());
				}
			}
			_l.addAll(addL);
			getDtlL().setAll(_l);
			sort();
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0210_Srch01();
	}
	/**
	 * Panel[ChdSet]のボタン[chd_srch]の押下時の処理
	 */
	@Override
	public void doChdSet_chd_srch(MCEventInfo info) {
		setValueEx(ChdSet_par_itm_cd, getHdrR().par_itm_cd());
		setValueEx(ChdSet_par_itm_sub1, getHdrR().par_itm_sub1());
		setValueEx(ChdSet_par_itm_sub2, getHdrR().par_itm_sub2());
		setValueEx(ChdSet_par_itm_sub3, getHdrR().par_itm_sub3());
		setValueEx(ChdSet_bom_ptn, getHdrR().bom_ptn());
		setValueEx(ChdSet_lot_inh_col_typ, getHdrR().lot_inh_col_typ());
		callMA_MABSL0210_Sprt01();
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
		callMA_MABSL0210_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0210_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0210_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0210_Del01();
	}


	//-------------------- 初期化ここから --------------------//

	@Override
	protected void tableInit() {
		super.tableInit();
		setDividerPos(TblPanel, 0.5);
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
		if (Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		Hdr_par_itm_p_PPanel.addItmLCListner(this);
		Dtl_chd_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_prio, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub1, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub2, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub3, MCList.SortType.ASC);
	}

	//-------------------- 初期化ここまで --------------------//	

	//-------------------- イベントここから --------------------//
	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);
		if (!isCheckColumn(event)) {
			if (getHdrR().isStatusNone() && !isNull(getHdrR().getValueNE(getUpdCntrColumn()))) {
				getHdrR().setStatus(MCRow.MODIFY);
			}
		}
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Hdr_par_itm_p_PPanel.isItm(lc)) {
			doHdr_par_itm_cd_LC(info);
		}
		else if (Dtl_chd_itm_p_PPanel.isItm(lc)) {
			doDtl_chd_itm_cd_LC(info);
		}
	}

	/**
	 * [Hdr]パネルの[par_itm_cd]のListChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	protected void doHdr_par_itm_cd_LC(MCEventInfo info) {
		if (isNull(getHdrR().bom_ptn())) {
			setValueEx(Hdr_bom_ptn, getHdrR().bom_ptn());
		}
		chkSrchBtnMode();
	}

	@Override
	public void doHdr_bom_ptn_LC(MCEventInfo info) {
		super.doHdr_bom_ptn_LC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doHdr_lot_inh_col_typ_LC(MCEventInfo info) {
		super.doHdr_lot_inh_col_typ_LC(info);

		setValueEx(Hdr_lot_inh_typ, null);
		chkSrchBtnMode();
	}

	@Override
	public void doHdr_lot_inh_typ_LC(MCEventInfo info) {
		super.doHdr_lot_inh_typ_LC(info);
		if (!MAC_LOT_INH_TYP.isCONCAT(getHdrR().lot_inh_typ())) {
			Hdr_add_concat_col.setMode(MCMode.READ_ONLY);
			Hdr_overflow_err_flg.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_add_concat_col, null);
			setValueEx(Hdr_overflow_err_flg, false);
		}
		else {
			setDefaultMode(Hdr_add_concat_col);
			setDefaultMode(Hdr_overflow_err_flg);
		}
	}

	/**
	 * [Dtl]パネルの[chd_itm_cd]のListChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	protected void doDtl_chd_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.chd_itm_cd())) {
			setValueEx(columnDtl_st_dt, idx, null);
			setValueEx(columnDtl_end_dt, idx, null);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getChdSetR().clear();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void doChdSet_wg_cd_LC(MCEventInfo info) {
		super.doChdSet_wg_cd_LC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doChdSet_base_dt_LC(MCEventInfo info) {
		super.doChdSet_base_dt_LC(info);
		chkSrchBtnMode();
	}
	public void chkSrchBtnMode() {
		if (isNull(getChdSetR().wg_cd()) || isNull(getChdSetR().base_dt())) {
				ChdSet_chd_srch.setMode(MCMode.DISABLE);
		}
		else if ((!isNull(getHdrR().par_itm_cd()))
				&& (!isNull(getHdrR().bom_ptn()))
				&& (!isNull(getHdrR().lot_inh_col_typ()))) {
			ChdSet_chd_srch.setMode(MCMode.ENABLE);
		}
		else {
			ChdSet_chd_srch.setMode(MCMode.DISABLE);
		}
	}
	//-------------------- イベントここまで --------------------//

	@Override
	protected void clearAll() {
		super.clearAll();
		getHdrR().clear();
	}

	@Override
	public void fillSpace() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_MOD.isSelected()) {
			DtlTable.fillSpace();
		}
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		if (isUpdOpe()) {
			// 参照登録時、登録ユーザIDや更新カウンタ等を削除
			if (getStatus() == REF) {
				setRowStatusForIns(getHdrR());
				clearNotInheritInfo(getHdrR());
				setRowStatusForIns(getDtlL());
				clearNotInheritInfo(getDtlL());
			}
			else {
				clearAll();
			}
			getDtlTable().setStatusColumnVisible(true);
			setUPDStatus();
			HdrPanel.focusFirstComponent();
		}
		// 参照訂正時
		else if (isModOpe() && getStatus() == REF) {
			getDtlTable().setStatusColumnVisible(true);
			setMODStatus();
			HdrPanel.focusFirstComponent();
		}
		else {
			clearAll();
			if (isModOpe()) {
				getDtlTable().setStatusColumnVisible(true);
			}
			else {
				getDtlTable().setStatusColumnVisible(false);
			}
			setSRCHStatus();
			CndPanel.focusFirstComponent();
		}
		setRegTgtValue(info);
		setModeByRegTgt();
	}

	@Override
	protected void clearNotInheritInfo(MCContainer cont) {
		super.clearNotInheritInfo(cont);
		if (cont instanceof DtlR) {
			for (DtlR r : getDtlL()) {
				setValueEx(columnDtl_st_dt, r.getGUIIndex(), null);
				setValueEx(columnDtl_end_dt, r.getGUIIndex(), null);
			}
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Ctrl_ctrl_PPanel.expand(false);
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		setRegTgtMode();
		fillSpace();
	}
	@Override
	public void setMODStatus() {
		super.setMODStatus();
		Ctrl_ctrl_PPanel.expand(false);
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		setRegTgtMode();
		setBtnMode();
		fillSpace();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		Ctrl_ctrl_PPanel.expand(false);
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		setRegTgtMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		setRegTgtMode();
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		setRegTgtMode();
		setModeByRegTgt();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		setRegTgtMode();
		setModeByRegTgt();
		setBtnMode();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		setBtnMode();
	}

	//-------------------- ステータスここから --------------------//
	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			getDtlTable().setStatusColumnVisible(true);
			setStatus(UPD);
		}
		if (Cnd_ope_MOD.isSelected()) {
			getDtlTable().setStatusColumnVisible(true);
			setStatus(MOD);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			getDtlTable().setStatusColumnVisible(false);
			setStatus(DEL);
		}
		else if (Cnd_ope_REF.isSelected()) {
			getDtlTable().setStatusColumnVisible(false);
			setStatus(REF);
		}
		setModeByRegTgt();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
		setBtnMode();
	}

	protected void setRegTgtMode() {
		if (Cnd_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (Cnd_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD) || isSame(getStatus(), MOD);
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (!isNull(r.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
	}
	//-------------------- ステータスここまで --------------------//

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}

		if (info.getComponent() == Cnd_ope_Group) {
			if (getCndR().cmn_flg() && getCndR().wg_flg()) {
				initRegTgt();
			}
		}
		else if (info.getComponent() == Cnd_cmn_flg) {
			if (isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().wg_flg(false);
			}
			else {
				getCndR().cmn_flg(true);
			}
		}
		else if (info.getComponent() == Cnd_wg_flg) {
			if (isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().cmn_flg(false);
			}
			else {
				getCndR().wg_flg(true);
			}
		}
	}

	protected void setModeByRegTgt() {
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			setDefaultMode(Hdr_wg_cd);
			setDefaultMode(Hdr_wg_nm);
			setDefaultMode(Hdr_wg_nm);
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			if (isUpdOpe() && !isNullOrNullVal(getHdrR().wg_cd())) {
				setValueEx(Hdr_wg_cd, null);
			}
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			Hdr_wg_cd.setMode(MCMode.READ_ONLY);
			Hdr_wg_nm.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
		if (!MAC_LOT_INH_TYP.isCONCAT(getHdrR().lot_inh_typ())) {
			Hdr_add_concat_col.setMode(MCMode.READ_ONLY);
			Hdr_overflow_err_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_add_concat_col);
			setDefaultMode(Hdr_overflow_err_flg);
		}
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getChdSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getChdSetR().clearAll();
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
		public MCMode getPriorMode(
				int index, MCColumnConfig column, MCTable table) {
			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (getStatus() == MOD) {
				if (column == columnDtl_chd_itm_cd
						|| column == columnDtl_chd_itm_sub1
						|| column == columnDtl_chd_itm_sub2
						|| column == columnDtl_chd_itm_sub3) {
					if (!isNull(r.upd_cntr())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------
	@Override
	public MCList getHdr_lot_inh_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLotInhTyp(info));
		return super.getHdr_lot_inh_typ(row, info);
	}
	/**
	 * 表示する継承方法区分を取得する
	 */
	protected MAC_LOT_INH_TYP[] getLotInhTyp(MCEventInfo info) {
		if (MAC_LOT_INH_COL_TYP.is_enable_concat(getHdrR().lot_inh_col_typ())) {
			return MAC_LOT_INH_TYP.array();
		}
		return new MAC_LOT_INH_TYP[] { MAC_LOT_INH_TYP.PRIO, MAC_LOT_INH_TYP.MIN_VALUE, MAC_LOT_INH_TYP.MAX_VALUE };
	}

	//--------------------リストロジック表示制御End-----------------------

}