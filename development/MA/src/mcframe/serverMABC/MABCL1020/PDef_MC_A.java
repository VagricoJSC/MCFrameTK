package mcframe.serverMABC.MABCL1020;

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
 * [MABCL_AccountReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1020.Account_UpdChk01.UP.BLOCK0")){
			return MA_MABCL1020_Account_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Account_Upd01.UP.BLOCK0")){
			return MA_MABCL1020_Account_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.AccountLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL1020_AccountLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.AccountLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL1020_AccountLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Account_DelChk01.UP.BLOCK0")){
			return MA_MABCL1020_Account_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Account_Del01.UP.BLOCK0")){
			return MA_MABCL1020_Account_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Srch01.UP.BLOCK0")){
			return MA_MABCL1020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Srch01.DOWN.BLOCK1")){
			return MA_MABCL1020_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL1020.Upd01.UP.BLOCK0")){
			return MA_MABCL1020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1020.Upd01.UP.BLOCK1")){
			return MA_MABCL1020_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL1020.Del01.UP.BLOCK0")){
			return MA_MABCL1020_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABCL1020_Account_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL1020", "Account_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Account_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Account_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("ac_tax_cd", "ac_tax_cd"),
				MCItemDef.create("ac_tax_typ", "ac_tax_typ"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("sum0_flg", "sum0_flg"),
				MCItemDef.create("sum1_flg", "sum1_flg"),
				MCItemDef.create("sum2_flg", "sum2_flg"),
				MCItemDef.create("sum3_flg", "sum3_flg"),
				MCItemDef.create("sum4_flg", "sum4_flg"),
				MCItemDef.create("sum5_flg", "sum5_flg"),
				MCItemDef.create("project_flg", "project_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("usr_flg", "usr_flg"),
				MCItemDef.create("bank_ac_flg", "bank_ac_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ac_typ1", "ac_typ1"),
				MCItemDef.create("ac_typ2", "ac_typ2"),
				MCItemDef.create("ac_typ3", "ac_typ3"),
				MCItemDef.create("ac_typ4", "ac_typ4"),
				MCItemDef.create("ac_typ5", "ac_typ5"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Account_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Account_Upd01_INFO = new MCOperationInfo("MA", "MABCL1020", "Account_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Account_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Account_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("ac_tax_cd", "ac_tax_cd"),
				MCItemDef.create("ac_tax_typ", "ac_tax_typ"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("sum0_flg", "sum0_flg"),
				MCItemDef.create("sum1_flg", "sum1_flg"),
				MCItemDef.create("sum2_flg", "sum2_flg"),
				MCItemDef.create("sum3_flg", "sum3_flg"),
				MCItemDef.create("sum4_flg", "sum4_flg"),
				MCItemDef.create("sum5_flg", "sum5_flg"),
				MCItemDef.create("project_flg", "project_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("usr_flg", "usr_flg"),
				MCItemDef.create("bank_ac_flg", "bank_ac_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ac_typ1", "ac_typ1"),
				MCItemDef.create("ac_typ2", "ac_typ2"),
				MCItemDef.create("ac_typ3", "ac_typ3"),
				MCItemDef.create("ac_typ4", "ac_typ4"),
				MCItemDef.create("ac_typ5", "ac_typ5"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Account_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_AccountLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL1020", "AccountLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_AccountLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "AccountLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AccountLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_AccountLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL1020", "AccountLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_AccountLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "AccountLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AccountLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Account_DelChk01_INFO = new MCOperationInfo("MA", "MABCL1020", "Account_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Account_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Account_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Account_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Account_Del01_INFO = new MCOperationInfo("MA", "MABCL1020", "Account_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Account_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Account_Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Account_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Srch01_INFO = new MCOperationInfo("MA", "MABCL1020", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm_lcl", "ac_nm_lcl"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ac_typ1", "ac_typ1"),
				MCItemDef.create("ac_typ2", "ac_typ2"),
				MCItemDef.create("ac_typ3", "ac_typ3"),
				MCItemDef.create("ac_typ4", "ac_typ4"),
				MCItemDef.create("ac_typ5", "ac_typ5"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL1020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm_lcl", "ac_nm_lcl"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2_lcl", "ac_nm2_lcl"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("dc_typ_nm", "dc_typ_nm"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("ac_typ_nm", "ac_typ_nm"),
				MCItemDef.create("ac_tax_cd", "ac_tax_cd"),
				MCItemDef.create("ac_tax_nm", "ac_tax_nm"),
				MCItemDef.create("ac_tax_typ", "ac_tax_typ"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("sum0_flg", "sum0_flg"),
				MCItemDef.create("sum1_flg", "sum1_flg"),
				MCItemDef.create("sum2_flg", "sum2_flg"),
				MCItemDef.create("sum3_flg", "sum3_flg"),
				MCItemDef.create("sum4_flg", "sum4_flg"),
				MCItemDef.create("sum5_flg", "sum5_flg"),
				MCItemDef.create("project_flg", "project_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("usr_flg", "usr_flg"),
				MCItemDef.create("bank_ac_flg", "bank_ac_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("ac_typ1", "ac_typ1"),
				MCItemDef.create("ac_typ_nm1", "ac_typ_nm1"),
				MCItemDef.create("ac_typ2", "ac_typ2"),
				MCItemDef.create("ac_typ_nm2", "ac_typ_nm2"),
				MCItemDef.create("ac_typ3", "ac_typ3"),
				MCItemDef.create("ac_typ_nm3", "ac_typ_nm3"),
				MCItemDef.create("ac_typ4", "ac_typ4"),
				MCItemDef.create("ac_typ_nm4", "ac_typ_nm4"),
				MCItemDef.create("ac_typ5", "ac_typ5"),
				MCItemDef.create("ac_typ_nm5", "ac_typ_nm5"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABCL1020_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
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
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Upd01_INFO = new MCOperationInfo("MA", "MABCL1020", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("ac_tax_cd", "ac_tax_cd"),
				MCItemDef.create("ac_tax_typ", "ac_tax_typ"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("sum0_flg", "sum0_flg"),
				MCItemDef.create("sum1_flg", "sum1_flg"),
				MCItemDef.create("sum2_flg", "sum2_flg"),
				MCItemDef.create("sum3_flg", "sum3_flg"),
				MCItemDef.create("sum4_flg", "sum4_flg"),
				MCItemDef.create("sum5_flg", "sum5_flg"),
				MCItemDef.create("project_flg", "project_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("usr_flg", "usr_flg"),
				MCItemDef.create("bank_ac_flg", "bank_ac_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ac_typ1", "ac_typ1"),
				MCItemDef.create("ac_typ2", "ac_typ2"),
				MCItemDef.create("ac_typ3", "ac_typ3"),
				MCItemDef.create("ac_typ4", "ac_typ4"),
				MCItemDef.create("ac_typ5", "ac_typ5"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL1020_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_nm2", "ac_nm2"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL1020_Del01_INFO = new MCOperationInfo("MA", "MABCL1020", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1020_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

