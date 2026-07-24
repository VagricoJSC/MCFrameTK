package mcframe.serverMSBC.MSBCL1160;

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
 * [MSBCL_VerChgSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1160.Srch01.UP.BLOCK0")){
			return MS_MSBCL1160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1160.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1160_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL1160_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1160_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("uncmpl_flg", "uncmpl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ver_chg_sts_typ", "ver_chg_sts_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("purc_st_dt_fr", "purc_st_dt_fr"),
				MCItemDef.create("purc_st_dt_to", "purc_st_dt_to"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("first_inst_st_dt_fr", "first_inst_st_dt_fr"),
				MCItemDef.create("first_inst_st_hm_fr", "first_inst_st_hm_fr"),
				MCItemDef.create("first_inst_st_dt_to", "first_inst_st_dt_to"),
				MCItemDef.create("first_inst_st_hm_to", "first_inst_st_hm_to"),
				MCItemDef.create("first_act_st_dt_fr", "first_act_st_dt_fr"),
				MCItemDef.create("first_act_st_hm_fr", "first_act_st_hm_fr"),
				MCItemDef.create("first_act_st_dt_to", "first_act_st_dt_to"),
				MCItemDef.create("first_act_st_hm_to", "first_act_st_hm_to"),
				MCItemDef.create("last_act_st_dt_fr", "last_act_st_dt_fr"),
				MCItemDef.create("last_act_st_hm_fr", "last_act_st_hm_fr"),
				MCItemDef.create("last_act_st_dt_to", "last_act_st_dt_to"),
				MCItemDef.create("last_act_st_hm_to", "last_act_st_hm_to"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("chd_itm_grp_flg1", "chd_itm_grp_flg1"),
				MCItemDef.create("chd_itm_grp_cd1", "chd_itm_grp_cd1"),
				MCItemDef.create("chd_itm_grp_nm1", "chd_itm_grp_nm1"),
				MCItemDef.create("chd_itm_grp_flg2", "chd_itm_grp_flg2"),
				MCItemDef.create("chd_itm_grp_cd2", "chd_itm_grp_cd2"),
				MCItemDef.create("chd_itm_grp_nm2", "chd_itm_grp_nm2"),
				MCItemDef.create("chd_itm_grp_flg3", "chd_itm_grp_flg3"),
				MCItemDef.create("chd_itm_grp_cd3", "chd_itm_grp_cd3"),
				MCItemDef.create("chd_itm_grp_nm3", "chd_itm_grp_nm3"),
				MCItemDef.create("chd_itm_grp_flg4", "chd_itm_grp_flg4"),
				MCItemDef.create("chd_itm_grp_cd4", "chd_itm_grp_cd4"),
				MCItemDef.create("chd_itm_grp_nm4", "chd_itm_grp_nm4"),
				MCItemDef.create("chd_itm_grp_flg5", "chd_itm_grp_flg5"),
				MCItemDef.create("chd_itm_grp_cd5", "chd_itm_grp_cd5"),
				MCItemDef.create("chd_itm_grp_nm5", "chd_itm_grp_nm5"),
				MCItemDef.create("chd_itm_grp_flg6", "chd_itm_grp_flg6"),
				MCItemDef.create("chd_itm_grp_cd6", "chd_itm_grp_cd6"),
				MCItemDef.create("chd_itm_grp_nm6", "chd_itm_grp_nm6"),
				MCItemDef.create("chd_itm_grp_flg7", "chd_itm_grp_flg7"),
				MCItemDef.create("chd_itm_grp_cd7", "chd_itm_grp_cd7"),
				MCItemDef.create("chd_itm_grp_nm7", "chd_itm_grp_nm7"),
				MCItemDef.create("chd_itm_grp_flg8", "chd_itm_grp_flg8"),
				MCItemDef.create("chd_itm_grp_cd8", "chd_itm_grp_cd8"),
				MCItemDef.create("chd_itm_grp_nm8", "chd_itm_grp_nm8"),
				MCItemDef.create("chd_itm_grp_flg9", "chd_itm_grp_flg9"),
				MCItemDef.create("chd_itm_grp_cd9", "chd_itm_grp_cd9"),
				MCItemDef.create("chd_itm_grp_nm9", "chd_itm_grp_nm9"),
				MCItemDef.create("chd_itm_grp_flg10", "chd_itm_grp_flg10"),
				MCItemDef.create("chd_itm_grp_cd10", "chd_itm_grp_cd10"),
				MCItemDef.create("chd_itm_grp_nm10", "chd_itm_grp_nm10"),
				MCItemDef.create("par_itm_grp_flg1", "par_itm_grp_flg1"),
				MCItemDef.create("par_itm_grp_cd1", "par_itm_grp_cd1"),
				MCItemDef.create("par_itm_grp_nm1", "par_itm_grp_nm1"),
				MCItemDef.create("par_itm_grp_flg2", "par_itm_grp_flg2"),
				MCItemDef.create("par_itm_grp_cd2", "par_itm_grp_cd2"),
				MCItemDef.create("par_itm_grp_nm2", "par_itm_grp_nm2"),
				MCItemDef.create("par_itm_grp_flg3", "par_itm_grp_flg3"),
				MCItemDef.create("par_itm_grp_cd3", "par_itm_grp_cd3"),
				MCItemDef.create("par_itm_grp_nm3", "par_itm_grp_nm3"),
				MCItemDef.create("par_itm_grp_flg4", "par_itm_grp_flg4"),
				MCItemDef.create("par_itm_grp_cd4", "par_itm_grp_cd4"),
				MCItemDef.create("par_itm_grp_nm4", "par_itm_grp_nm4"),
				MCItemDef.create("par_itm_grp_flg5", "par_itm_grp_flg5"),
				MCItemDef.create("par_itm_grp_cd5", "par_itm_grp_cd5"),
				MCItemDef.create("par_itm_grp_nm5", "par_itm_grp_nm5"),
				MCItemDef.create("par_itm_grp_flg6", "par_itm_grp_flg6"),
				MCItemDef.create("par_itm_grp_cd6", "par_itm_grp_cd6"),
				MCItemDef.create("par_itm_grp_nm6", "par_itm_grp_nm6"),
				MCItemDef.create("par_itm_grp_flg7", "par_itm_grp_flg7"),
				MCItemDef.create("par_itm_grp_cd7", "par_itm_grp_cd7"),
				MCItemDef.create("par_itm_grp_nm7", "par_itm_grp_nm7"),
				MCItemDef.create("par_itm_grp_flg8", "par_itm_grp_flg8"),
				MCItemDef.create("par_itm_grp_cd8", "par_itm_grp_cd8"),
				MCItemDef.create("par_itm_grp_nm8", "par_itm_grp_nm8"),
				MCItemDef.create("par_itm_grp_flg9", "par_itm_grp_flg9"),
				MCItemDef.create("par_itm_grp_cd9", "par_itm_grp_cd9"),
				MCItemDef.create("par_itm_grp_nm9", "par_itm_grp_nm9"),
				MCItemDef.create("par_itm_grp_flg10", "par_itm_grp_flg10"),
				MCItemDef.create("par_itm_grp_cd10", "par_itm_grp_cd10"),
				MCItemDef.create("par_itm_grp_nm10", "par_itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1160_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_chg_sts_typ", "ver_chg_sts_typ"),
				MCItemDef.create("ver_chg_sts_typ_nm", "ver_chg_sts_typ_nm"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("first_inst_st_dt", "first_inst_st_dt"),
				MCItemDef.create("first_inst_st_hm", "first_inst_st_hm"),
				MCItemDef.create("first_inst_lot_no", "first_inst_lot_no"),
				MCItemDef.create("first_inst_sublot_no", "first_inst_sublot_no"),
				MCItemDef.create("first_act_st_dt", "first_act_st_dt"),
				MCItemDef.create("first_act_st_hm", "first_act_st_hm"),
				MCItemDef.create("first_act_lot_no", "first_act_lot_no"),
				MCItemDef.create("first_act_sublot_no", "first_act_sublot_no"),
				MCItemDef.create("last_act_st_dt", "last_act_st_dt"),
				MCItemDef.create("last_act_st_hm", "last_act_st_hm"),
				MCItemDef.create("last_act_lot_no", "last_act_lot_no"),
				MCItemDef.create("last_act_sublot_no", "last_act_sublot_no"),
				MCItemDef.create("master_rmrks", "master_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("purc_st_dt", "purc_st_dt"),
				MCItemDef.create("first_mfg_inst_no", "first_mfg_inst_no"),
				MCItemDef.create("first_act_mfg_inst_no", "first_act_mfg_inst_no"),
				MCItemDef.create("first_mfg_act_no", "first_mfg_act_no"),
				MCItemDef.create("last_mfg_inst_no", "last_mfg_inst_no"),
				MCItemDef.create("last_mfg_act_no", "last_mfg_act_no"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_grp_cd1", "chd_itm_grp_cd1"),
				MCItemDef.create("chd_itm_grp_nm1", "chd_itm_grp_nm1"),
				MCItemDef.create("chd_itm_grp_cd2", "chd_itm_grp_cd2"),
				MCItemDef.create("chd_itm_grp_nm2", "chd_itm_grp_nm2"),
				MCItemDef.create("chd_itm_grp_cd3", "chd_itm_grp_cd3"),
				MCItemDef.create("chd_itm_grp_nm3", "chd_itm_grp_nm3"),
				MCItemDef.create("chd_itm_grp_cd4", "chd_itm_grp_cd4"),
				MCItemDef.create("chd_itm_grp_nm4", "chd_itm_grp_nm4"),
				MCItemDef.create("chd_itm_grp_cd5", "chd_itm_grp_cd5"),
				MCItemDef.create("chd_itm_grp_nm5", "chd_itm_grp_nm5"),
				MCItemDef.create("chd_itm_grp_cd6", "chd_itm_grp_cd6"),
				MCItemDef.create("chd_itm_grp_nm6", "chd_itm_grp_nm6"),
				MCItemDef.create("chd_itm_grp_cd7", "chd_itm_grp_cd7"),
				MCItemDef.create("chd_itm_grp_nm7", "chd_itm_grp_nm7"),
				MCItemDef.create("chd_itm_grp_cd8", "chd_itm_grp_cd8"),
				MCItemDef.create("chd_itm_grp_nm8", "chd_itm_grp_nm8"),
				MCItemDef.create("chd_itm_grp_cd9", "chd_itm_grp_cd9"),
				MCItemDef.create("chd_itm_grp_nm9", "chd_itm_grp_nm9"),
				MCItemDef.create("chd_itm_grp_cd10", "chd_itm_grp_cd10"),
				MCItemDef.create("chd_itm_grp_nm10", "chd_itm_grp_nm10"),
				MCItemDef.create("par_itm_grp_cd1", "par_itm_grp_cd1"),
				MCItemDef.create("par_itm_grp_nm1", "par_itm_grp_nm1"),
				MCItemDef.create("par_itm_grp_cd2", "par_itm_grp_cd2"),
				MCItemDef.create("par_itm_grp_nm2", "par_itm_grp_nm2"),
				MCItemDef.create("par_itm_grp_cd3", "par_itm_grp_cd3"),
				MCItemDef.create("par_itm_grp_nm3", "par_itm_grp_nm3"),
				MCItemDef.create("par_itm_grp_cd4", "par_itm_grp_cd4"),
				MCItemDef.create("par_itm_grp_nm4", "par_itm_grp_nm4"),
				MCItemDef.create("par_itm_grp_cd5", "par_itm_grp_cd5"),
				MCItemDef.create("par_itm_grp_nm5", "par_itm_grp_nm5"),
				MCItemDef.create("par_itm_grp_cd6", "par_itm_grp_cd6"),
				MCItemDef.create("par_itm_grp_nm6", "par_itm_grp_nm6"),
				MCItemDef.create("par_itm_grp_cd7", "par_itm_grp_cd7"),
				MCItemDef.create("par_itm_grp_nm7", "par_itm_grp_nm7"),
				MCItemDef.create("par_itm_grp_cd8", "par_itm_grp_cd8"),
				MCItemDef.create("par_itm_grp_nm8", "par_itm_grp_nm8"),
				MCItemDef.create("par_itm_grp_cd9", "par_itm_grp_cd9"),
				MCItemDef.create("par_itm_grp_nm9", "par_itm_grp_nm9"),
				MCItemDef.create("par_itm_grp_cd10", "par_itm_grp_cd10"),
				MCItemDef.create("par_itm_grp_nm10", "par_itm_grp_nm10"),
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
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

