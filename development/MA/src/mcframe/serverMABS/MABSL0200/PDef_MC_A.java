package mcframe.serverMABS.MABSL0200;

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
 * [MABSL_LotInhLst]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0200.Srch01.UP.BLOCK0")){
			return MA_MABSL0200_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0200.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0200_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABSL0200_Srch01_INFO = new MCOperationInfo("MA", "MABSL0200", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0200_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("dest_memo1", "dest_memo1"),
				MCItemDef.create("dest_memo2", "dest_memo2"),
				MCItemDef.create("dest_memo3", "dest_memo3"),
				MCItemDef.create("src_memo1", "src_memo1"),
				MCItemDef.create("src_memo2", "src_memo2"),
				MCItemDef.create("src_memo3", "src_memo3"),
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
				MCItemDef.create("chd_itm_grp_nm10", "chd_itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0200_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("lot_inh_col_typ_nm", "lot_inh_col_typ_nm"),
				MCItemDef.create("lot_inh_typ", "lot_inh_typ"),
				MCItemDef.create("lot_inh_typ_nm", "lot_inh_typ_nm"),
				MCItemDef.create("add_concat_col", "add_concat_col"),
				MCItemDef.create("add_concat_col_nm", "add_concat_col_nm"),
				MCItemDef.create("overflow_err_flg", "overflow_err_flg"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dest_memo1", "dest_memo1"),
				MCItemDef.create("dest_memo2", "dest_memo2"),
				MCItemDef.create("dest_memo3", "dest_memo3"),
				MCItemDef.create("src_memo1", "src_memo1"),
				MCItemDef.create("src_memo2", "src_memo2"),
				MCItemDef.create("src_memo3", "src_memo3"),
				MCItemDef.create("dest_ins_usr_id", "dest_ins_usr_id"),
				MCItemDef.create("dest_ins_usr_nm", "dest_ins_usr_nm"),
				MCItemDef.create("dest_ins_ts", "dest_ins_ts"),
				MCItemDef.create("dest_ins_func_id", "dest_ins_func_id"),
				MCItemDef.create("dest_ins_func_nm", "dest_ins_func_nm"),
				MCItemDef.create("dest_upd_cntr", "dest_upd_cntr"),
				MCItemDef.create("dest_upd_usr_id", "dest_upd_usr_id"),
				MCItemDef.create("dest_upd_usr_nm", "dest_upd_usr_nm"),
				MCItemDef.create("dest_upd_ts", "dest_upd_ts"),
				MCItemDef.create("dest_upd_func_id", "dest_upd_func_id"),
				MCItemDef.create("dest_upd_func_nm", "dest_upd_func_nm"),
				MCItemDef.create("dest_upd_srv_req_no", "dest_upd_srv_req_no"),
				MCItemDef.create("dest_del_usr_id", "dest_del_usr_id"),
				MCItemDef.create("dest_del_usr_nm", "dest_del_usr_nm"),
				MCItemDef.create("dest_del_ts", "dest_del_ts"),
				MCItemDef.create("src_ins_usr_id", "src_ins_usr_id"),
				MCItemDef.create("src_ins_usr_nm", "src_ins_usr_nm"),
				MCItemDef.create("src_ins_ts", "src_ins_ts"),
				MCItemDef.create("src_ins_func_id", "src_ins_func_id"),
				MCItemDef.create("src_ins_func_nm", "src_ins_func_nm"),
				MCItemDef.create("src_upd_cntr", "src_upd_cntr"),
				MCItemDef.create("src_upd_usr_id", "src_upd_usr_id"),
				MCItemDef.create("src_upd_usr_nm", "src_upd_usr_nm"),
				MCItemDef.create("src_upd_ts", "src_upd_ts"),
				MCItemDef.create("src_upd_func_id", "src_upd_func_id"),
				MCItemDef.create("src_upd_func_nm", "src_upd_func_nm"),
				MCItemDef.create("src_upd_srv_req_no", "src_upd_srv_req_no"),
				MCItemDef.create("src_del_usr_id", "src_del_usr_id"),
				MCItemDef.create("src_del_usr_nm", "src_del_usr_nm"),
				MCItemDef.create("src_del_ts", "src_del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	//FMCB DEF_CLASSES END
}

