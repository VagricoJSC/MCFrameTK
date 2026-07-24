package mcframe.serverMSBD.MSBDL5180;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [MSBDL_PurcActRegService]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("MS.MSBDL5180.Purc_Chk01.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk01.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk02.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.UP.BLOCK2")){
			return MS_MSBDL5180_Purc_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.UP.BLOCK3")){
			return MS_MSBDL5180_Purc_Chk03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.DOWN.BLOCK1")){
			return MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Chk03.DOWN.BLOCK2")){
			return MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.UP.BLOCK2")){
			return MS_MSBDL5180_Purc_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.UP.BLOCK3")){
			return MS_MSBDL5180_Purc_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.DOWN.BLOCK1")){
			return MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Ins01.DOWN.BLOCK2")){
			return MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.UP.BLOCK2")){
			return MS_MSBDL5180_Purc_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.UP.BLOCK3")){
			return MS_MSBDL5180_Purc_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd01.DOWN.BLOCK2")){
			return MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.UP.BLOCK2")){
			return MS_MSBDL5180_Purc_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.UP.BLOCK3")){
			return MS_MSBDL5180_Purc_Upd02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.DOWN.BLOCK1")){
			return MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Upd02.DOWN.BLOCK2")){
			return MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Del01.UP.BLOCK0")){
			return MS_MSBDL5180_Purc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Del01.UP.BLOCK1")){
			return MS_MSBDL5180_Purc_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Del01.UP.BLOCK2")){
			return MS_MSBDL5180_Purc_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5180.Purc_Del01.UP.BLOCK3")){
			return MS_MSBDL5180_Purc_Del01_UP_BLOCK3();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_upd_flg", "dtl_upd_flg")
			}
			,
			MCBlockDef.create("Purc_Chk01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".po_no", "po_no"),
				MCItemDef.create("pa" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("pa" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("pa" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".cred_cd", "cred_cd"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("pa" + ".purc_dt", "purc_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pa" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pa" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pa" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ptax_dt", "ptax_dt"),
				MCItemDef.create("pa" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pa" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("pa" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("pa" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("pa" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("pa" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("pa" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pad" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pad" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("pad" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("pad" + ".purc_src_typ", "purc_src_typ"),
				MCItemDef.create("pad" + ".purc_src_no", "purc_src_no"),
				MCItemDef.create("pad" + ".purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("pad" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pad" + ".purc_typ", "purc_typ"),
				MCItemDef.create("pad" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pad" + ".ver_no", "ver_no"),
				MCItemDef.create("pad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pad" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pad" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pad" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pad" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pad" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("pad" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("pad" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pad" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pad" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pad" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pad" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pad" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("pad" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("pad" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("pad" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("pad" + ".ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("pad" + ".ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("pad" + ".ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("pad" + ".ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pad" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pad" + ".re_arr_flg", "re_arr_flg"),
				MCItemDef.create("pad" + ".re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("pad" + ".re_arr_loc_wg_cd", "re_arr_loc_wg_cd"),
				MCItemDef.create("pad" + ".re_arr_str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("pad" + ".re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("pad" + ".re_arr_rqst_tm", "re_arr_rqst_tm"),
				MCItemDef.create("pad" + ".re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("pad" + ".trd_unit_re_arr_qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".base_unit_re_arr_qty", "base_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".ncv_flg", "ncv_flg"),
				MCItemDef.create("pad" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pad" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pad" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pad" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pad" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("pad" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pad" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pad" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pad" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pad" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pad" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pad" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pad" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pad" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pad" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pad" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pad" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("pad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("pad" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("pad" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pad" + ".intr_rmrks", "intr_d_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".sub_char1", "sub_d_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_d_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_d_char3"),
				MCItemDef.create("pad" + ".ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("pad" + ".ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("pad" + ".ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("pad" + ".ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("pad" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("pad" + ".sno1", "sno1"),
				MCItemDef.create("pad" + ".sno2", "sno2"),
				MCItemDef.create("pad" + ".sno3", "sno3"),
				MCItemDef.create("pad" + ".sno4", "sno4"),
				MCItemDef.create("pad" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pad" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pad" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("pad" + ".lot_no", "lot_no"),
				MCItemDef.create("pad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pad" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pad" + ".po_no", "dscnt_po_no"),
				MCItemDef.create("pad" + ".slo_no", "dscnt_slo_no"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pad" + ".edi_flg", "edi_flg"),
				MCItemDef.create("pad" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("pad" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt")
			}
			,
			MCBlockDef.create("Purc_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Purc_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk02",
			new MCItemDef[]{
				MCItemDef.create("screen_tgt_flg", "screen_tgt_flg"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("arr_dt", "arr_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("arr_sync_flg", "arr_sync_flg"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pai" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pai" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pai" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pai" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pai" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pai" + ".ver_no", "ver_no"),
				MCItemDef.create("pai" + ".gd_cd", "gd_cd"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("pai" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("pai" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("pai" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("pai" + ".gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("pai" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pai" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pai" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pai" + ".lot_no", "lot_no"),
				MCItemDef.create("pai" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pai" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pai" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pai" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pai" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Purc_Chk02_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk02",
			new MCItemDef[]{
				MCItemDef.create("screen_tgt_flg", "screen_tgt_flg"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Purc_Chk02_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Chk03_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("no_chk_flg", "no_chk_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".po_no", "po_no"),
				MCItemDef.create("pa" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("pa" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("pa" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("pa" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("pa" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("pa" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("pa" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pa" + ".purc_dt", "purc_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pa" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pa" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pa" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("pa" + ".ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ptax_dt", "ptax_dt"),
				MCItemDef.create("pa" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("fix_flg", "fix_flg")
			}
			,
			MCBlockDef.create("Purc_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("no_chk_flg", "no_chk_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pad" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pad" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pad" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("pad" + ".purc_src_typ", "purc_src_typ"),
				MCItemDef.create("pad" + ".purc_src_no", "purc_src_no"),
				MCItemDef.create("pad" + ".purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("pad" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pad" + ".purc_typ", "purc_typ"),
				MCItemDef.create("pad" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pad" + ".ver_no", "ver_no"),
				MCItemDef.create("pad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pad" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pad" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pad" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pad" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_flg", "dscnt_flg"),
				MCItemDef.create("pad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pad" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("pad" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pad" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pad" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pad" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pad" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pad" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("pad" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("pad" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("pad" + ".ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("pad" + ".ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("pad" + ".ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".tax_cd", "tax_cd"),
				MCItemDef.create("pad" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("pad" + ".ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("pad" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pad" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pad" + ".re_arr_flg", "re_arr_flg"),
				MCItemDef.create("pad" + ".re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("pad" + ".re_arr_loc_wg_cd", "re_arr_loc_wg_cd"),
				MCItemDef.create("pad" + ".re_arr_str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("pad" + ".trd_unit_re_arr_qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".base_unit_re_arr_qty", "base_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".re_arr_rqst_tm", "re_arr_rqst_tm"),
				MCItemDef.create("pad" + ".re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("pad" + ".re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("pad" + ".ncv_flg", "ncv_flg"),
				MCItemDef.create("pad" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pad" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pad" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pad" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pad" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("pad" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pad" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pad" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pad" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pad" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pad" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pad" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pad" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pad" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pad" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pad" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pad" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("pad" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("pad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("pad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pad" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pad" + ".ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("pad" + ".ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("pad" + ".ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("pad" + ".ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("pad" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("pad" + ".sno1", "sno1"),
				MCItemDef.create("pad" + ".sno2", "sno2"),
				MCItemDef.create("pad" + ".sno3", "sno3"),
				MCItemDef.create("pad" + ".sno4", "sno4"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("pad" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pad" + ".lot_no", "lot_no"),
				MCItemDef.create("pad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pad" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pad" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pad" + ".edi_flg", "edi_flg"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("arr_sync_flg", "arr_sync_flg")
			}
			,
			MCBlockDef.create("Purc_Chk03_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("no_chk_flg", "no_chk_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("pai" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pai" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("pai" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pai" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pai" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pai" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pai" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pai" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pai" + ".ver_no", "ver_no"),
				MCItemDef.create("pai" + ".gd_cd", "gd_cd"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("pai" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("pai" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("pai" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("pai" + ".gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("pai" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("pai" + ".lot_no", "lot_no"),
				MCItemDef.create("pai" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pai" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pai" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pai" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pai" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pai" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pai" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pai" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt")
			}
			,
			MCBlockDef.create("Purc_Chk03_Io")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("crt_param_cache_flg", "crt_param_cache_flg"),
				MCItemDef.create("arr_act_srvs_flg", "arr_act_srvs_flg"),
				MCItemDef.create("purc_ddlv_reg_exec_flg", "purc_ddlv_reg_exec_flg"),
				MCItemDef.create("purc_dtl_flg", "purc_dtl_flg"),
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("arr_act_flg", "arr_act_flg"),
				MCItemDef.create("insp_act_srvs_flg", "insp_act_srvs_flg"),
				MCItemDef.create("rcpt_iv_form_flg", "rcpt_iv_form_flg")
			}
			,
			MCBlockDef.create("Purc_Chk03_Ctl")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Purc_Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pad" + ".purc_dtl_upd_flg", "purc_dtl_upd_flg"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty")
			}
			,
			MCBlockDef.create("Purc_Chk03_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Chk03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Chk03",
			new MCItemDef[]{
				MCItemDef.create("outsrc_act_flg", "outsrc_act_flg"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Purc_Chk03_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Ins01_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("arr_act_flg", "arr_act_flg"),
				MCItemDef.create("arr_act_srvs_flg", "arr_act_srvs_flg"),
				MCItemDef.create("purc_ddlv_reg_exec_flg", "purc_ddlv_reg_exec_flg"),
				MCItemDef.create("insp_act_srvs_flg", "insp_act_srvs_flg"),
				MCItemDef.create("rcpt_iv_form_flg", "rcpt_iv_form_flg"),
				MCItemDef.create("purc_lst_flg", "purc_lst_flg"),
				MCItemDef.create("purc_form_flg", "purc_form_flg"),
				MCItemDef.create("purc_ret_flg", "purc_ret_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Ctl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slo_sts_upd_flg", "slo_sts_upd_flg"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".po_no", "po_no"),
				MCItemDef.create("pa" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("pa" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("pa" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".cred_cd", "cred_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("pa" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("pa" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("pa" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("pa" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("pa" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pa" + ".purc_dt", "purc_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pa" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pa" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pa" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("pa" + ".ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("pa" + ".purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("pa" + ".purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ptax_dt", "ptax_dt"),
				MCItemDef.create("pa" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("fix_flg", "fix_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("pad" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pad" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pad" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pad" + ".purc_src_typ", "purc_src_typ"),
				MCItemDef.create("pad" + ".purc_src_no", "purc_src_no"),
				MCItemDef.create("pad" + ".purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("pad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".purc_typ", "purc_typ"),
				MCItemDef.create("pad" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pad" + ".ver_no", "ver_no"),
				MCItemDef.create("pad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pad" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pad" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pad" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pad" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pad" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("pad" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("pad" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pad" + ".temp_ap_flg", "temp_ap_flg"),
				MCItemDef.create("arr_sync_flg", "arr_sync_flg"),
				MCItemDef.create("pad" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pad" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pad" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pad" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pad" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("pad" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("pad" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("pad" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("pad" + ".ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("pad" + ".ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("pad" + ".ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("pad" + ".ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pad" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pad" + ".re_arr_flg", "re_arr_flg"),
				MCItemDef.create("pad" + ".re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("pad" + ".re_arr_loc_wg_cd", "re_arr_loc_wg_cd"),
				MCItemDef.create("pad" + ".re_arr_str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("pad" + ".re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("pad" + ".re_arr_rqst_tm", "re_arr_rqst_tm"),
				MCItemDef.create("pad" + ".re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("pad" + ".trd_unit_re_arr_qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".base_unit_re_arr_qty", "base_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".ncv_flg", "ncv_flg"),
				MCItemDef.create("pad" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pad" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pad" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pad" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pad" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("pad" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pad" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pad" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pad" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pad" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pad" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pad" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pad" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pad" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pad" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pad" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pad" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("pad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("pad" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("pad" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pad" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pad" + ".ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("pad" + ".ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("pad" + ".ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("pad" + ".ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("pad" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("pad" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("pad" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("pad" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("pad" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("pad" + ".sno1", "sno1"),
				MCItemDef.create("pad" + ".sno2", "sno2"),
				MCItemDef.create("pad" + ".sno3", "sno3"),
				MCItemDef.create("pad" + ".sno4", "sno4"),
				MCItemDef.create("pad" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pad" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pad" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pad" + ".lot_no", "lot_no"),
				MCItemDef.create("pad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pad" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pad" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pad" + ".po_no", "po_no"),
				MCItemDef.create("pad" + ".slo_no", "slo_no"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pad" + ".edi_flg", "edi_flg"),
				MCItemDef.create("pad" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("pad" + ".upri_not_tgt_flg", "upri_not_tgt_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("screen_tgt_flg", "screen_tgt_flg"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("outsrc_act_flg", "outsrc_act_flg"),
				MCItemDef.create("pai" + ".purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pai" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pai" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pai" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pai" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pai" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pai" + ".ver_no", "ver_no"),
				MCItemDef.create("pai" + ".gd_cd", "gd_cd"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("pai" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("pai" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("pai" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("pai" + ".gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("pai" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pai" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pai" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("pai" + ".lot_no", "lot_no"),
				MCItemDef.create("pai" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pai" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pai" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pai" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("pai" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pai" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pai" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pai" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("pai" + ".insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("pai" + ".insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("pai" + ".insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Purc_Ins01_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pa" + ".purc_act_rev", "purc_act_rev")
			}
			,
			MCBlockDef.create("Purc_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq")
			}
			,
			MCBlockDef.create("Purc_Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("screen_tgt_flg", "screen_tgt_flg"),
				MCItemDef.create("src_peg_no", "src_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("pai" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pai" + ".purc_act_d_seq", "purc_act_d_seq")
			}
			,
			MCBlockDef.create("Purc_Ins01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("arr_act_flg", "arr_act_flg"),
				MCItemDef.create("arr_act_srvs_flg", "arr_act_srvs_flg"),
				MCItemDef.create("purc_dtl_flg", "purc_dtl_flg"),
				MCItemDef.create("purc_ddlv_reg_exec_flg", "purc_ddlv_reg_exec_flg"),
				MCItemDef.create("insp_act_srvs_flg", "insp_act_srvs_flg"),
				MCItemDef.create("rcpt_iv_form_flg", "rcpt_iv_form_flg"),
				MCItemDef.create("purc_lst_flg", "purc_lst_flg"),
				MCItemDef.create("purc_form_flg", "purc_form_flg"),
				MCItemDef.create("purc_ret_flg", "purc_ret_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Ctl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slo_sts_upd_flg", "slo_sts_upd_flg"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pa" + ".purc_act_rev", "purc_act_rev"),
				MCItemDef.create("pa" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("pa" + ".po_no", "po_no"),
				MCItemDef.create("pa" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("pa" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("pa" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".cred_cd", "cred_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("pa" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("pa" + ".base_cur_cd", "base_cur_cd"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("pa" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("pa" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("pa" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("pa" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("pa" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pa" + ".purc_dt", "purc_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pa" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pa" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pa" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("pa" + ".ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("pa" + ".purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("pa" + ".purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("pa" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ptax_dt", "ptax_dt"),
				MCItemDef.create("pa" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("fix_flg", "fix_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("pad" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pad" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pad" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pad" + ".purc_src_typ", "purc_src_typ"),
				MCItemDef.create("pad" + ".purc_src_no", "purc_src_no"),
				MCItemDef.create("pad" + ".purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("pad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".purc_typ", "purc_typ"),
				MCItemDef.create("pad" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pad" + ".ver_no", "ver_no"),
				MCItemDef.create("pad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pad" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pad" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pad" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pad" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pad" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("pad" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pad" + ".temp_ap_flg", "temp_ap_flg"),
				MCItemDef.create("pad" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pad" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pad" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pad" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pad" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("pad" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("pad" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("pad" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("pad" + ".ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("pad" + ".ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("pad" + ".ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("pad" + ".ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("pad" + ".ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("pad" + ".ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("pad" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pad" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pad" + ".re_arr_flg", "re_arr_flg"),
				MCItemDef.create("pad" + ".re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("pad" + ".re_arr_rqst_tm", "re_arr_rqst_tm"),
				MCItemDef.create("pad" + ".re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("pad" + ".trd_unit_re_arr_qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".base_unit_re_arr_qty", "base_unit_re_arr_qty"),
				MCItemDef.create("pad" + ".ncv_flg", "ncv_flg"),
				MCItemDef.create("pad" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pad" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pad" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pad" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pad" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("pad" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pad" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pad" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pad" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pad" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pad" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pad" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pad" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pad" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pad" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pad" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pad" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("pad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("pad" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("pad" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pad" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pad" + ".ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("pad" + ".ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("pad" + ".ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("pad" + ".ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("pad" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("pad" + ".sno1", "sno1"),
				MCItemDef.create("pad" + ".sno2", "sno2"),
				MCItemDef.create("pad" + ".sno3", "sno3"),
				MCItemDef.create("pad" + ".sno4", "sno4"),
				MCItemDef.create("pad" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pad" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pad" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pad" + ".lot_no", "lot_no"),
				MCItemDef.create("pad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pad" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pad" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pad" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pad" + ".po_no", "po_no"),
				MCItemDef.create("pad" + ".slo_no", "slo_no"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pad" + ".edi_flg", "edi_flg"),
				MCItemDef.create("pad" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("pad" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("pad" + ".purc_dtl_upd_flg", "purc_dtl_upd_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("outsrc_act_flg", "outsrc_act_flg"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("pai" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pai" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pai" + ".purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pai" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pai" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pai" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pai" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pai" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("pai" + ".ver_no", "ver_no"),
				MCItemDef.create("pai" + ".gd_cd", "gd_cd"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("pai" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("pai" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("pai" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("pai" + ".gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("pai" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pai" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pai" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("pai" + ".lot_no", "lot_no"),
				MCItemDef.create("pai" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pai" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pai" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pai" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("pai" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("pai" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pai" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pai" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pai" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt")
			}
			,
			MCBlockDef.create("Purc_Ins01_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pa" + ".purc_act_rev", "purc_act_rev")
			}
			,
			MCBlockDef.create("Purc_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq")
			}
			,
			MCBlockDef.create("Purc_Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("pai" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pai" + ".purc_act_d_seq", "purc_act_d_seq")
			}
			,
			MCBlockDef.create("Purc_Ins01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("arr_flg", "arr_flg"),
				MCItemDef.create("purc_dtl_flg", "purc_dtl_flg"),
				MCItemDef.create("purc_lst_flg", "purc_lst_flg"),
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("purc_ddlv_reg_exec_flg", "purc_ddlv_reg_exec_flg"),
				MCItemDef.create("insp_act_srvs_flg", "insp_act_srvs_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Purc_Upd02_Ctl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Purc_Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Purc_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("pai" + ".insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("pai" + ".insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Purc_Upd02_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq")
			}
			,
			MCBlockDef.create("Purc_Upd02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq")
			}
			,
			MCBlockDef.create("Purc_Upd02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5180_Purc_Upd02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("pai" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq")
			}
			,
			MCBlockDef.create("Purc_Upd02_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5180_Purc_Del01_INFO = new MCOperationInfo("MS", "MSBDL5180", "Purc_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5180_Purc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Del01",
			new MCItemDef[]{
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("arr_act_flg", "arr_act_flg"),
				MCItemDef.create("purc_ddlv_reg_exec_flg", "purc_ddlv_reg_exec_flg"),
				MCItemDef.create("insp_act_srvs_flg", "insp_act_srvs_flg")
			}
			,
			MCBlockDef.create("Purc_Ins01_Ctl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pa" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pa" + ".po_no", "po_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("Purc_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pad" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pad" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("pad" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("pad" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pad" + ".po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Purc_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5180_Purc_Del01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5180", "Purc_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("outsrc_act_flg", "outsrc_act_flg"),
				MCItemDef.create("pai" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("pai" + ".purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("pai" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("pai" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("pai" + ".in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("pai" + ".in_to_loc_cd", "in_to_loc_cd")
			}
			,
			MCBlockDef.create("Purc_Ins01_Io")
		);
	}


	//FMCB DEF_CLASSES END
}

