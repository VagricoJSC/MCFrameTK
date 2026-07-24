package mcframe.clientMGBD.MGBDP0520;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBDP_BomReg]の入出力情報となる電文（上り・下り電文）と
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
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("off_non_calc_flg", "off_non_calc_flg"),
				MCItemDef.create("on_non_calc_flg", "on_non_calc_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("par_rqmt_qty_p" + ".qty", "par_rqmt_qty"),
				MCItemDef.create("chd_rqmt_qty_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_base_qty_p" + ".qty", "chd_base_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty_p" + ".qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("chd_min_qty_p" + ".qty", "chd_min_qty"),
				MCItemDef.create("chd_batch_qty_p" + ".qty", "chd_batch_qty"),
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
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0520_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("par_rqmt_qty_p" + ".qty", "par_rqmt_qty"),
				MCItemDef.create("chd_rqmt_qty_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_base_qty_p" + ".qty", "chd_base_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty_p" + ".qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("chd_min_qty_p" + ".qty", "chd_min_qty"),
				MCItemDef.create("chd_batch_qty_p" + ".qty", "chd_batch_qty"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("non_calc_flg", "non_calc_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0520_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0520_Del01_INFO = new MCOperationInfo("MG", "MGBDL0520", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0520_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0520_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0520_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0520", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

