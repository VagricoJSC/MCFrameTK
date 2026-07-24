package mcframe.clientMSBG.MSBGP0010;

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
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_BillCl"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_BillCl_MC extends MSBGP_BillCl_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillCl_MC() {
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
	public MSBGP_BillCl_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Srch01Caller<P extends MSBGP_BillCl, B extends MS_MSBGL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}

		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_manual_flg, Cnd_sel_flg, Cnd_each_sls_flg, Cnd_batch_flg));
			msgList.addAll(checkAtLeastOne(Cnd_on_edi_flg, Cnd_off_edi_flg));
		}

		@Override
		protected void setMode() {

			super.setMode();
			setUPD_UStatus();
		}

		@Override
		protected void setModeNoDown() {

			setSRCH_UStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			setRecId();
			setBaseDt();
			getDtlL().clear();	// 明細選択との引継ぎパラメータをクリア
		}

		/**
		 * レコードＩＤ（連番）を設定する
		 * 
		 */
		protected void setRecId() {

			MCNumber num = MCNumber.ONE;

			for (HdrR hdrR : bridge.down0()) {
				hdrR.rec_id(num);
				num = num.add(MCNumber.ONE);
			}
		}
		
		protected void setBaseDt() {
			for (HdrR hdrR : bridge.down0()) {
				hdrR.base_dt(getBaseDt(hdrR));
			}
		}
	}

	/**
	 * [MS_MSBGL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Srch02Caller<P extends MSBGP_BillCl, B extends MS_MSBGL0010_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0010_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}

		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_manual_flg, Cnd_sel_flg, Cnd_batch_flg));
		}

		@Override
		protected void setMode() {

			super.setMode();
			setUPD_DStatus();
			if (getCndR().new_flg()) {
				Cnd_bill_ym.setMode(MCMode.READ_ONLY);
			}
		}

		@Override
		protected void setModeNoDown() {

			setSRCH_DStatus();
			if (getCndR().new_flg()) {
				Cnd_bill_ym.setMode(MCMode.READ_ONLY);
			}
		}

	}

	/**
	 * [MS_MSBGL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Upd01Caller<P extends MSBGP_BillCl, B extends MS_MSBGL0010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setBtnMode();
		}

	}

	/**
	 * [MS_MSBGL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Del01Caller<P extends MSBGP_BillCl, B extends MS_MSBGL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0010_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setBtnMode();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {

		if (Cnd_ope_UPD.isSelected()) {
			callMS_MSBGL0010_Srch01();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			callMS_MSBGL0010_Srch02();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0020(MCEventInfo info) {
		HdrR selR = HdrTable.getSelectedMCRow();

		if (selR == null) {	
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addDateColumn("bill_ym", selR.bill_ym());
		bind.addNumberColumn("bill_cl_day", selR.bill_cl_day());
		bind.addStringColumn("bcst_cd", selR.bcst_cd());
		bind.addStringColumn("bcst_nm", selR.bcst_nm());
		bind.addStringColumn("bill_dpt_cd", selR.bill_dpt_cd());
		bind.addStringColumn("bill_dpt_nm", selR.bill_dpt_nm());
		bind.addStringColumn("wg_cd", selR.wg_cd());
		bind.addStringColumn("wg_nm", selR.wg_nm());
		bind.addStringColumn("wrk_no", selR.wrk_no());
		bind.addStringColumn("wrk_nm", selR.wrk_nm());
		bind.addStringColumn("trd_cur_cd", selR.trd_cur_cd());
		bind.addStringColumn("trd_cur_nm", selR.trd_cur_nm());
		bind.addStringColumn("base_cur_cd", getBaseCur().cur_cd());
		bind.addStringColumn("base_cur_nm", getBaseCur().cur_nm());
		bind.addNumberColumn("base_cur_amt_dec_place", getBaseCur().amt_dec_place());
		bind.addNumberColumn("base_cur_upri_dec_place", getBaseCur().upri_dec_place());
		bind.addStringColumn("iv_no", selR.iv_no());
		bind.addBooleanColumn("bill_d_sel_flg", selR.bill_d_sel_flg());
		bind.addNumberColumn("rec_id", selR.rec_id());
		openModalPanel("MS", "MSBGP0020", T1, bind, getDtlL(), selR);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0030(MCEventInfo info) {

		HdrR fr = HdrTable.getSelectedMCRow();

		if (fr == null) {	
			dialog(msgNoSelectedRow());
			return;
		}	

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0030");
		MCRow asoRow = crtOpenMSBGP0030CndR(aso, fr);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MSBGP0030]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	protected MCRow crtOpenMSBGP0030CndR(MAUCP_AppScreenOpener aso, HdrR fr) {
		mcframe.clientMSBG.MSBGP0030.MSBGP_BillSrch p = 
				(mcframe.clientMSBG.MSBGP0030.MSBGP_BillSrch) aso.getPanel();
		mcframe.clientMSBG.MSBGP0030.CndR to = mcframe.clientMSBG.MSBGP0030.CndR.create();

		to.ope(p.Cnd_ope_PRT.getActionCommand());
		to.bill_cl_ym_from(fr.bill_ym());
		to.bill_cl_ym_to(fr.bill_ym());
		to.bill_cl_day(fr.bill_cl_day());
		to.bcst_cd(fr.bcst_cd());
		to.bill_dpt_cd(fr.bill_dpt_cd());
		to.bill_dpt_nm("");
		to.bcst_cd(fr.bcst_cd());
		to.bill_no(fr.bill_no());
		to.trd_cur_cd(fr.trd_cur_cd());
		to.wrk_no(fr.wrk_no());
		to.not_cl_flg(false);
		to.cl_batch_flg(true);
		to.cl_scrn_flg(true);
		to.each_sls_flg(true);
		to.not_prnt_flg(true);
		to.prnt_flg(true);
		to.dmstic_flg(true);
		to.foreign_flg(true);
		to.not_adjst_flg(true);
		to.adjst_flg(true);
		to.not_prnt_ex_flg(true);
		to.on_edi_flg(true);
		to.off_edi_flg(true);
		to.inc_no_bill_flg(true);
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0080(MCEventInfo info) {

		HdrR r = HdrTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0080");
		aso.putCnd(crtOpenMSBGP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MABGP0080]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0080.CndR crtOpenMSBGP0080CndR(MAUCP_AppScreenOpener aso, HdrR r) {
		mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg p = 
				(mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0080.CndR to = 
				mcframe.clientMSBG.MSBGP0080.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.bill_no(r.bill_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1370]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1370(MCEventInfo info) {
		HdrR r = HdrTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1370");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP1370CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBBP1370]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1370.CndR crtOpenMSBBP1370CndR(MAUCP_AppScreenOpener aso, HdrR r) {
		mcframe.clientMSBB.MSBBP1370.CndR to = 
				mcframe.clientMSBB.MSBBP1370.CndR.create();

		to.ac_ym_fr(r.bill_ym());
		to.ac_ym_to(r.bill_ym());
		to.bcst_cd(r.bcst_cd());
		to.wrk_no(r.wrk_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {

		doSelectAll(HdrTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {

		doDeselectAll(HdrTable);

	}
	/**
	 * Panel[Btn]のボタン[upd1]の押下時の処理
	 */
	@Override
	public void doBtn_upd1(MCEventInfo info) {
		callMS_MSBGL0010_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMS_MSBGL0010_Del01();
	}

	@Override
	public MCTable getListRegTable() {
		return HdrTable;
	}

	// /////////////////////オープン時の処理実装/////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_bill_ym, toYM(getToday()));
		setValueEx(Cnd_manual_flg, true);
		setValueEx(Cnd_sel_flg, true);
		setValueEx(Cnd_each_sls_flg, true);
		setValueEx(Cnd_batch_flg, false);
		setValueEx(Cnd_new_flg, false);
		setValueEx(Cnd_on_edi_flg, true);
		setValueEx(Cnd_off_edi_flg, true);
		setValueEx(Cnd_base_cur_cd, getCo().base_cur_cd());
		setValueEx(Cnd_bill_xrate_cd, getCo().bill_xrate_cd());
	}

	protected void valueInitSubDel() {
		setValueEx(Cnd_bill_ym, null);
		setValueEx(Cnd_manual_flg, true);
		setValueEx(Cnd_sel_flg, true);
		setValueEx(Cnd_each_sls_flg, false);
		setValueEx(Cnd_batch_flg, true);
		setValueEx(Cnd_new_flg, true);
	}

	// /////////////////////ステータス制御の実装/////////////////////
	@Override
	public void setSRCH_UStatus() {

		super.setSRCH_UStatus();
		focusFirstComponent();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
		setBtnMode();
	}

	@Override
	public void setSRCH_DStatus() {

		super.setSRCH_DStatus();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
		setBtnMode();
	}

	@Override
	public void setUPD_UStatus() {
		super.setUPD_UStatus();
		if (!getCo().bill_xrate_conv_flg()) {
			columnHdr_bill_xrate.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(columnHdr_bill_xrate);
		}
		
		HdrTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
		setBtnMode();
	}

	@Override
	public void setUPD_DStatus() {
		super.setUPD_DStatus();
		HdrTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
		setBtnMode();
	}

	// /////////////////////種別変更時の処理実装/////////////////////
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DStatus();
			getHdrL().clear();
			getDtlL().clear();
			valueInitSubDel();
		}
		else {
			setSRCH_UStatus();
			getHdrL().clear();
			valueInitSub();
			setValueEx(Cnd_each_sls_flg, true);
			setValueEx(Cnd_new_flg, false);
			setValueEx(Cnd_bill_no, null);
			setValueEx(Cnd_bill_ym, toYM(getToday()));
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		} else {
			if (isStatusNone(getHdrL())) {
				return true;
			} else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_new_flg_NC(MCEventInfo info) {
		if (getCndR().new_flg()) {
			getCndR().clear(CndR.$bill_ym);
			Cnd_bill_ym.setMode(MCMode.READ_ONLY);
		} else {
			Cnd_bill_ym.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void doHdr_NC(MCEventInfo info) {
		super.doHdr_NC(info);

		setBtnMode();
	}
	@Override
	public void doHdr_bill_ym_NC(MCEventInfo info) {
		super.doHdr_bill_ym_NC(info);
		HdrR hdrR = getHdrL().get(info.getEventIndex());
		setValueEx(columnHdr_base_dt, info.getEventIndex(), getBaseDt(hdrR));
	}
	@Override
	public void doHdr_bill_cl_day_NC(MCEventInfo info) {
		super.doHdr_bill_cl_day_NC(info);
		HdrR hdrR = getHdrL().get(info.getEventIndex());
		setValueEx(columnHdr_base_dt, info.getEventIndex(), getBaseDt(hdrR));
	}


	// /////////////////////値変更イベント/////////////////////

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		HdrTable.setCellConfig(crtHdrTableCellConfig());
	}

	protected HdrTableCellConfig crtHdrTableCellConfig() {
		return new HdrTableCellConfig();
	}

	protected class HdrTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			HdrR r = (HdrR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isSame(getStatus(), UPD_U)) {
				// 請求締日
				if (columnHdr_bill_cl_day == column) {
					if (MAC_BILL_CL_TYP.isSEL(r.bill_cl_typ()) ||
							MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 明細選択済はONの場合のみ編集可能
				if (columnHdr_bill_d_sel_flg == column) {
					if (!r.bill_d_sel_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (columnHdr_rcv_schd_dt == column) {
					if (MAC_BILL_CL_TYP.isSEL(r.bill_cl_typ()) ||
							MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						return MCMode.REQUIRED;
					} else {
						return MCMode.ENABLE;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public boolean doHdr_bill_d_sel_flg_VC(MCEventInfo info) {

		int i = info.getEventIndex();

		if (i < 0) {
			return super.doHdr_bill_d_sel_flg_VC(info);
		}

		boolean newVal = (Boolean)info.getNewValue();

		// チェックが外された場合はダイアログで確認する
		if (!newVal) {
			// ダイアログで「はい」を選択した場合
			if (MCMessageBox.YES_OPTION == confirm(MSBGP0001)) {
				MCList<DtlR> subL = getDtlL().subList(DtlR.$rec_id, getHdrL().get(i).rec_id());
				getDtlL().removeAll(subL);
				return super.doHdr_bill_d_sel_flg_VC(info);
			}
			// ダイアログで「いいえ」を選択した場合
			else {
				return false;
			}
		}

		return false;

	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == HdrTable) {
			HdrR r = getHdrL().get(info.getEventIndex());

			if (r == null) {
				return;
			}
			if (Cnd_ope_DEL.isSelected() || MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return;
			}
			doBtn_open_MSBGP0020(info);
		}
	}

	protected void setBtnMode() {
		HdrR r = HdrTable.getSelectedMCRow();

		if (r == null) {
			Btn_open_MSBGP0020.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0030.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
			Btn_open_MSBBP1370.setMode(MCMode.DISABLE);
		}
		else {
			if(!MAC_STR.isNULL_VAL(r.bill_no()) && Cnd_ope_UPD.isSelected()) {
				setDefaultMode(Btn_open_MSBGP0030);
				setDefaultMode(Btn_open_MSBGP0080);
				
			} else {
				Btn_open_MSBGP0030.setMode(MCMode.DISABLE);
				Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
			}
			if (Cnd_ope_UPD.isSelected() && !MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				setDefaultMode(Btn_open_MSBGP0020);
			}
			else {
				Btn_open_MSBGP0020.setMode(MCMode.DISABLE);
			}
			setDefaultMode(Btn_open_MSBBP1370);
		}
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_billXrate_p_PPanel.setRelateBeans(
			columnHdr_trd_cur_cd, Cnd_base_cur_cd, Cnd_bill_xrate_cd, columnHdr_base_dt, true);
	}
	protected MCDate getBaseDt(HdrR hdrR) {
		if (MAC_BILL_CL_TYP.isSEL(hdrR.bill_cl_typ())
			|| MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {
			return getToday();
		}
		
		if (isNullOr(hdrR.bill_ym(), hdrR.bill_cl_day())) {
			return null;
		}
		else if (isSame(hdrR.bill_cl_day(), 0)) {
			return hdrR.bill_ym();
		}
		MCDate tmp = hdrR.bill_ym().addDay(hdrR.bill_cl_day()).addDay(-1);
		if (tmp.getMonth() != hdrR.bill_ym().getMonth()) {
			return hdrR.bill_ym().endOfMonth();
		}
		else {
			return tmp;
		}
	}

}