package mcframe.serverMSBE.MSBEL5700;

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
 * [MSBEL_ExIvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5700.ExIv_Upd01.UP.BLOCK0")){
			return MS_MSBEL5700_ExIv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5700.ExIv_Upd01.UP.BLOCK1")){
			return MS_MSBEL5700_ExIv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5700.ExIv_Chk01.UP.BLOCK0")){
			return MS_MSBEL5700_ExIv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5700.ExIv_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5700_ExIv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5700.ExIv_Del01.UP.BLOCK0")){
			return MS_MSBEL5700_ExIv_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL5700_ExIv_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5700", "ExIv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5700_ExIv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5700", "ExIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv" + ".iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv" + ".iv_no", "iv_no"),
				MCItemDef.create("iv" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv" + ".ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("iv" + ".ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("iv" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("iv" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("iv" + ".dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("iv" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("iv" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("iv" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("iv" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("iv" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("iv" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("iv" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("iv" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("iv" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("iv" + ".dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("iv" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("iv" + ".trnspt_cd", "trnspt_cd"),
				MCItemDef.create("iv" + ".vssl_flght", "vssl_flght"),
				MCItemDef.create("iv" + ".load_port_cd", "load_port_cd"),
				MCItemDef.create("iv" + ".etd_dt", "etd_dt"),
				MCItemDef.create("iv" + ".dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("iv" + ".eta_dt", "eta_dt"),
				MCItemDef.create("iv" + ".via_port_cd", "via_port_cd"),
				MCItemDef.create("iv" + ".via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv" + ".sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("iv" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("iv" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("iv" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("iv" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("iv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("iv" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("iv" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("iv" + ".pre_rcpt_iv_flg", "pre_rcpt_iv_flg")
			}
			,
			MCBlockDef.create("ExIv_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5700_ExIv_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5700", "ExIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks")
			}
			,
			MCBlockDef.create("ExIv_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5700_ExIv_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5700", "ExIv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5700_ExIv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5700", "ExIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no")
			}
			,
			MCBlockDef.create("ExIv_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL5700_ExIv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5700", "ExIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExIv_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5700_ExIv_Del01_INFO = new MCOperationInfo("MS", "MSBEL5700", "ExIv_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5700_ExIv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5700", "ExIv_Del01",
			new MCItemDef[]{
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no")
			}
			,
			MCBlockDef.create("ExIv_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

