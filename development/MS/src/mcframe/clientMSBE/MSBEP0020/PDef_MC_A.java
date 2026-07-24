package mcframe.clientMSBE.MSBEP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_MlyIoStkSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0020.Srch01.UP.BLOCK0")){
			return MS_MSBEL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0020_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mly_io_cl_ym_fr", "mly_io_cl_ym_fr"),
				MCItemDef.create("mly_io_cl_ym_to", "mly_io_cl_ym_to"),
				MCItemDef.create("mly_io_cl_day", "mly_io_cl_day"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("only_enable_flg", "only_enable_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("asst_typ_flg", "asst_typ_flg"),
				MCItemDef.create("stk_id_typ_flg", "stk_id_typ_flg"),
				MCItemDef.create("stk_bp_flg", "stk_bp_flg"),
				MCItemDef.create("stk_arrv_bp_flg", "stk_arrv_bp_flg"),
				MCItemDef.create("disp_unit", "disp_unit")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mly_io_cl_ym", "mly_io_cl_ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_dec_place", "base_cur_dec_place"),
				MCItemDef.create("base_cur_rnd_typ", "base_cur_rnd_typ"),
				MCItemDef.create("std_unit_cost_amt_p" + ".amt", "std_unit_cost"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("ini_stk_qty_p" + ".qty", "ini_stk_qty"),
				MCItemDef.create("gr_total_qty_p" + ".qty", "gr_total_qty"),
				MCItemDef.create("purc_bf_accpt_qty_p" + ".qty", "purc_bf_accpt_qty"),
				MCItemDef.create("gr_purc_qty_p" + ".qty", "gr_purc_qty"),
				MCItemDef.create("accpt_dfct_qty_p" + ".qty", "accpt_dfct_qty"),
				MCItemDef.create("gr_prod_qty_p" + ".qty", "gr_prod_qty"),
				MCItemDef.create("gr_xfr_qty_p" + ".qty", "gr_xfr_qty"),
				MCItemDef.create("gr_rcv_qty_p" + ".qty", "gr_rcv_qty"),
				MCItemDef.create("gr_stk_xfr_qty_p" + ".qty", "gr_stk_xfr_qty"),
				MCItemDef.create("gr_ac_xfr_qty_p" + ".qty", "gr_ac_xfr_qty"),
				MCItemDef.create("gi_total_qty_p" + ".qty", "gi_total_qty"),
				MCItemDef.create("gi_input_qty_p" + ".qty", "gi_input_qty"),
				MCItemDef.create("gi_insp_qty_p" + ".qty", "gi_insp_qty"),
				MCItemDef.create("gi_xfr_qty_p" + ".qty", "gi_xfr_qty"),
				MCItemDef.create("rcv_ret_qty_p" + ".qty", "rcv_ret_qty"),
				MCItemDef.create("gi_stk_xfr_qty_p" + ".qty", "gi_stk_xfr_qty"),
				MCItemDef.create("gi_ac_xfr_qty_p" + ".qty", "gi_ac_xfr_qty"),
				MCItemDef.create("stktk_minus_qty_p" + ".qty", "stktk_minus_qty"),
				MCItemDef.create("sls_qty_p" + ".qty", "sls_qty"),
				MCItemDef.create("end_stk_qty_p" + ".qty", "end_stk_qty"),
				MCItemDef.create("ini_stk_amt_p" + ".amt", "ini_stk_amt"),
				MCItemDef.create("gr_total_amt_p" + ".amt", "gr_total_amt"),
				MCItemDef.create("purc_bf_accpt_amt_p" + ".amt", "purc_bf_accpt_amt"),
				MCItemDef.create("gr_purc_amt_p" + ".amt", "gr_purc_amt"),
				MCItemDef.create("accpt_dfct_amt_p" + ".amt", "accpt_dfct_amt"),
				MCItemDef.create("gr_prod_amt_p" + ".amt", "gr_prod_amt"),
				MCItemDef.create("gr_xfr_amt_p" + ".amt", "gr_xfr_amt"),
				MCItemDef.create("gr_rcv_amt_p" + ".amt", "gr_rcv_amt"),
				MCItemDef.create("gr_stk_xfr_amt_p" + ".amt", "gr_stk_xfr_amt"),
				MCItemDef.create("gr_ac_xfr_amt_p" + ".amt", "gr_ac_xfr_amt"),
				MCItemDef.create("gi_total_amt_p" + ".amt", "gi_total_amt"),
				MCItemDef.create("gi_input_amt_p" + ".amt", "gi_input_amt"),
				MCItemDef.create("gi_insp_amt_p" + ".amt", "gi_insp_amt"),
				MCItemDef.create("gi_xfr_amt_p" + ".amt", "gi_xfr_amt"),
				MCItemDef.create("rcv_ret_amt_p" + ".amt", "rcv_ret_amt"),
				MCItemDef.create("gi_stk_xfr_amt_p" + ".amt", "gi_stk_xfr_amt"),
				MCItemDef.create("gi_ac_xfr_amt_p" + ".amt", "gi_ac_xfr_amt"),
				MCItemDef.create("stktk_minus_amt_p" + ".amt", "stktk_minus_amt"),
				MCItemDef.create("sls_amt_p" + ".amt", "sls_amt"),
				MCItemDef.create("end_stk_amt_p" + ".amt", "end_stk_amt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

