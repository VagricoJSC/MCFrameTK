package mcframe.serverMSBC.MSBCL6120;

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
 * [MSBCL_OutSrcInstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Sprt01.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk01.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk01.UP.BLOCK1")){
			return MS_MSBCL6120_OutSrcInst_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk02.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk02.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk03.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Chk03.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd01.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd02.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd03.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6120.OutSrcInst_Upd04.UP.BLOCK0")){
			return MS_MSBCL6120_OutSrcInst_Upd04_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("grp_no", "grp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("proc_upri_typ", "proc_upri_typ"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("itmdtl_base_dt", "itmdtl_base_dt"),
				MCItemDef.create("not_add_up_qty_flg", "not_add_up_qty_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt")
			}
			,
			MCBlockDef.create("OutSrcInst_Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk01_PoD")
		);
	}

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk01_SchdPoD")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk01_PoD")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Chk02_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("re_arr_mfg_inst_no", "re_arr_mfg_inst_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("old_base_unit_qty", "old_base_unit_qty"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk02_ReArr")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk02_ReArr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Chk03_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("base_unit_abort_qty", "base_unit_abort_qty"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk03_ArrAbort")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OutSrcInst_Chk03_ArrAbort")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_dt", "po_dt")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd01_PoD")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd01_PoD")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("org_mfg_inst_no", "org_mfg_inst_no"),
				MCItemDef.create("re_arr_mfg_inst_no", "re_arr_mfg_inst_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd02_ReArr")
		);
	}


	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("re_arr_mfg_inst_no", "re_arr_mfg_inst_no"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd02_ReArr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd03",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd03_ArrAbort")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6120_OutSrcInst_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6120", "OutSrcInst_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6120_OutSrcInst_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6120", "OutSrcInst_Upd04",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no")
			}
			,
			MCBlockDef.create("OutSrcInst_Upd04_ArrAbort")
		);
	}


	//FMCB DEF_CLASSES END
}

