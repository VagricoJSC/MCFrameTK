package mcframe.serverMSBB.MSBBL6220;

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
 * [MSBBL_SlsSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd01.UP.BLOCK0")){
			return MS_MSBBL6220_Sls_Schd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd02.UP.BLOCK0")){
			return MS_MSBBL6220_Sls_Schd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd02.UP.BLOCK1")){
			return MS_MSBBL6220_Sls_Schd_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd03.UP.BLOCK0")){
			return MS_MSBBL6220_Sls_Schd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd04.UP.BLOCK0")){
			return MS_MSBBL6220_Sls_Schd_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd05.UP.BLOCK0")){
			return MS_MSBBL6220_Sls_Schd_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6220.Sls_Schd_Upd05.UP.BLOCK1")){
			return MS_MSBBL6220_Sls_Schd_Upd05_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBBL6220_Sls_Schd_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6220", "Sls_Schd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_schd_src_typ", "sls_schd_src_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6220_Sls_Schd_Upd02_INFO = new MCOperationInfo("MS", "MSBBL6220", "Sls_Schd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd02_ShipAct")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6220_Sls_Schd_Upd03_INFO = new MCOperationInfo("MS", "MSBBL6220", "Sls_Schd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_schd_no", "sls_schd_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_sls_qty", "base_unit_sls_qty"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("manual_upd_flg", "manual_upd_flg")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6220_Sls_Schd_Upd04_INFO = new MCOperationInfo("MS", "MSBBL6220", "Sls_Schd_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("sls_schd_src_typ", "sls_schd_src_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("inst_po_flg", "inst_po_flg"),
				MCItemDef.create("sls_purc_sync_flg", "sls_purc_sync_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6220_Sls_Schd_Upd05_INFO = new MCOperationInfo("MS", "MSBBL6220", "Sls_Schd_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd05",
			new MCItemDef[]{
				MCItemDef.create("sls_schd_src_typ", "sls_schd_src_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_act_flg", "ship_act_flg"),
				MCItemDef.create("sls_ret_flg", "sls_ret_flg"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd05_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6220_Sls_Schd_Upd05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6220", "Sls_Schd_Upd05",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("iv_ship_act_d_no", "iv_ship_act_d_no")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd05_IVAct")
		);
	}


	//FMCB DEF_CLASSES END
}

