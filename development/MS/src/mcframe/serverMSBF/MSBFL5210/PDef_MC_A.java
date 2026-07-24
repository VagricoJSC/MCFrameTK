package mcframe.serverMSBF.MSBFL5210;

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
 * [MSBFL_LotService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5210.Lot_Chk01.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Chk02.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Chk03.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Chk03.DOWN.BLOCK0")){
			return MS_MSBFL5210_Lot_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Srch01.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Srch01.DOWN.BLOCK0")){
			return MS_MSBFL5210_Lot_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Srch02.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Srch02.DOWN.BLOCK0")){
			return MS_MSBFL5210_Lot_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd01.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd02.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd03.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd04.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd05.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd06.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd06.UP.BLOCK1")){
			return MS_MSBFL5210_Lot_Upd06_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd07.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Upd08.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Upd08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5210.Lot_Del01.UP.BLOCK0")){
			return MS_MSBFL5210_Lot_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
														
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("exception_flg", "exception_flg"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Lot_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5210_Lot_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Lot_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("lot_not_change_flg", "lot_not_change_flg")
			}
			,
			MCBlockDef.create("Lot_Chk02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5210_Lot_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Lot_Chk02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Chk03_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".ver_no", "ver_no")
			}
			,
			MCBlockDef.create("Lot_Chk03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5210_Lot_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_p" + ".first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_p" + ".vld_dt", "vld_dt"),
				MCItemDef.create("lot_p" + ".lot_seq", "lot_seq"),
				MCItemDef.create("lot_p" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("lot_p" + ".quality_typ", "quality_typ"),
				MCItemDef.create("lot_p" + ".mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("lot_p" + ".insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("lot_p" + ".plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("lot_p" + ".mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("lot_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Lot_Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Srch01_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("base_dt", "base_dt")
			}
			,
			MCBlockDef.create("Lot_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5210_Lot_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt")
			}
			,
			MCBlockDef.create("Lot_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Srch02_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm")
			}
			,
			MCBlockDef.create("Lot_Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5210_Lot_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt")
			}
			,
			MCBlockDef.create("Lot_Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd01",
			new MCItemDef[]{
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".schd_flg", "schd_flg"),
				MCItemDef.create("lot_p" + ".lot_sub_char1", "lot_sub_char1"),
				MCItemDef.create("lot_p" + ".lot_sub_char2", "lot_sub_char2"),
				MCItemDef.create("lot_p" + ".lot_sub_char3", "lot_sub_char3"),
				MCItemDef.create("lot_p" + ".lot_sub_char4", "lot_sub_char4"),
				MCItemDef.create("lot_p" + ".lot_sub_char5", "lot_sub_char5"),
				MCItemDef.create("lot_p" + ".lot_sub_num1", "lot_sub_num1"),
				MCItemDef.create("lot_p" + ".lot_sub_num2", "lot_sub_num2"),
				MCItemDef.create("lot_p" + ".lot_sub_num3", "lot_sub_num3"),
				MCItemDef.create("lot_p" + ".lot_sub_num4", "lot_sub_num4"),
				MCItemDef.create("lot_p" + ".lot_sub_num5", "lot_sub_num5"),
				MCItemDef.create("lot_p" + ".lot_sub_dt1", "lot_sub_dt1"),
				MCItemDef.create("lot_p" + ".lot_sub_dt2", "lot_sub_dt2"),
				MCItemDef.create("lot_p" + ".lot_sub_dt3", "lot_sub_dt3"),
				MCItemDef.create("lot_p" + ".lot_sub_dt4", "lot_sub_dt4"),
				MCItemDef.create("lot_p" + ".lot_sub_dt5", "lot_sub_dt5"),
				MCItemDef.create("lot_p" + ".lot_sub_flg1", "lot_sub_flg1"),
				MCItemDef.create("lot_p" + ".lot_sub_flg2", "lot_sub_flg2"),
				MCItemDef.create("lot_p" + ".lot_sub_flg3", "lot_sub_flg3"),
				MCItemDef.create("lot_p" + ".lot_sub_flg4", "lot_sub_flg4"),
				MCItemDef.create("lot_p" + ".lot_sub_flg5", "lot_sub_flg5")
			}
			,
			MCBlockDef.create("Lot_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd02",
			new MCItemDef[]{
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".lot_rmrks", "lot_rmrks")
			}
			,
			MCBlockDef.create("Lot_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd03_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd03",
			new MCItemDef[]{
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no")
			}
			,
			MCBlockDef.create("Lot_Upd03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd04_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd04",
			new MCItemDef[]{
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("vld_dt_flg", "vld_dt_flg"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".vld_dt", "vld_dt"),
				MCItemDef.create("lot_p" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("lot_p" + ".lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lot_p" + ".lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lot_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lot_p" + ".base_gr_dt", "base_gr_dt")
			}
			,
			MCBlockDef.create("Lot_Upd04_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd05_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd05",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("lot_p" + ".quality_typ", "quality_typ"),
				MCItemDef.create("lot_p" + ".plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("lot_p" + ".insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("lot_p" + ".mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("lot_insp_schd_flg", "lot_insp_schd_flg"),
				MCItemDef.create("insp_inst_flg", "insp_inst_flg"),
				MCItemDef.create("insp_inst_aprv_flg", "insp_inst_aprv_flg"),
				MCItemDef.create("insp_act_flg", "insp_act_flg"),
				MCItemDef.create("insp_judg_flg", "insp_judg_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("mrkt_judg_flg", "mrkt_judg_flg")
			}
			,
			MCBlockDef.create("Lot_Upd05_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd06_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd06", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_lot_no", "main_lot_no"),
				MCItemDef.create("main_sublot_no", "main_sublot_no"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm")
			}
			,
			MCBlockDef.create("Lot_Upd06_DtlChd")
		);
	}

	public static MCContainerDef MS_MSBFL5210_Lot_Upd06_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd06",
			new MCItemDef[]{
				MCItemDef.create("chd_peg_no", "chd_peg_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("gr_dt", "gr_dt"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Lot_Upd06_DtlPar")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd07_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd07", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd07",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("Lot_Upd07_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Upd08_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Upd08", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Upd08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("lot_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_p" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("site_cd", "site_cd")
			}
			,
			MCBlockDef.create("Lot_Upd08_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5210_Lot_Del01_INFO = new MCOperationInfo("MS", "MSBFL5210", "Lot_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5210_Lot_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5210", "Lot_Del01",
			new MCItemDef[]{
				MCItemDef.create("lot_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("lot_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("lot_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("lot_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Lot_Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

