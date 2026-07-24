package mcframe.serverMABS.MABSL0130;

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
 * [MABSL_ProvUpriReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0130.ProvUpri_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Upd01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_DelChk01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Del01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Aprv_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_UpdChk01.UP.BLOCK1")){
			return MA_MABSL0130_ProvUpri_Aprv_UpdChk01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_Upd01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Aprv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_Upd01.UP.BLOCK1")){
			return MA_MABSL0130_ProvUpri_Aprv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_DelChk01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Aprv_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.ProvUpri_Aprv_Del01.UP.BLOCK0")){
			return MA_MABSL0130_ProvUpri_Aprv_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Srch01.UP.BLOCK0")){
			return MA_MABSL0130_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0130_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Sprt01.UP.BLOCK0")){
			return MA_MABSL0130_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0130_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Upd01.UP.BLOCK0")){
			return MA_MABSL0130_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Del01.UP.BLOCK0")){
			return MA_MABSL0130_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Srch01.UP.BLOCK0")){
			return MA_MABSL0130_Aprv_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Srch01.DOWN.BLOCK0")){
			return MA_MABSL0130_Aprv_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Upd01.UP.BLOCK0")){
			return MA_MABSL0130_Aprv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Upd01.UP.BLOCK1")){
			return MA_MABSL0130_Aprv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Upd01.DOWN.BLOCK0")){
			return MA_MABSL0130_Aprv_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.Aprv_Del01.UP.BLOCK0")){
			return MA_MABSL0130_Aprv_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0130.AprvAfter_Upd01.UP.BLOCK0")){
			return MA_MABSL0130_AprvAfter_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Upd01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Del01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Aprv_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Aprv_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_UpdChk01_Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_UpdChk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_UpdChk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Aprv_Upd01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Aprv_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Aprv_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Aprv_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_ProvUpri_Aprv_Del01_INFO = new MCOperationInfo("MA", "MABSL0130", "ProvUpri_Aprv_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_ProvUpri_Aprv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "ProvUpri_Aprv_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProvUpri_Aprv_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Srch01_INFO = new MCOperationInfo("MA", "MABSL0130", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("prsppl_cntry_cd", "prsppl_cntry_cd"),
				MCItemDef.create("prsppl_cntry_nm", "prsppl_cntry_nm"),
				MCItemDef.create("prsppl_foreign_flg", "prsppl_foreign_flg"),
				MCItemDef.create("prsppl_area_cd", "prsppl_area_cd"),
				MCItemDef.create("prsppl_area_nm", "prsppl_area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("par_base_dt", "par_base_dt"),
				MCItemDef.create("par_wg_cd", "par_wg_cd"),
				MCItemDef.create("par_wg_nm", "par_wg_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
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
				MCItemDef.create("prsppl_grp_cd1", "prsppl_grp_cd1"),
				MCItemDef.create("prsppl_grp_nm1", "prsppl_grp_nm1"),
				MCItemDef.create("prsppl_grp_cd2", "prsppl_grp_cd2"),
				MCItemDef.create("prsppl_grp_nm2", "prsppl_grp_nm2"),
				MCItemDef.create("prsppl_grp_cd3", "prsppl_grp_cd3"),
				MCItemDef.create("prsppl_grp_nm3", "prsppl_grp_nm3"),
				MCItemDef.create("prsppl_grp_cd4", "prsppl_grp_cd4"),
				MCItemDef.create("prsppl_grp_nm4", "prsppl_grp_nm4"),
				MCItemDef.create("prsppl_grp_cd5", "prsppl_grp_cd5"),
				MCItemDef.create("prsppl_grp_nm5", "prsppl_grp_nm5"),
				MCItemDef.create("prsppl_grp_cd6", "prsppl_grp_cd6"),
				MCItemDef.create("prsppl_grp_nm6", "prsppl_grp_nm6"),
				MCItemDef.create("prsppl_grp_cd7", "prsppl_grp_cd7"),
				MCItemDef.create("prsppl_grp_nm7", "prsppl_grp_nm7"),
				MCItemDef.create("prsppl_grp_cd8", "prsppl_grp_cd8"),
				MCItemDef.create("prsppl_grp_nm8", "prsppl_grp_nm8"),
				MCItemDef.create("prsppl_grp_cd9", "prsppl_grp_cd9"),
				MCItemDef.create("prsppl_grp_nm9", "prsppl_grp_nm9"),
				MCItemDef.create("prsppl_grp_cd10", "prsppl_grp_cd10"),
				MCItemDef.create("prsppl_grp_nm10", "prsppl_grp_nm10"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("apl_dt_fr", "apl_dt_fr"),
				MCItemDef.create("apl_dt_to", "apl_dt_to"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0130_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0130", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0130_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Upd01_INFO = new MCOperationInfo("MA", "MABSL0130", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Del01_INFO = new MCOperationInfo("MA", "MABSL0130", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Aprv_Srch01_INFO = new MCOperationInfo("MA", "MABSL0130", "Aprv_Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Aprv_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("prsppl_cntry_cd", "prsppl_cntry_cd"),
				MCItemDef.create("prsppl_cntry_nm", "prsppl_cntry_nm"),
				MCItemDef.create("prsppl_foreign_flg", "prsppl_foreign_flg"),
				MCItemDef.create("prsppl_area_cd", "prsppl_area_cd"),
				MCItemDef.create("prsppl_area_nm", "prsppl_area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("par_base_dt", "par_base_dt"),
				MCItemDef.create("par_wg_cd", "par_wg_cd"),
				MCItemDef.create("par_wg_nm", "par_wg_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
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
				MCItemDef.create("prsppl_grp_cd1", "prsppl_grp_cd1"),
				MCItemDef.create("prsppl_grp_nm1", "prsppl_grp_nm1"),
				MCItemDef.create("prsppl_grp_cd2", "prsppl_grp_cd2"),
				MCItemDef.create("prsppl_grp_nm2", "prsppl_grp_nm2"),
				MCItemDef.create("prsppl_grp_cd3", "prsppl_grp_cd3"),
				MCItemDef.create("prsppl_grp_nm3", "prsppl_grp_nm3"),
				MCItemDef.create("prsppl_grp_cd4", "prsppl_grp_cd4"),
				MCItemDef.create("prsppl_grp_nm4", "prsppl_grp_nm4"),
				MCItemDef.create("prsppl_grp_cd5", "prsppl_grp_cd5"),
				MCItemDef.create("prsppl_grp_nm5", "prsppl_grp_nm5"),
				MCItemDef.create("prsppl_grp_cd6", "prsppl_grp_cd6"),
				MCItemDef.create("prsppl_grp_nm6", "prsppl_grp_nm6"),
				MCItemDef.create("prsppl_grp_cd7", "prsppl_grp_cd7"),
				MCItemDef.create("prsppl_grp_nm7", "prsppl_grp_nm7"),
				MCItemDef.create("prsppl_grp_cd8", "prsppl_grp_cd8"),
				MCItemDef.create("prsppl_grp_nm8", "prsppl_grp_nm8"),
				MCItemDef.create("prsppl_grp_cd9", "prsppl_grp_cd9"),
				MCItemDef.create("prsppl_grp_nm9", "prsppl_grp_nm9"),
				MCItemDef.create("prsppl_grp_cd10", "prsppl_grp_cd10"),
				MCItemDef.create("prsppl_grp_nm10", "prsppl_grp_nm10"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("apl_dt_fr", "apl_dt_fr"),
				MCItemDef.create("apl_dt_to", "apl_dt_to"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm")
			}
			,
			MCBlockDef.create("Aprv_Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0130_Aprv_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
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
			MCBlockDef.create("Aprv_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Aprv_Upd01_INFO = new MCOperationInfo("MA", "MABSL0130", "Aprv_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Aprv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("upri_bf", "upri_bf"),
				MCItemDef.create("sub_upri1", "sub_upri1"),
				MCItemDef.create("sub_upri2", "sub_upri2"),
				MCItemDef.create("sub_upri3", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Aprv_Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0130_Aprv_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo")
			}
			,
			MCBlockDef.create("Aprv_Upd01_Dtl2")
		);
	}


	public static MCContainerDef MA_MABSL0130_Aprv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no")
			}
			,
			MCBlockDef.create("Aprv_Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_Aprv_Del01_INFO = new MCOperationInfo("MA", "MABSL0130", "Aprv_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_Aprv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "Aprv_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Aprv_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0130_AprvAfter_Upd01_INFO = new MCOperationInfo("MA", "MABSL0130", "AprvAfter_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0130_AprvAfter_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0130", "AprvAfter_Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("last_aprv_usr_cd", "last_aprv_usr_cd"),
				MCItemDef.create("last_aprv_tm", "last_aprv_tm"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("AprvAfter_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

