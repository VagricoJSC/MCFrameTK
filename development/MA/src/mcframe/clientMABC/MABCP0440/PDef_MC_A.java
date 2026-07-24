package mcframe.clientMABC.MABCP0440;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_SttlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0440.Srch01.UP.BLOCK0")){
			return MA_MABCL0440_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0440.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0440_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0440.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0440_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0440.Upd01.UP.BLOCK0")){
			return MA_MABCL0440_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0440.Upd01.UP.BLOCK1")){
			return MA_MABCL0440_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0440.Del01.UP.BLOCK0")){
			return MA_MABCL0440_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL0440_Srch01_INFO = new MCOperationInfo("MA", "MABCL0440", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0440_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm_lcl"),
				MCItemDef.create("ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0440_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm_lcl", "sttl_nm_lcl"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("ar_sttl_flg", "ar_sttl_flg"),
				MCItemDef.create("ap_sttl_flg", "ap_sttl_flg"),
				MCItemDef.create("ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("ar_sttl_typ_nm", "ar_sttl_typ_nm"),
				MCItemDef.create("rcv_reg_typ", "rcv_reg_typ"),
				MCItemDef.create("rcv_reg_typ_nm", "rcv_reg_typ_nm"),
				MCItemDef.create("sls_purc_typ", "sls_purc_typ"),
				MCItemDef.create("sls_purc_typ_nm", "sls_purc_typ_nm"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("ar_setoff_cd", "ar_setoff_cd"),
				MCItemDef.create("ar_setoff_nm", "ar_setoff_nm"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_typ_nm", "debt_cred_id_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("ap_setoff_act_flg", "ap_setoff_act_flg"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
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
	public static MCContainerDef MA_MABCL0440_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL0440_Upd01_INFO = new MCOperationInfo("MA", "MABCL0440", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0440_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("ar_sttl_flg", "ar_sttl_flg"),
				MCItemDef.create("ap_sttl_flg", "ap_sttl_flg"),
				MCItemDef.create("ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("rcv_reg_typ", "rcv_reg_typ"),
				MCItemDef.create("sls_purc_typ", "sls_purc_typ"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("ar_setoff_cd", "ar_setoff_cd"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_act_flg", "ap_setoff_act_flg"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
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

	public static MCContainerDef MA_MABCL0440_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL0440_Del01_INFO = new MCOperationInfo("MA", "MABCL0440", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0440_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0440", "Del01",
			new MCItemDef[]{
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

