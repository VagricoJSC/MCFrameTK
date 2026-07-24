package mcframe.serverMSBF.MSBFL5200;

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
 * [MSBFL_LotTraceService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5200.LotTrace_Chk01.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Chk01.UP.BLOCK1")){
			return MS_MSBFL5200_LotTrace_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch01.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch01.DOWN.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch01.DOWN.BLOCK1")){
			return MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch01.DOWN.BLOCK2")){
			return MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch02.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch02.DOWN.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch03.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch03.DOWN.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch04.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Srch04.DOWN.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Upd01.UP.BLOCK0")){
			return MS_MSBFL5200_LotTrace_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5200.LotTrace_Upd01.UP.BLOCK1")){
			return MS_MSBFL5200_LotTrace_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("no_chk_flg", "no_chk_flg")
			}
			,
			MCBlockDef.create("LotTrace_Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL5200_LotTrace_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Chk01",
			new MCItemDef[]{
				MCItemDef.create("no_err_msg_flg", "no_err_msg_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg")
			}
			,
			MCBlockDef.create("LotTrace_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5200_LotTrace_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("comp_itm_insp_typ", "comp_itm_insp_typ"),
				MCItemDef.create("comp_itm_quality_typ", "comp_itm_quality_typ"),
				MCItemDef.create("comp_itm_mfg_aprv_typ", "comp_itm_mfg_aprv_typ")
			}
			,
			MCBlockDef.create("LotTrace_Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Srch01_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("out_use_par_lot_flg", "out_use_par_lot_flg"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_sno1", "par_sno1"),
				MCItemDef.create("par_sno2", "par_sno2"),
				MCItemDef.create("par_sno3", "par_sno3"),
				MCItemDef.create("par_sno4", "par_sno4")
			}
			,
			MCBlockDef.create("LotTrace_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_gr_qty", "base_gr_qty"),
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
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LotTrace_Srch01_RsltGr")
		);
	}
	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_gi_qty", "base_gi_qty"),
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
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_sno1", "par_sno1"),
				MCItemDef.create("par_sno2", "par_sno2"),
				MCItemDef.create("par_sno3", "par_sno3"),
				MCItemDef.create("par_sno4", "par_sno4"),
				MCItemDef.create("schd_act_typ", "schd_act_typ"),
				MCItemDef.create("schd_act_typ_nm", "schd_act_typ_nm"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm"),
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
			MCBlockDef.create("LotTrace_Srch01_RsltGi")
		);
	}
	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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
			MCBlockDef.create("LotTrace_Srch01_RsltAprvJudg")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Srch02_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_mng_flg", "not_mng_flg"),
				MCItemDef.create("dupl_abl_flg", "dupl_abl_flg")
			}
			,
			MCBlockDef.create("LotTrace_Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("extno", "extno"),
				MCItemDef.create("par_extno", "par_extno"),
				MCItemDef.create("loop_flg", "loop_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("stk_insp_flg", "stk_insp_flg"),
				MCItemDef.create("not_quality_good_flg", "not_quality_good_flg"),
				MCItemDef.create("not_mfg_aprv_acpt_flg", "not_mfg_aprv_acpt_flg"),
				MCItemDef.create("hrchy_stk_insp_flg", "hrchy_stk_insp_flg"),
				MCItemDef.create("hrchy_not_quality_good_flg", "hrchy_not_quality_good_flg"),
				MCItemDef.create("hrchy_not_mfg_aprv_acpt_flg", "hrchy_not_mfg_aprv_acpt_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_sno1", "par_sno1"),
				MCItemDef.create("par_sno2", "par_sno2"),
				MCItemDef.create("par_sno3", "par_sno3"),
				MCItemDef.create("par_sno4", "par_sno4"),
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
				MCItemDef.create("th_image", "th_image")
			}
			,
			MCBlockDef.create("LotTrace_Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Srch03_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch03",
			new MCItemDef[]{
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_mng_flg", "not_mng_flg"),
				MCItemDef.create("dupl_abl_flg", "dupl_abl_flg"),
				MCItemDef.create("bottom_layer_only_flg", "bottom_layer_only_flg")
			}
			,
			MCBlockDef.create("LotTrace_Srch03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch03",
			new MCItemDef[]{
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("extno", "extno"),
				MCItemDef.create("par_extno", "par_extno"),
				MCItemDef.create("loop_flg", "loop_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
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
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_sno1", "par_sno1"),
				MCItemDef.create("par_sno2", "par_sno2"),
				MCItemDef.create("par_sno3", "par_sno3"),
				MCItemDef.create("par_sno4", "par_sno4"),
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
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm")
			}
			,
			MCBlockDef.create("LotTrace_Srch03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Srch04_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_mng_flg", "not_mng_flg"),
				MCItemDef.create("dupl_abl_flg", "dupl_abl_flg")
			}
			,
			MCBlockDef.create("LotTrace_Srch04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5200_LotTrace_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("extno", "extno"),
				MCItemDef.create("par_extno", "par_extno"),
				MCItemDef.create("loop_flg", "loop_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("stk_insp_flg", "stk_insp_flg"),
				MCItemDef.create("not_quality_good_flg", "not_quality_good_flg"),
				MCItemDef.create("not_mfg_aprv_acpt_flg", "not_mfg_aprv_acpt_flg"),
				MCItemDef.create("hrchy_stk_insp_flg", "hrchy_stk_insp_flg"),
				MCItemDef.create("hrchy_not_quality_good_flg", "hrchy_not_quality_good_flg"),
				MCItemDef.create("hrchy_not_mfg_aprv_acpt_flg", "hrchy_not_mfg_aprv_acpt_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_lot_no", "par_lot_no"),
				MCItemDef.create("par_sublot_no", "par_sublot_no"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_sno1", "par_sno1"),
				MCItemDef.create("par_sno2", "par_sno2"),
				MCItemDef.create("par_sno3", "par_sno3"),
				MCItemDef.create("par_sno4", "par_sno4"),
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
				MCItemDef.create("th_image", "th_image")
			}
			,
			MCBlockDef.create("LotTrace_Srch04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5200_LotTrace_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5200", "LotTrace_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5200_LotTrace_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_schd_no", "slip_schd_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("base_gr_qty", "base_gr_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("schd_act_typ", "schd_act_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ")
			}
			,
			MCBlockDef.create("LotTrace_Upd01_DtlGr")
		);
	}

	public static MCContainerDef MS_MSBFL5200_LotTrace_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5200", "LotTrace_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_schd_no", "slip_schd_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("base_gi_qty", "base_gi_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("schd_act_typ", "schd_act_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ")
			}
			,
			MCBlockDef.create("LotTrace_Upd01_DtlGi")
		);
	}


	//FMCB DEF_CLASSES END
}

