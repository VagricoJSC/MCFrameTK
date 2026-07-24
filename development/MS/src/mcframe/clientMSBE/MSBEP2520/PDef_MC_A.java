package mcframe.clientMSBE.MSBEP2520;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_StkXfrActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL2520.Srch01.UP.BLOCK0")){
			return MS_MSBEL2520_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL2520_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL2520_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2520.Srch01.DOWN.BLOCK2")){
			return MS_MSBEL2520_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.UP.BLOCK0")){
			return MS_MSBEL2520_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.UP.BLOCK1")){
			return MS_MSBEL2520_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.UP.BLOCK2")){
			return MS_MSBEL2520_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL2520_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.DOWN.BLOCK1")){
			return MS_MSBEL2520_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2520.Ins01.DOWN.BLOCK2")){
			return MS_MSBEL2520_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.UP.BLOCK0")){
			return MS_MSBEL2520_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.UP.BLOCK1")){
			return MS_MSBEL2520_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.UP.BLOCK2")){
			return MS_MSBEL2520_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL2520_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.DOWN.BLOCK1")){
			return MS_MSBEL2520_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2520.Upd01.DOWN.BLOCK2")){
			return MS_MSBEL2520_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL2520.Del01.UP.BLOCK0")){
			return MS_MSBEL2520_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2520.Prnt01.UP.BLOCK0")){
			return MS_MSBEL2520_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBEL2520_Srch01_INFO = new MCOperationInfo("MS", "MSBEL2520", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2520_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2520_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ymd_hm_p" + ".ymd", "stk_xfr_act_dt"),
				MCItemDef.create("ymd_hm_p" + ".hm", "stk_xfr_act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("stk_xfr_rsn_nm", "stk_xfr_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_fctr_qty"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_fctr_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_DtlGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("not_new_lot_flg", "not_new_lot_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_fctr_qty"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_fctr_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2520_Ins01_INFO = new MCOperationInfo("MS", "MSBEL2520", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2520_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("ymd_hm_p" + ".ymd", "stk_xfr_act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL2520_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_DtlGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL2520_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_DtlGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("lot_no_p" + ".crt_lot_flg", "crt_lot_flg")
			}
			,
			MCBlockDef.create("DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL2520_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_DtlGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Ins01_DOWN_BLOCK2() {
	/** Ope.のBlock [Ins01_DtlGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2520_Upd01_INFO = new MCOperationInfo("MS", "MSBEL2520", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2520_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("ymd_hm_p" + ".ymd", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL2520_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_DtlGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL2520_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_DtlGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_p" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("lot_no_p" + ".crt_lot_flg", "crt_lot_flg")
			}
			,
			MCBlockDef.create("DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL2520_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_DtlGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL2520_Upd01_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd01_DtlGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2520_Del01_INFO = new MCOperationInfo("MS", "MSBEL2520", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2520_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2520_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL2520", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2520_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2520", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("stk_xfr_act_no", "dlv_slip_act_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

