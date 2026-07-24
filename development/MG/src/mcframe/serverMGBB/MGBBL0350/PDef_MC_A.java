package mcframe.serverMGBB.MGBBL0350;

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
 * [MGBBL_ActInstWipIfReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0350.Srch01.UP.BLOCK0")){
			return MG_MGBBL0350_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0350_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk01.UP.BLOCK0")){
			return MG_MGBBL0350_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk01.UP.BLOCK1")){
			return MG_MGBBL0350_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0350.Chk01.DOWN.BLOCK0")){
			return MG_MGBBL0350_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk02.UP.BLOCK0")){
			return MG_MGBBL0350_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk02.DOWN.BLOCK0")){
			return MG_MGBBL0350_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk03.UP.BLOCK0")){
			return MG_MGBBL0350_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Chk03.DOWN.BLOCK0")){
			return MG_MGBBL0350_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Imp01.UP.BLOCK0")){
			return MG_MGBBL0350_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Imp01.DOWN.BLOCK0")){
			return MG_MGBBL0350_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Upd01.UP.BLOCK0")){
			return MG_MGBBL0350_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Upd01.DOWN.BLOCK0")){
			return MG_MGBBL0350_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Del01.UP.BLOCK0")){
			return MG_MGBBL0350_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Del01.DOWN.BLOCK0")){
			return MG_MGBBL0350_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Del02.UP.BLOCK0")){
			return MG_MGBBL0350_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Ins01.UP.BLOCK0")){
			return MG_MGBBL0350_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Ins02.UP.BLOCK0")){
			return MG_MGBBL0350_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0350.Ins02.UP.BLOCK1")){
			return MG_MGBBL0350_Ins02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MG_MGBBL0350_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
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
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("no_ac_rsn_flg", "no_ac_rsn_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
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
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("wip_qty", "wip_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("wip_per", "wip_per"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBBL0350_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("file_ins_flg", "file_ins_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Chk02_INFO = new MCOperationInfo("MG", "MGBBL0350", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Chk03_INFO = new MCOperationInfo("MG", "MGBBL0350", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Imp01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Del01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0350_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Del02_INFO = new MCOperationInfo("MG", "MGBBL0350", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0350", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0350_Ins02_INFO = new MCOperationInfo("MG", "MGBBL0350", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0350_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0350_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0350", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".wip_qty", "wip_qty"),
				MCItemDef.create("dbc" + ".wip_per", "wip_per"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

