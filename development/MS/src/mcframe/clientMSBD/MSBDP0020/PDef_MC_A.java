package mcframe.clientMSBD.MSBDP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PurcFrcstBalReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0020.Srch01.UP.BLOCK0")){
			return MS_MSBDL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0020.Upd01.UP.BLOCK0")){
			return MS_MSBDL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0020.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0020_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0020.Del01.UP.BLOCK0")){
			return MS_MSBDL0020_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0020.Del01.DOWN.BLOCK0")){
			return MS_MSBDL0020_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBDL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("subcon_t_flg", "subcon_t_flg"),
				MCItemDef.create("subcon_f_flg", "subcon_f_flg"),
				MCItemDef.create("purc_commit_t_flg", "purc_commit_t_flg"),
				MCItemDef.create("purc_commit_f_flg", "purc_commit_f_flg"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("trd_rate_fr", "trd_rate_fr"),
				MCItemDef.create("trd_rate_to", "trd_rate_to"),
				MCItemDef.create("bal_ym", "bal_ym"),
				MCItemDef.create("fix_period_flg", "fix_period_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm10", "sppl_grp_nm10"),
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


	public static MCContainerDef MS_MSBDL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
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
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_st_dt", "ym_st_dt"),
				MCItemDef.create("ym_end_dt", "ym_end_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_pf_qty_p" + ".qty", "trd_unit_pf_qty"),
				MCItemDef.create("trd_unit_bf_qty_p" + ".qty", "trd_unit_bf_qty"),
				MCItemDef.create("trd_unit_po_qty_p" + ".qty", "trd_unit_po_qty"),
				MCItemDef.create("trd_unit_diff_qty_p" + ".qty", "trd_unit_diff_qty"),
				MCItemDef.create("trd_rate", "trd_rate"),
				MCItemDef.create("trd_unit_monthly_pf_qty_p" + ".qty", "trd_unit_monthly_pf_qty"),
				MCItemDef.create("trd_unit_tendays_pf_qty_p" + ".qty", "trd_unit_tendays_pf_qty"),
				MCItemDef.create("trd_unit_weekly_pf_qty_p" + ".qty", "trd_unit_weekly_pf_qty"),
				MCItemDef.create("trd_unit_monthly_po_qty_p" + ".qty", "trd_unit_monthly_po_qty"),
				MCItemDef.create("trd_unit_weekly_po_qty_p" + ".qty", "trd_unit_weekly_po_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_pf_qty_p" + ".qty", "base_unit_pf_qty"),
				MCItemDef.create("base_unit_bf_qty_p" + ".qty", "base_unit_bf_qty"),
				MCItemDef.create("base_unit_po_qty_p" + ".qty", "base_unit_po_qty"),
				MCItemDef.create("base_unit_diff_qty_p" + ".qty", "base_unit_diff_qty"),
				MCItemDef.create("base_unit_monthly_pf_qty_p" + ".qty", "base_unit_monthly_pf_qty"),
				MCItemDef.create("base_unit_tendays_pf_qty_p" + ".qty", "base_unit_tendays_pf_qty"),
				MCItemDef.create("base_unit_weekly_pf_qty_p" + ".qty", "base_unit_weekly_pf_qty"),
				MCItemDef.create("base_unit_monthly_po_qty_p" + ".qty", "base_unit_monthly_po_qty"),
				MCItemDef.create("base_unit_weekly_po_qty_p" + ".qty", "base_unit_weekly_po_qty"),
				MCItemDef.create("monthly_ym_st_dt", "monthly_ym_st_dt"),
				MCItemDef.create("monthly_ym_end_dt", "monthly_ym_end_dt"),
				MCItemDef.create("week_ym_st_dt", "week_ym_st_dt"),
				MCItemDef.create("week_ym_end_dt", "week_ym_end_dt"),
				MCItemDef.create("monthly_flg", "monthly_flg"),
				MCItemDef.create("tendays_flg", "tendays_flg"),
				MCItemDef.create("weekly_flg", "weekly_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0020_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0020_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_bf_qty_p" + ".qty", "trd_unit_bf_qty"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBDL0020_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0020_Del01_INFO = new MCOperationInfo("MS", "MSBDL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0020_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBDL0020_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

