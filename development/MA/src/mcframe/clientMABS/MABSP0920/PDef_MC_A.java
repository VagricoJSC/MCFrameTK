package mcframe.clientMABS.MABSP0920;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_ProcUpriChk]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0920.Sprt01.UP.BLOCK0")){
			return MA_MABSL0920_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0920.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0920_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0920.Sprt01.DOWN.BLOCK1")){
			return MA_MABSL0920_Sprt01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABSL0920_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0920", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0920_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0920", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("proc_upri_typ", "proc_upri_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "qty")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0920_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0920", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MA_MABSL0920_Sprt01_DOWN_BLOCK1() {
	/** Ope.のBlock [Sprt01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0920", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("lot_qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("proc_upri_typ", "proc_upri_typ"),
				MCItemDef.create("proc_upri_typ_nm", "proc_upri_typ_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("ProcDtlAll")
		);
	}
	//FMCB DEF_CLASSES END
}

