package mcframe.clientMSBE.MSBEP0080;

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
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
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
 * 画面"MSBEP_IoActSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IoActSrch_MC extends MSBEP_IoActSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoActSrch_MC() {
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
	public MSBEP_IoActSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL0080_Srch01().execDL();
	}
	/**
	 * [MS_MSBEL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0080_Srch01Caller<P extends MSBEP_IoActSrch, B extends MS_MSBEL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0080_Srch01Caller(P p, B b) {
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
			setREFStatus();
			changeDisp();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	protected void changeDisp() {
		doChangeDisp();
	}

	protected void doChangeDisp() {
		changeDispSubRemove();
	}

	protected void changeDispSubRemove() {

		changeDispSlipNo();
		changeDispSlipSeqNo();
		changeDispAcDt();
		changeDispLoc();
		changeDispStrLn();
		changeDispStkArrvBp();
		changeDispSite();
		changeDispGrWg();
		changeDispGiWg();
		changeDispLgGrp();
		changeDispAllocGrp();
		changeDispLocGrp();
		changeDispLot();
		changeDispSublot();
		changeDispLotInfo();
		changeDispPackUnit();
		changeDispSno1();
		changeDispSno2();
		changeDispSno3();
		changeDispSno4();
		changeDispFixNoTyp();
		changeDispFixNo();
		changeDispGd();
		changeDispRsn();
		changeDispActDpt();
		changeDispGrDpt();
		changeDispGiDpt();
		changeDispBdDpt();
		changeDispActUsr();
		changeDispSlsUsr();
		changeDispMfgUsr();
		changeDispPurcUsr();
		changeDispSloNo();
		changeDispPoNo();
		changeDispIvNo();
		changeDispRcptIvNo();
		changeDispDlv();
		changeDispTdlv();
		changeDispCst();
		changeDispSppl();
		changeDispCstItm();
		changeDispCstItmNm();
		changeDispSpplItm();
		changeDispSpplItmNm();
		changeDispParBdInfo();
		changeDispDefCols();
	}

	protected void changeDispSlipNo() {
		if (getCndR().slip_no_flg()) {
			columnRslt_slip_no.setMode(getDefaultMode(columnRslt_slip_no));
		}
		else {
			columnRslt_slip_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSlipSeqNo() {
		if (getCndR().slip_seq_no_flg()) {
			columnRslt_slip_seq_no.setMode(getDefaultMode(columnRslt_slip_seq_no));
		}
		else {
			columnRslt_slip_seq_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispAcDt() {
		if (getCndR().ac_dt_flg()) {
			columnRslt_ac_dt.setMode(getDefaultMode(columnRslt_ac_dt));
		}
		else {
			columnRslt_ac_dt.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLoc() {
		if (getCndR().loc_flg()) {
			columnRslt_loc_cd.setMode(getDefaultMode(columnRslt_loc_cd));
			columnRslt_loc_nm.setMode(getDefaultMode(columnRslt_loc_nm));
		}
		else {
			columnRslt_loc_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStrLn() {
		if (getCndR().str_ln_flg()) {
			columnRslt_str_ln_cd.setMode(getDefaultMode(columnRslt_str_ln_cd));
			columnRslt_str_ln_nm.setMode(getDefaultMode(columnRslt_str_ln_nm));
			columnRslt_str_ln_cd_none_flg.setMode(getDefaultMode(columnRslt_str_ln_cd_none_flg));
		}
		else {
			columnRslt_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkArrvBp() {
		if (getCndR().stk_arrv_bp_flg()) {
			columnRslt_stk_arrv_bp_cd.setMode(getDefaultMode(columnRslt_stk_arrv_bp_cd));
			columnRslt_stk_arrv_bp_nm.setMode(getDefaultMode(columnRslt_stk_arrv_bp_nm));
		}
		else {
			columnRslt_stk_arrv_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_arrv_bp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSite() {
		if (getCndR().site_flg()) {
			columnRslt_site_cd.setMode(getDefaultMode(columnRslt_site_cd));
			columnRslt_site_nm.setMode(getDefaultMode(columnRslt_site_nm));
		}
		else {
			columnRslt_site_cd.setMode(MCMode.INVISIBLE);
			columnRslt_site_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGrWg() {
		if (getCndR().gr_wg_flg()) {
			columnRslt_gr_wg_cd.setMode(getDefaultMode(columnRslt_gr_wg_cd));
			columnRslt_gr_wg_nm.setMode(getDefaultMode(columnRslt_gr_wg_nm));
		}
		else {
			columnRslt_gr_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gr_wg_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGiWg() {
		if (getCndR().gi_wg_flg()) {
			columnRslt_gi_wg_cd.setMode(getDefaultMode(columnRslt_gi_wg_cd));
			columnRslt_gi_wg_nm.setMode(getDefaultMode(columnRslt_gi_wg_nm));
		}
		else {
			columnRslt_gi_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gi_wg_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLgGrp() {
		if (getCndR().lg_grp_flg()) {
			columnRslt_lg_grp_cd.setMode(getDefaultMode(columnRslt_lg_grp_cd));
			columnRslt_lg_grp_nm.setMode(getDefaultMode(columnRslt_lg_grp_nm));
		}
		else {
			columnRslt_lg_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_lg_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispAllocGrp() {
		if (getCndR().alloc_grp_flg()) {
			columnRslt_alloc_grp_cd.setMode(getDefaultMode(columnRslt_alloc_grp_cd));
			columnRslt_alloc_grp_nm.setMode(getDefaultMode(columnRslt_alloc_grp_nm));
		}
		else {
			columnRslt_alloc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLocGrp() {
		if (getCndR().loc_grp_flg()) {
			columnRslt_loc_grp_cd.setMode(getDefaultMode(columnRslt_loc_grp_cd));
			columnRslt_loc_grp_nm.setMode(getDefaultMode(columnRslt_loc_grp_nm));
		}
		else {
			columnRslt_loc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLot() {
		if (getCndR().lot_flg()) {
			columnRslt_lot_no.setMode(getDefaultMode(columnRslt_lot_no));
		}
		else {
			columnRslt_lot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSublot() {
		if (getCndR().sublot_flg()) {
			columnRslt_sublot_no.setMode(getDefaultMode(columnRslt_sublot_no));
		}
		else {
			columnRslt_sublot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLotInfo() {
		//ロットとサブロットのいずれかが集計されたらロット管理情報の項目は非表示にする
		if (getCndR().lot_flg() && getCndR().sublot_flg()) {
			columnRslt_ver_no.setMode(getDefaultMode(columnRslt_ver_no));
		}
		else {
			columnRslt_ver_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispPackUnit() {
		if (getCndR().pack_unit_flg()) {
			columnRslt_pack_unit_cd.setMode(getDefaultMode(columnRslt_pack_unit_cd));
			columnRslt_pack_unit_nm.setMode(getDefaultMode(columnRslt_pack_unit_nm));
			columnRslt_pack_unit_gr_qty.setMode(getDefaultMode(columnRslt_pack_unit_gr_qty));
			columnRslt_pack_unit_gi_qty.setMode(getDefaultMode(columnRslt_pack_unit_gi_qty));
		}
		else {
			columnRslt_pack_unit_cd.setMode(MCMode.INVISIBLE);
			columnRslt_pack_unit_nm.setMode(MCMode.INVISIBLE);
			columnRslt_pack_unit_gr_qty.setMode(MCMode.INVISIBLE);
			columnRslt_pack_unit_gi_qty.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno1() {
		if (getCndR().sno1_flg()) {
			columnRslt_sno1.setMode(getDefaultMode(columnRslt_sno1));
			columnRslt_wrk_no.setMode(getDefaultMode(columnRslt_wrk_no));
			columnRslt_wrk_nm.setMode(getDefaultMode(columnRslt_wrk_nm));
		}
		else {
			columnRslt_sno1.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno2() {
		if (getCndR().sno2_flg()) {
			columnRslt_sno2.setMode(getDefaultMode(columnRslt_sno2));
		}
		else {
			columnRslt_sno2.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno3() {
		if (getCndR().sno3_flg()) {
			columnRslt_sno3.setMode(getDefaultMode(columnRslt_sno3));
		}
		else {
			columnRslt_sno3.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno4() {
		if (getCndR().sno4_flg()) {
			columnRslt_sno4.setMode(getDefaultMode(columnRslt_sno4));
		}
		else {
			columnRslt_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNoTyp() {
		if (getCndR().fix_no_typ_flg()) {
			columnRslt_fix_no_typ.setMode(getDefaultMode(columnRslt_fix_no_typ));
			columnRslt_fix_no_typ_nm.setMode(getDefaultMode(columnRslt_fix_no_typ_nm));
		}
		else {
			columnRslt_fix_no_typ.setMode(MCMode.INVISIBLE);
			columnRslt_fix_no_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNo() {
		if (getCndR().fix_no_flg()) {
			columnRslt_fix_no.setMode(getDefaultMode(columnRslt_fix_no));
		}
		else {
			columnRslt_fix_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGd() {
		if (getCndR().gd_flg()) {
			columnRslt_gd_cd.setMode(getDefaultMode(columnRslt_gd_cd));
			columnRslt_gd_nm.setMode(getDefaultMode(columnRslt_gd_nm));
		}
		else {
			columnRslt_gd_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gd_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispRsn() {
		if (getCndR().rsn_flg()) {
			columnRslt_rsn_cd.setMode(getDefaultMode(columnRslt_rsn_cd));
			columnRslt_rsn_nm.setMode(getDefaultMode(columnRslt_rsn_nm));
		}
		else {
			columnRslt_rsn_cd.setMode(MCMode.INVISIBLE);
			columnRslt_rsn_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispActDpt() {
		if (getCndR().act_dpt_flg()) {
			columnRslt_act_dpt_cd.setMode(getDefaultMode(columnRslt_act_dpt_cd));
			columnRslt_act_dpt_nm.setMode(getDefaultMode(columnRslt_act_dpt_nm));
		}
		else {
			columnRslt_act_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_act_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGrDpt() {
		if (getCndR().gr_dpt_flg()) {
			columnRslt_gr_dpt_cd.setMode(getDefaultMode(columnRslt_gr_dpt_cd));
			columnRslt_gr_dpt_nm.setMode(getDefaultMode(columnRslt_gr_dpt_nm));
		}
		else {
			columnRslt_gr_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gr_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGiDpt() {
		if (getCndR().gi_dpt_flg()) {
			columnRslt_gi_dpt_cd.setMode(getDefaultMode(columnRslt_gi_dpt_cd));
			columnRslt_gi_dpt_nm.setMode(getDefaultMode(columnRslt_gi_dpt_nm));
		}
		else {
			columnRslt_gi_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gi_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispBdDpt() {
		if (getCndR().bd_dpt_flg()) {
			columnRslt_bd_dpt_cd.setMode(getDefaultMode(columnRslt_bd_dpt_cd));
			columnRslt_bd_dpt_nm.setMode(getDefaultMode(columnRslt_bd_dpt_nm));
		}
		else {
			columnRslt_bd_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispActUsr() {
		if (getCndR().act_usr_flg()) {
			columnRslt_act_usr_cd.setMode(getDefaultMode(columnRslt_act_usr_cd));
			columnRslt_act_usr_nm.setMode(getDefaultMode(columnRslt_act_usr_nm));
		}
		else {
			columnRslt_act_usr_cd.setMode(MCMode.INVISIBLE);
			columnRslt_act_usr_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSlsUsr() {
		if (getCndR().sls_usr_flg()) {
			columnRslt_sls_usr_cd.setMode(getDefaultMode(columnRslt_sls_usr_cd));
			columnRslt_sls_usr_nm.setMode(getDefaultMode(columnRslt_sls_usr_nm));
		}
		else {
			columnRslt_sls_usr_cd.setMode(MCMode.INVISIBLE);
			columnRslt_sls_usr_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispMfgUsr() {
		if (getCndR().mfg_usr_flg()) {
			columnRslt_mfg_usr_cd.setMode(getDefaultMode(columnRslt_mfg_usr_cd));
			columnRslt_mfg_usr_nm.setMode(getDefaultMode(columnRslt_mfg_usr_nm));
		}
		else {
			columnRslt_mfg_usr_cd.setMode(MCMode.INVISIBLE);
			columnRslt_mfg_usr_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispPurcUsr() {
		if (getCndR().purc_usr_flg()) {
			columnRslt_purc_usr_cd.setMode(getDefaultMode(columnRslt_purc_usr_cd));
			columnRslt_purc_usr_nm.setMode(getDefaultMode(columnRslt_purc_usr_nm));
		}
		else {
			columnRslt_purc_usr_cd.setMode(MCMode.INVISIBLE);
			columnRslt_purc_usr_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSloNo() {
		if (getCndR().slo_no_flg()) {
			columnRslt_slo_no.setMode(getDefaultMode(columnRslt_slo_no));
		}
		else {
			columnRslt_slo_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispPoNo() {
		if (getCndR().po_no_flg()) {
			columnRslt_po_no.setMode(getDefaultMode(columnRslt_po_no));
		}
		else {
			columnRslt_po_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispIvNo() {
		if (getCndR().iv_no_flg()) {
			columnRslt_iv_no.setMode(getDefaultMode(columnRslt_iv_no));
		}
		else {
			columnRslt_iv_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispRcptIvNo() {
		if (getCndR().rcpt_iv_no_flg()) {
			columnRslt_rcpt_iv_no.setMode(getDefaultMode(columnRslt_rcpt_iv_no));
		}
		else {
			columnRslt_rcpt_iv_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispDlv() {
		if (getCndR().dlv_flg()) {
			columnRslt_dlv_cd.setMode(getDefaultMode(columnRslt_dlv_cd));
			columnRslt_dlv_nm.setMode(getDefaultMode(columnRslt_dlv_nm));
		}
		else {
			columnRslt_dlv_cd.setMode(MCMode.INVISIBLE);
			columnRslt_dlv_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispTdlv() {
		if (getCndR().tdlv_flg()) {
			columnRslt_tdlv_cd.setMode(getDefaultMode(columnRslt_tdlv_cd));
			columnRslt_tdlv_nm.setMode(getDefaultMode(columnRslt_tdlv_nm));
		}
		else {
			columnRslt_tdlv_cd.setMode(MCMode.INVISIBLE);
			columnRslt_tdlv_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispCst() {
		if (getCndR().cst_flg()) {
			columnRslt_cst_cd.setMode(getDefaultMode(columnRslt_cst_cd));
			columnRslt_cst_nm.setMode(getDefaultMode(columnRslt_cst_nm));
		}
		else {
			columnRslt_cst_cd.setMode(MCMode.INVISIBLE);
			columnRslt_cst_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSppl() {
		if (getCndR().sppl_flg()) {
			columnRslt_sppl_cd.setMode(getDefaultMode(columnRslt_sppl_cd));
			columnRslt_sppl_nm.setMode(getDefaultMode(columnRslt_sppl_nm));
		}
		else {
			columnRslt_sppl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_sppl_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispCstItm() {
		if (getCndR().cst_itm_flg()) {
			columnRslt_cst_itm_cd.setMode(getDefaultMode(columnRslt_cst_itm_cd));
		}
		else {
			columnRslt_cst_itm_cd.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispCstItmNm() {
		if (getCndR().cst_itm_nm_flg()) {
			columnRslt_cst_itm_nm.setMode(getDefaultMode(columnRslt_cst_itm_nm));
		}
		else {
			columnRslt_cst_itm_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSpplItm() {
		if (getCndR().sppl_itm_flg()) {
			columnRslt_sppl_itm_cd.setMode(getDefaultMode(columnRslt_sppl_itm_cd));
		}
		else {
			columnRslt_sppl_itm_cd.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSpplItmNm() {
		if (getCndR().sppl_itm_nm_flg()) {
			columnRslt_sppl_itm_nm.setMode(getDefaultMode(columnRslt_sppl_itm_nm));
		}
		else {
			columnRslt_sppl_itm_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispParBdInfo() {
		if (getCndR().par_bd_info_flg()) {
			columnRslt_bd_ctg_cd.setMode(getDefaultMode(columnRslt_bd_ctg_cd));
			columnRslt_bd_ctg_nm.setMode(getDefaultMode(columnRslt_bd_ctg_nm));
			columnRslt_bd_bp_cd.setMode(getDefaultMode(columnRslt_bd_bp_cd));
			columnRslt_bd_bp_nm.setMode(getDefaultMode(columnRslt_bd_bp_nm));
			columnRslt_bd_oper_cd.setMode(getDefaultMode(columnRslt_bd_oper_cd));
			columnRslt_bd_oper_nm.setMode(getDefaultMode(columnRslt_bd_oper_nm));
			columnRslt_bd_loc_cd.setMode(getDefaultMode(columnRslt_bd_loc_cd));
			columnRslt_bd_loc_nm.setMode(getDefaultMode(columnRslt_bd_loc_nm));
			columnRslt_bd_slo_no.setMode(getDefaultMode(columnRslt_bd_slo_no));
			columnRslt_bd_po_no.setMode(getDefaultMode(columnRslt_bd_po_no));
			columnRslt_bd_iv_no.setMode(getDefaultMode(columnRslt_bd_iv_no));
			columnRslt_bd_wg_cd.setMode(getDefaultMode(columnRslt_bd_wg_cd));
			columnRslt_bd_wg_nm.setMode(getDefaultMode(columnRslt_bd_wg_nm));
			columnRslt_par_itm_cd.setMode(getDefaultMode(columnRslt_par_itm_cd));
			columnRslt_par_itm_sub1.setMode(getDefaultMode(columnRslt_par_itm_sub1));
			columnRslt_par_itm_sub2.setMode(getDefaultMode(columnRslt_par_itm_sub2));
			columnRslt_par_itm_sub3.setMode(getDefaultMode(columnRslt_par_itm_sub3));
			columnRslt_par_itm_nm.setMode(getDefaultMode(columnRslt_par_itm_nm));
			columnRslt_par_lot_no.setMode(getDefaultMode(columnRslt_par_lot_no));
			columnRslt_par_sublot_no.setMode(getDefaultMode(columnRslt_par_sublot_no));
			columnRslt_par_sno1.setMode(getDefaultMode(columnRslt_par_sno1));
			columnRslt_par_sno2.setMode(getDefaultMode(columnRslt_par_sno2));
			columnRslt_par_sno3.setMode(getDefaultMode(columnRslt_par_sno3));
			columnRslt_par_sno4.setMode(getDefaultMode(columnRslt_par_sno4));
		}
		else {
			columnRslt_bd_ctg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_ctg_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bd_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_bp_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bd_oper_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_oper_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bd_loc_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_loc_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bd_slo_no.setMode(MCMode.INVISIBLE);
			columnRslt_bd_po_no.setMode(MCMode.INVISIBLE);
			columnRslt_bd_iv_no.setMode(MCMode.INVISIBLE);
			columnRslt_bd_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bd_wg_nm.setMode(MCMode.INVISIBLE);
			columnRslt_par_itm_cd.setMode(MCMode.INVISIBLE);
			columnRslt_par_itm_sub1.setMode(MCMode.INVISIBLE);
			columnRslt_par_itm_sub2.setMode(MCMode.INVISIBLE);
			columnRslt_par_itm_sub3.setMode(MCMode.INVISIBLE);
			columnRslt_par_itm_nm.setMode(MCMode.INVISIBLE);
			columnRslt_par_lot_no.setMode(MCMode.INVISIBLE);
			columnRslt_par_sublot_no.setMode(MCMode.INVISIBLE);
			columnRslt_par_sno1.setMode(MCMode.INVISIBLE);
			columnRslt_par_sno2.setMode(MCMode.INVISIBLE);
			columnRslt_par_sno3.setMode(MCMode.INVISIBLE);
			columnRslt_par_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispDefCols() {
		//ひとつでも集計されたら非表示にする項目

		if (getCndR().slip_no_flg()
				&& getCndR().slip_seq_no_flg()
				&& getCndR().ac_dt_flg()
				&& getCndR().loc_flg()
				&& getCndR().str_ln_flg()
				&& getCndR().stk_arrv_bp_flg()
				&& getCndR().site_flg()
				&& getCndR().gr_wg_flg()
				&& getCndR().gi_wg_flg()
				&& getCndR().lg_grp_flg()
				&& getCndR().alloc_grp_flg()
				&& getCndR().loc_grp_flg()
				&& getCndR().lot_flg()
				&& getCndR().sublot_flg()
				&& getCndR().sno1_flg()
				&& getCndR().sno2_flg()
				&& getCndR().sno3_flg()
				&& getCndR().sno4_flg()
				&& getCndR().fix_no_typ_flg()
				&& getCndR().fix_no_flg()
				&& getCndR().pack_unit_flg()
				&& getCndR().gd_flg()
				&& getCndR().rsn_flg()
				&& getCndR().act_dpt_flg()
				&& getCndR().gr_dpt_flg()
				&& getCndR().gi_dpt_flg()
				&& getCndR().bd_dpt_flg()
				&& getCndR().act_usr_flg()
				&& getCndR().sls_usr_flg()
				&& getCndR().mfg_usr_flg()
				&& getCndR().purc_usr_flg()
				&& getCndR().slo_no_flg()
				&& getCndR().po_no_flg()
				&& getCndR().iv_no_flg()
				&& getCndR().rcpt_iv_no_flg()
				&& getCndR().dlv_flg()
				&& getCndR().tdlv_flg()
				&& getCndR().cst_flg()
				&& getCndR().sppl_flg()
				&& getCndR().cst_itm_flg()
				&& getCndR().cst_itm_nm_flg()
				&& getCndR().sppl_itm_flg()
				&& getCndR().sppl_itm_nm_flg()
				&& getCndR().par_bd_info_flg()) {

			columnRslt_act_dt.setMode(getDefaultMode(columnRslt_act_dt));
			columnRslt_act_hm.setMode(getDefaultMode(columnRslt_act_hm));
			columnRslt_stktk_base_dt.setMode(getDefaultMode(columnRslt_stktk_base_dt));
			columnRslt_trd_rmrks.setMode(getDefaultMode(columnRslt_trd_rmrks));
			columnRslt_trd_d_rmrks.setMode(getDefaultMode(columnRslt_trd_d_rmrks));
			columnRslt_slip_rev_no.setMode(getDefaultMode(columnRslt_slip_rev_no));
			columnRslt_act_no.setMode(getDefaultMode(columnRslt_act_no));
			columnRslt_act_seq.setMode(getDefaultMode(columnRslt_act_seq));
			columnRslt_act_rev_no.setMode(getDefaultMode(columnRslt_act_rev_no));
			columnRslt_act_d_no.setMode(getDefaultMode(columnRslt_act_d_no));
			columnRslt_act_d_seq.setMode(getDefaultMode(columnRslt_act_d_seq));
			columnRslt_act_io_no.setMode(getDefaultMode(columnRslt_act_io_no));
			columnRslt_act_io_seq.setMode(getDefaultMode(columnRslt_act_io_seq));
			columnRslt_slip_sts_typ.setMode(getDefaultMode(columnRslt_slip_sts_typ));
			columnRslt_slip_sts_typ_nm.setMode(getDefaultMode(columnRslt_slip_sts_typ_nm));
			columnRslt_trd_cd.setMode(getDefaultMode(columnRslt_trd_cd));
			columnRslt_trd_nm.setMode(getDefaultMode(columnRslt_trd_nm));
			columnRslt_trd_ptn_typ.setMode(getDefaultMode(columnRslt_trd_ptn_typ));
			columnRslt_trd_ptn_typ_nm.setMode(getDefaultMode(columnRslt_trd_ptn_typ_nm));
			columnRslt_trn_typ.setMode(getDefaultMode(columnRslt_trn_typ));
			columnRslt_trn_typ_nm.setMode(getDefaultMode(columnRslt_trn_typ_nm));
			columnRslt_par_slip_no.setMode(getDefaultMode(columnRslt_par_slip_no));
			columnRslt_par_slip_seq_no.setMode(getDefaultMode(columnRslt_par_slip_seq_no));
			columnRslt_slip_cmpl_flg.setMode(getDefaultMode(columnRslt_slip_cmpl_flg));
			columnRslt_sub_char1.setMode(getDefaultMode(columnRslt_sub_char1));
			columnRslt_sub_char2.setMode(getDefaultMode(columnRslt_sub_char2));
			columnRslt_sub_char3.setMode(getDefaultMode(columnRslt_sub_char3));
			columnRslt_sub_char4.setMode(getDefaultMode(columnRslt_sub_char4));
			columnRslt_sub_char5.setMode(getDefaultMode(columnRslt_sub_char5));
			columnRslt_sub_char6.setMode(getDefaultMode(columnRslt_sub_char6));
			columnRslt_sub_char7.setMode(getDefaultMode(columnRslt_sub_char7));
			columnRslt_sub_char8.setMode(getDefaultMode(columnRslt_sub_char8));
			columnRslt_sub_char9.setMode(getDefaultMode(columnRslt_sub_char9));
			columnRslt_sub_char10.setMode(getDefaultMode(columnRslt_sub_char10));
			columnRslt_sub_num1.setMode(getDefaultMode(columnRslt_sub_num1));
			columnRslt_sub_num2.setMode(getDefaultMode(columnRslt_sub_num2));
			columnRslt_sub_num3.setMode(getDefaultMode(columnRslt_sub_num3));
			columnRslt_sub_dt1.setMode(getDefaultMode(columnRslt_sub_dt1));
			columnRslt_sub_dt2.setMode(getDefaultMode(columnRslt_sub_dt2));
			columnRslt_sub_dt3.setMode(getDefaultMode(columnRslt_sub_dt3));

			columnRslt_ins_usr_id.setMode(getDefaultMode(columnRslt_ins_usr_id));
			columnRslt_ins_usr_nm.setMode(getDefaultMode(columnRslt_ins_usr_nm));
			columnRslt_ins_func_id.setMode(getDefaultMode(columnRslt_ins_func_id));
			columnRslt_ins_func_nm.setMode(getDefaultMode(columnRslt_ins_func_nm));
			columnRslt_ins_ts.setMode(getDefaultMode(columnRslt_ins_ts));
			columnRslt_upd_usr_id.setMode(getDefaultMode(columnRslt_upd_usr_id));
			columnRslt_upd_usr_nm.setMode(getDefaultMode(columnRslt_upd_usr_nm));
			columnRslt_upd_func_id.setMode(getDefaultMode(columnRslt_upd_func_id));
			columnRslt_upd_func_nm.setMode(getDefaultMode(columnRslt_upd_func_nm));
			columnRslt_upd_ts.setMode(getDefaultMode(columnRslt_upd_ts));
			columnRslt_upd_srv_req_no.setMode(getDefaultMode(columnRslt_upd_srv_req_no));
		}
		else {
			columnRslt_act_dt.setMode(MCMode.INVISIBLE);
			columnRslt_act_hm.setMode(MCMode.INVISIBLE);
			columnRslt_stktk_base_dt.setMode(MCMode.INVISIBLE);
			columnRslt_trd_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_trd_d_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_slip_rev_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_seq.setMode(MCMode.INVISIBLE);
			columnRslt_act_rev_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_d_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_d_seq.setMode(MCMode.INVISIBLE);
			columnRslt_act_io_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_io_seq.setMode(MCMode.INVISIBLE);
			columnRslt_slip_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_slip_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_trd_cd.setMode(MCMode.INVISIBLE);
			columnRslt_trd_nm.setMode(MCMode.INVISIBLE);
			columnRslt_trd_ptn_typ.setMode(MCMode.INVISIBLE);
			columnRslt_trd_ptn_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_trn_typ.setMode(MCMode.INVISIBLE);
			columnRslt_trn_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_par_slip_no.setMode(MCMode.INVISIBLE);
			columnRslt_par_slip_seq_no.setMode(MCMode.INVISIBLE);
			columnRslt_slip_cmpl_flg.setMode(MCMode.INVISIBLE);

			columnRslt_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char3.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char4.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char5.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char6.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char7.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char8.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char9.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char10.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num3.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt3.setMode(MCMode.INVISIBLE);

			columnRslt_ins_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_srv_req_no.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		// 検索後ステータス
		if (Cnd_ope_SRCH_NRML.isSelected()) {
			setSRCH_NRMLStatus();
		}
		else if (Cnd_ope_SRCH_ALL.isSelected()) {
			setSRCH_ALLStatus();
		}
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		// 検索前ステータス
		if (Cnd_ope_SRCH_NRML.isSelected()) {
			setSRCH_NRMLStatus();
		}
		else if (Cnd_ope_SRCH_ALL.isSelected()) {
			setSRCH_ALLStatus();
		}
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
	
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0010(r)) {
			Btn_open_MSBEP0010.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0010);
		}
		if (isEnableBtn_open_MSBEP0040(r)) {
			Btn_open_MSBEP0040.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0040);
		}
		if (isEnableBtn_open_DtlInfo(r)) {
			Btn_open_DtlInfo.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_DtlInfo);
		}
	}
	
	//イベント
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		setSRCHStatus();
	}

	protected void clearCnd() {
		if (Cnd_ope_SRCH_NRML.isSelected()) {
			setValueEx(Cnd_send_flg, false);

			setValueEx(Cnd_amt_fix_flg, false);
			setValueEx(Cnd_un_fix_flg, false);
			setValueEx(Cnd_domestic_flg, false);
			setValueEx(Cnd_foreign_flg, false);
			setValueEx(Cnd_spot_flg, false);
			setValueEx(Cnd_not_spot_flg, false);
			setValueEx(Cnd_temp_ap_flg, false);
			setValueEx(Cnd_not_temp_ap_flg, false);
			setValueEx(Cnd_repurc_obli_flg, false);
			setValueEx(Cnd_not_repurc_obli_flg, false);

			setValueEx(Cnd_c_not_imp_flg, false);
			setValueEx(Cnd_c_imp_flg, false);
			setValueEx(Cnd_a_not_imp_flg, false);
			setValueEx(Cnd_a_imp_flg, false);
			
			setValueEx(Cnd_trd_unit_cd, null);
			setValueEx(Cnd_trd_unit_nm, null);

			setValueEx(Cnd_purc_dpt_cd, null);
			setValueEx(Cnd_purc_dpt_nm, null);
			setValueEx(Cnd_ap_dpt_cd, null);
			setValueEx(Cnd_ap_dpt_nm, null);
			setValueEx(Cnd_sls_dpt_cd, null);
			setValueEx(Cnd_sls_dpt_nm, null);
			setValueEx(Cnd_ar_dpt_cd, null);
			setValueEx(Cnd_ar_dpt_nm, null);
			setValueEx(Cnd_sub_dpt_cd1, null);
			setValueEx(Cnd_sub_dpt_nm1, null);
			setValueEx(Cnd_sub_dpt_cd2, null);
			setValueEx(Cnd_sub_dpt_nm2, null);
			setValueEx(Cnd_sub_dpt_cd3, null);
			setValueEx(Cnd_sub_dpt_nm3, null);
			
			setValueEx(Cnd_trd_cur_cd, null);
			setValueEx(Cnd_trd_cur_nm, null);
			setValueEx(Cnd_tax_cd, null);
			setValueEx(Cnd_tax_nm, null);
			setValueEx(Cnd_xrate_cd, null);
			setValueEx(Cnd_xrate_nm, null);
			setValueEx(Cnd_ptax_xrate_cd, null);
			setValueEx(Cnd_ptax_xrate_nm, null);

			setValueEx(Cnd_rcst_cd, null);
			setValueEx(Cnd_rcst_nm, null);
			setValueEx(Cnd_bcst_cd, null);
			setValueEx(Cnd_bcst_nm, null);
			setValueEx(Cnd_acst_cd, null);
			setValueEx(Cnd_acst_nm, null);
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);			
			setValueEx(Cnd_psppl_cd, null);
			setValueEx(Cnd_psppl_nm, null);
			setValueEx(Cnd_bsppl_cd, null);
			setValueEx(Cnd_bsppl_nm, null);
			setValueEx(Cnd_asppl_cd, null);
			setValueEx(Cnd_asppl_nm, null);
			setValueEx(Cnd_cred_cd, null);
			setValueEx(Cnd_cred_nm, null);
			setValueEx(Cnd_sttl_schd_dt_fr, null);
			setValueEx(Cnd_sttl_schd_dt_to, null);
			setValueEx(Cnd_sttl_cd, null);
			setValueEx(Cnd_sttl_nm, null);

			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_itm_mfg_inst_no, null);
			setValueEx(Cnd_mfg_inst_no, null);
			setValueEx(Cnd_mfg_act_no, null);
			setValueEx(Cnd_oper_act_no, null);
			setValueEx(Cnd_disp_seq, null);
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
			
			setValueEx(Cnd_ac_slip_typ, null);
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);

		}
		else if (Cnd_ope_SRCH_ALL.isSelected()){
			setValueEx(Cnd_send_flg, true);

			setValueEx(Cnd_amt_fix_flg, true);
			setValueEx(Cnd_un_fix_flg, true);
			setValueEx(Cnd_domestic_flg, true);
			setValueEx(Cnd_foreign_flg, true);
			setValueEx(Cnd_spot_flg, true);
			setValueEx(Cnd_not_spot_flg, true);
			setValueEx(Cnd_temp_ap_flg, true);
			setValueEx(Cnd_not_temp_ap_flg, true);
			setValueEx(Cnd_repurc_obli_flg, true);
			setValueEx(Cnd_not_repurc_obli_flg, true);

			setValueEx(Cnd_c_not_imp_flg, true);
			setValueEx(Cnd_c_imp_flg, true);
			setValueEx(Cnd_a_not_imp_flg, true);
			setValueEx(Cnd_a_imp_flg, true);

			setDispTabSelectAll(true);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_fix_no_typ_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_typ_flg_NC(info);
		if (!getCndR().fix_no_typ_flg()) {
			setValueEx(Cnd_fix_no_flg, false);
		}
	}

	@Override
	public void doCnd_fix_no_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_flg_NC(info);
		if (getCndR().fix_no_flg()) {
			setValueEx(Cnd_fix_no_typ_flg, true);
		}
	}

	@Override
	public void doCnd_slip_no_flg_NC(MCEventInfo info) {
		super.doCnd_slip_no_flg_NC(info);
		if (!getCndR().slip_no_flg()) {
			setValueEx(Cnd_slip_seq_no_flg, false);
		}
	}

	@Override
	public void doCnd_slip_seq_no_flg_NC(MCEventInfo info) {
		super.doCnd_slip_seq_no_flg_NC(info);
		if (getCndR().slip_seq_no_flg()) {
			setValueEx(Cnd_slip_no_flg, true);
		}
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_DtlInfo(r)) {
				doBtn_open_DtlInfo(r);
			}
		}
	}

	/**
	 * 詳細情報に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_DtlInfo(RsltR r) {
		if (r == null) {
			return false;
		}
		//集計されていたら、実績ＮＯ（ヘッダ、明細）が非表示になるため、遷移不可とする
		return !(isNull(r.act_no()) && isNull(r.act_d_no())) ;
	}

	/**
	 * 現状在庫一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * 在庫引当状況照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setDispTabSelectAll(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setDispTabSelectAll(false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0080_Srch01();
	}

	protected void doBtn_open_DtlInfo(RsltR r) {

		if (MSC_TRN_TYP.isSLS(r.trn_typ())) {
			open_MSBBP1370();
		}
		else if (MSC_TRN_TYP.isYIELD(r.trn_typ())) {
			if(isNull(r.par_itm_cd())) {
				open_MSBCP1070();
			}
			else {
				open_MSBCP1100();
			}
		}
		else if (MSC_TRN_TYP.isINPT(r.trn_typ()) 
					|| MSC_TRN_TYP.isLOSS(r.trn_typ())) {
			open_MSBCP1090();
		}
		else if (MSC_TRN_TYP.isPURC(r.trn_typ())) {
			open_MSBDP0190(r.trn_typ());
		}
		else if (MSC_TRN_TYP.isPURC_RTN(r.trn_typ())) {
			open_MSBDP0170();
		}
		else if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {
			open_MSBEP1450();
		}
		else if (MSC_TRN_TYP.isIV_SHIP(r.trn_typ())) {
			open_MSBEP1770();
		}
		else if (MSC_TRN_TYP.isXFR(r.trn_typ())) {
			open_MSBEP1050();
		}
		else if (MSC_TRN_TYP.isPROV(r.trn_typ())) {
			open_MSBEP1160();
		}
		else if (MSC_TRN_TYP.isARR(r.trn_typ())) {
			if (!isNullOr(r.po_no(), r.slo_no())) {
				open_MSBDP0190(r.trn_typ());
			}
			else if (isNull(r.loc_sppl_cd())) {
				open_MSBEP2000();
			}
			else {
				open_MSBEP1090();
			}
		}
		else if (MSC_TRN_TYP.isACXFR(r.trn_typ())) {
			open_MSBEP2430();
		}
		else if (MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) {
			open_MSBEP2530();
		}
		else if (MSC_TRN_TYP.isSTK_ADJST(r.trn_typ())) {
			open_MSBEP2620();
		}
		else if (MSC_TRN_TYP.isINSP_STT(r.trn_typ())
					|| MSC_TRN_TYP.isINSP_ACT(r.trn_typ())
					|| MSC_TRN_TYP.isINSP_JUDG(r.trn_typ())
					|| MSC_TRN_TYP.isINSP_SMPL(r.trn_typ())) {
			open_MSBFP0060();
		}
		else if (MSC_TRN_TYP.isINSP_SCHD(r.trn_typ())) {
			open_MSBFP0030();
		}
		else if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
			open_MSBGP0250();
		}
		else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
			open_MSBHP0010();
		}
	}

	public void open_MSBBP1370() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1370");
		aso.putCnd(crtOpenMSBBP1370CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBB.MSBBP1370.CndR crtOpenMSBBP1370CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg p = (mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1370.CndR to = mcframe.clientMSBB.MSBBP1370.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.disp_unit(p.Cnd_disp_unit_DTL.getActionCommand());
		to.sls(true);
		to.sls_ret(true);
		to.sls_dscnt(true);
		to.interim_flg(true);
		to.not_interim_flg(true);
		to.iv_tgt_flg(true);
		to.iv_not_tgt_flg(true);
		to.dis_can_disp_flg(true);
		to.dis_can_disp_flg(true);
		to.opn_flg(true);
		to.fix_flg(true);
		to.acpt_flg(true);
		to.rjct_flg(true);
		to.last_rjct_flg(true);
		to.not_aprv_flg(true);

		to.sls_act_no(r.act_no());

		return to;
	}

	public void open_MSBCP1070() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1070");
		aso.putCnd(crtOpenMSBCP1070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1070.CndR crtOpenMSBCP1070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch p = (mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1070.CndR to = mcframe.clientMSBC.MSBCP1070.CndR.create();

		to.tmp_sts_stt_flg(true);
		to.tmp_sts_cmpl_flg(true);
		to.disp_unit1(p.Cnd_disp_unit1_YIELD.getActionCommand());
		to.disp_unit2(p.Cnd_disp_unit2_ACT.getActionCommand());
		to.unschd_act_flg(true);
		to.not_unschd_act_flg(true);

		to.yield_act_no(r.act_d_no());

		return to;
	}
	
	public void open_MSBCP1100() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		aso.putCnd(crtOpenMSBCP1100CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1100.CndR crtOpenMSBCP1100CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg p = (mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_ACT_NO.name());
		to.srch_tgt_no(r.act_no());
		
		return to;
	}

	public void open_MSBCP1090() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1090");
		aso.putCnd(crtOpenMSBCP1090CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1090.CndR crtOpenMSBCP1090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1090.MSBCP_InptListSrch p = (mcframe.clientMSBC.MSBCP1090.MSBCP_InptListSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1090.CndR to = mcframe.clientMSBC.MSBCP1090.CndR.create();

		//投入の場合は投入実績ＮＯ
		//ロスの場合はロス実績ＮＯ

		to.srch_mode1(p.Cnd_srch_mode1_ACT.getActionCommand());
		
		if (MSC_TRN_TYP.isLOSS(r.trn_typ())) {
			to.srch_mode2(p.Cnd_srch_mode2_LOSS.getActionCommand());
			to.loss_act_no(r.act_d_no());			
		}
		else {
			to.srch_mode2(p.Cnd_srch_mode2_INPT.getActionCommand());
			to.inpt_act_no(r.act_d_no());	
		}
		
		to.oper_stt_flg(true);
		to.oper_cmpl_flg(true);
		to.inpt_stt_flg(true);
		to.inpt_cmpl_flg(true);
	
		return to;
	}

	public void open_MSBDP0190(String trnTyp) {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0190");
		aso.putCnd(crtOpenMSBDP0190CndR(aso, r, trnTyp));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBD.MSBDP0190.CndR crtOpenMSBDP0190CndR(MAUCP_AppScreenOpener aso, RsltR r, String trnTyp) {
		mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg p = (mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0190.CndR to = mcframe.clientMSBD.MSBDP0190.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.disp_unit(p.Cnd_disp_unit_Dtl.getActionCommand());

		to.purc_flg(true);
		to.ret_flg(true);
		to.dscnt_flg(true);
		to.iv_trgt_flg(true);
		to.iv_not_trgt_flg(true);
		to.upri_flg(true);
		to.interim_flg(true);
		to.subcon_flg(true);
		to.not_subcon_flg(true);

		if (MSC_TRN_TYP.isPURC(trnTyp)) {
			to.purc_act_no(r.act_no());
			to.purc_act_d_no(r.act_d_no());
		}
		else if (MSC_TRN_TYP.isARR(trnTyp)) {
			to.po_no(r.po_no());
		}

		return to;
	}

	public void open_MSBDP0170() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0170");
		aso.putCnd(crtOpenMSBDP0170CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBD.MSBDP0170.CndR crtOpenMSBDP0170CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch p = (mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch) aso.getPanel();
		mcframe.clientMSBD.MSBDP0170.CndR to = mcframe.clientMSBD.MSBDP0170.CndR.create();

		to.ope(p.Cnd_ope_SRCH_ACT_REF.getActionCommand());
		to.mode(p.Cnd_mode_SRCH_DTL.getActionCommand());

		to.iv_trgt_flg(true);
		to.iv_not_trgt_flg(true);
		to.not_issue_flg(true);
		to.issue_flg(true);

		to.purc_ret_act_no(r.act_no());
		to.purc_ret_act_d_no(r.act_d_no());

		return to;
	}

	public void open_MSBEP1450() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1450");
		aso.putCnd(crtOpenMSBEP1450CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP1450.CndR crtOpenMSBEP1450CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg p = (mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1450.CndR to = mcframe.clientMSBE.MSBEP1450.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.md(p.Cnd_md_DTL.getActionCommand());
		to.dlv_not_prnted(true);
		to.dlv_prnted(true);
		to.adv_not_prnted(true);
		to.adv_prnted(true);

		to.ship_act_no(r.act_no());

		return to;
	}

	public void open_MSBEP1770() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1770");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1770CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP1770.CndR crtOpenMSBEP1770CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch p = (mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP1770.CndR to = mcframe.clientMSBE.MSBEP1770.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_mode(p.Cnd_srch_mode_SHIP_ACT.getActionCommand());

		to.iv_no(r.act_no());

		return to;
	}

	public void open_MSBEP1050() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1050");
		aso.putCnd(crtOpenMSBEP1050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP1050.CndR crtOpenMSBEP1050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg p = (mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1050.CndR to = mcframe.clientMSBE.MSBEP1050.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.tgt(p.Cnd_tgt_ACT.getActionCommand());
		to.md(p.Cnd_md_DTL.getActionCommand());

		to.xfr_act_no(r.act_no());
		to.xfr_act_d_no(r.act_d_no());

		return to;
	}

	public void open_MSBEP1090() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1090");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1090CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2000.CndR crtOpenMSBEP1090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg p = (mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.arr_act_no(r.act_no());

		return to;
	}

	public void open_MSBEP1160() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1160");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1160CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP1160.CndR crtOpenMSBEP1160CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg p = (mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1160.CndR to = mcframe.clientMSBE.MSBEP1160.CndR.create();

		to.ope(p.Cnd_ope_REF_ACT.getActionCommand());
		//支給実績ＮＯ
		to.prov_act_no(r.act_no());

		return to;
	}

	public void open_MSBEP2000() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2000");
		aso.putCnd(crtOpenMSBEP2000CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2000.CndR crtOpenMSBEP2000CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg p = (mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.arr_act_no(r.act_no());

		return to;
	}


	public void open_MSBEP2430() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2430");
		aso.putCnd(crtOpenMSBEP2430CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2430.CndR crtOpenMSBEP2430CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch p = (mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP2430.CndR to = mcframe.clientMSBE.MSBEP2430.CndR.create();

		to.ope(p.Cnd_ope_REF3.getActionCommand());
		to.acxfr_act_no(r.act_no());
		to.acxfr_act_d_no(r.act_d_no());

		return to;
	}

	public void open_MSBEP2530() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2530");
		aso.putCnd(crtOpenMSBEP2530CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2530.CndR crtOpenMSBEP2530CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2530.CndR to = mcframe.clientMSBE.MSBEP2530.CndR.create();

		to.stk_xfr_act_no(r.act_no());

		return to;
	}

	public void open_MSBEP2620() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2620");
		aso.putCnd(crtOpenMSBEP2620CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2620.CndR crtOpenMSBEP2620CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2620.MSBEP_StktkActReg p = (mcframe.clientMSBE.MSBEP2620.MSBEP_StktkActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2620.CndR to = mcframe.clientMSBE.MSBEP2620.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());

		to.stktk_act_no(r.act_no());
		to.stktk_base_dt(r.ac_dt());
		to.inc_entrd_flg(true);
		return to;
	}

	public void open_MSBFP0060() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0060");
		aso.putCnd(crtOpenMSBFP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0060.CndR crtOpenMSBFP0060CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg p = (mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0060.CndR to = mcframe.clientMSBF.MSBFP0060.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.insp_act_no(r.act_no());

		return to;
	}

	public void open_MSBFP0030() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0030");
		aso.putCnd(crtOpenMSBFP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0030.CndR crtOpenMSBFP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg p = (mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0030.CndR to = mcframe.clientMSBF.MSBFP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.insp_schd_no(r.act_no());
		return to;
	}

	public void open_MSBGP0250() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0250");
		aso.putCnd(crtOpenMSBGP0250CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBG.MSBGP0250.CndR crtOpenMSBGP0250CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch p = (mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch) aso.getPanel();
		mcframe.clientMSBG.MSBGP0250.CndR to = mcframe.clientMSBG.MSBGP0250.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.tax_diff_flg(true);
		to.not_prnt_flg(true);
		to.prnt_flg(true);

		to.rcv_act_no(r.act_no());

		return to;
	}
	public void open_MSBHP0010() {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0010");
		aso.putCnd(crtOpenMSBHP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBH.MSBHP0010.CndR crtOpenMSBHP0010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBH.MSBHP0010.MSBHP_ApDtlApplBalSrch p = (mcframe.clientMSBH.MSBHP0010.MSBHP_ApDtlApplBalSrch) aso.getPanel();
		mcframe.clientMSBH.MSBHP0010.CndR to = mcframe.clientMSBH.MSBHP0010.CndR.create();

		to.ope(p.Cnd_ope_PAY.getActionCommand());
		to.ap_d_no(r.act_no());
		to.unchk_flg(true);
		to.chk_flg(true);
		to.interim_flg(true);
		to.upri_flg(true);
		to.crryovr_flg(true);
		to.not_crryovr_flg(true);
		to.pay_spot_flg(true);
		to.not_pay_spot_flg(true);
		to.subcon_flg(true);
		to.not_subcon_flg(true);

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_DtlInfo]の押下時の処理
	 */
	@Override
	public void doBtn_open_DtlInfo(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_DtlInfo(r);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}


	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		if (MSC_IO_TYP.isGI(r.io_typ())){
			to.wg_cd(r.gi_wg_cd());
			to.dpt_cd(r.gi_dpt_cd());
		}
		else if (MSC_IO_TYP.isGR(r.io_typ())){
			to.wg_cd(r.gr_wg_cd());
			to.dpt_cd(r.gr_dpt_cd());
		}
		to.site_cd(r.site_cd());
		to.lg_grp_cd(r.lg_grp_cd());
		to.loc_grp_cd(r.loc_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.fix_no_typ(r.fix_no_typ());
		to.fix_no(r.fix_no());
		to.pack_unit_cd(r.pack_unit_cd());
		to.gd_cd(r.gd_cd());
		to.in_xfr_typ(r.in_xfr_typ());
		to.quality_typ(r.quality_typ());
		to.asst_typ(r.asst_typ());
		to.stk_insp_typ(r.stk_insp_typ());
		to.stk_id_typ(r.stk_id_typ());
		to.stk_bp_cd(r.stk_bp_cd());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch p = (mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0040.CndR to = mcframe.clientMSBE.MSBEP0040.CndR.create();

		to.ope(p.Cnd_ope_ALLOC.getActionCommand());
		to.lg_grp_cd(r.lg_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());

		return to;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		//数量項目
		Rslt_trd_unit_gr_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_gi_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_pack_unit_gr_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_unit_gi_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_base_unit_gr_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_gi_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_itm_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_mfg_st_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		//単価項目
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_upri_dec_place);

		//金額項目
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);

		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);

		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);

		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		//取引先分類
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);

		//品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		//版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, Cnd_site_cd, null);
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_sttl_schd_dt_fr, Cnd_sttl_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_sub_dt1_fr, Cnd_sub_dt1_to));
		msgList.addAll(checkBeforeAfter(Cnd_sub_dt2_fr, Cnd_sub_dt2_to));
		msgList.addAll(checkBeforeAfter(Cnd_sub_dt3_fr, Cnd_sub_dt3_to));

		if (Cnd_ope_SRCH_ALL.isSelected()){
			msgList.addAll(checkAtLeastOne(AmtfixPanel));
			msgList.addAll(checkAtLeastOne(ForeignPanel));
			msgList.addAll(checkAtLeastOne(SpotPanel));
			msgList.addAll(checkAtLeastOne(CimpPanel));
			msgList.addAll(checkAtLeastOne(AimpPanel));
			msgList.addAll(checkAtLeastOne(TempapPanel));
			msgList.addAll(checkAtLeastOne(RepurcobliPanel));
		}
	}

	/**
	 * 集計タブの全チェックオン／オフ処理
	 * @param flg
	 */
	protected void setDispTabSelectAll(boolean flg) {

		setValueEx(Cnd_slip_no_flg, flg);
		setValueEx(Cnd_slip_seq_no_flg, flg);
		setValueEx(Cnd_ac_dt_flg, flg);
		setValueEx(Cnd_loc_flg, flg);
		setValueEx(Cnd_str_ln_flg, flg);
		setValueEx(Cnd_stk_arrv_bp_flg, flg);
		setValueEx(Cnd_site_flg, flg);
		setValueEx(Cnd_gr_wg_flg, flg);
		setValueEx(Cnd_gi_wg_flg, flg);
		setValueEx(Cnd_lg_grp_flg, flg);
		setValueEx(Cnd_alloc_grp_flg, flg);
		setValueEx(Cnd_loc_grp_flg, flg);
		setValueEx(Cnd_lot_flg, flg);
		setValueEx(Cnd_sublot_flg, flg);
		setValueEx(Cnd_sno1_flg, flg);
		setValueEx(Cnd_sno2_flg, flg);
		setValueEx(Cnd_sno3_flg, flg);
		setValueEx(Cnd_sno4_flg, flg);
		setValueEx(Cnd_fix_no_typ_flg, flg);
		setValueEx(Cnd_fix_no_flg, flg);
		setValueEx(Cnd_pack_unit_flg, flg);
		setValueEx(Cnd_gd_flg, flg);
		setValueEx(Cnd_rsn_flg, flg);
		setValueEx(Cnd_act_dpt_flg, flg);
		setValueEx(Cnd_gr_dpt_flg, flg);
		setValueEx(Cnd_gi_dpt_flg, flg);
		setValueEx(Cnd_bd_dpt_flg, flg);
		setValueEx(Cnd_act_usr_flg, flg);
		setValueEx(Cnd_sls_usr_flg, flg);
		setValueEx(Cnd_mfg_usr_flg, flg);
		setValueEx(Cnd_purc_usr_flg, flg);
		setValueEx(Cnd_slo_no_flg, flg);
		setValueEx(Cnd_po_no_flg, flg);
		setValueEx(Cnd_iv_no_flg, flg);
		setValueEx(Cnd_rcpt_iv_no_flg, flg);
		setValueEx(Cnd_dlv_flg, flg);
		setValueEx(Cnd_tdlv_flg, flg);
		setValueEx(Cnd_cst_flg, flg);
		setValueEx(Cnd_sppl_flg, flg);
		setValueEx(Cnd_cst_itm_flg, flg);
		setValueEx(Cnd_cst_itm_nm_flg, flg);
		setValueEx(Cnd_sppl_itm_flg, flg);
		setValueEx(Cnd_sppl_itm_nm_flg, flg);
		setValueEx(Cnd_par_bd_info_flg, flg);
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setValueEx(Cnd_ac_dt_fr, getToday().startOfMonth());
		setValueEx(Cnd_ac_dt_to, getCndR().ac_dt_fr().addMonth(1).addDay(-1));

		setDispTabSelectAll(true);
	}

}