package mcframe.clientMABS.MABSP0210;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_LotInhReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0210.Srch01.UP.BLOCK0")){
			return MA_MABSL0210_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0210.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0210_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0210.Srch01.DOWN.BLOCK1")){
			return MA_MABSL0210_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL0210.Upd01.UP.BLOCK0")){
			return MA_MABSL0210_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0210.Upd01.UP.BLOCK1")){
			return MA_MABSL0210_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0210.Del01.UP.BLOCK0")){
			return MA_MABSL0210_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0210.Sprt01.UP.BLOCK0")){
			return MA_MABSL0210_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0210.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0210_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABSL0210_Srch01_INFO = new MCOperationInfo("MA", "MABSL0210", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0210_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0210_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("lot_inh_col_typ_nm", "lot_inh_col_typ_nm"),
				MCItemDef.create("lot_inh_typ", "lot_inh_typ"),
				MCItemDef.create("lot_inh_typ_nm", "lot_inh_typ_nm"),
				MCItemDef.create("add_concat_col", "add_concat_col"),
				MCItemDef.create("add_concat_col_nm", "add_concat_col_nm"),
				MCItemDef.create("overflow_err_flg", "overflow_err_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}
	public static MCContainerDef MA_MABSL0210_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_p" + ".itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0210_Upd01_INFO = new MCOperationInfo("MA", "MABSL0210", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0210_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0210_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lot_inh_typ", "lot_inh_typ"),
				MCItemDef.create("add_concat_col", "add_concat_col"),
				MCItemDef.create("overflow_err_flg", "overflow_err_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}
	
	static final MCOperationInfo MA_MABSL0210_Del01_INFO = new MCOperationInfo("MA", "MABSL0210", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0210_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0210_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0210", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0210_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_inh_col_typ", "lot_inh_col_typ")
			}
			,
			MCBlockDef.create("ChdSet")
		);
	}


	public static MCContainerDef MA_MABSL0210_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0210", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_p" + ".itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

