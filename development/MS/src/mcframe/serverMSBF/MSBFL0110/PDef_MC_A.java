package mcframe.serverMSBF.MSBFL0110;

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
 * [MSBFL_LotSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0110.Chk01.UP.BLOCK0")){
			return MS_MSBFL0110_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0110_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Chk02.UP.BLOCK0")){
			return MS_MSBFL0110_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0110_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Srch01.UP.BLOCK0")){
			return MS_MSBFL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Imp01.UP.BLOCK0")){
			return MS_MSBFL0110_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Imp01.DOWN.BLOCK0")){
			return MS_MSBFL0110_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Upd01.UP.BLOCK0")){
			return MS_MSBFL0110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0110_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Del01.UP.BLOCK0")){
			return MS_MSBFL0110_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0110.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0110_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBFL0110_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0110", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("lot_no_key", "lot_no_key"),
				MCItemDef.create("sublot_no_key", "sublot_no_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0110_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("lot_no_key", "lot_no_key"),
				MCItemDef.create("sublot_no_key", "sublot_no_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0110_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0110", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0110_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0110_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("first_gr_dt_fr", "first_gr_dt_fr"),
				MCItemDef.create("first_gr_dt_to", "first_gr_dt_to"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("lmt_dt_fr", "lmt_dt_fr"),
				MCItemDef.create("lmt_dt_to", "lmt_dt_to"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
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


	public static MCContainerDef MS_MSBFL0110_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
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
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0110_Imp01_INFO = new MCOperationInfo("MS", "MSBFL0110", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("lot_sub_flg5", "lot_sub_flg5")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0110_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0110_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0110", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("lot_no_key", "lot_no_key"),
				MCItemDef.create("sublot_no_key", "sublot_no_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("base_gr_dt", "base_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("first_gr_dt_save_flg", "first_gr_dt_save_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0110_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0110_Del01_INFO = new MCOperationInfo("MS", "MSBFL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0110_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0110_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

