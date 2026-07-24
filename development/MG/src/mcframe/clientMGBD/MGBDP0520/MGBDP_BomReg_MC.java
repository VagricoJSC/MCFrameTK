package mcframe.clientMGBD.MGBDP0520;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5310.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_BomReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_BomReg_MC extends MGBDP_BomReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_BomReg_MC() {
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
	public MGBDP_BomReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0520_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Srch01Caller<P extends MGBDP_BomReg, B extends MG_MGBDL0520_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0520_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_non_calc_flg, Cnd_on_non_calc_flg));
		}

		@Override
		protected void show() {
			setCndValues();
			for (RsltR r : bridge.down0()) {
				setHdrValues(r);
			}
			super.show();
		}
		
		protected void setCndValues() {
			setValueEx(Hdr_calc_ctg_cd, getCndR().calc_ctg_cd());
			setValueEx(Hdr_wg_cd, getCndR().wg_cd());
			setValueEx(Hdr_term, getCndR().term());
			setValueEx(Hdr_par_itm_cd, getCndR().par_itm_cd());
			setValueEx(Hdr_par_itm_sub1, getCndR().par_itm_sub1());
			setValueEx(Hdr_par_itm_sub2, getCndR().par_itm_sub2());
			setValueEx(Hdr_par_itm_sub3, getCndR().par_itm_sub3());
			setValueEx(Hdr_bom_ptn, getCndR().bom_ptn());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setInitStatus();
		}
	}

	/**
	 * [MG_MGBDL0520_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Upd01Caller<P extends MGBDP_BomReg, B extends MG_MGBDL0520_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0520_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getHdrR()));
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			if (Cnd_ope_INS.isSelected()) {
				for (RsltR r : bridge.up0()) {
					setHdrValues(r);
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_INS.isSelected()) {
				setFIX_IStatus();
			}
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCndValues();
		}
		
		protected void setCndValues() {
			if (Cnd_ope_INS.isSelected()) {
				setValueEx(Cnd_calc_ctg_cd, getHdrR().calc_ctg_cd());
				setValueEx(Cnd_wg_cd, getHdrR().wg_cd());
				setValueEx(Cnd_term, getHdrR().term());
				setValueEx(Cnd_par_itm_cd, getHdrR().par_itm_cd());
				setValueEx(Cnd_par_itm_sub1, getHdrR().par_itm_sub1());
				setValueEx(Cnd_par_itm_sub2, getHdrR().par_itm_sub2());
				setValueEx(Cnd_par_itm_sub3, getHdrR().par_itm_sub3());
				setValueEx(Cnd_bom_ptn, getHdrR().bom_ptn());
			}
		}
	}

	/**
	 * [MG_MGBDL0520_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Del01Caller<P extends MGBDP_BomReg, B extends MG_MGBDL0520_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0520_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0520_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0500]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0500(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		doBtn_open_MGBDP0500(r);
	}
	
	public void doBtn_open_MGBDP0500(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0500");
		mcframe.clientMGBD.MGBDP0500.CndR to = mcframe.clientMGBD.MGBDP0500.CndR.create();

		to.term_fr(r.term());
		to.term_to(r.term());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.chd_itm_cd());
		to.itm_sub1(r.chd_itm_sub1());
		to.itm_sub2(r.chd_itm_sub2());
		to.itm_sub3(r.chd_itm_sub3());
		
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0500(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		doBtn_open_MGBDP0510(r);
	}
	
	public void doBtn_open_MGBDP0510(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();

		to.term_fr(r.term());
		to.term_to(r.term());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.chd_itm_cd());
		to.itm_sub1(r.chd_itm_sub1());
		to.itm_sub2(r.chd_itm_sub2());
		to.itm_sub3(r.chd_itm_sub3());
		
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0510(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0540]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0540(MCEventInfo info) {
		doBtn_open_MGBDP0540();
	}
	
	public void doBtn_open_MGBDP0540() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0540");
		mcframe.clientMGBD.MGBDP0540.CndR to = mcframe.clientMGBD.MGBDP0540.CndR.create();
		
		to.term(getHdrR().term());
		to.wg_cd(getHdrR().wg_cd());
		to.itm_cd(getHdrR().par_itm_cd());
		to.itm_sub1(getHdrR().par_itm_sub1());
		to.itm_sub2(getHdrR().par_itm_sub2());
		to.itm_sub3(getHdrR().par_itm_sub3());
		to.bom_ptn(getHdrR().bom_ptn());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBD.MGBDP0540.CndR.$term);
		
		aso.putCnd(to, list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[ins_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_ins_cmn(MCEventInfo info) {
		callMG_MGBDL0520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[ins_wg]の押下時の処理
	 */
	@Override
	public void doBtn_ins_wg(MCEventInfo info) {
		callMG_MGBDL0520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMG_MGBDL0520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMG_MGBDL0520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMG_MGBDL0520_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMG_MGBDL0520_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}
	
	protected void setupPartsSub() {
		Rslt_par_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_par_unit_cd, Hdr_par_dec_place);
		Rslt_chd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_chd_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_base_qty_p_PPanel.setRelateBeans(columnRslt_chd_unit_cd, columnRslt_chd_dec_place);
		Rslt_fxd_chd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_chd_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_min_qty_p_PPanel.setRelateBeans(columnRslt_chd_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_batch_qty_p_PPanel.setRelateBeans(columnRslt_chd_unit_cd, columnRslt_chd_dec_place);
	}

	@Override
	protected void valueInit() {
		valueInitSub();
		super.valueInit();
	}
	
	protected void valueInitSub() {

		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		initRegTgt();

		setDefCalcCtg(Cnd_calc_ctg_cd);
		Cnd_term_p_PPanel.setDefault();
		setValueEx(Cnd_on_non_calc_flg, true);
		setValueEx(Cnd_off_non_calc_flg, true);
		valueInitIns();
	}
	
	protected void valueInitIns() {
		setDefCalcCtg(Hdr_calc_ctg_cd);
		Hdr_term_p_PPanel.setDefault();
	}

	protected void initRegTgt() {
		if (!Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		if (!Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_wg_flg, false);
		}
		if (!Cnd_ope_REF.isSelected()) {
			if (getCndR().cmn_flg() && getCndR().wg_flg()) {
				setValueEx(Cnd_cmn_flg, false);
			}
			else if (!getCndR().cmn_flg() && !getCndR().wg_flg()) {
				if (Cnd_srch_wg.authorize()) {
					setValueEx(Cnd_wg_flg, true);
				}
				else if (Cnd_srch_cmn.authorize()) {
					setValueEx(Cnd_cmn_flg, true);
				}
			}
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	public void setInitStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				setSRCH_UPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setSRCH_DELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setSRCH_REFStatus();
			}
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	public void setRefStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
		fillSpace();
	}
	
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_INS.isSelected()) {
			RsltTable.fillSpace();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			if (!getRsltL().isEmpty()) {
				RsltTable.fillSpace();
			}
		}
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
		Ctrl_ctrl_PPanel.expand(false);
		HdrPanel.focusFirstComponent();
		fillSpace();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setStatusCom();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD) || isSame(getStatus(), INS);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setStatusCom() {
		setRegTgtMode();
		setModeByRegTgt();
		setStatusColumn();
		setFocus();
		setBtnMode();
	}

	protected void setRegTgtMode() {
		if (!Cnd_srch_cmn.authorize() || !Cnd_srch_wg.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setModeByRegTgt() {
		MCTextComboBox wg_cd = Cnd_ope_INS.isSelected() ? Hdr_wg_cd : Cnd_wg_cd;
		MCTextField wg_nm = Cnd_ope_INS.isSelected() ? Hdr_wg_nm : Cnd_wg_nm;
		if (getCndR().wg_flg()) {
			setDefaultMode(wg_cd);
			setDefaultMode(wg_nm);
			setDefaultMode(Btn_ins_wg);
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_ins_cmn.setMode(MCMode.INVISIBLE);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(wg_cd, null);
			setValueEx(wg_nm, null);

			wg_cd.setMode(MCMode.READ_ONLY);
			wg_nm.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_ins_cmn);
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_ins_wg.setMode(MCMode.INVISIBLE);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			if (Cnd_ope_INS.isSelected()) {
				HdrPanel.focusFirstComponent();
			}
			else {
				CndPanel.focusFirstComponent();
			}
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_radd.setMode(MCMode.DISABLE);
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
				setDefaultMode(Btn_radd);
				setDefaultMode(Btn_rcopy);
			}
		}

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBDP0500, isEnableBtn_open_MGBDP0500(r));
		setBtnModeByFlg(Btn_open_MGBDP0510, isEnableBtn_open_MGBDP0510(r));
		setBtnModeByFlg(Btn_open_MGBDP0540, isEnableBtn_open_MGBDP0540());
	}

	/**
	 * 原価品目情報登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0500(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.term(), r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());
	}

	/**
	 * 原価品目詳細登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0510(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.term(), r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());
	}

	/**
	 * 原価ＢＯＭ一覧照会（展開）に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0540() {
		return !isNullOr(getHdrR().par_itm_cd(), getHdrR().par_itm_sub1(), getHdrR().par_itm_sub2(), getHdrR().par_itm_sub3());
	}

	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_itm_p_PPanel.addItmLCListner(this);
		Rslt_itm_p_PPanel.addItmLCListner(this);
		columnRslt_chd_rqmt_qty.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Hdr_itm_p_PPanel.isItm(lc)) {
			doHdr_itm_cd_LC(info);
		}
		else if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_cd_LC(info);
		}
		else if (lc == columnRslt_chd_rqmt_qty) {
			doRslt_chd_rqmt_qty_LC(info);
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isRegStatus() && isChanged(RsltTable)
					|| Cnd_ope_INS.isSelected() && isChanged(getHdrR())) {
				return confirmRegDataClear();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearforOpeChange(info);
		setInitStatus();
		initRegTgt();
	}
	
	protected void clearforOpeChange(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			if (isSame(getStatus(), REF)) {
				getRsltL().setStatus(Status.CREATE);
				clearNotInheritInfo(new ArrayList<MCContainer>(getRsltL()));
				RsltTable.fillSpace();
			}
			else {
				clearContainers(getRsltL(), getHdrR());
			}
			valueInitIns();
		}
		else {
			clearContainers(getRsltL(), getHdrR());
		}
	}
	
	@Override
	public boolean doCnd_cmn_flg_VC(MCEventInfo info) {
		if (isChanged(RsltTable) && !confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_cmn_flg_VC(info);
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		if (!Cnd_ope_INS.isSelected()) {
			clearContainers(getHdrR());
		}
		clearContainers(getRsltL());
		if ((Boolean)info.getNewValue()) {
			setValueEx(Cnd_wg_flg, false);
		}
		setInitStatus();
	}

	@Override
	public boolean doCnd_wg_flg_VC(MCEventInfo info) {
		if (isChanged(RsltTable) && !confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_wg_flg_VC(info);
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		if (!Cnd_ope_INS.isSelected()) {
			clearContainers(getHdrR());
		}
		clearContainers(getRsltL());
		if ((Boolean)info.getNewValue()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		setInitStatus();
	}
	
	public void doHdr_itm_cd_LC(MCEventInfo info) {
		setValueEx(Hdr_bom_ptn, null);

		for (RsltR r : getRsltL().statusChangedList()) {
			setValueEx(columnRslt_par_rqmt_qty, r.getGUIIndex(), null);
			setHdrValues(r);
		}
		setBtnMode();
	}


	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	public void doRslt_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);
		
		setHdrValues(r);

		if (Rslt_itm_p_PPanel.isItmFix(idx)) {
			if (isNull(r.par_rqmt_qty())) {
				setValueEx(columnRslt_par_rqmt_qty, idx, getHdrR().par_cost_std_qty());
			}
			if (isNull(r.fxd_chd_rqmt_qty())) {
				setValueEx(columnRslt_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.chd_min_qty())) {
				setValueEx(columnRslt_chd_min_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.chd_batch_qty())) {
				setValueEx(columnRslt_chd_batch_qty, idx, MCNumber.ZERO);
			}
		}
		else {
			setValueEx(columnRslt_par_rqmt_qty, idx, null);
			setValueEx(columnRslt_fxd_chd_rqmt_qty, idx, null);
			setValueEx(columnRslt_chd_min_qty, idx, null);
			setValueEx(columnRslt_chd_batch_qty, idx, null);
		}
	}
	
	protected void setHdrValues(RsltR r) {
		r.calc_ctg_cd(getHdrR().calc_ctg_cd());
		r.wg_cd(getHdrR().wg_cd());
		r.term(getHdrR().term());
		r.par_itm_cd(getHdrR().par_itm_cd());
		r.par_itm_sub1(getHdrR().par_itm_sub1());
		r.par_itm_sub2(getHdrR().par_itm_sub2());
		r.par_itm_sub3(getHdrR().par_itm_sub3());
		r.par_unit_cd(getHdrR().par_unit_cd());
		r.par_unit_nm(getHdrR().par_unit_nm());
		r.bom_ptn(getHdrR().bom_ptn());
	}
	
	@Override
	public void doRslt_oper_cd_LC(MCEventInfo info) {
		super.doRslt_oper_cd_LC(info);
		if (isNull(info.getNewValue())) {
			setValueEx(columnRslt_oper_seq,  info.getEventIndex(), null);
		}
		else if (isNull(getRsltL().get(info.getEventIndex()).oper_seq())) {
			setValueEx(columnRslt_oper_seq, info.getEventIndex(), MCNumber.ONE);
		}
	}

	@Override
	public void doRslt_alt_grp_cd_LC(MCEventInfo info) {
		super.doRslt_alt_grp_cd_LC(info);
		if (isNull(info.getNewValue())) {
			setValueEx(columnRslt_alt_itm_ratio,  info.getEventIndex(), null);
		}
	}
	
	protected void doRslt_chd_rqmt_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.chd_base_qty())) {
			setValueEx(columnRslt_chd_base_qty, info.getEventIndex(), r.chd_rqmt_qty());
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return isUpdStatus();
		}
		return super.useFileIn(table);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected boolean useCustomExcelIn(MCTable table) {
		if (table == RsltTable) {
			return false;
		}
		return super.useCustomExcelIn(table);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected boolean useCustomCsvIn(MCTable table) {
		if (table == RsltTable) {
			return false;
		}
		return super.useCustomCsvIn(table);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@SuppressWarnings("rawtypes")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_oper_seq) {
					if (isNull(r.oper_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_alt_itm_ratio) {
					if (isNull(r.alt_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}