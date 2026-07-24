package mcframe.serverMABC.MABCL0035;

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
		else if (id.equals("MA.MABCL0035.JnlPtnBase_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBase_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.JnlPtnBase_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBase_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.JnlPtnBaseLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBaseLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.JnlPtnBaseLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBaseLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.JnlPtnBase_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBase_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.JnlPtnBase_Del01.UP.BLOCK0")){
			return MA_MABCL0035_JnlPtnBase_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKey_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKey_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKey_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKey_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKeyLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKeyLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKeyLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKeyLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKey_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKey_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AutoJnlKey_Del01.UP.BLOCK0")){
			return MA_MABCL0035_AutoJnlKey_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.InspPtn_Del01.UP.BLOCK0")){
			return MA_MABCL0035_InspPtn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDay_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_WkDay_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDay_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_WkDay_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDayLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_WkDayLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDayLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_WkDayLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDay_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_WkDay_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.WkDay_Del01.UP.BLOCK0")){
			return MA_MABCL0035_WkDay_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTerm_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTerm_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTerm_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTerm_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTermLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTermLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTermLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTermLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTerm_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTerm_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipTerm_Del01.UP.BLOCK0")){
			return MA_MABCL0035_ShipTerm_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWk_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWk_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWk_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWk_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWkLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWkLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWkLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWkLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWk_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWk_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ShipWk_Del01.UP.BLOCK0")){
			return MA_MABCL0035_ShipWk_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.Rsrc_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_Rsrc_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.Rsrc_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_Rsrc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.RsrcLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_RsrcLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.RsrcLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_RsrcLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.Rsrc_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_Rsrc_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.Rsrc_Del01.UP.BLOCK0")){
			return MA_MABCL0035_Rsrc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.HsGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0035_HsGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.AlcPtn_Del01.UP.BLOCK0")){
			return MA_MABCL0035_AlcPtn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.CtgGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0035_CtgGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0035.ActPtn_Del01.UP.BLOCK0")){
			return MA_MABCL0035_ActPtn_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																																																																		
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBase_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBase_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBase_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBase_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBase_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBase_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBase_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBase_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBase_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBase_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBaseLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBaseLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBaseLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBaseLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBaseLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBaseLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBaseLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBaseLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBaseLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBaseLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBase_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBase_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBase_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBase_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBase_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_JnlPtnBase_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "JnlPtnBase_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_JnlPtnBase_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "JnlPtnBase_Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtnBase_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKey_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKey_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKey_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKey_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKey_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKey_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKey_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKey_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKey_Upd01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKey_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKeyLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKeyLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKeyLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKeyLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKeyLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKeyLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKeyLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKeyLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKeyLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKeyLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKey_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKey_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKey_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKey_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKey_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AutoJnlKey_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "AutoJnlKey_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AutoJnlKey_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AutoJnlKey_Del01",
			new MCItemDef[]{
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AutoJnlKey_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_InspPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "InspPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_InspPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "InspPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspPtn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDay_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDay_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDay_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDay_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDay_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDay_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDay_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDay_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDay_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDay_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDayLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDayLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDayLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDayLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDayLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDayLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDayLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDayLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDayLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDayLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDay_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDay_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDay_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDay_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDay_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_WkDay_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "WkDay_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_WkDay_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "WkDay_Del01",
			new MCItemDef[]{
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkDay_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTerm_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTerm_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTerm_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTerm_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTerm_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTerm_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTerm_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTerm_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTerm_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTerm_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTermLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTermLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTermLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTermLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTermLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTermLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTermLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTermLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTermLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTermLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTerm_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTerm_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTerm_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTerm_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTerm_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipTerm_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipTerm_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipTerm_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipTerm_Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipTerm_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWk_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWk_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWk_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWk_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWk_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWk_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWk_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWk_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWk_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWkLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWkLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWkLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWkLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWkLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWkLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWkLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWkLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWkLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWkLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWk_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWk_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWk_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWk_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWk_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ShipWk_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "ShipWk_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ShipWk_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ShipWk_Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipWk_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_Rsrc_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "Rsrc_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_Rsrc_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "Rsrc_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rsrc_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_Rsrc_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "Rsrc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_Rsrc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "Rsrc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rsrc_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_RsrcLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "RsrcLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_RsrcLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "RsrcLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RsrcLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_RsrcLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "RsrcLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_RsrcLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "RsrcLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RsrcLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_Rsrc_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "Rsrc_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_Rsrc_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "Rsrc_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rsrc_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_Rsrc_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "Rsrc_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_Rsrc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "Rsrc_Del01",
			new MCItemDef[]{
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rsrc_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("hs_grp_nm", "hs_grp_nm"),
				MCItemDef.create("hs_typ", "hs_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("hs_grp_nm", "hs_grp_nm"),
				MCItemDef.create("hs_typ", "hs_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("hs_grp_nm", "hs_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("hs_grp_nm", "hs_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_HsGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "HsGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_HsGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "HsGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("hs_grp_cd", "hs_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HsGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("alc_ptn_nm", "alc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("alc_ptn_nm", "alc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("alc_ptn_nm", "alc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("alc_ptn_nm", "alc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_AlcPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "AlcPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_AlcPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "AlcPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AlcPtn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("ctg_grp_nm", "ctg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("ctg_grp_nm", "ctg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ctg_grp_nm", "ctg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ctg_grp_nm", "ctg_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_CtgGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "CtgGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_CtgGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "CtgGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("ctg_grp_cd", "ctg_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CtgGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("act_ptn_nm", "act_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("act_ptn_nm", "act_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("act_ptn_nm", "act_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("act_ptn_nm", "act_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0035_ActPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL0035", "ActPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0035_ActPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0035", "ActPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("act_ptn_cd", "act_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ActPtn_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

