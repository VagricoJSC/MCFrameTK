package mcframe.clientMSBC.MSBCP1100;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_MfgActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1100.Srch01.UP.BLOCK0")){
			return MS_MSBCL1100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK2")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK3")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK4")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK5")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK6")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL1100.Srch01.DOWN.BLOCK7")){
			return MS_MSBCL1100_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK0")){
			return MS_MSBCL1100_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK1")){
			return MS_MSBCL1100_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK2")){
			return MS_MSBCL1100_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK3")){
			return MS_MSBCL1100_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK4")){
			return MS_MSBCL1100_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK5")){
			return MS_MSBCL1100_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.UP.BLOCK6")){
			return MS_MSBCL1100_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK2")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK3")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK4")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK5")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1100.Upd01.DOWN.BLOCK6")){
			return MS_MSBCL1100_Upd01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL1100.Del01.UP.BLOCK0")){
			return MS_MSBCL1100_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Del01.UP.BLOCK1")){
			return MS_MSBCL1100_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Del01.UP.BLOCK2")){
			return MS_MSBCL1100_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Del01.UP.BLOCK3")){
			return MS_MSBCL1100_Del01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Upd02.UP.BLOCK0")){
			return MS_MSBCL1100_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Upd02.DOWN.BLOCK0")){
			return MS_MSBCL1100_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Del02.UP.BLOCK0")){
			return MS_MSBCL1100_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Del02.DOWN.BLOCK0")){
			return MS_MSBCL1100_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Prnt01.UP.BLOCK0")){
			return MS_MSBCL1100_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Prnt01.DOWN.BLOCK0")){
			return MS_MSBCL1100_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt01.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt01.UP.BLOCK1")){
			return MS_MSBCL1100_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt01.DOWN.BLOCK1")){
			return MS_MSBCL1100_Sprt01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt02.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt02.UP.BLOCK1")){
			return MS_MSBCL1100_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt02.UP.BLOCK2")){
			return MS_MSBCL1100_Sprt02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt03.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt03.UP.BLOCK1")){
			return MS_MSBCL1100_Sprt03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt03.UP.BLOCK2")){
			return MS_MSBCL1100_Sprt03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK1")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK2")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK3")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK4")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1100.Sprt04.DOWN.BLOCK5")){
			return MS_MSBCL1100_Sprt04_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.UP.BLOCK1")){
			return MS_MSBCL1100_Sprt06_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.UP.BLOCK2")){
			return MS_MSBCL1100_Sprt06_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.UP.BLOCK3")){
			return MS_MSBCL1100_Sprt06_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt06.DOWN.BLOCK1")){
			return MS_MSBCL1100_Sprt06_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt07.UP.BLOCK0")){
			return MS_MSBCL1100_Sprt07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1100.Sprt07.UP.BLOCK1")){
			return MS_MSBCL1100_Sprt07_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1100.Sprt07.UP.BLOCK2")){
			return MS_MSBCL1100_Sprt07_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1100.Sprt07.UP.BLOCK3")){
			return MS_MSBCL1100_Sprt07_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1100.Sprt07.DOWN.BLOCK0")){
			return MS_MSBCL1100_Sprt07_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBCL1100_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1100", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("inst_srch_flg", "inst_srch_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_dt"),
				MCItemDef.create("st_act_p" + ".hm", "st_act_hm"),
				MCItemDef.create("st_ac_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_dt"),
				MCItemDef.create("end_act_p" + ".hm", "end_act_hm"),
				MCItemDef.create("end_ac_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("st_act_qty_p" + ".qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("mfg_rem_qty_p" + ".qty", "base_unit_mfg_rem_qty"),
				MCItemDef.create("mfg_inst_qty_p" + ".qty", "base_unit_mfg_inst_qty"),
				MCItemDef.create("yield_qty_p" + ".qty", "base_unit_yield_qty"),
				MCItemDef.create("dfct_qty_p" + ".qty", "base_unit_dfct_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_mtd_typ_nm", "mfg_mtd_typ_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_tgt_flg", "mfg_str_ln_tgt_flg"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
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
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("inpt_itm_add_flg", "inpt_itm_add_flg"),
				MCItemDef.create("inpt_itm_del_flg", "inpt_itm_del_flg"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_act_tm_p" + ".ymd", "st_act_dt"),
				MCItemDef.create("st_act_tm_p" + ".hm", "st_act_hm"),
				MCItemDef.create("end_act_tm_p" + ".ymd", "end_act_dt"),
				MCItemDef.create("end_act_tm_p" + ".hm", "end_act_hm"),
				MCItemDef.create("oper_unit_act_qty_p" + ".qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_unit_schd_qty_p" + ".qty", "oper_unit_schd_qty"),
				MCItemDef.create("oper_unit_rem_qty_p" + ".qty", "oper_unit_rem_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("base_unit_act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("base_unit_schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_qty"),
				MCItemDef.create("loss_qty_p" + ".qty", "base_unit_loss_qty"),
				MCItemDef.create("fxd_loss_qty_p" + ".qty", "base_unit_fxd_loss_qty"),
				MCItemDef.create("schd_inpt_qty_p" + ".qty", "base_unit_schd_inpt_qty"),
				MCItemDef.create("schd_fxd_rqmt_qty_p" + ".qty", "base_unit_schd_fxd_rqmt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inpt_rem_qty_p" + ".qty", "base_unit_inpt_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_cd_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty_p" + ".cont_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("cont_schd_inpt_qty_p" + ".cont_qty", "cont_schd_inpt_qty"),
				MCItemDef.create("cont_schd_fxd_rqmt_qty_p" + ".cont_qty", "cont_schd_fxd_rqmt_qty"),
				MCItemDef.create("cont_acxfr_act_qty_p" + ".cont_qty", "cont_acxfr_act_qty"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("acxfr_act_qty_p" + ".qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_rsn_nm", "acxfr_act_rsn_nm"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_nm", "acxfr_act_bd_dpt_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno1", "inst_sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno2", "inst_sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno3", "inst_sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno4", "inst_sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_loc_sppl_cd", "inpt_loc_sppl_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("inst_ver_no_p" + ".ver_no", "inpt_schd_ver_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_qty_p" + ".qty", "base_unit_alt_qty"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("loss_qty_enable_flg", "loss_qty_enable_flg"),
				MCItemDef.create("fxd_loss_qty_enable_flg", "fxd_loss_qty_enable_flg"),
				MCItemDef.create("recalc_grp", "recalc_grp"),
				MCItemDef.create("recalc_grp_seq", "recalc_grp_seq"),
				MCItemDef.create("base_unit_inpt_qty_bef", "base_unit_inpt_qty_bef"),
				MCItemDef.create("base_unit_fxd_loss_qty_bef", "base_unit_fxd_loss_qty_bef")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("act_wk_cost_p" + ".wk_cost_qty", "act_wk_cost"),
				MCItemDef.create("schd_wk_cost_p" + ".wk_cost_qty", "schd_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("rem_wk_cost_p" + ".wk_cost_qty", "rem_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("st_tm_p" + ".hm", "st_tm"),
				MCItemDef.create("end_tm_p" + ".hm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("wk_usr_p" + ".usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_p" + ".usr_nm", "wk_usr_nm"),
				MCItemDef.create("wk_usr_p" + ".dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_p" + ".dpt_nm", "wk_usr_dpt_nm"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_cost_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("fxd_wk_cost_p" + ".wk_cost_qty", "fxd_wk_cost"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_typ_nm", "yield_typ_nm"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_rem_qty_p" + ".qty", "base_unit_yield_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rsn_nm", "yield_rsn_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_yield_act_qty_bef", "base_unit_yield_act_qty_bef")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_rem_qty_p" + ".qty", "base_unit_yield_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rsn_nm", "yield_rsn_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_yield_act_qty_bef", "base_unit_yield_act_qty_bef")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK6() {
	/** Ope.のBlock [Srch01_Dtl_Arr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("arr_dt", "arr_dt"),
				MCItemDef.create("arr_hm", "arr_hm"),
				MCItemDef.create("trd_unit_arr_qty_p" + ".qty", "trd_unit_arr_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("arr_qty_p" + ".qty", "base_unit_arr_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place")
			}
			,
			MCBlockDef.create("DtlArrAct")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Srch01_DOWN_BLOCK7() {
	/** Ope.のBlock [Srch01_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("def_disp_flg", "def_disp_flg"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_rsn_nm", "loss_rsn_nm"),
				MCItemDef.create("loss_qty_p" + ".qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Upd01_INFO = new MCOperationInfo("MS", "MSBCL1100", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("st_ac_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("end_ac_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("st_act_qty_p" + ".qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_unit_act_qty_p" + ".qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("st_act_tm_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("end_act_tm_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_qty"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("acxfr_act_qty_p" + ".qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty_p" + ".qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("act_wk_cost_p" + ".wk_cost_qty", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("st_tm_p" + ".ymd", "st_tm"),
				MCItemDef.create("end_tm_p" + ".ymd", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_usr_p" + ".usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_p" + ".dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Upd01_UP_BLOCK6() {
		/** Ope.のBlock [Upd01_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_act_no", "oper_act_no")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_act_no", "inpt_act_no")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK3() {
	/** Ope.のBlock [Upd01_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("loss_act_no", "loss_act_no")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK4() {
	/** Ope.のBlock [Upd01_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_act_no", "wk_act_no")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK5() {
	/** Ope.のBlock [Upd01_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Upd01_DOWN_BLOCK6() {
	/** Ope.のBlock [Upd01_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Del01_INFO = new MCOperationInfo("MS", "MSBCL1100", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Del01_UP_BLOCK3() {
		/** Ope.のBlock [Del01_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Upd02_INFO = new MCOperationInfo("MS", "MSBCL1100", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Del02_INFO = new MCOperationInfo("MS", "MSBCL1100", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Prnt01_INFO = new MCOperationInfo("MS", "MSBCL1100", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_qty"),
				MCItemDef.create("loss_qty_p" + ".qty", "base_unit_loss_qty"),
				MCItemDef.create("fxd_loss_qty_p" + ".qty", "base_unit_fxd_loss_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty_p" + ".cont_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_qty_p" + ".qty", "base_unit_alt_qty"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("check", "check"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt01_UP_BLOCK1() {
		/** Ope.のBlock [Srch01_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty_p" + ".qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_qty"),
				MCItemDef.create("loss_qty_p" + ".qty", "base_unit_loss_qty"),
				MCItemDef.create("fxd_loss_qty_p" + ".qty", "base_unit_fxd_loss_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty_p" + ".cont_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("check", "check")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty_p" + ".qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("site_cd", "mfg_loc_site_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt02_UP_BLOCK1() {
		/** Ope.のBlock [Sprt02_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("act_tm_p" + ".ymd", "yield_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt02_UP_BLOCK2() {
		/** Ope.のBlock [Sprt02_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt03_UP_BLOCK0() {
		/** Ope.のBlock [Sprt03_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("site_cd", "mfg_loc_site_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt03_UP_BLOCK1() {
		/** Ope.のBlock [Sprt03_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("act_tm_p" + ".ymd", "yield_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt03_UP_BLOCK2() {
		/** Ope.のBlock [Sprt03_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt03_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt03_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt04_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt04_UP_BLOCK0() {
		/** Ope.のBlock [Sprt04_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("st_act_qty_p" + ".qty", "base_unit_st_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt04_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_act_tm_p" + ".ymd", "st_act_dt"),
				MCItemDef.create("st_act_tm_p" + ".hm", "st_act_hm"),
				MCItemDef.create("end_act_tm_p" + ".ymd", "end_act_dt"),
				MCItemDef.create("end_act_tm_p" + ".hm", "end_act_hm"),
				MCItemDef.create("oper_unit_act_qty_p" + ".qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_unit_schd_qty_p" + ".qty", "oper_unit_schd_qty"),
				MCItemDef.create("oper_unit_rem_qty_p" + ".qty", "oper_unit_rem_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_p" + ".str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("base_unit_act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("base_unit_schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK1() {
	/** Ope.のBlock [Sprt04_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_qty"),
				MCItemDef.create("loss_qty_p" + ".qty", "base_unit_loss_qty"),
				MCItemDef.create("fxd_loss_qty_p" + ".qty", "base_unit_fxd_loss_qty"),
				MCItemDef.create("schd_inpt_qty_p" + ".qty", "base_unit_schd_inpt_qty"),
				MCItemDef.create("schd_fxd_rqmt_qty_p" + ".qty", "base_unit_schd_fxd_rqmt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inpt_rem_qty_p" + ".qty", "base_unit_inpt_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_cd_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty_p" + ".cont_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("cont_schd_inpt_qty_p" + ".cont_qty", "cont_schd_inpt_qty"),
				MCItemDef.create("cont_schd_fxd_rqmt_qty_p" + ".cont_qty", "cont_schd_fxd_rqmt_qty"),
				MCItemDef.create("cont_acxfr_act_qty_p" + ".cont_qty", "cont_acxfr_act_qty"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("acxfr_act_qty_p" + ".qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_rsn_nm", "acxfr_act_rsn_nm"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_nm", "acxfr_act_bd_dpt_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno1", "inst_sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno2", "inst_sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno3", "inst_sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inst_sno_p" + ".sno4", "inst_sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_loc_sppl_cd", "inpt_loc_sppl_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_p" + ".str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("inst_ver_no_p" + ".ver_no", "inpt_schd_ver_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_qty_p" + ".qty", "base_unit_alt_qty"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("loss_qty_enable_flg", "loss_qty_enable_flg"),
				MCItemDef.create("fxd_loss_qty_enable_flg", "fxd_loss_qty_enable_flg"),
				MCItemDef.create("recalc_grp", "recalc_grp"),
				MCItemDef.create("recalc_grp_seq", "recalc_grp_seq")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK2() {
	/** Ope.のBlock [Sprt04_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("def_disp_flg", "def_disp_flg"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_rsn_nm", "loss_rsn_nm"),
				MCItemDef.create("loss_qty_p" + ".qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty_p" + ".cont_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK3() {
	/** Ope.のBlock [Sprt04_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("act_wk_cost_p" + ".wk_cost_qty", "act_wk_cost"),
				MCItemDef.create("schd_wk_cost_p" + ".wk_cost_qty", "schd_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("rem_wk_cost_p" + ".wk_cost_qty", "rem_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("st_tm_p" + ".hm", "st_tm"),
				MCItemDef.create("end_tm_p" + ".hm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("wk_usr_p" + ".usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_p" + ".usr_nm", "wk_usr_nm"),
				MCItemDef.create("wk_usr_p" + ".dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_p" + ".dpt_nm", "wk_usr_dpt_nm"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_cost_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("fxd_wk_cost_p" + ".wk_cost_qty", "fxd_wk_cost"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK4() {
	/** Ope.のBlock [Sprt04_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_typ_nm", "yield_typ_nm"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_rem_qty_p" + ".qty", "base_unit_yield_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rsn_nm", "yield_rsn_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt04_DOWN_BLOCK5() {
	/** Ope.のBlock [Sprt04_DtlByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_rem_qty_p" + ".qty", "base_unit_yield_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_tm_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_tm_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rsn_nm", "yield_rsn_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt06_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt06", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt06_UP_BLOCK0() {
		/** Ope.のBlock [Sprt06_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt06_UP_BLOCK1() {
		/** Ope.のBlock [Sprt06_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("st_act_tm_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("end_act_tm_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("base_unit_schd_qty_p" + ".qty", "base_unit_st_qty"),
				MCItemDef.create("base_unit_act_qty_p" + ".qty", "base_unit_act_qty")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt06_UP_BLOCK2() {
		/** Ope.のBlock [Sprt06_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_st_qty"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt06_UP_BLOCK3() {
		/** Ope.のBlock [Sprt06_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "up_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("recalc_grp", "recalc_grp"),
				MCItemDef.create("recalc_grp_seq", "recalc_grp_seq"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("schd_inpt_qty_p" + ".qty", "base_unit_inpt_st_qty"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_act_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_schd_inpt_qty_p" + ".cont_qty", "cont_inpt_st_qty"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_act_qty"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt06_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt06_DtlInpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bfr_recalc_peg_no", "up_peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("inpt_qty_p" + ".qty", "base_unit_inpt_act_qty"),
				MCItemDef.create("cont_inpt_qty_p" + ".cont_qty", "cont_inpt_act_qty")
			}
			,
			MCBlockDef.create("DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1100_Sprt06_DOWN_BLOCK1() {
	/** Ope.のBlock [Sprt06_DtlLoss] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("def_disp_flg", "def_disp_flg"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_rsn_nm", "loss_rsn_nm")
			}
			,
			MCBlockDef.create("DtlLoss")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1100_Sprt07_INFO = new MCOperationInfo("MS", "MSBCL1100", "Sprt07", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1100_Sprt07_UP_BLOCK0() {
		/** Ope.のBlock [Sprt07_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt07_UP_BLOCK1() {
		/** Ope.のBlock [Sprt07_DtlOper] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("st_act_tm_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("base_unit_schd_qty_p" + ".qty", "base_unit_st_qty"),
				MCItemDef.create("base_unit_act_qty_p" + ".qty", "base_unit_act_qty")
			}
			,
			MCBlockDef.create("DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt07_UP_BLOCK2() {
		/** Ope.のBlock [Sprt07_DtlYield] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_st_qty"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty")
			}
			,
			MCBlockDef.create("DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1100_Sprt07_UP_BLOCK3() {
		/** Ope.のBlock [Sprt07_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("wk_cost_p" + ".wk_cost_qty", "st_cost"),
				MCItemDef.create("act_wk_cost_p" + ".wk_cost_qty", "act_cost"),
				MCItemDef.create("wk_cost_dec_place", "dec_place"),
				MCItemDef.create("fxd_wk_cost_p" + ".wk_cost_qty", "st_fxd_cost")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL1100_Sprt07_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt07_DtlWk] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1100", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("act_wk_cost_p" + ".wk_cost_qty", "act_cost")
			}
			,
			MCBlockDef.create("DtlWk")
		);
	}
	//FMCB DEF_CLASSES END
}

