package mcframe.serverMGBD.MGBDL0530;

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
 * [MGBDL_BomLst]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0530.Srch01.UP.BLOCK0")){
			return MG_MGBDL0530_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk01.UP.BLOCK0")){
			return MG_MGBDL0530_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk01.UP.BLOCK1")){
			return MG_MGBDL0530_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk02.UP.BLOCK0")){
			return MG_MGBDL0530_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk02.UP.BLOCK1")){
			return MG_MGBDL0530_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0530_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk03.UP.BLOCK0")){
			return MG_MGBDL0530_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk03.UP.BLOCK1")){
			return MG_MGBDL0530_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Chk03.UP.BLOCK2")){
			return MG_MGBDL0530_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MG.MGBDL0530.Chk03.DOWN.BLOCK0")){
			return MG_MGBDL0530_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Chk03.DOWN.BLOCK1")){
			return MG_MGBDL0530_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Upd01.UP.BLOCK0")){
			return MG_MGBDL0530_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Upd01.UP.BLOCK1")){
			return MG_MGBDL0530_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Del01.UP.BLOCK0")){
			return MG_MGBDL0530_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Del01.UP.BLOCK1")){
			return MG_MGBDL0530_Del01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Imp01.UP.BLOCK0")){
			return MG_MGBDL0530_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Imp01.UP.BLOCK1")){
			return MG_MGBDL0530_Imp01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Imp01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Cnv01.UP.BLOCK0")){
			return MG_MGBDL0530_Cnv01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0530.Cnv01.UP.BLOCK1")){
			return MG_MGBDL0530_Cnv01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0530.Cnv01.UP.BLOCK2")){
			return MG_MGBDL0530_Cnv01_UP_BLOCK2();
		}
		else if (id.equals("MG.MGBDL0530.Cnv01.DOWN.BLOCK0")){
			return MG_MGBDL0530_Cnv01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MG_MGBDL0530_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_jnl_cd", "chd_itm_jnl_cd"),
				MCItemDef.create("chd_itm_jnl_nm", "chd_itm_jnl_nm"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("no_alt_grp_flg", "no_alt_grp_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("no_expns_flg", "no_expns_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("off_non_calc_flg", "off_non_calc_flg"),
				MCItemDef.create("on_non_calc_flg", "on_non_calc_flg"),
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


	public static MCContainerDef MG_MGBDL0530_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("cost_std_qty", "cost_std_qty"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_jnl_cd", "chd_itm_jnl_cd"),
				MCItemDef.create("chd_itm_jnl_nm", "chd_itm_jnl_nm"),
				MCItemDef.create("par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("par_base_unit_cd", "par_base_unit_cd"),
				MCItemDef.create("par_base_unit_nm", "par_base_unit_nm"),
				MCItemDef.create("par_dec_place", "par_dec_place"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_base_qty", "chd_base_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("chd_min_qty", "chd_min_qty"),
				MCItemDef.create("chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("chd_base_unit_cd", "chd_base_unit_cd"),
				MCItemDef.create("chd_base_unit_nm", "chd_base_unit_nm"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("cost_std_qty", "cost_std_qty"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_jnl_cd", "chd_itm_jnl_cd"),
				MCItemDef.create("chd_itm_jnl_nm", "chd_itm_jnl_nm"),
				MCItemDef.create("par_base_unit_cd", "par_base_unit_cd"),
				MCItemDef.create("par_base_unit_nm", "par_base_unit_nm"),
				MCItemDef.create("par_dec_place", "par_dec_place"),
				MCItemDef.create("chd_base_unit_cd", "chd_base_unit_cd"),
				MCItemDef.create("chd_base_unit_nm", "chd_base_unit_nm"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("expns_nm", "expns_nm")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0530", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk02_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Chk03_INFO = new MCOperationInfo("MG", "MGBDL0530", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk03_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("par_dec_place", "par_dec_place"),
				MCItemDef.create("chd_dec_place", "chd_dec_place")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	public static MCContainerDef MG_MGBDL0530_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("new_par_itm_cd", "new_par_itm_cd"),
				MCItemDef.create("new_par_itm_sub1", "new_par_itm_sub1"),
				MCItemDef.create("new_par_itm_sub2", "new_par_itm_sub2"),
				MCItemDef.create("new_par_itm_sub3", "new_par_itm_sub3"),
				MCItemDef.create("new_chd_itm_cd", "new_chd_itm_cd"),
				MCItemDef.create("new_chd_itm_sub1", "new_chd_itm_sub1"),
				MCItemDef.create("new_chd_itm_sub2", "new_chd_itm_sub2"),
				MCItemDef.create("new_chd_itm_sub3", "new_chd_itm_sub3"),
				MCItemDef.create("new_bom_ptn", "new_bom_ptn")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Del01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Del01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Imp01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Imp01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("cost_std_qty", "cost_std_qty"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_itm_jnl_cd", "chd_itm_jnl_cd"),
				MCItemDef.create("chd_itm_jnl_nm", "chd_itm_jnl_nm"),
				MCItemDef.create("par_base_unit_cd", "par_base_unit_cd"),
				MCItemDef.create("par_base_unit_nm", "par_base_unit_nm"),
				MCItemDef.create("par_dec_place", "par_dec_place"),
				MCItemDef.create("chd_base_unit_cd", "chd_base_unit_cd"),
				MCItemDef.create("chd_base_unit_nm", "chd_base_unit_nm"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("expns_nm", "expns_nm")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0530_Cnv01_INFO = new MCOperationInfo("MG", "MGBDL0530", "Cnv01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0530_Cnv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Cnv01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn")
			}
			,
			MCBlockDef.create("Cnv01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Cnv01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Cnv01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("dbc" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("dbc" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("dbc" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("dbc" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("dbc" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("dbc" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("dbc" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("dbc" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("dbc" + ".expns_cd", "expns_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_base_qty", "chd_base_qty"),
				MCItemDef.create("dbc" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("dbc" + ".chd_min_qty", "chd_min_qty"),
				MCItemDef.create("dbc" + ".chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("dbc" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cnv01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0530_Cnv01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Cnv01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Cnv01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0530_Cnv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0530", "Cnv01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Cnv01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

