package mcframe.clientMSBB.MSBBP1220;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5010.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.container.io.MCCsvBinaryReader;
import mcframe.commonCore.param.MCParam;
import mcframe.clientCore.beans.list.MCLinkBeans;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SloSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SloSrch_MC extends MSBBP_SloSrch_MC_A implements IfListRegPanel, MCResultViewerWithFile {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloSrch_MC() {
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
	public MSBBP_SloSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1220_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1220_Imp01Caller<P extends MSBBP_SloSrch, B extends MS_MSBBL1220_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBBL1220_Imp01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBtnR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
			setDayWeekTyp(getRsltL());
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			return csvOutFromContainer(getContainersForOutCsv());
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isAsync()) {
				setFIX_IStatus();
			}
			else if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
				Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
			}
			// ファイル入力後には、正常終了か異常終了かに関わらず一覧を広げる
			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
	}

	/**
	 * [MS_MSBBL1220_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1220_Ins01Caller<P extends MSBBP_SloSrch, B extends MS_MSBBL1220_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1220_Ins01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBtnR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			return csvOutFromContainer(getContainersForOutCsv());
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isAsync()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MS_MSBBL1220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1220_Srch01Caller<P extends MSBBP_SloSrch, B extends MS_MSBBL1220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1220_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setREF_HDRStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBBL1220_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1220_Srch02Caller<P extends MSBBP_SloSrch, B extends MS_MSBBL1220_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1220_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setREF_DTLStatus();
			setColumnOverduePrspctQtyMode();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBBL1220_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1220_Srch03Caller<P extends MSBBP_SloSrch, B extends MS_MSBBL1220_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1220_Srch03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setREF_SHIP_SCHDStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}
	
	/**
	 * 検索条件のチェックの共通処理。
	 * @param msgList メッセージリスト
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		
		msgList.addAll(checkBeforeAfter(Cnd_slo_dt_fr, Cnd_slo_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_sls_schd_dt_fr, Cnd_sls_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_dlv_dt_fr, Cnd_dlv_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_dlv_inst_rcpt_dt_fr, Cnd_dlv_inst_rcpt_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_rcpt_dt_fr, Cnd_rcpt_dt_to));
		
		if (Cnd_disp_unit_DTL.isSelected()) {
			
			msgList.addAll(checkAtLeastOne(SlsStsTypPanel));
		}
		
		msgList.addAll(checkAtLeastOne(AprvStsTypPanel));
		msgList.addAll(checkAtLeastOne(IvPanel));
		msgList.addAll(checkAtLeastOne(EdiPanel));
		
		if (Cnd_disp_unit_DTL.isSelected() || Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			msgList.addAll(checkAtLeastOne(AllowStsTypPanel));
		}
		
		if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			msgList.addAll(checkAtLeastOne(PrStsTypPanel));
		}
	}
	protected void setDayWeekTyp(MCList<RsltR> rsltL) {
		
		for (RsltR rsltR : rsltL) {
			
			if (!isNull(rsltR.dlv_day_week_typ_nm())) {
				
				for (MCRow r : MAC_DAY_WEEK_TYP.list()) {
					
					String dayWeekTypNm = r.getString("day_week_typ_nm");
					String dayWeekTyp = r.getString("day_week_typ");
					if (isSame(dayWeekTypNm, rsltR.dlv_day_week_typ_nm())) {
						rsltR.dlv_day_week_typ(dayWeekTyp);
					}
				}
			}
		}
	}
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		
		Rslt_tdlv_p_PPanel.setTdlvMode(true);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_upri_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_cost_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		
		Rslt_iv_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);

		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_prms_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_dlv_inst_rcpt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_dlv_inst_prms_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_alloc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_wait_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ship_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ship_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_iv_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_iv_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sls_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ship_ret_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_re_ship_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		Rslt_ship_schd_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sls_schd_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		Rslt_not_dlv_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_overdue_prspct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_dlv_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 画面のデフォルト値を設定する。
	 */
	protected void valueInitSub() {
		
		setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_DTL.getActionCommand());
		Cnd_disp_unit_Group.doNC();
		setValueEx(Cnd_ope_Group, Cnd_ope_SRCH.getActionCommand());
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged(RsltTable)){
			return confirmRegDataClear();
		}
		return true;
	}

	@Override
	public boolean isChanged(MCTable<?> tbl) {
		MCList data = tbl.getList().subList(o -> o.getBoolean("check"));
		return !data.isStatusNone();
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub(info);
	}

	/** 種別切替後のイベント */
	public void doCnd_ope_NCSub(MCEventInfo info) {
		
		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
		setDefStsFlgByOpe();
		setStatusColumn();
		setDefAsyncFlgByOpe();
	}

	protected void setDefStsFlgByOpe() {
		if (Cnd_ope_SRCH.isSelected()) {
			setDefaultSrchSlsSts();
		}
		else if (Cnd_ope_IMP.isSelected()) {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_DTL.getActionCommand());
			setBoolean(SlsStsTypPanel, false);
		}
	}

	protected void setDefAsyncFlgByOpe() {
		if (!Cnd_ope_IMP.isSelected()) {
			setValueEx(Btn_async_flg, false);
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_IMP.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		
		setBtnMode();
	}
	
	/**
	 * ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		RsltR rsltR = RsltTable.getSelectedMCRow();
		
		if(!isNull(rsltR)) {
			
			// 受注登録
			if (rsltR.can_flg() || isNull(rsltR.slo_no())) {
				Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1210);
			}
			// 販売納期調整登録
			if (isNull(rsltR.slo_no())) {
				Btn_open_MSBBP1230.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1230);
			}
			
			// 売上実績登録
			if (rsltR.can_flg() 
					|| rsltR.slo_d_can_flg()
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ())
					|| rsltR.cst_iv_flg() || isNull(rsltR.slo_no())
					|| ((!MAC_SLS_BASIS_TYP.isSHIP_BASIS(rsltR.sls_basis_typ()) || !MAC_SHIP_INST_TYP.isNON(rsltR.ship_inst_typ()))
							&& !rsltR.sls_cststk_flg())) {
				Btn_open_MSBBP1310.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1310);
			}

			// 仕入直送売上登録
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ()) || rsltR.can_flg() || rsltR.cst_iv_flg() || isNull(rsltR.slo_no())) {
				
				Btn_open_MSBBP1360.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1360);
			}
			
			// 引当先変更
			if (isNull(rsltR.wait_qty()) || !rsltR.wait_qty().gt(MCNumber.ZERO)) {
				Btn_open_MSBEP0120.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBEP0120);
			}
			
			// 引当解除登録
			if (Cnd_disp_unit_HDR.isSelected()) {
				if (rsltR.can_flg()) {
					Btn_open_MSBEP0130.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_open_MSBEP0130);
				}
			}
			else if (Cnd_disp_unit_DTL.isSelected() || Cnd_disp_unit_SHIP_SCHD.isSelected()) {
				
				if(Cnd_ope_SRCH.isSelected()) {
					if (isNull(rsltR.alloc_qty()) || !rsltR.alloc_qty().isPositive() || rsltR.ship_inst_qty().isPositive() || rsltR.ship_act_qty().isPositive()) {
						Btn_open_MSBEP0130.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(Btn_open_MSBEP0130);
					}
				}
				else {
					if (isNull(rsltR.alloc_qty()) || !rsltR.alloc_qty().isPositive()) {
						Btn_open_MSBEP0130.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(Btn_open_MSBEP0130);
					}
				}
			}
		}
	}

	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		
		clearContainers(getRsltL());
		
		clearCnd();
		
		setSrchStatus();
	}
	
	@Override
	public void doCnd_overdue_prspct_only_flg_NC(MCEventInfo info) {
		super.doCnd_overdue_prspct_only_flg_NC(info);
		
		setValueEx(Cnd_overdue_prspct_disp_flg, true);
		
		setOverduePrspctDispMode();
	}
	
	@Override
	public void doCnd_overdue_prspct_disp_flg_NC(MCEventInfo info) {
		super.doCnd_overdue_prspct_disp_flg_NC(info);
		
		setColumnOverduePrspctQtyMode();
	}
	
	/**
	 * 遅れ見込数表示のモードを設定する。
	 */
	protected void setOverduePrspctDispMode() {
		
		if (getCndR().overdue_prspct_only_flg()) {
			
			Cnd_overdue_prspct_disp_flg.setMode(MCMode.READ_ONLY);
			
		}
		else {
			setDefaultMode(Cnd_overdue_prspct_disp_flg);
			columnRslt_overdue_prspct_qty.setVisible(false);
		}
	}
	
	/**
	 * 遅れ見込数量のモードを設定する。
	 */
	protected void setColumnOverduePrspctQtyMode() {
		
		if (getCndR().overdue_prspct_disp_flg()) {
			columnRslt_overdue_prspct_qty.setVisible(true);
		}
		else{
			columnRslt_overdue_prspct_qty.setVisible(false);
		}
	}
	
	/**
	 * 表示単位に応じて、検索条件をクリアする。
	 */
	protected void clearCnd() {
			setValueEx(Cnd_inc_past_flg, false);
		if (Cnd_disp_unit_HDR.isSelected()) {
			
			setBoolean(SlsStsTypPanel, false);
			setBoolean(AprvStsTypPanel, true);
			setBoolean(IvPanel, true);
			setBoolean(EdiPanel, true);
			setBoolean(AllowStsTypPanel, false);
			setBoolean(PrStsTypPanel, false);
			
			setValueEx(Cnd_ship_rqst_dt_fr, null);
			setValueEx(Cnd_ship_rqst_dt_to, null);
			setValueEx(Cnd_ship_rqst_hm_fr, null);
			setValueEx(Cnd_ship_rqst_hm_to, null);
			setValueEx(Cnd_dlv_rqst_dt_fr, null);
			setValueEx(Cnd_dlv_rqst_hm_fr, null);
			setValueEx(Cnd_dlv_rqst_dt_to, null);
			setValueEx(Cnd_dlv_rqst_hm_to, null);
			setValueEx(Cnd_sls_schd_dt_fr, null);
			setValueEx(Cnd_sls_schd_dt_to, null);
			setValueEx(Cnd_ship_schd_dt_fr, null);
			setValueEx(Cnd_ship_schd_hm_fr, null);
			setValueEx(Cnd_ship_schd_dt_to, null);
			setValueEx(Cnd_ship_schd_hm_to, null);
			setValueEx(Cnd_dlv_schd_dt_fr, null);
			setValueEx(Cnd_dlv_schd_hm_fr, null);
			setValueEx(Cnd_dlv_schd_dt_to, null);
			setValueEx(Cnd_dlv_schd_hm_to, null);
			setValueEx(Cnd_dlv_dt_fr, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_dlv_dt_to, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_dlv_inst_rcpt_dt_fr, null);
			setValueEx(Cnd_dlv_inst_rcpt_dt_to, null);
			setValueEx(Cnd_ship_rqst_dt_overdue_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_overdue_flg, false);
			setValueEx(Cnd_pd_inst_dlv_dt_overdue_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_overdue_act_flg, false);
			setValueEx(Cnd_prms_dlv_dt_overdue_act_flg, false);
			setValueEx(Cnd_ship_pr_fr, null);
			setValueEx(Cnd_ship_pr_to, null);
			setValueEx(Cnd_sls_pr_fr, null);
			setValueEx(Cnd_sls_pr_to, null);
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
			setValueEx(Cnd_tdlv_cd, null);
			setValueEx(Cnd_tdlv_nm, null);
			setValueEx(Cnd_slo_d_no, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
			setValueEx(Cnd_ver_no, null);
			setValueEx(Cnd_sno1, null);
			setValueEx(Cnd_sno2, null);
			setValueEx(Cnd_sno3, null);
			setValueEx(Cnd_sno4, null);
			setValueEx(Cnd_cst_po_d_no, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_cst_itm_nm, null);
			setValueEx(Cnd_rqst_to_loc_cd, null);
			setValueEx(Cnd_rqst_to_loc_nm, null);
			setValueEx(Cnd_sppl_cd, null);
			setValueEx(Cnd_sppl_nm, null);
			setValueEx(Cnd_ship_inst_typ, null);
			setValueEx(Cnd_ship_block_flg, false);
			setValueEx(Cnd_gd_cd, null);
			setValueEx(Cnd_gd_nm, null);
			setValueEx(Cnd_alloc_grp_cd, null);
			setValueEx(Cnd_alloc_grp_nm, null);
			setValueEx(Cnd_ship_lg_grp_cd, null);
			setValueEx(Cnd_ship_lg_grp_nm, null);
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_sublot_no, null);
			setValueEx(Cnd_sls_rsn_cd, null);
			setValueEx(Cnd_sls_rsn_nm, null);
			setValueEx(Cnd_bd_dpt_cd, null);
			setValueEx(Cnd_bd_dpt_nm, null);
			setValueEx(Cnd_proc_typ, null);
			setValueEx(Cnd_alloc_typ, null);
			setValueEx(Cnd_slo_d_can_rsn_cd, null);
			setValueEx(Cnd_slo_d_can_rsn_nm, null);
			setValueEx(Cnd_cst_po_d_rmrks, null);
			setValueEx(Cnd_trd_d_rmrks, null);
			setValueEx(Cnd_slo_d_intr_rmrks, null);
			setValueEx(Cnd_slo_d_sub_char1, null);
			setValueEx(Cnd_slo_d_sub_char2, null);
			setValueEx(Cnd_slo_d_sub_char3, null);
			setValueEx(Cnd_inc_abort_flg, false);
			setValueEx(Cnd_overdue_prspct_disp_flg, false);
			setValueEx(Cnd_overdue_prspct_only_flg, false);
			setValueEx(Cnd_dlv_grp_flg1, false);
			setValueEx(Cnd_dlv_grp_cd1, null);
			setValueEx(Cnd_dlv_grp_flg2, false);
			setValueEx(Cnd_dlv_grp_cd2, null);
			setValueEx(Cnd_dlv_grp_flg3, false);
			setValueEx(Cnd_dlv_grp_cd3, null);
			setValueEx(Cnd_dlv_grp_flg4, false);
			setValueEx(Cnd_dlv_grp_cd4, null);
			setValueEx(Cnd_dlv_grp_flg5, false);
			setValueEx(Cnd_dlv_grp_cd5, null);
			setValueEx(Cnd_dlv_grp_flg6, false);
			setValueEx(Cnd_dlv_grp_cd6, null);
			setValueEx(Cnd_dlv_grp_flg7, false);
			setValueEx(Cnd_dlv_grp_cd7, null);
			setValueEx(Cnd_dlv_grp_flg8, false);
			setValueEx(Cnd_dlv_grp_cd8, null);
			setValueEx(Cnd_dlv_grp_flg9, false);
			setValueEx(Cnd_dlv_grp_cd9, null);
			setValueEx(Cnd_dlv_grp_flg10, false);
			setValueEx(Cnd_dlv_grp_cd10, null);
			setValueEx(Cnd_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_cd1, null);
			setValueEx(Cnd_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_cd2, null);
			setValueEx(Cnd_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_cd3, null);
			setValueEx(Cnd_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_cd4, null);
			setValueEx(Cnd_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_cd5, null);
			setValueEx(Cnd_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_cd6, null);
			setValueEx(Cnd_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_cd7, null);
			setValueEx(Cnd_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_cd8, null);
			setValueEx(Cnd_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_cd9, null);
			setValueEx(Cnd_itm_grp_flg10, false);
			setValueEx(Cnd_itm_grp_cd10, null);
		}
		else if (Cnd_disp_unit_DTL.isSelected()) {
			
			setDefaultSrchSlsSts();
			setBoolean(AprvStsTypPanel, true);
			setBoolean(IvPanel, true);
			setBoolean(EdiPanel, true);
			setBoolean(AllowStsTypPanel, true);
			setBoolean(PrStsTypPanel, false);
			setValueEx(Cnd_ship_block_flg, false);
			setValueEx(Cnd_overdue_prspct_disp_flg, true);
			setValueEx(Cnd_overdue_prspct_only_flg, false);
		}
		else if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			setBoolean(SlsStsTypPanel, false);
			setBoolean(AprvStsTypPanel, true);
			setBoolean(IvPanel, true);
			setBoolean(EdiPanel, true);
			setBoolean(AllowStsTypPanel, true);
			setBoolean(PrStsTypPanel, true);
			setValueEx(Cnd_dlv_rqst_dt_overdue_act_flg, false);
			setValueEx(Cnd_prms_dlv_dt_overdue_act_flg, false);
			setValueEx(Cnd_ship_pr_fr, null);
			setValueEx(Cnd_ship_pr_to, null);
			setValueEx(Cnd_sls_pr_fr, null);
			setValueEx(Cnd_sls_pr_to, null);
			setValueEx(Cnd_dlv_dt_fr, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_dlv_dt_to, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_can_rsn_cd, null);
			setValueEx(Cnd_can_rsn_nm, null);
			setValueEx(Cnd_slo_d_can_rsn_cd, null);
			setValueEx(Cnd_slo_d_can_rsn_nm, null);
			setValueEx(Cnd_inc_can_flg, false);
			setValueEx(Cnd_overdue_prspct_disp_flg, false);
			setValueEx(Cnd_overdue_prspct_only_flg, false);
		}
	}
	
	/**
	 * 検索条件の販売状況の初期値を設定する。
	 */
	protected void setDefaultSrchSlsSts() {
		
		setValueEx(Cnd_slo_flg, true);
		setValueEx(Cnd_prms_flg, true);
		setValueEx(Cnd_dlv_inst_rcpt_flg, true);
		setValueEx(Cnd_dlv_inst_prms_flg, true);
		setValueEx(Cnd_sls_flg, true);
		setValueEx(Cnd_sls_ship_flg, false);
		setValueEx(Cnd_sls_compl_flg, false);
	}
	
	/**
	 * 表示単位に対応する検索ステータスに設定する。
	 */
	protected void setSrchStatus() {
		
		if(Cnd_ope_SRCH.isSelected()) {
			if (Cnd_disp_unit_HDR.isSelected()) {
				
				setSRCH_HDRStatus();
			}
			else if (Cnd_disp_unit_DTL.isSelected()) {
				
				setSRCH_DTLStatus();
			}
			else if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
				
				setSRCH_SHIP_SCHDStatus();
			}
		}
		else if (Cnd_ope_IMP.isSelected()) {
			setIMP_FILEStatus();
		}
		
		FoldTab.focusActiveFirstComponent();
		if (Cnd_ope_IMP.isSelected()){
			Ctrl_ctrl_PPanel.expand(false);
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		}
		else{
			Ctrl_ctrl_PPanel.expand(true);
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.ENABLE);
		}
	}
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setModeToIncCanFlg();
	}
	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		setModeToIncCanFlg();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		
		if (Cnd_disp_unit_HDR.isSelected()) {
			
			callMS_MSBBL1220_Srch01();
		}
		else if (Cnd_disp_unit_DTL.isSelected()) {
			
			callMS_MSBBL1220_Srch02();
		}
		else if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			callMS_MSBBL1220_Srch03();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		
		if (Cnd_disp_unit_HDR.isSelected()) {
			
			createMS_MSBBL1220_Srch01().execDL();
		}
		else if (Cnd_disp_unit_DTL.isSelected()) {
			
			createMS_MSBBL1220_Srch02().execDL();
		}
		else if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			createMS_MSBBL1220_Srch03().execDL();
		}
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1220_Ins01();
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (!rsltR.can_flg() && !isNull(rsltR.slo_no())) {
				doBtn_open_MSBBP1210(rsltR);
			}
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1210(r);
	}
	
	protected void doBtn_open_MSBBP1210(RsltR r) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.putCnd(crtOpenMSBBP1210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1210]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = 
				(mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.slo_no());
		to.srch_tgt_rev(r.slo_rev());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1230(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
		aso.putCnd(crtOpenMSBBP1230CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1230]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBB.MSBBP1230.CndR crtOpenMSBBP1230CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = 
				(mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.slo_no(r.slo_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1310(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1310");
		aso.putCnd(crtOpenMSBBP1310CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1310]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBB.MSBBP1310.CndR crtOpenMSBBP1310CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg p = 
				(mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1310.CndR to = mcframe.clientMSBB.MSBBP1310.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
		to.srch_tgt_no(r.slo_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1360]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1360(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1360");
		aso.putCnd(crtOpenMSBBP1360CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1360]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBB.MSBBP1360.CndR crtOpenMSBBP1360CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg p = 
				(mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1360.CndR to = mcframe.clientMSBB.MSBBP1360.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		if (Cnd_disp_unit_SHIP_SCHD.isSelected() && !isNull(r.dlv_slip_no())) {
			to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO.name());
			to.srch_tgt_no(r.dlv_slip_no());
		}
		else {
			to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
			to.srch_tgt_no(r.slo_no());
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0120(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0120");
		aso.putCnd(crtOpenMSBEP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBEP0120]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBE.MSBEP0120.CndR crtOpenMSBEP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBE.MSBEP0120.MSBEP_AllocChng p = 
				(mcframe.clientMSBE.MSBEP0120.MSBEP_AllocChng) aso.getPanel();
		mcframe.clientMSBE.MSBEP0120.CndR to = mcframe.clientMSBE.MSBEP0120.CndR.create();

		to.ope(p.Cnd_ope_CHNG.getActionCommand());
		to.ship_schd_no(r.ship_schd_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0130(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0130");
		aso.putCnd(crtOpenMSBEP0130CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBEP0130]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBE.MSBEP0130.CndR crtOpenMSBEP0130CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBE.MSBEP0130.MSBEP_AllocRelReg p = 
				(mcframe.clientMSBE.MSBEP0130.MSBEP_AllocRelReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP0130.CndR to = mcframe.clientMSBE.MSBEP0130.CndR.create();

		to.ope(p.Cnd_ope_REL.getActionCommand());
		
		if (Cnd_disp_unit_HDR.isSelected()) {
			
			to.slo_no(r.slo_no());
		}
		else if (Cnd_disp_unit_DTL.isSelected()) {
			
			to.slo_d_no(r.slo_d_no());
		}
		else if (Cnd_disp_unit_SHIP_SCHD.isSelected()) {
			
			to.ship_schd_no(r.ship_schd_no());
		}
		
		return to;
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch rootP =
				(mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch)panel;

		if(!rootP.Cnd_disp_unit_HDR.isSelected()) {
			dialog(MSBBP0103);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg)aso.getPanel();

		p.screenOpen(rootP, args);
	}
	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);
		
		MCIndexKey idxkey = list.createIndex(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key1, mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key2);
		
		for(RsltR dispRow : getRsltL()) {
			R row = list.getFirst(idxkey, dispRow.slo_no(), dispRow.slo_rev().toString());
			
			String bizTyp = dispRow.getBoolean(RsltR.$edi_flg) ? MAC_BIZ_TYP.SLO_EDI.value() : MAC_BIZ_TYP.SLO.value();
			row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
		}
	}
		
	@Override
	public void doCnd_inc_past_flg_NC(MCEventInfo info) {
		super.doCnd_inc_past_flg_NC(info);
		setModeToIncCanFlg();
	}
	
	protected void setModeToIncCanFlg() {
		if (getCndR().inc_past_flg()) {
			setValueEx(Cnd_inc_can_flg, true);
			Cnd_inc_can_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_inc_can_flg);
		}
	}
	

	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}

	/***
	 * CSV出力用コンテナリスト取得
	 * 
	 * @return CSV出力用コンテナリスト
	 */
	protected List<MCList<?>> getContainersForOutCsv() {
		List<MCList<?>> containers = new ArrayList<MCList<?>>();

		// 検索条件
		MCList<CndR> cndL = MCList.create(CndR.class);
		cndL.add(getCndR());
		containers.add(cndL);

		// 明細
		containers.add(getRsltL());

		return containers;
	}

	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge, MCBinary... files) {
		boolean result = false;

		if (!(bridge instanceof MS_MSBBL1220_Imp01Bridge) 
				&& !(bridge instanceof MS_MSBBL1220_Ins01Bridge)) {
			return result;
		}

		if (files == null || files.length < 2) {
			return result;
		}

		MCMessageList errMsgL = new MCMessageList();

		// 検索条件
		MCCsvBinaryReader<CndR> cndReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
		errMsgL.addAll(cndReader.read());

		// 明細
		MCCsvBinaryReader<RsltR> rsltReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltR.class), files[1]);
		errMsgL.addAll(rsltReader.read());

		if (errMsgL.isEmpty()) {
			if (bridge instanceof MS_MSBBL1220_Imp01Bridge) {
				openByAsyncRslt((MS_MSBBL1220_Imp01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								rsltReader.getDestList());
			}
			else if (bridge instanceof MS_MSBBL1220_Ins01Bridge) {
				openByAsyncRslt((MS_MSBBL1220_Ins01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								rsltReader.getDestList());
			}
		}
		else {
			message(errMsgL);
		}

		return result;
	}

	/***
	 * 画面起動（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param rsltFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBBL1220_Imp01Bridge bridge, 
			CndR cndR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T1, null, bridge, cndR, rsltFileL);
	}

	/***
	 * 画面起動（登録オペレーション非同期実行用）
	 * 
	 * @param bridge 登録オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param rsltFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBBL1220_Ins01Bridge bridge, 
			CndR cndR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T2, null, bridge, cndR, rsltFileL);
	}

	/*** 画面起動時のfillSpaceをスキップするか */
	protected boolean _isSkipFillSpaceForOpen = false;

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		MCException ex = null;
		if (T1 == openTyp) {
			screenClear();

			MS_MSBBL1220_Imp01Bridge b = (MS_MSBBL1220_Imp01Bridge) args[0];
			restoreContainer(b.down0(), 0, args);
			ex = getParamEx(b.param());

			if(getParamEx(b.param()) == null) {
				MS_MSBBL1220_Imp01Caller<MSBBP_SloSrch, MS_MSBBL1220_Imp01Bridge> caller = createMS_MSBBL1220_Imp01();
				restoreCaller(caller, b);
			}
		}
		else if (T2 == openTyp) {
			screenClear();

			MS_MSBBL1220_Ins01Bridge b = (MS_MSBBL1220_Ins01Bridge) args[0];
			restoreContainer(b.down0(), 0, args);
			ex = getParamEx(b.param());

			if(getParamEx(b.param()) == null) {
				MS_MSBBL1220_Ins01Caller<MSBBP_SloSrch, MS_MSBBL1220_Ins01Bridge> caller = createMS_MSBBL1220_Ins01();
				restoreCaller(caller, b);
			}
		}
		else {
			return;
		}

		if (ex == null) {
			_isSkipStatusClear = true;
		}
		else {
			setStatusForAsyncEx();
		}
		_isSkipFillSpaceForOpen = true;
	}

	@Override
	protected void afterOpenByInitParam(String openTyp, MCRow bind, Object... args) {
		super.afterOpenByInitParam(openTyp, bind, args);

		MCException ex = null;
		if (T1 == openTyp) {
			MS_MSBBL1220_Imp01Bridge b = (MS_MSBBL1220_Imp01Bridge) args[0];
			ex = getParamEx(b.param());
		}
		else if (T2 == openTyp) {
			MS_MSBBL1220_Ins01Bridge b = (MS_MSBBL1220_Ins01Bridge) args[0];
			ex = getParamEx(b.param());
		}
		else {
			return;
		}

		if (ex != null) {
			dialog(ex);
		}
		else if (_asyncResultMsg != null) {
			dialog(_asyncResultMsg);
			_asyncResultMsg = null;
		}
	}

	/*** ステータスクリア処理をスキップするか */
	protected boolean _isSkipStatusClear = false;

	@Override
	public void statusClear() {
		// 非同期実行の結果確認時に下り電文から復元した行ステータスがクリアされないようにするために必要な処理。
		if (!_isSkipStatusClear) {
			super.statusClear();
		}

		// 実行後は、スキップ要否を元に戻しておく
		_isSkipStatusClear = false;
	}

	/***
	 * コンテナ値設定（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param paramIndex 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainer(MCList<RsltR> downL, int paramIndex, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 明細
		MCList<RsltR> rsltL = (MCList<RsltR>) args[2];
		getRsltL().setAll(rsltL);
		setRowIndexForUp(rsltL, paramIndex);

		// 非同期
		getBtnR().async_flg(true);
	}

	/*** 非同期実行終了メッセージ */
	protected MCMessage _asyncResultMsg = null;

	/***
	 * ファイル入力オペレーション通信後処理実行
	 * 
	 * @param caller ファイル入力オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCaller(
			MS_MSBBL1220_Imp01Caller<MSBBP_SloSrch, MS_MSBBL1220_Imp01Bridge> caller,
			MS_MSBBL1220_Imp01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b.param()));
	}

	/***
	 * 登録オペレーション通信後処理実行
	 * 
	 * @param caller 登録オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCaller(
			MS_MSBBL1220_Ins01Caller<MSBBP_SloSrch, MS_MSBBL1220_Ins01Bridge> caller,
			MS_MSBBL1220_Ins01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b.param()));
	}

	/***
	 * 上り電文用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param paramIndex paramインデックス
	 * @return INDEX設定済上り電文リスト
	 */
	protected MCList<RsltR> setRowIndexForUp(MCList<RsltR> srcL, int paramIndex) {
		MCList<RsltR> tgtL = srcL.subList(RsltR.$check, true);

		// paramIndexとparamRowIndexを設定
		srcL.setParamIndex(paramIndex);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltR r = tgtL.get(i);
			r.setParamIndex(paramIndex);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * パラメータから例外取得
	 * 
	 * @param param パラメータ
	 * @return 発生例外
	 */
	protected MCException getParamEx(MCParam param) {
		MCException result = null;

		if (!param.getExceptionParam().isEmpty()) {
			result = param.getExceptionParam().getException();
		}

		return result;
	}

	/***
	 * パラメータからメッセ―ジ取得
	 * 
	 * @param param パラメータ
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MCParam param) {
		MCMessageList result = null;

		if (!param.getMessageParam().isEmpty()) {
			result =param.getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 非同期実行例外発生時のステータス設定
	 * 
	 */
	protected void setStatusForAsyncEx() {
		setFIX_IStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	//--------------------------------------
	// IfListRegPanelの実装
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	//--------------------------------------
	//ファイル入力の実装

	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_IMP.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBBL1220_Imp01();
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		if (!_isSkipFillSpaceForOpen) {
			fillSpace();
		}
	}

	protected void fillSpace() {
		if (Cnd_ope_IMP.isSelected()) {
			RsltTable.fillSpace();
		}
	}

}