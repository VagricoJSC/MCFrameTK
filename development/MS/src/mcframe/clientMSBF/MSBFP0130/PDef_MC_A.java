package mcframe.clientMSBF.MSBFP0130;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBFP_LotTraceSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0130.Srch01.UP.BLOCK0")){
			return MS_MSBFL0130_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0130.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0130_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0130.Srch02.UP.BLOCK0")){
			return MS_MSBFL0130_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0130.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0130_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0130.Srch02.DOWN.BLOCK1")){
			return MS_MSBFL0130_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0130.Srch02.DOWN.BLOCK2")){
			return MS_MSBFL0130_Srch02_DOWN_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBFL0130_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0130", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0130_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("dupl_abl_flg", "dupl_abl_flg"),
				MCItemDef.create("not_mng_flg", "not_mng_flg"),
				MCItemDef.create("bottom_layer_only_flg", "bottom_layer_only_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0130_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hrrchy_p" + ".hrrchy", "hrrchy"),
				MCItemDef.create("hrrchy_p" + ".extno", "extno"),
				MCItemDef.create("hrrchy_p" + ".par_extno", "par_extno"),
				MCItemDef.create("hrrchy_p" + ".loop_flg", "loop_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_sno_p" + ".sno1", "par_sno1"),
				MCItemDef.create("par_sno_p" + ".sno2", "par_sno2"),
				MCItemDef.create("par_sno_p" + ".sno3", "par_sno3"),
				MCItemDef.create("par_sno_p" + ".sno4", "par_sno4"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("lot_sub_char1", "lot_sub_char1"),
				MCItemDef.create("lot_sub_char2", "lot_sub_char2"),
				MCItemDef.create("lot_sub_char3", "lot_sub_char3"),
				MCItemDef.create("lot_sub_char4", "lot_sub_char4"),
				MCItemDef.create("lot_sub_char5", "lot_sub_char5"),
				MCItemDef.create("lot_sub_num1", "lot_sub_num1"),
				MCItemDef.create("lot_sub_num2", "lot_sub_num2"),
				MCItemDef.create("lot_sub_num3", "lot_sub_num3"),
				MCItemDef.create("lot_sub_num4", "lot_sub_num4"),
				MCItemDef.create("lot_sub_num5", "lot_sub_num5"),
				MCItemDef.create("lot_sub_dt1", "lot_sub_dt1"),
				MCItemDef.create("lot_sub_dt2", "lot_sub_dt2"),
				MCItemDef.create("lot_sub_dt3", "lot_sub_dt3"),
				MCItemDef.create("lot_sub_dt4", "lot_sub_dt4"),
				MCItemDef.create("lot_sub_dt5", "lot_sub_dt5"),
				MCItemDef.create("lot_sub_flg1", "lot_sub_flg1"),
				MCItemDef.create("lot_sub_flg2", "lot_sub_flg2"),
				MCItemDef.create("lot_sub_flg3", "lot_sub_flg3"),
				MCItemDef.create("lot_sub_flg4", "lot_sub_flg4"),
				MCItemDef.create("lot_sub_flg5", "lot_sub_flg5"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0130_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0130", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0130_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_sno_p" + ".sno1", "par_sno1"),
				MCItemDef.create("par_sno_p" + ".sno2", "par_sno2"),
				MCItemDef.create("par_sno_p" + ".sno3", "par_sno3"),
				MCItemDef.create("par_sno_p" + ".sno4", "par_sno4")
			}
			,
			MCBlockDef.create("RsltCnd")
		);
	}


	public static MCContainerDef MS_MSBFL0130_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_RsltGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_ptn_typ_nm", "trd_ptn_typ_nm"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("io_act_typ_nm", "io_act_typ_nm"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("slip_schd_no", "slip_schd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("qty_p" + ".qty", "base_gr_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("schd_act_typ", "schd_act_typ"),
				MCItemDef.create("schd_act_typ_nm", "schd_act_typ_nm"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("RsltGr")
		);
	}
	public static MCContainerDef MS_MSBFL0130_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_RsltGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_ptn_typ_nm", "trd_ptn_typ_nm"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("io_act_typ_nm", "io_act_typ_nm"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("slip_schd_no", "slip_schd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("qty_p" + ".qty", "base_gi_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_sno_p" + ".sno1", "par_sno1"),
				MCItemDef.create("par_sno_p" + ".sno2", "par_sno2"),
				MCItemDef.create("par_sno_p" + ".sno3", "par_sno3"),
				MCItemDef.create("par_sno_p" + ".sno4", "par_sno4"),
				MCItemDef.create("schd_act_typ", "schd_act_typ"),
				MCItemDef.create("schd_act_typ_nm", "schd_act_typ_nm"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("RsltGi")
		);
	}
	public static MCContainerDef MS_MSBFL0130_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_RsltAprvJudg] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("mfg_aprv_dt", "mfg_aprv_dt"),
				MCItemDef.create("yield_base_unit_qty", "yield_base_unit_qty"),
				MCItemDef.create("yield_base_unit_cd", "yield_base_unit_cd"),
				MCItemDef.create("yield_base_unit_nm", "yield_base_unit_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("insp_judg_dt", "insp_judg_dt"),
				MCItemDef.create("insp_good_qty", "insp_good_qty"),
				MCItemDef.create("insp_base_unit_cd", "insp_base_unit_cd"),
				MCItemDef.create("insp_base_unit_nm", "insp_base_unit_nm"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_judg_rslt_typ_nm", "insp_judg_rslt_typ_nm"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("plnt_aprv_dt", "plnt_aprv_dt"),
				MCItemDef.create("plnt_base_unit_qty", "plnt_base_unit_qty"),
				MCItemDef.create("plnt_base_unit_cd", "plnt_base_unit_cd"),
				MCItemDef.create("plnt_base_unit_nm", "plnt_base_unit_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_dt", "mrkt_judg_dt"),
				MCItemDef.create("mrkt_base_unit_qty", "mrkt_base_unit_qty"),
				MCItemDef.create("mrkt_base_unit_cd", "mrkt_base_unit_cd"),
				MCItemDef.create("mrkt_base_unit_nm", "mrkt_base_unit_nm")
			}
			,
			MCBlockDef.create("RsltAprvJudg")
		);
	}
	//FMCB DEF_CLASSES END
}

