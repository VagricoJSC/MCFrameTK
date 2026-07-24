package mcframe.clientMSBB.MSBBP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_MlySPlnItmUpd]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL0120.Srch01.UP.BLOCK0")){
			return MS_MSBBL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL0120_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0120.Sprt01.UP.BLOCK0")){
			return MS_MSBBL0120_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Sprt01.UP.BLOCK1")){
			return MS_MSBBL0120_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0120.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL0120_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Sprt02.UP.BLOCK0")){
			return MS_MSBBL0120_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Sprt02.UP.BLOCK1")){
			return MS_MSBBL0120_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0120.Sprt02.DOWN.BLOCK0")){
			return MS_MSBBL0120_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Upd01.UP.BLOCK0")){
			return MS_MSBBL0120_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0120.Upd01.UP.BLOCK1")){
			return MS_MSBBL0120_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0120.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL0120_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBBL0120_Srch01_INFO = new MCOperationInfo("MS", "MSBBL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0120_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("spln_ym_to", "spln_ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("fix_t_flg", "fix_t_flg"),
				MCItemDef.create("fix_f_flg", "fix_f_flg"),
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


	public static MCContainerDef MS_MSBBL0120_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("edited_flg", "edited_flg"),
				MCItemDef.create("adopted_flg", "adopted_flg"),
				MCItemDef.create("locked_flg", "locked_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0120_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("old_fix_flg", "fix_flg"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0120_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL0120", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0120_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0120_Sprt01_UP_BLOCK1() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}


	public static MCContainerDef MS_MSBBL0120_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0120_Sprt02_INFO = new MCOperationInfo("MS", "MSBBL0120", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0120_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0120_Sprt02_UP_BLOCK1() {
		/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}


	public static MCContainerDef MS_MSBBL0120_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0120_Upd01_INFO = new MCOperationInfo("MS", "MSBBL0120", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0120_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0120_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0120_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

