package mcframe.serverMSBE.MSBEL2610;

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
 * [MSBEL_StktkList]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL2610.Srch01.UP.BLOCK0")){
			return MS_MSBEL2610_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch02.UP.BLOCK0")){
			return MS_MSBEL2610_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch03.UP.BLOCK0")){
			return MS_MSBEL2610_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch03.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch04.UP.BLOCK0")){
			return MS_MSBEL2610_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch04.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch05.UP.BLOCK0")){
			return MS_MSBEL2610_Srch05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch05.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch06.UP.BLOCK0")){
			return MS_MSBEL2610_Srch06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch06.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch07.UP.BLOCK0")){
			return MS_MSBEL2610_Srch07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch07.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch08.UP.BLOCK0")){
			return MS_MSBEL2610_Srch08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch08.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch08_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch09.UP.BLOCK0")){
			return MS_MSBEL2610_Srch09_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch09.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch09_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch10.UP.BLOCK0")){
			return MS_MSBEL2610_Srch10_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch10.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch10_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch11.UP.BLOCK0")){
			return MS_MSBEL2610_Srch11_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch11.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch11_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch12.UP.BLOCK0")){
			return MS_MSBEL2610_Srch12_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Srch12.DOWN.BLOCK0")){
			return MS_MSBEL2610_Srch12_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk01.UP.BLOCK0")){
			return MS_MSBEL2610_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk02.UP.BLOCK0")){
			return MS_MSBEL2610_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk02.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk03.UP.BLOCK0")){
			return MS_MSBEL2610_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk03.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk04.UP.BLOCK0")){
			return MS_MSBEL2610_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk04.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk05.UP.BLOCK0")){
			return MS_MSBEL2610_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk05.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk06.UP.BLOCK0")){
			return MS_MSBEL2610_Chk06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk06.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk07.UP.BLOCK0")){
			return MS_MSBEL2610_Chk07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Chk07.DOWN.BLOCK0")){
			return MS_MSBEL2610_Chk07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd01.UP.BLOCK0")){
			return MS_MSBEL2610_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL2610_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd02.UP.BLOCK0")){
			return MS_MSBEL2610_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd02.UP.BLOCK1")){
			return MS_MSBEL2610_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2610.Upd02.DOWN.BLOCK0")){
			return MS_MSBEL2610_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd03.UP.BLOCK0")){
			return MS_MSBEL2610_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd03.DOWN.BLOCK0")){
			return MS_MSBEL2610_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd04.UP.BLOCK0")){
			return MS_MSBEL2610_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Upd04.DOWN.BLOCK0")){
			return MS_MSBEL2610_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del01.UP.BLOCK0")){
			return MS_MSBEL2610_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del01.DOWN.BLOCK0")){
			return MS_MSBEL2610_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del02.UP.BLOCK0")){
			return MS_MSBEL2610_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del02.UP.BLOCK1")){
			return MS_MSBEL2610_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2610.Del02.DOWN.BLOCK0")){
			return MS_MSBEL2610_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del03.UP.BLOCK0")){
			return MS_MSBEL2610_Del03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Del03.DOWN.BLOCK0")){
			return MS_MSBEL2610_Del03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Prnt01.UP.BLOCK0")){
			return MS_MSBEL2610_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2610.Prnt01.UP.BLOCK1")){
			return MS_MSBEL2610_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2610.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL2610_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																											
	
	static final MCOperationInfo MS_MSBEL2610_Srch01_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
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
	
	static final MCOperationInfo MS_MSBEL2610_Srch02_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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


	public static MCContainerDef MS_MSBEL2610_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch03_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Srch03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch04_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch05_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch05", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch05_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch05_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch06_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch06", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch06",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Srch06_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch06",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch06_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch07_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch07", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch07",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch07_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch07",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch07_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch08_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch08", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch08",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Srch08_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch08",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch08_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch09_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch09", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch09_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Srch09_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch09_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch09_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch10_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch10", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch10_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch10_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch10_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch10_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch11_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch11", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch11_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch11",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch11_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch11_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch11",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch11_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Srch12_INFO = new MCOperationInfo("MS", "MSBEL2610", "Srch12", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Srch12_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch12",
			new MCItemDef[]{
				MCItemDef.create("stktk_sts_wtg", "stktk_sts_wtg"),
				MCItemDef.create("stktk_sts_st", "stktk_sts_st"),
				MCItemDef.create("stktk_sts_rfl", "stktk_sts_rfl"),
				MCItemDef.create("stktk_ym", "stktk_ym"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("ctrl_tgt_dt_fr", "ctrl_tgt_dt_fr"),
				MCItemDef.create("ctrl_tgt_dt_to", "ctrl_tgt_dt_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_invlist_flg", "not_invlist_flg"),
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("not_difflist_flg", "not_difflist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg"),
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
			MCBlockDef.create("Srch12_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Srch12_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Srch12",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_typ_nm", "stktk_typ_nm"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("stktk_st_tm", "stktk_st_tm"),
				MCItemDef.create("diff_upd_tm", "diff_upd_tm"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch12_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk01_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk02_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk03_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("not_chk_tor_flg", "not_chk_tor_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk04_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk05_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk05_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk06_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk06", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk06_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk06_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Chk07_INFO = new MCOperationInfo("MS", "MSBEL2610", "Chk07", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Chk07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk07",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Chk07_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Chk07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Chk07",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk07_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Upd01_INFO = new MCOperationInfo("MS", "MSBEL2610", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Upd02_INFO = new MCOperationInfo("MS", "MSBEL2610", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL2610_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("add_io_ctrl_flg", "add_io_ctrl_flg")
			}
			,
			MCBlockDef.create("Upd02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Upd03_INFO = new MCOperationInfo("MS", "MSBEL2610", "Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("not_chk_tor_flg", "not_chk_tor_flg")
			}
			,
			MCBlockDef.create("Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Upd04_INFO = new MCOperationInfo("MS", "MSBEL2610", "Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd04",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Upd04",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("last_stktk_dt", "last_stktk_dt"),
				MCItemDef.create("latest_stktk_st_dt", "latest_stktk_st_dt"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Del01_INFO = new MCOperationInfo("MS", "MSBEL2610", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("io_ctrl_flg", "io_ctrl_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Del02_INFO = new MCOperationInfo("MS", "MSBEL2610", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del02",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL2610_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del02",
			new MCItemDef[]{
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg")
			}
			,
			MCBlockDef.create("Del02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del02",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("act_qty_keep_flg", "act_qty_keep_flg"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Del03_INFO = new MCOperationInfo("MS", "MSBEL2610", "Del03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Del03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del03",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Del03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Del03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Del03",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_intr_rmrks", "stktk_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL2610_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL2610", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2610_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL2610_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("invlist_flg", "invlist_flg"),
				MCItemDef.create("difflist_flg", "difflist_flg")
			}
			,
			MCBlockDef.create("Prnt01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL2610_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2610", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("pre_stktk_upd_cntr", "pre_stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

