package mcframe.serverMBBA.MBBAL0020;

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
 * [MBBAL_AprvListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBAL0020.Srch01.UP.BLOCK0")){
			return MB_MBBAL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Srch01.DOWN.BLOCK0")){
			return MB_MBBAL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd01.UP.BLOCK0")){
			return MB_MBBAL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd01.DOWN.BLOCK0")){
			return MB_MBBAL0020_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd02.UP.BLOCK0")){
			return MB_MBBAL0020_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd02.DOWN.BLOCK0")){
			return MB_MBBAL0020_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd03.UP.BLOCK0")){
			return MB_MBBAL0020_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL0020.Upd03.DOWN.BLOCK0")){
			return MB_MBBAL0020_Upd03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MB_MBBAL0020_Srch01_INFO = new MCOperationInfo("MB", "MBBAL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBAL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2"),
				MCItemDef.create("aprv_d_sts_typ", "aprv_d_sts_typ"),
				MCItemDef.create("ins_dt_fr", "ins_dt_fr"),
				MCItemDef.create("ins_dt_to", "ins_dt_to"),
				MCItemDef.create("aprv_d_tm_fr", "aprv_d_tm_fr"),
				MCItemDef.create("aprv_d_tm_to", "aprv_d_tm_to"),
				MCItemDef.create("ins_biz_usr_cd", "ins_biz_usr_cd"),
				MCItemDef.create("ins_biz_usr_nm", "ins_biz_usr_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("main_role_flg", "main_role_flg"),
				MCItemDef.create("sub_role_flg", "sub_role_flg"),
				MCItemDef.create("next_opr_flg", "next_opr_flg"),
				MCItemDef.create("not_upd_flg", "not_upd_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd1")
		);
	}


	public static MCContainerDef MB_MBBAL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_no_seq", "aprv_no_seq"),
				MCItemDef.create("next_opr_flg", "next_opr_flg"),
				MCItemDef.create("ins_dt", "ins_dt"),
				MCItemDef.create("biz_usr_cd", "biz_usr_cd"),
				MCItemDef.create("biz_usr_nm", "biz_usr_nm"),
				MCItemDef.create("src_ins_usr_cd", "src_ins_usr_cd"),
				MCItemDef.create("src_ins_usr_nm", "src_ins_usr_nm"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_func_typ_nm", "aprv_func_typ_nm"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_itm_nm", "src_itm_nm"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_dpt_nm", "src_dpt_nm"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_bp_nm", "src_bp_nm"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_cur_nm1", "src_cur_nm1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_cur_nm2", "src_cur_nm2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_cur_nm3", "src_cur_nm3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2"),
				MCItemDef.create("main_role_flg", "main_role_flg"),
				MCItemDef.create("sub_role_flg", "sub_role_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_seq", "aprv_seq"),
				MCItemDef.create("aprv_d_sts_typ", "aprv_d_sts_typ"),
				MCItemDef.create("aprv_d_sts_typ_nm", "aprv_d_sts_typ_nm"),
				MCItemDef.create("aprv_d_tm", "aprv_d_tm"),
				MCItemDef.create("deputy_flg", "deputy_flg"),
				MCItemDef.create("deputy_usr_cd", "deputy_usr_cd"),
				MCItemDef.create("deputy_usr_nm", "deputy_usr_nm"),
				MCItemDef.create("aprv_d_rmrks", "aprv_d_rmrks"),
				MCItemDef.create("not_upd_flg", "not_upd_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("match_cnd_flg", "match_cnd_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL0020_Upd01_INFO = new MCOperationInfo("MB", "MBBAL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBAL0020_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_no_seq", "aprv_no_seq"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_d_sts_typ", "aprv_d_sts_typ"),
				MCItemDef.create("aprv_d_rmrks", "aprv_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}


	public static MCContainerDef MB_MBBAL0020_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL0020_Upd02_INFO = new MCOperationInfo("MB", "MBBAL0020", "Upd02", "000000", new PDef());

	public static MCContainerDef MB_MBBAL0020_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_no_seq", "aprv_no_seq"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_d_rmrks", "aprv_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Dtl1")
		);
	}


	public static MCContainerDef MB_MBBAL0020_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Dtl1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL0020_Upd03_INFO = new MCOperationInfo("MB", "MBBAL0020", "Upd03", "000000", new PDef());

	public static MCContainerDef MB_MBBAL0020_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_no_seq", "aprv_no_seq"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_d_rmrks", "aprv_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd03_Dtl1")
		);
	}


	public static MCContainerDef MB_MBBAL0020_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL0020", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd03_Dtl1")
		);
	}
	//FMCB DEF_CLASSES END
}

