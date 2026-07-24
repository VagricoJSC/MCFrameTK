package mcframe.serverMABC.MABCL0032;

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
 * [MABCL_MultiReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0032.BankAc_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_BankAc_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.BankAc_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_BankAc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.BankAcLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_BankAcLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.BankAcLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_BankAcLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.BankAc_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_BankAc_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.BankAc_Del01.UP.BLOCK0")){
			return MA_MABCL0032_BankAc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Xrate_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_Xrate_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Xrate_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_Xrate_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.XrateLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_XrateLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.XrateLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_XrateLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Xrate_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_Xrate_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Xrate_Del01.UP.BLOCK0")){
			return MA_MABCL0032_Xrate_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBase_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_CalBase_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBase_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_CalBase_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBaseLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_CalBaseLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBaseLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_CalBaseLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBase_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_CalBase_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.CalBase_Del01.UP.BLOCK0")){
			return MA_MABCL0032_CalBase_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnlLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnlLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnlLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnlLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnl_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnl_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.ItmJnl_Del01.UP.BLOCK0")){
			return MA_MABCL0032_ItmJnl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcItmGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0032_AcItmGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsn_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AcRsn_Del01.UP.BLOCK0")){
			return MA_MABCL0032_AcRsn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Site_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_Site_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Site_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_Site_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.SiteLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_SiteLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.SiteLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_SiteLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Site_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_Site_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.Site_Del01.UP.BLOCK0")){
			return MA_MABCL0032_Site_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LocGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0032_LocGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.LgGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0032_LgGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0032.AllocGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0032_AllocGrp_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																																																												
	
	static final MCOperationInfo MA_MABCL0032_BankAc_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAc_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAc_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAc_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("ext_flg", "ext_flg"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("bank_ac_typ", "bank_ac_typ"),
				MCItemDef.create("bank_ac_holder", "bank_ac_holder"),
				MCItemDef.create("bank_ac_holder_sub", "bank_ac_holder_sub"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAc_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_BankAc_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("ext_flg", "ext_flg"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("bank_ac_typ", "bank_ac_typ"),
				MCItemDef.create("bank_ac_holder", "bank_ac_holder"),
				MCItemDef.create("bank_ac_holder_sub", "bank_ac_holder_sub"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAc_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_BankAcLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAcLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAcLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAcLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAcLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_BankAcLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAcLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAcLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAcLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAcLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_BankAc_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAc_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAc_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAc_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAc_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_BankAc_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "BankAc_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_BankAc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "BankAc_Del01",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankAc_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Xrate_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "Xrate_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Xrate_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Xrate_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Xrate_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Xrate_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "Xrate_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Xrate_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Xrate_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Xrate_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_XrateLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "XrateLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_XrateLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "XrateLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XrateLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_XrateLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "XrateLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_XrateLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "XrateLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XrateLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Xrate_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "Xrate_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Xrate_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Xrate_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Xrate_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Xrate_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "Xrate_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Xrate_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Xrate_Del01",
			new MCItemDef[]{
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Xrate_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBase_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBase_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBase_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBase_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBase_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBase_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBase_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBase_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBase_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBase_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBaseLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBaseLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBaseLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBaseLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBaseLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBaseLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBaseLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBaseLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBaseLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBaseLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBase_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBase_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBase_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBase_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBase_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_CalBase_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "CalBase_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_CalBase_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "CalBase_Del01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalBase_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnlLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnlLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnlLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnlLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnlLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnlLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnlLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnlLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnlLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnlLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnl_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnl_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnl_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnl_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnl_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_ItmJnl_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "ItmJnl_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_ItmJnl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "ItmJnl_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmJnl_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("ac_itm_grp_nm", "ac_itm_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("ac_itm_grp_nm", "ac_itm_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_itm_grp_nm", "ac_itm_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_itm_grp_nm", "ac_itm_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcItmGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcItmGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcItmGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcItmGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcItmGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ac_invalid_flg", "ac_invalid_flg"),
				MCItemDef.create("cost_invalid_flg", "cost_invalid_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ac_invalid_flg", "ac_invalid_flg"),
				MCItemDef.create("cost_invalid_flg", "cost_invalid_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AcRsn_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "AcRsn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AcRsn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AcRsn_Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AcRsn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Site_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "Site_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Site_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Site_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("arr_flg", "arr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("def_loc_grp_cd", "def_loc_grp_cd"),
				MCItemDef.create("def_alloc_grp_cd", "def_alloc_grp_cd"),
				MCItemDef.create("def_lg_grp_cd", "def_lg_grp_cd"),
				MCItemDef.create("def_cal_cd", "def_cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Site_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Site_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "Site_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Site_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Site_Upd01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("arr_flg", "arr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("def_loc_grp_cd", "def_loc_grp_cd"),
				MCItemDef.create("def_alloc_grp_cd", "def_alloc_grp_cd"),
				MCItemDef.create("def_lg_grp_cd", "def_lg_grp_cd"),
				MCItemDef.create("def_cal_cd", "def_cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Site_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_SiteLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "SiteLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_SiteLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "SiteLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_SiteLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "SiteLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_SiteLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "SiteLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Site_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "Site_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Site_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Site_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Site_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_Site_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "Site_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_Site_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "Site_Del01",
			new MCItemDef[]{
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Site_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LocGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "LocGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LocGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LocGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_slip_flg", "ship_slip_flg"),
				MCItemDef.create("pick_list_flg", "pick_list_flg"),
				MCItemDef.create("ship_inst_flg", "ship_inst_flg"),
				MCItemDef.create("ship_slip_act_flg", "ship_slip_act_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("gi_minus_stk_chk_flg", "gi_minus_stk_chk_flg"),
				MCItemDef.create("ship_loc_prio_flg", "ship_loc_prio_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_slip_flg", "ship_slip_flg"),
				MCItemDef.create("pick_list_flg", "pick_list_flg"),
				MCItemDef.create("ship_inst_flg", "ship_inst_flg"),
				MCItemDef.create("ship_slip_act_flg", "ship_slip_act_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("gi_minus_stk_chk_flg", "gi_minus_stk_chk_flg"),
				MCItemDef.create("ship_loc_prio_flg", "ship_loc_prio_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_LgGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "LgGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_LgGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "LgGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LgGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0032_AllocGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0032", "AllocGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0032_AllocGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0032", "AllocGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocGrp_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

