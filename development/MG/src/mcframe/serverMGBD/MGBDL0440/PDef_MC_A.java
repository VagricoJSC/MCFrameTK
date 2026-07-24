package mcframe.serverMGBD.MGBDL0440;

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
 * [MGBDL_CopyItmWk]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0440.Srch01.UP.BLOCK0")){
			return MG_MGBDL0440_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0440_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk01.UP.BLOCK0")){
			return MG_MGBDL0440_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0440_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Ins01.UP.BLOCK0")){
			return MG_MGBDL0440_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk02.UP.BLOCK0")){
			return MG_MGBDL0440_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk02.UP.BLOCK1")){
			return MG_MGBDL0440_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0440.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0440_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk02.DOWN.BLOCK1")){
			return MG_MGBDL0440_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0440.Upd01.UP.BLOCK0")){
			return MG_MGBDL0440_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Upd01.UP.BLOCK1")){
			return MG_MGBDL0440_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0440.Chk03.UP.BLOCK0")){
			return MG_MGBDL0440_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Chk03.DOWN.BLOCK0")){
			return MG_MGBDL0440_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0440.Upd02.UP.BLOCK0")){
			return MG_MGBDL0440_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MG_MGBDL0440_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0440", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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
				MCItemDef.create("no_exist_flg", "no_exist_flg"),
				MCItemDef.create("change_flg", "change_flg"),
				MCItemDef.create("exist_flg", "exist_flg"),
				MCItemDef.create("imp_err_flg", "imp_err_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0440_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("imp_err_flg", "imp_err_flg"),
				MCItemDef.create("change_flg", "change_flg"),
				MCItemDef.create("no_exist_flg", "no_exist_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("unit_dec_place", "unit_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("min_wk_cost", "min_wk_cost"),
				MCItemDef.create("batch_wk_cost", "batch_wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("non_calc_flg", "non_calc_flg"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0440", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0440_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0440", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0440", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0440_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0440_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MG_MGBDL0440_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0440", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0440_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Chk03_INFO = new MCOperationInfo("MG", "MGBDL0440", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0440_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0440_Upd02_INFO = new MCOperationInfo("MG", "MGBDL0440", "Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0440_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0440", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Upd02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

