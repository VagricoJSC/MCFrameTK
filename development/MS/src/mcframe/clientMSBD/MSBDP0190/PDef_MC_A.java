package mcframe.clientMSBD.MSBDP0190;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PurcDtlModReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0190.Srch01.UP.BLOCK0")){
			return MS_MSBDL0190_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0190_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Upd01.UP.BLOCK0")){
			return MS_MSBDL0190_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Upd01.UP.BLOCK1")){
			return MS_MSBDL0190_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0190.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0190_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt01.UP.BLOCK0")){
			return MS_MSBDL0190_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt01.DOWN.BLOCK0")){
			return MS_MSBDL0190_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt02.UP.BLOCK0")){
			return MS_MSBDL0190_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt02.DOWN.BLOCK0")){
			return MS_MSBDL0190_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt03.UP.BLOCK0")){
			return MS_MSBDL0190_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0190.Sprt03.DOWN.BLOCK0")){
			return MS_MSBDL0190_Sprt03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBDL0190_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0190", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0190_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("disp_unit", "disp_unit"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("ret_flg", "ret_flg"),
				MCItemDef.create("dscnt_flg", "dscnt_flg"),
				MCItemDef.create("iv_trgt_flg", "iv_trgt_flg"),
				MCItemDef.create("iv_not_trgt_flg", "iv_not_trgt_flg"),
				MCItemDef.create("upri_flg", "upri_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("not_subcon_flg", "not_subcon_flg"),
				MCItemDef.create("purc_dt_from", "purc_dt_from"),
				MCItemDef.create("purc_dt_to", "purc_dt_to"),
				MCItemDef.create("ac_ym_from", "ac_ym_from"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_dt_from", "ac_dt_from"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("arr_dt_p" + ".ymd_fr", "arr_dt_fr"),
				MCItemDef.create("arr_dt_p" + ".hm_fr", "arr_hm_fr"),
				MCItemDef.create("arr_dt_p" + ".ymd_to", "arr_dt_to"),
				MCItemDef.create("arr_dt_p" + ".hm_to", "arr_hm_to"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_src_typ", "purc_src_typ"),
				MCItemDef.create("purc_src_no", "purc_src_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("edi_bp_dlv_slip_no", "edi_bp_dlv_slip_no"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dtl_trd_d_rmrks", "dtl_trd_d_rmrks"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("dis_can_disp_flg", "dis_can_disp_flg"),
				MCItemDef.create("inc_past_flg", "inc_past_flg"),
				MCItemDef.create("incl_temp_ap_flg", "incl_temp_ap_flg"),
				MCItemDef.create("sign_rev_flg", "sign_rev_flg"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg1", "asppl_grp_flg1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg2", "asppl_grp_flg2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg3", "asppl_grp_flg3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg4", "asppl_grp_flg4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg5", "asppl_grp_flg5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg6", "asppl_grp_flg6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg7", "asppl_grp_flg7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg8", "asppl_grp_flg8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg9", "asppl_grp_flg9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg10", "asppl_grp_flg10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm10", "asppl_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0190_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_dt", "arr_dt"),
				MCItemDef.create("arr_hm", "arr_hm"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("purc_cl_ym", "purc_cl_ym"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_typ_nm", "purc_typ_nm"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("purc_cont_fctr_p" + ".purc_cont_fctr", "purc_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("old_trd_cur_upri_p" + ".upri", "old_trd_cur_upri"),
				MCItemDef.create("old_trd_cur_proc_upri_p" + ".upri", "old_trd_cur_proc_upri"),
				MCItemDef.create("old_trd_cur_onr_prov_upri_p" + ".upri", "old_trd_cur_onr_prov_upri"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_cd"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_p" + ".bp_nm", "dlv_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_p" + ".cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("purc_dscnt_loc_mng_typ", "purc_dscnt_loc_mng_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("purc_act_sub_char1", "purc_act_sub_char1"),
				MCItemDef.create("purc_act_sub_char2", "purc_act_sub_char2"),
				MCItemDef.create("purc_act_sub_char3", "purc_act_sub_char3"),
				MCItemDef.create("purc_act_d_sub_char1", "purc_act_d_sub_char1"),
				MCItemDef.create("purc_act_d_sub_char2", "purc_act_d_sub_char2"),
				MCItemDef.create("purc_act_d_sub_char3", "purc_act_d_sub_char3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("temp_ap_flg", "temp_ap_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_src_typ", "purc_src_typ"),
				MCItemDef.create("purc_src_typ_nm", "purc_src_typ_nm"),
				MCItemDef.create("purc_src_no", "purc_src_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("purc_upd_cntr", "purc_upd_cntr"),
				MCItemDef.create("purc_ret_upd_cntr", "purc_ret_upd_cntr"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm10", "asppl_grp_nm10"),
				MCItemDef.create("base_trd_unit_cd", "base_trd_unit_cd"),
				MCItemDef.create("base_trd_unit_nm", "base_trd_unit_nm"),
				MCItemDef.create("base_trd_unit_dec_place", "base_trd_unit_dec_place"),
				MCItemDef.create("base_trd_unit_qty_p" + ".qty", "base_trd_unit_qty"),
				MCItemDef.create("base_base_unit_qty_p" + ".qty", "base_base_unit_qty"),
				MCItemDef.create("base_trd_cur_cd", "base_trd_cur_cd"),
				MCItemDef.create("base_trd_cur_nm", "base_trd_cur_nm"),
				MCItemDef.create("base_in_to_loc_wg_cd", "base_in_to_loc_wg_cd"),
				MCItemDef.create("base_in_to_loc_wg_nm", "base_in_to_loc_wg_nm"),
				MCItemDef.create("base_in_to_loc_cd", "base_in_to_loc_cd"),
				MCItemDef.create("base_in_to_loc_nm", "base_in_to_loc_nm"),
				MCItemDef.create("sbst_dt", "sbst_dt"),
				MCItemDef.create("base_tax_cd", "base_tax_cd"),
				MCItemDef.create("base_tax_nm", "base_tax_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_ret_dt", "purc_ret_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0190_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0190", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0190_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("purc_upd_cntr", "purc_upd_cntr"),
				MCItemDef.create("purc_ret_upd_cntr", "purc_ret_upd_cntr"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("purc_act_sub_char1", "purc_act_sub_char1"),
				MCItemDef.create("purc_act_sub_char2", "purc_act_sub_char2"),
				MCItemDef.create("purc_act_sub_char3", "purc_act_sub_char3"),
				MCItemDef.create("purc_act_d_sub_char1", "purc_act_d_sub_char1"),
				MCItemDef.create("purc_act_d_sub_char2", "purc_act_d_sub_char2"),
				MCItemDef.create("purc_act_d_sub_char3", "purc_act_d_sub_char3"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0190_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBDL0190_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0190_Sprt01_INFO = new MCOperationInfo("MS", "MSBDL0190", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0190_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("base_trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("base_in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("base_tax_cd", "tax_cd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0190_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0190_Sprt02_INFO = new MCOperationInfo("MS", "MSBDL0190", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0190_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate_base_dt", "xrate_base_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0190_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate_p" + ".xrate", "xrate")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0190_Sprt03_INFO = new MCOperationInfo("MS", "MSBDL0190", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0190_Sprt03_UP_BLOCK0() {
		/** Ope.のBlock [Sprt03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("tax_base_dt", "tax_base_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0190_Sprt03_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0190", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

