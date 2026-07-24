package mcframe.serverMSBE.MSBEL1760;

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
 * [MSBEL_ExActListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1760.Srch01.UP.BLOCK0")){
			return MS_MSBEL1760_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1760_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1760_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1760.Chk01.UP.BLOCK0")){
			return MS_MSBEL1760_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Chk01.UP.BLOCK1")){
			return MS_MSBEL1760_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1760.Chk01.UP.BLOCK2")){
			return MS_MSBEL1760_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1760.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1760_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Upd01.UP.BLOCK0")){
			return MS_MSBEL1760_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Upd01.UP.BLOCK1")){
			return MS_MSBEL1760_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1760.Upd01.UP.BLOCK2")){
			return MS_MSBEL1760_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1760.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1760_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Del01.UP.BLOCK0")){
			return MS_MSBEL1760_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1760.Del01.UP.BLOCK1")){
			return MS_MSBEL1760_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1760.Del01.DOWN.BLOCK0")){
			return MS_MSBEL1760_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL1760_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1760", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1760_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("is_crt", "is_crt"),
				MCItemDef.create("is_upd_del", "is_upd_del"),
				MCItemDef.create("is_ref", "is_ref"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("cmpl_schd_dt_fr", "cmpl_schd_dt_fr"),
				MCItemDef.create("cmpl_schd_dt_to", "cmpl_schd_dt_to"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("rqst_grp_flg1", "rqst_grp_flg1"),
				MCItemDef.create("rqst_grp_cd1", "rqst_grp_cd1"),
				MCItemDef.create("rqst_grp_nm1", "rqst_grp_nm1"),
				MCItemDef.create("rqst_grp_flg2", "rqst_grp_flg2"),
				MCItemDef.create("rqst_grp_cd2", "rqst_grp_cd2"),
				MCItemDef.create("rqst_grp_nm2", "rqst_grp_nm2"),
				MCItemDef.create("rqst_grp_flg3", "rqst_grp_flg3"),
				MCItemDef.create("rqst_grp_cd3", "rqst_grp_cd3"),
				MCItemDef.create("rqst_grp_nm3", "rqst_grp_nm3"),
				MCItemDef.create("rqst_grp_flg4", "rqst_grp_flg4"),
				MCItemDef.create("rqst_grp_cd4", "rqst_grp_cd4"),
				MCItemDef.create("rqst_grp_nm4", "rqst_grp_nm4"),
				MCItemDef.create("rqst_grp_flg5", "rqst_grp_flg5"),
				MCItemDef.create("rqst_grp_cd5", "rqst_grp_cd5"),
				MCItemDef.create("rqst_grp_nm5", "rqst_grp_nm5"),
				MCItemDef.create("rqst_grp_flg6", "rqst_grp_flg6"),
				MCItemDef.create("rqst_grp_cd6", "rqst_grp_cd6"),
				MCItemDef.create("rqst_grp_nm6", "rqst_grp_nm6"),
				MCItemDef.create("rqst_grp_flg7", "rqst_grp_flg7"),
				MCItemDef.create("rqst_grp_cd7", "rqst_grp_cd7"),
				MCItemDef.create("rqst_grp_nm7", "rqst_grp_nm7"),
				MCItemDef.create("rqst_grp_flg8", "rqst_grp_flg8"),
				MCItemDef.create("rqst_grp_cd8", "rqst_grp_cd8"),
				MCItemDef.create("rqst_grp_nm8", "rqst_grp_nm8"),
				MCItemDef.create("rqst_grp_flg9", "rqst_grp_flg9"),
				MCItemDef.create("rqst_grp_cd9", "rqst_grp_cd9"),
				MCItemDef.create("rqst_grp_nm9", "rqst_grp_nm9"),
				MCItemDef.create("rqst_grp_flg10", "rqst_grp_flg10"),
				MCItemDef.create("rqst_grp_cd10", "rqst_grp_cd10"),
				MCItemDef.create("rqst_grp_nm10", "rqst_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1760_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("ttl_iv_amt", "ttl_iv_amt"),
				MCItemDef.create("ttl_ncv_amt", "ttl_ncv_amt"),
				MCItemDef.create("ttl_base_amt", "ttl_base_amt"),
				MCItemDef.create("ttl_freight_amt", "ttl_freight_amt"),
				MCItemDef.create("ttl_insurance_amt", "ttl_insurance_amt"),
				MCItemDef.create("ttl_other_amt", "ttl_other_amt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL1760_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_ShipPrCnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1760_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1760", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1760_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1760_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1760_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_ShipPrCnt")
		);
	}


	public static MCContainerDef MS_MSBEL1760_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1760_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1760", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1760_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1760_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1760_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_ShipPrCnt")
		);
	}


	public static MCContainerDef MS_MSBEL1760_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1760_Del01_INFO = new MCOperationInfo("MS", "MSBEL1760", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1760_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1760_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_ShipPrCnt")
		);
	}


	public static MCContainerDef MS_MSBEL1760_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1760", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

