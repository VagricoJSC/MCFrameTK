package mcframe.serverMSBD.MSBDL0240;

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
 * [MSBDL_PrmsRcptListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0240.Srch01.UP.BLOCK0")){
			return MS_MSBDL0240_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0240_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Srch02.UP.BLOCK0")){
			return MS_MSBDL0240_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0240_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Chk01.UP.BLOCK0")){
			return MS_MSBDL0240_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Chk01.UP.BLOCK1")){
			return MS_MSBDL0240_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0240.Chk01.DOWN.BLOCK0")){
			return MS_MSBDL0240_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Imp01.UP.BLOCK0")){
			return MS_MSBDL0240_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Imp01.DOWN.BLOCK0")){
			return MS_MSBDL0240_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Upd01.UP.BLOCK0")){
			return MS_MSBDL0240_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Upd01.UP.BLOCK1")){
			return MS_MSBDL0240_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0240.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0240_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Del01.UP.BLOCK0")){
			return MS_MSBDL0240_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Del01.UP.BLOCK1")){
			return MS_MSBDL0240_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0240.Del01.DOWN.BLOCK0")){
			return MS_MSBDL0240_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Prnt01.UP.BLOCK0")){
			return MS_MSBDL0240_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0240.Prnt01.UP.BLOCK1")){
			return MS_MSBDL0240_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBDL0240_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("not_edi_flg", "not_edi_flg"),
				MCItemDef.create("dlv_rqst_dt_fr", "dlv_rqst_dt_fr"),
				MCItemDef.create("dlv_rqst_hm_fr", "dlv_rqst_hm_fr"),
				MCItemDef.create("dlv_rqst_dt_to", "dlv_rqst_dt_to"),
				MCItemDef.create("dlv_rqst_hm_to", "dlv_rqst_hm_to"),
				MCItemDef.create("arr_schd_dt_fr", "arr_schd_dt_fr"),
				MCItemDef.create("arr_schd_hm_fr", "arr_schd_hm_fr"),
				MCItemDef.create("arr_schd_dt_to", "arr_schd_dt_to"),
				MCItemDef.create("arr_schd_hm_to", "arr_schd_hm_to"),
				MCItemDef.create("po_dt_fr", "po_dt_fr"),
				MCItemDef.create("po_dt_to", "po_dt_to"),
				MCItemDef.create("dlv_inst_dt_fr", "dlv_inst_dt_fr"),
				MCItemDef.create("dlv_inst_dt_to", "dlv_inst_dt_to"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("src_trd_unit_qty", "src_trd_unit_qty"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd"),
				MCItemDef.create("src_trd_unit_nm", "src_trd_unit_nm"),
				MCItemDef.create("src_trd_unit_dec_place", "src_trd_unit_dec_place"),
				MCItemDef.create("src_trd_unit_rnd_typ", "src_trd_unit_rnd_typ"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("arr_schd_hm", "arr_schd_hm"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("base_unit_purc_schd_qty", "base_unit_purc_schd_qty"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("in_to_loc_lg_grp_cd", "in_to_loc_lg_grp_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0240", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("not_edi_flg", "not_edi_flg"),
				MCItemDef.create("dlv_rqst_dt_fr", "dlv_rqst_dt_fr"),
				MCItemDef.create("dlv_rqst_hm_fr", "dlv_rqst_hm_fr"),
				MCItemDef.create("dlv_rqst_dt_to", "dlv_rqst_dt_to"),
				MCItemDef.create("dlv_rqst_hm_to", "dlv_rqst_hm_to"),
				MCItemDef.create("arr_schd_dt_fr", "arr_schd_dt_fr"),
				MCItemDef.create("arr_schd_hm_fr", "arr_schd_hm_fr"),
				MCItemDef.create("arr_schd_dt_to", "arr_schd_dt_to"),
				MCItemDef.create("arr_schd_hm_to", "arr_schd_hm_to"),
				MCItemDef.create("po_dt_fr", "po_dt_fr"),
				MCItemDef.create("po_dt_to", "po_dt_to"),
				MCItemDef.create("dlv_inst_dt_fr", "dlv_inst_dt_fr"),
				MCItemDef.create("dlv_inst_dt_to", "dlv_inst_dt_to"),
				MCItemDef.create("prms_rcpt_dt_fr", "prms_rcpt_dt_fr"),
				MCItemDef.create("prms_rcpt_dt_to", "prms_rcpt_dt_to"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("incl_can_flg", "incl_can_flg"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("dtl_can_flg", "dtl_can_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("src_trd_unit_qty", "src_trd_unit_qty"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd"),
				MCItemDef.create("src_trd_unit_nm", "src_trd_unit_nm"),
				MCItemDef.create("src_trd_unit_dec_place", "src_trd_unit_dec_place"),
				MCItemDef.create("src_trd_unit_rnd_typ", "src_trd_unit_rnd_typ"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("arr_schd_hm", "arr_schd_hm"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("base_unit_purc_schd_qty", "base_unit_purc_schd_qty"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("in_to_loc_lg_grp_cd", "in_to_loc_lg_grp_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Chk01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0240_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg", "msg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Imp01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("sppl_cd", "sppl_cd")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg", "msg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("src_trd_unit_qty", "src_trd_unit_qty"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd"),
				MCItemDef.create("src_trd_unit_nm", "src_trd_unit_nm"),
				MCItemDef.create("src_trd_unit_dec_place", "src_trd_unit_dec_place"),
				MCItemDef.create("src_trd_unit_rnd_typ", "src_trd_unit_rnd_typ"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("arr_schd_hm", "arr_schd_hm"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("base_unit_purc_schd_qty", "base_unit_purc_schd_qty"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("in_to_loc_lg_grp_cd", "in_to_loc_lg_grp_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0240_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg", "msg"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Del01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Del01",
			new MCItemDef[]{
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0240_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Del01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBDL0240_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg", "msg"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0240_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL0240", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0240_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0240_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0240", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Ctrl")
		);
	}


	//FMCB DEF_CLASSES END
}

