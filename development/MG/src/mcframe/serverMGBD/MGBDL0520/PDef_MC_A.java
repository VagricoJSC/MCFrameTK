package mcframe.serverMGBD.MGBDL0520;

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
 * [MGBDL_BomReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0520.Srch01.UP.BLOCK0")){
			return MG_MGBDL0520_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0520_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Chk01.UP.BLOCK0")){
			return MG_MGBDL0520_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Chk01.UP.BLOCK1")){
			return MG_MGBDL0520_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0520.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0520_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Chk02.UP.BLOCK0")){
			return MG_MGBDL0520_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Chk02.UP.BLOCK1")){
			return MG_MGBDL0520_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0520.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0520_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Upd01.UP.BLOCK0")){
			return MG_MGBDL0520_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Upd01.UP.BLOCK1")){
			return MG_MGBDL0520_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0520.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0520_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Del01.UP.BLOCK0")){
			return MG_MGBDL0520_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0520.Del01.UP.BLOCK1")){
			return MG_MGBDL0520_Del01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0520.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0520_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MG_MGBDL0520_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("off_non_calc_flg", "off_non_calc_flg"),
				MCItemDef.create("on_non_calc_flg", "on_non_calc_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Srch01",
			new MCItemDef[]{
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
				MCItemDef.create("par_rqmt_qty", "par_rqmt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_base_qty", "chd_base_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("chd_min_qty", "chd_min_qty"),
				MCItemDef.create("chd_batch_qty", "chd_batch_qty"),
				MCItemDef.create("chd_unit_cd", "chd_unit_cd"),
				MCItemDef.create("chd_unit_nm", "chd_unit_nm"),
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
	
	static final MCOperationInfo MG_MGBDL0520_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk01",
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
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0520_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0520_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0520", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk02",
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
			MCBlockDef.create("Chk02_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0520_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk02_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0520_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
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

	public static MCContainerDef MG_MGBDL0520_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0520_Del01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
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

	public static MCContainerDef MG_MGBDL0520_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Del01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

