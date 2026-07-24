package mcframe.clientMSUA.MSUAP1100;

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
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloItmCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_SloItm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_SloItm_MC extends MSUAP_SloItm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_SloItm_MC() {
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
	public MSUAP_SloItm_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [Rslt]ブロックのコンテナを返します。
	 *
	 * @return RsltL
	 */
	@Override
	public MCList<mcframe.clientMSUA.MSUAP1100.RsltR> getRsltL() {
		return super.getRsltL();
	}

	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		callListLogicBeforeAccept(info);
		doAccept();
	}

	/**
	 * テーブルのダブルクリック時処理
	 */
	@Override
	public void doDCAccept(MCEventInfo info) {
		callListLogicBeforeAccept(info, true);
		super.doDCAccept(info);
	}

	protected void callListLogicBeforeAccept(MCEventInfo info) {
		callListLogicBeforeAccept(info, false);
	}

	protected void callListLogicBeforeAccept(MCEventInfo info, boolean isDCEvent) {
		MCList<RsltR> checkedRslt = getRsltL().subList("check", true);
		if (isDCEvent) {
			//ＤＣの場合
			if (checkedRslt.isEmpty()) {
				// チェックがＯＦＦの場合ダブルクリック行を返す
				checkedRslt.add((RsltR) getRsltTable().getSelectedMCRow());
			}
			else {
				// チェックがＯＮのものがある場合は決定できないので中断
				return;
			}
		}

		if (checkedRslt.size() != 1) {
			return;
		}
		RsltR checked = checkedRslt.get(0);

		CndR cnd = getCndR().clone();
		cnd.itm_cd(null);
		cnd.itm_cd(checked.itm_cd());
		cnd.itm_sub1(checked.itm_sub1());
		cnd.itm_sub2(checked.itm_sub2());
		// cnd.itm_sub3(checked.itm_sub3());
		cnd.addStringColumn(FXBAC_ListLogicBase.$INPUT_VAL, checked.itm_sub3());

		MCList<MCRow> list = new mcframe.clientMSUA.MSUAP0030.MSUAP_List().getSloItmSub3(cnd, info);
		if (list.size() != 1) {
			return;
		}

		MCRow down = list.get(0);
		checked.ship_unit_nm(down.getStringNE(SloItmCols.$o_ship_unit_nm));
		checked.ship_unit_dec_place(down.getNumberNE(SloItmCols.$o_ship_unit_dec_place));
		checked.ship_unit_conv_base_qty(down.getNumberNE(SloItmCols.$o_ship_unit_conv_base_qty));
		checked.ship_unit_conv_qty(down.getNumberNE(SloItmCols.$o_ship_unit_conv_qty));
		checked.ship_unit_qty(down.getNumberNE(SloItmCols.$o_ship_unit_qty));
		checked.cntry_org_nm(down.getStringNE(SloItmCols.$o_cntry_org_nm));
		checked.proc_typ(down.getStringNE(SloItmCols.$o_proc_typ));
		checked.ship_inst_typ(down.getStringNE(SloItmCols.$o_ship_inst_typ));
		checked.ship_term_nm(down.getStringNE(SloItmCols.$o_ship_term_nm));
		checked.vmi_flg(down.getBooleanNE(SloItmCols.$o_vmi_flg));
		checked.iv_itm_nm(down.getStringNE(SloItmCols.$o_iv_itm_nm));
		checked.trd_cur_upri(down.getNumberNE(SloItmCols.$o_trd_cur_upri));
		checked.tax_cd(down.getStringNE(SloItmCols.$o_tax_cd));
		checked.tax_nm(down.getStringNE(SloItmCols.$o_tax_nm));
		checked.tax_rate(down.getNumberNE(SloItmCols.$o_tax_rate));
		checked.tax_typ(down.getStringNE(SloItmCols.$o_tax_typ));
		checked.inc_tax_flg(down.getBooleanNE(SloItmCols.$o_inc_tax_flg));
		checked.dscnt_rsn_cd(down.getStringNE(SloItmCols.$o_dscnt_rsn_cd));
		checked.dscnt_rsn_nm(down.getStringNE(SloItmCols.$o_dscnt_rsn_nm));
		checked.cost_upri(down.getNumberNE(SloItmCols.$o_cost_upri));
		checked.wtax_rate(down.getNumberNE(SloItmCols.$o_wtax_rate));
		checked.bill_crryovr_times(down.getNumberNE(SloItmCols.$o_bill_crryovr_times));
		checked.ship_rqst_dt(down.getDateNE(SloItmCols.$o_ship_rqst_dt));
		checked.ship_rqst_hm(down.getDateNE(SloItmCols.$o_ship_rqst_hm));
		checked.dlv_rqst_dt(down.getDateNE(SloItmCols.$o_dlv_rqst_dt));
		checked.dlv_rqst_hm(down.getDateNE(SloItmCols.$o_dlv_rqst_hm));
		checked.dlv_day_week_typ(down.getStringNE(SloItmCols.$o_dlv_day_week_typ));
		checked.dlv_day_week_typ_nm(down.getStringNE(SloItmCols.$o_dlv_day_week_typ_nm));
		checked.dlv_cd(down.getStringNE(SloItmCols.$o_dlv_cd));
		checked.dlv_nm(down.getStringNE(SloItmCols.$o_dlv_nm));
		checked.dlv_sundry_flg(down.getBooleanNE(SloItmCols.$o_dlv_sundry_flg));
		checked.pri_prnt_flg(down.getBooleanNE(SloItmCols.$o_pri_prnt_flg));
		checked.dlv_lg_grp_cd(down.getStringNE(SloItmCols.$o_dlv_lg_grp_cd));
		checked.dlv_lg_grp_nm(down.getStringNE(SloItmCols.$o_dlv_lg_grp_nm));
		checked.dlv_cntry_cd(down.getStringNE(SloItmCols.$o_dlv_cntry_cd));
		checked.dlv_cntry_nm(down.getStringNE(SloItmCols.$o_dlv_cntry_nm));
		checked.dlv_zip_cd(down.getStringNE(SloItmCols.$o_dlv_zip_cd));
		checked.dlv_addr1(down.getStringNE(SloItmCols.$o_dlv_addr1));
		checked.dlv_addr2(down.getStringNE(SloItmCols.$o_dlv_addr2));
		checked.dlv_addr3(down.getStringNE(SloItmCols.$o_dlv_addr3));
		checked.dlv_addr4(down.getStringNE(SloItmCols.$o_dlv_addr4));
		checked.dlv_tel(down.getStringNE(SloItmCols.$o_dlv_tel));
		checked.dlv_fax(down.getStringNE(SloItmCols.$o_dlv_fax));
		checked.dlv_cntct_dpt(down.getStringNE(SloItmCols.$o_dlv_cntct_dpt));
		checked.dlv_cntct_psn(down.getStringNE(SloItmCols.$o_dlv_cntct_psn));
		checked.prnt_lcl_cd(down.getStringNE(SloItmCols.$o_prnt_lcl_cd));
		checked.tdlv_req_flg(down.getBooleanNE(SloItmCols.$o_tdlv_req_flg));
		checked.dest_cd1(down.getStringNE(SloItmCols.$o_dest_cd1));
		checked.dest_nm1(down.getStringNE(SloItmCols.$o_dest_nm1));
		checked.dest_cd2(down.getStringNE(SloItmCols.$o_dest_cd2));
		checked.dest_nm2(down.getStringNE(SloItmCols.$o_dest_nm2));
		checked.dest_cd3(down.getStringNE(SloItmCols.$o_dest_cd3));
		checked.dest_nm3(down.getStringNE(SloItmCols.$o_dest_nm3));
		checked.tdlv_cd(down.getStringNE(SloItmCols.$o_tdlv_cd));
		checked.tdlv_nm(down.getStringNE(SloItmCols.$o_tdlv_nm));
		checked.tdlv_sundry_flg(down.getBooleanNE(SloItmCols.$o_tdlv_sundry_flg));
		checked.tdlv_lg_grp_cd(down.getStringNE(SloItmCols.$o_tdlv_lg_grp_cd));
		checked.tdlv_lg_grp_nm(down.getStringNE(SloItmCols.$o_tdlv_lg_grp_nm));
		checked.tdlv_cntry_cd(down.getStringNE(SloItmCols.$o_tdlv_cntry_cd));
		checked.tdlv_cntry_nm(down.getStringNE(SloItmCols.$o_tdlv_cntry_nm));
		checked.tdlv_zip_cd(down.getStringNE(SloItmCols.$o_tdlv_zip_cd));
		checked.tdlv_addr1(down.getStringNE(SloItmCols.$o_tdlv_addr1));
		checked.tdlv_addr2(down.getStringNE(SloItmCols.$o_tdlv_addr2));
		checked.tdlv_addr3(down.getStringNE(SloItmCols.$o_tdlv_addr3));
		checked.tdlv_addr4(down.getStringNE(SloItmCols.$o_tdlv_addr4));
		checked.tdlv_tel(down.getStringNE(SloItmCols.$o_tdlv_tel));
		checked.tdlv_fax(down.getStringNE(SloItmCols.$o_tdlv_fax));
		checked.tdlv_cntct_dpt(down.getStringNE(SloItmCols.$o_tdlv_cntct_dpt));
		checked.tdlv_cntct_psn(down.getStringNE(SloItmCols.$o_tdlv_cntct_psn));
		checked.via_dlv_typ(down.getStringNE(SloItmCols.$o_via_dlv_typ));
		checked.via_dlv_typ_nm(down.getStringNE(SloItmCols.$o_via_dlv_typ_nm));
		checked.sls_cststk_flg(down.getBooleanNE(SloItmCols.$o_sls_cststk_flg));
		checked.gd_cd(down.getStringNE(SloItmCols.$o_gd_cd));
		checked.gd_nm(down.getStringNE(SloItmCols.$o_gd_nm));
		checked.ship_schd_split_typ(down.getStringNE(SloItmCols.$o_ship_schd_split_typ));
		checked.alloc_scope_typ(down.getStringNE(SloItmCols.$o_alloc_scope_typ));
		checked.alloc_typ(down.getStringNE(SloItmCols.$o_alloc_typ));
		checked.sls_upri_req_typ(down.getStringNE(SloItmCols.$o_sls_upri_req_typ));
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				SloItmCols.$i_itm_sub1,
				SloItmCols.$i_itm_sub2,
				SloItmCols.$i_itm_sub3,
				SloItmCols.$i_itm_nm,
				SloItmCols.$i_itm_alt_nm1,
				SloItmCols.$i_itm_alt_nm2,
				SloItmCols.$i_itm_alt_nm3,
				SloItmCols.$i_itm_alt_nm4,
				SloItmCols.$i_itm_typ,
				SloItmCols.$i_itm_typ_d_cd,
				SloItmCols.$i_stk_mng_typ,
				SloItmCols.$i_asset_mng_typ,
				SloItmCols.$i_itm_is_srch_typ,
				SloItmCols.$i_sundry_itm_flg_on,
				SloItmCols.$i_sundry_itm_flg_off,
				SloItmCols.$i_release_flg_on,
				SloItmCols.$i_release_flg_off,
				SloItmCols.$i_bp_cd,
				SloItmCols.$i_bp_nm,
				SloItmCols.$i_dt,
				SloItmCols.$i_trd_ptn_typ,
				SloItmCols.$i_hdr_dlv_cd,
				SloItmCols.$i_hdr_dlv_nm,
				SloItmCols.$i_hdr_dlv_sundry_flg,
				SloItmCols.$i_hdr_pri_prnt_flg,
				SloItmCols.$i_hdr_dlv_lg_grp_cd,
				SloItmCols.$i_hdr_dlv_lg_grp_nm,
				SloItmCols.$i_hdr_dlv_cntry_cd,
				SloItmCols.$i_hdr_dlv_cntry_nm,
				SloItmCols.$i_hdr_dlv_zip_cd,
				SloItmCols.$i_hdr_dlv_addr1,
				SloItmCols.$i_hdr_dlv_addr2,
				SloItmCols.$i_hdr_dlv_addr3,
				SloItmCols.$i_hdr_dlv_addr4,
				SloItmCols.$i_hdr_dlv_tel,
				SloItmCols.$i_hdr_dlv_fax,
				SloItmCols.$i_hdr_dlv_cntct_dpt,
				SloItmCols.$i_hdr_dlv_cntct_psn,
				SloItmCols.$i_hdr_prnt_lcl_cd,
				SloItmCols.$i_hdr_dest_cd1,
				SloItmCols.$i_hdr_dest_nm1,
				SloItmCols.$i_hdr_dest_cd2,
				SloItmCols.$i_hdr_dest_nm2,
				SloItmCols.$i_hdr_dest_cd3,
				SloItmCols.$i_hdr_dest_nm3,
				SloItmCols.$i_hdr_tdlv_cd,
				SloItmCols.$i_hdr_tdlv_nm,
				SloItmCols.$i_hdr_tdlv_sundry_flg,
				SloItmCols.$i_hdr_tdlv_lg_grp_cd,
				SloItmCols.$i_hdr_tdlv_lg_grp_nm,
				SloItmCols.$i_hdr_tdlv_cntry_cd,
				SloItmCols.$i_hdr_tdlv_cntry_nm,
				SloItmCols.$i_hdr_tdlv_zip_cd,
				SloItmCols.$i_hdr_tdlv_addr1,
				SloItmCols.$i_hdr_tdlv_addr2,
				SloItmCols.$i_hdr_tdlv_addr3,
				SloItmCols.$i_hdr_tdlv_addr4,
				SloItmCols.$i_hdr_tdlv_tel,
				SloItmCols.$i_hdr_tdlv_fax,
				SloItmCols.$i_hdr_tdlv_cntct_dpt,
				SloItmCols.$i_hdr_tdlv_cntct_psn,
				SloItmCols.$i_hdr_via_dlv_typ,
				SloItmCols.$i_hdr_via_dlv_typ_nm,
				SloItmCols.$i_hdr_tdlv_req_flg,
				SloItmCols.$i_sls_basis_typ,
				SloItmCols.$i_hdr_wg_cd,
				SloItmCols.$i_trd_cur_cd,
				SloItmCols.$i_base_cur_cd,
				SloItmCols.$i_ptax_cur_cd,
				SloItmCols.$i_cst_iv_flg,
				SloItmCols.$i_cst_bill_crryovr_times,
				SloItmCols.$i_hdr_sls_upri_req_typ,
				SloItmCols.$i_hdr_ship_schd_split_typ,
				SloItmCols.$i_assort_typ,
				SloItmCols.$i_iv_no,
				SloItmCols.$i_iv_num_flg,
				SloItmCols.$i_hdr_ship_rqst_dt,
				SloItmCols.$i_hdr_ship_rqst_hm,
				SloItmCols.$i_hdr_dlv_rqst_dt,
				SloItmCols.$i_hdr_dlv_rqst_hm,
				SloItmCols.$i_hdr_dlv_day_week_typ,
				SloItmCols.$i_hdr_dlv_day_week_typ_nm,
				SloItmCols.$i_vmi_flg,
				SloItmCols.$i_trd_unit_qty,
				SloItmCols.$i_trd_cur_upri,
				SloItmCols.$i_tax_cd,
				SloItmCols.$i_tax_nm,
				SloItmCols.$i_tax_rate,
				SloItmCols.$i_tax_typ,
				SloItmCols.$i_inc_tax_flg,
				SloItmCols.$i_dscnt_rsn_cd,
				SloItmCols.$i_dscnt_rsn_nm,
				SloItmCols.$i_cost_upri,
				SloItmCols.$i_bill_crryovr_times,
				SloItmCols.$i_set_itm_grp_no,
				SloItmCols.$i_ship_rqst_dt,
				SloItmCols.$i_is_editable_ship_rqst_dt,
				SloItmCols.$i_ship_rqst_hm,
				SloItmCols.$i_is_editable_ship_rqst_hm,
				SloItmCols.$i_dlv_rqst_dt,
				SloItmCols.$i_is_editable_dlv_rqst_dt,
				SloItmCols.$i_dlv_rqst_hm,
				SloItmCols.$i_is_editable_dlv_rqst_hm,
				SloItmCols.$i_dlv_day_week_typ,
				SloItmCols.$i_dlv_day_week_typ_nm,
				SloItmCols.$i_is_editable_dlv_day_week_typ_nm,
				SloItmCols.$i_sls_schd_dt,
				SloItmCols.$i_is_editable_dlv_cd,
				SloItmCols.$i_dlv_cd,
				SloItmCols.$i_dlv_nm,
				SloItmCols.$i_dlv_sundry_flg,
				SloItmCols.$i_pri_prnt_flg,
				SloItmCols.$i_dlv_lg_grp_cd,
				SloItmCols.$i_dlv_lg_grp_nm,
				SloItmCols.$i_dlv_cntry_cd,
				SloItmCols.$i_dlv_cntry_nm,
				SloItmCols.$i_dlv_zip_cd,
				SloItmCols.$i_dlv_addr1,
				SloItmCols.$i_dlv_addr2,
				SloItmCols.$i_dlv_addr3,
				SloItmCols.$i_dlv_addr4,
				SloItmCols.$i_dlv_tel,
				SloItmCols.$i_dlv_fax,
				SloItmCols.$i_dlv_cntct_dpt,
				SloItmCols.$i_dlv_cntct_psn,
				SloItmCols.$i_prnt_lcl_cd,
				SloItmCols.$i_tdlv_req_flg,
				SloItmCols.$i_is_editable_dest_cd1,
				SloItmCols.$i_dest_cd1,
				SloItmCols.$i_dest_nm1,
				SloItmCols.$i_is_editable_dest_cd2,
				SloItmCols.$i_dest_cd2,
				SloItmCols.$i_dest_nm2,
				SloItmCols.$i_is_editable_dest_cd3,
				SloItmCols.$i_dest_cd3,
				SloItmCols.$i_dest_nm3,
				SloItmCols.$i_is_editable_tdlv_cd,
				SloItmCols.$i_tdlv_cd,
				SloItmCols.$i_tdlv_nm,
				SloItmCols.$i_tdlv_sundry_flg,
				SloItmCols.$i_tdlv_lg_grp_cd,
				SloItmCols.$i_tdlv_lg_grp_nm,
				SloItmCols.$i_tdlv_cntry_cd,
				SloItmCols.$i_tdlv_cntry_nm,
				SloItmCols.$i_tdlv_zip_cd,
				SloItmCols.$i_tdlv_addr1,
				SloItmCols.$i_tdlv_addr2,
				SloItmCols.$i_tdlv_addr3,
				SloItmCols.$i_tdlv_addr4,
				SloItmCols.$i_tdlv_tel,
				SloItmCols.$i_tdlv_fax,
				SloItmCols.$i_tdlv_cntct_dpt,
				SloItmCols.$i_tdlv_cntct_psn,
				SloItmCols.$i_via_dlv_typ,
				SloItmCols.$i_via_dlv_typ_nm,
				SloItmCols.$i_sls_cststk_flg,
				SloItmCols.$i_proc_typ,
				SloItmCols.$i_ship_schd_split_typ,
				SloItmCols.$i_alloc_scope_typ,
				SloItmCols.$i_alloc_typ,
				SloItmCols.$i_sls_upri_req_typ,
				SloItmCols.$i_from_slo_reg,
				SloItmCols.$i_bp_itm_cd,
				SloItmCols.$i_bp_itm_nm,
				SloItmCols.$i_rpt_key_cd,
				SloItmCols.$i_rpt_key_nm
		};
	}

}