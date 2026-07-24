package mcframe.clientMSBC.MSBCP0190;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5210.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMSUB.MSUBP5020.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_SimOrdExtSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_SimOrdExtSrch_MC extends MSBCP_SimOrdExtSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 全展開するかしないかを制御する */
	protected Boolean _is_expand_all = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimOrdExtSrch_MC() {
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
	public MSBCP_SimOrdExtSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0190_Srch01Caller<P extends MSBCP_SimOrdExtSrch, B extends MS_MSBCL0190_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0190_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.leaf(r.itm_cd());
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatusByOpe();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatusByOpe();
		}

		@Override
		protected void show() {
			super.show();

			if (_is_expand_all) {
				Rslt_hrrchy_p_PPanel.showExpandAll(getRsltL());
			}
			else {
				Rslt_hrrchy_p_PPanel.showCollapseAll(getRsltL());
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMS_MSBCL0190_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMS_MSBCL0190_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0200(MCEventInfo info) {
		// シミュ用オーダ逆展開画面
		openMsbcp0200();
	}
	
	//DCと画面遷移ボタンで共有
	protected void openMsbcp0200() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0200ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	protected MAUCP_AppScreenOpener getMsbcp0200ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0200");
		mcframe.clientMSBC.MSBCP0200.CndR cnd = mcframe.clientMSBC.MSBCP0200.CndR.create();
		mcframe.clientMSBC.MSBCP0200.MSBCP_SimOrdRevExtSrch p =
			(mcframe.clientMSBC.MSBCP0200.MSBCP_SimOrdRevExtSrch) so.getPanel();

		if (!isNull(r.itm_ord_no())) {
			cnd.ope(p.Cnd_ope_ORD.getActionCommand());
			cnd.itm_ord_no(r.itm_ord_no());
			cnd.sim_mrp_no(r.sim_mrp_no());
		}
		else {
			cnd.ope(p.Cnd_ope_STK.getActionCommand());
			cnd.itm_cd(r.itm_cd());
			cnd.itm_sub1(r.itm_sub1());
			cnd.itm_sub2(r.itm_sub2());
			cnd.itm_sub3(r.itm_sub3());
			cnd.lot_no(nullValToNull(r.lot_no()));
			cnd.sublot_no(nullValToNull(r.sublot_no()));
			cnd.strg_loc_cd(r.strg_loc_cd());
			cnd.sim_mrp_no(r.sim_mrp_no());
		}

		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0170]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0170(MCEventInfo info) {
		// シミュ用在庫推移照会画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0170ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	protected MAUCP_AppScreenOpener getMsbcp0170ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0170");
		mcframe.clientMSBC.MSBCP0170.CndR cnd = mcframe.clientMSBC.MSBCP0170.CndR.create();
		
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.wg_cd(r.wg_cd());
		cnd.dt_fr(r.gi_schd_dt());
		cnd.dt_to(r.gi_schd_dt());
		cnd.sim_mrp_no(r.sim_mrp_no());

		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0160(MCEventInfo info) {

		// シミュレーション用オーダ確認画面またはオーダ確認画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0160ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	protected MAUCP_AppScreenOpener getMsbcp0160ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		if (r.sim_ord_flg()){
			MAUCP_AppScreenOpener simSo = new MAUCP_AppScreenOpener("MS", "MSBCP0160");
			mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch destP = 
					(mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch) simSo.getPanel();
			mcframe.clientMSBC.MSBCP0160.CndR cnd = mcframe.clientMSBC.MSBCP0160.CndR.create();
	
			String opeVal = destP.Cnd_ope_REF.getActionCommand();
			cnd.ope(opeVal);
			cnd.itm_ord_no(r.itm_ord_no());
			cnd.sim_mrp_no(r.sim_mrp_no());
			simSo.runValueInit();
			simSo.putCnd(cnd);
			simSo.putSearchAction();
			
			return simSo;
		}
		else {
			MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
			mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch destP = 
					(mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) so.getPanel();
			mcframe.clientMSBC.MSBCP0050.CndR cnd = mcframe.clientMSBC.MSBCP0050.CndR.create();
	
			String opeVal = destP.Cnd_ope_REF.getActionCommand();
			cnd.ope(opeVal);
			cnd.itm_ord_no(r.itm_ord_no());
			so.runValueInit();
			so.putCnd(cnd);
			so.putSearchAction();
			
			return so;
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_schd_alloc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_dec_place);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setValueEx(Cnd_rqmt_no, null);
		setValueEx(Cnd_itm_ord_no, null);
		setSrchStatusByOpe();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (!isNull(r) && !isNull(r.extno()) && !isSame(r.hrrchy(), MCNumber.ZERO)
					&& !(isNull(r.itm_ord_no()) && isNull(r.stk_loc_cd())) // 品目オーダのない受払予定は遷移不可
					) {
				openMsbcp0200();
			}
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		if (isNull(r) || isNull(r.extno())|| isSame(r.hrrchy(), MCNumber.ZERO)
				|| (isNull(r.itm_ord_no()) && isNull(r.stk_loc_cd())) // 品目オーダのない受払予定は遷移不可
				) {
			Btn_open_MSBCP0200.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBCP0200);
		}

		if (isNull(r) || isNull(r.itm_ord_no())) {
			Btn_open_MSBCP0160.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBCP0160);
		}

		if (isNull(r) || isNull(r.gi_schd_dt())) {
			Btn_open_MSBCP0170.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBCP0170);
		}
	}

	protected void setSrchStatusByOpe() {
		if (Cnd_ope_RQMT.isSelected()) {
			setSRCH_RQMTStatus();
		}
		else if (Cnd_ope_ORD.isSelected()) {
			setSRCH_ORDStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatusByOpe() {
		if (Cnd_ope_RQMT.isSelected()) {
			setREF_RQMTStatus();
		}
		else if (Cnd_ope_ORD.isSelected()) {
			setREF_ORDStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_RQMTStatus() {
		super.setSRCH_RQMTStatus();
		setSrchStatusComm();
	}

	@Override
	public void setSRCH_ORDStatus() {
		super.setSRCH_ORDStatus();
		setSrchStatusComm();
	}

	@Override
	public void setREF_RQMTStatus() {
		super.setREF_RQMTStatus();
		setRefStatusComm();
	}

	@Override
	public void setREF_ORDStatus() {
		super.setREF_ORDStatus();
		setRefStatusComm();
	}

	protected void setSrchStatusComm() {
		CndPanel.focusFirstComponent();
	}

	protected void setRefStatusComm() {
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

}