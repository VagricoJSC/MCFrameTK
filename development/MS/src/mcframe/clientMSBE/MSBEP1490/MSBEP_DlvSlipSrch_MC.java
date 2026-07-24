package mcframe.clientMSBE.MSBEP1490;

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
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5320.*;

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
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_DlvSlipSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_DlvSlipSrch_MC extends MSBEP_DlvSlipSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_DlvSlipSrch_MC() {
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
	public MSBEP_DlvSlipSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1490_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1490_Srch01Caller<P extends MSBEP_DlvSlipSrch, B extends MS_MSBEL1490_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1490_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1490_Srch01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
	}

	@Override
	public void doCnd_ope_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearCnd();
		clearContainers(getRsltL());
		
		if (Cnd_ope_DLV_SLIP.isSelected()) {
			setDLV_SLIPStatus();
		}
		else if (Cnd_ope_PURC_DLV_SLIP.isSelected()) {
			setPURC_DLV_SLIPStatus();
		}
		
		Ctrl_ctrl_PPanel.expand(true);
	}

	/**
	 * 操作種別変更時の検索条件のクリア処理
	 */
	protected void clearCnd() {
		Cnd_ship_dt_fr.clear();
		Cnd_ship_hm_fr.clear();
		Cnd_ship_dt_to.clear();
		Cnd_ship_hm_to.clear();
		Cnd_slo_no.clear();
		Cnd_dlv_slip_inst_no.clear();
		Cnd_dlv_slip_act_no.clear();
		Cnd_ship_dlv_slip_no.clear();
		Cnd_dlv_rqst_dt_fr.clear();
		Cnd_dlv_rqst_hm_fr.clear();
		Cnd_dlv_rqst_dt_to.clear();
		Cnd_dlv_rqst_hm_to.clear();
		Cnd_po_no.clear();
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBE.MSBEP1490.MSBEP_DlvSlipSrch rootP = (mcframe.clientMSBE.MSBEP1490.MSBEP_DlvSlipSrch)panel;
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		// 出荷納品伝票
		if(rootP.Cnd_ope_DLV_SLIP.isSelected()) {
			args.put(p.columnRslt_biz_typ.getBaseRowColumnName(), MAC_BIZ_TYP.DLV_SLIP_SLS.value());
			args.put(p.columnRslt_dt.getBaseRowColumnName(), rootP.columnRslt_ship_dt.getAliasName(rootP));
			args.put(p.columnRslt_sls_dpt_cd.getBaseRowColumnName(), rootP.columnRslt_dpt_cd.getName());
			args.put(p.columnRslt_dlv_cd.getBaseRowColumnName(), rootP.columnRslt_dlv_id_cd.getName());
			args.put(p.columnRslt_cst_cd.getBaseRowColumnName(), rootP.columnRslt_bp_cd.getName());
			args.remove(p.columnRslt_purc_dpt_cd.getBaseRowColumnName());
			args.remove(p.columnRslt_sppl_cd.getBaseRowColumnName());
		}
		// 購買納品伝票
		else if(rootP.Cnd_ope_PURC_DLV_SLIP.isSelected()) {
			args.put(p.columnRslt_biz_typ.getBaseRowColumnName(), MAC_BIZ_TYP.DLV_SLIP_PURC.value());
			args.put(p.columnRslt_dt.getBaseRowColumnName(), rootP.columnRslt_dlv_rqst_dt.getAliasName(rootP));
			args.put(p.columnRslt_purc_dpt_cd.getBaseRowColumnName(), rootP.columnRslt_dpt_cd.getName());
			args.put(p.columnRslt_sppl_cd.getBaseRowColumnName(), rootP.columnRslt_sppl_id_cd.getName());
			args.remove(p.columnRslt_sls_dpt_cd.getBaseRowColumnName());
			args.remove(p.columnRslt_dlv_cd.getBaseRowColumnName());
			args.remove(p.columnRslt_cst_cd.getBaseRowColumnName());
		}
		
		p.screenOpen(rootP, args);
		
	}

}