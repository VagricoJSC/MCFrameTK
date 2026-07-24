package mcframe.serverMABC.MABCL0034;

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
		else if (id.equals("MA.MABCL0034.ExCntnr_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnr_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ExCntnr_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnr_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ExCntnrLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnrLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ExCntnrLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnrLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ExCntnr_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnr_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ExCntnr_Del01.UP.BLOCK0")){
			return MA_MABCL0034_ExCntnr_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPort_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_EximPort_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPort_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_EximPort_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPortLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_EximPortLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPortLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_EximPortLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPort_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_EximPort_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.EximPort_Del01.UP.BLOCK0")){
			return MA_MABCL0034_EximPort_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGd_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_StkGd_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGd_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_StkGd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGdLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_StkGdLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGdLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_StkGdLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGd_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_StkGd_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.StkGd_Del01.UP.BLOCK0")){
			return MA_MABCL0034_StkGd_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.Trd_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_Trd_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.Trd_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_Trd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.TrdLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_TrdLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.TrdLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_TrdLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.Trd_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_Trd_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.Trd_Del01.UP.BLOCK0")){
			return MA_MABCL0034_Trd_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipForm_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_SlipForm_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipForm_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_SlipForm_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipFormLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_SlipFormLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipFormLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_SlipFormLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipForm_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_SlipForm_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.SlipForm_Del01.UP.BLOCK0")){
			return MA_MABCL0034_SlipForm_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.PfGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0034_PfGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmSpecGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0034_ItmSpecGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.ItmCompGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0034_ItmCompGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlAct_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlAct_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlAct_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_JnlAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlActLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlActLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlActLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_JnlActLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlAct_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlAct_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlAct_Del01.UP.BLOCK0")){
			return MA_MABCL0034_JnlAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0034.JnlGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0034_JnlGrp_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																																																												
	
	static final MCOperationInfo MA_MABCL0034_ExCntnr_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnr_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnr_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnr_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("wt", "wt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnr_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ExCntnr_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnr_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnr_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnr_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("wt", "wt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnr_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ExCntnrLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnrLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnrLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnrLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnrLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ExCntnrLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnrLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnrLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnrLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnrLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ExCntnr_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnr_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnr_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnr_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnr_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ExCntnr_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "ExCntnr_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ExCntnr_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ExCntnr_Del01",
			new MCItemDef[]{
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExCntnr_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPort_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPort_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPort_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPort_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("port_nm", "port_nm"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPort_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPort_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPort_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPort_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPort_Upd01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("port_nm", "port_nm"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPort_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPortLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPortLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPortLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPortLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("port_nm", "port_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPortLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPortLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPortLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPortLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPortLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("port_nm", "port_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPortLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPort_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPort_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPort_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPort_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPort_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_EximPort_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "EximPort_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_EximPort_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "EximPort_Del01",
			new MCItemDef[]{
				MCItemDef.create("port_cd", "port_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("EximPort_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGd_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGd_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGd_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGd_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("slo_flg", "slo_flg"),
				MCItemDef.create("sort_seq", "sort_seq"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGd_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGd_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGd_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("slo_flg", "slo_flg"),
				MCItemDef.create("sort_seq", "sort_seq"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGd_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGdLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGdLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGdLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGdLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGdLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGdLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGdLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGdLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGdLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGdLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGd_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGd_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGd_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGd_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGd_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_StkGd_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "StkGd_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_StkGd_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "StkGd_Del01",
			new MCItemDef[]{
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StkGd_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_Trd_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "Trd_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_Trd_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "Trd_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("auto_adopt_flg", "auto_adopt_flg"),
				MCItemDef.create("not_sls_slip_snd_flg", "not_sls_slip_snd_flg"),
				MCItemDef.create("not_purc_slip_snd_flg", "not_purc_slip_snd_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trd_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_Trd_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "Trd_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_Trd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "Trd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("auto_adopt_flg", "auto_adopt_flg"),
				MCItemDef.create("not_sls_slip_snd_flg", "not_sls_slip_snd_flg"),
				MCItemDef.create("not_purc_slip_snd_flg", "not_purc_slip_snd_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trd_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_TrdLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "TrdLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_TrdLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "TrdLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("TrdLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_TrdLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "TrdLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_TrdLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "TrdLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("TrdLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_Trd_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "Trd_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_Trd_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "Trd_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trd_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_Trd_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "Trd_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_Trd_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "Trd_Del01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trd_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipForm_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipForm_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipForm_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipForm_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("slip_form_nm", "slip_form_nm"),
				MCItemDef.create("slip_form_id", "slip_form_id"),
				MCItemDef.create("copy_slip_form_id", "copy_slip_form_id"),
				MCItemDef.create("line_num", "line_num"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipForm_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipForm_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipForm_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipForm_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipForm_Upd01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("slip_form_nm", "slip_form_nm"),
				MCItemDef.create("slip_form_id", "slip_form_id"),
				MCItemDef.create("copy_slip_form_id", "copy_slip_form_id"),
				MCItemDef.create("line_num", "line_num"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipForm_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipFormLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipFormLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipFormLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipFormLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("slip_form_nm", "slip_form_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipFormLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipFormLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipFormLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipFormLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipFormLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("slip_form_nm", "slip_form_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipFormLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipForm_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipForm_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipForm_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipForm_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipForm_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_SlipForm_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "SlipForm_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_SlipForm_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "SlipForm_Del01",
			new MCItemDef[]{
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlipForm_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("weekly_period_num", "weekly_period_num"),
				MCItemDef.create("weekly_period_st", "weekly_period_st"),
				MCItemDef.create("tendays_period_num", "tendays_period_num"),
				MCItemDef.create("tendays_period_st", "tendays_period_st"),
				MCItemDef.create("monthly_period_num", "monthly_period_num"),
				MCItemDef.create("monthly_period_st", "monthly_period_st"),
				MCItemDef.create("fix_period_num", "fix_period_num"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("weekly_period_num", "weekly_period_num"),
				MCItemDef.create("weekly_period_st", "weekly_period_st"),
				MCItemDef.create("tendays_period_num", "tendays_period_num"),
				MCItemDef.create("tendays_period_st", "tendays_period_st"),
				MCItemDef.create("monthly_period_num", "monthly_period_num"),
				MCItemDef.create("monthly_period_st", "monthly_period_st"),
				MCItemDef.create("fix_period_num", "fix_period_num"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_PfGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "PfGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_PfGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "PfGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PfGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("itm_spec_grp_nm", "itm_spec_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("itm_spec_grp_nm", "itm_spec_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_spec_grp_nm", "itm_spec_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_spec_grp_nm", "itm_spec_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmSpecGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmSpecGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmSpecGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmSpecGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_spec_grp_cd", "itm_spec_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSpecGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("itm_comp_grp_nm", "itm_comp_grp_nm"),
				MCItemDef.create("multi_sel_flg", "multi_sel_flg"),
				MCItemDef.create("req_flg", "req_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("itm_comp_grp_nm", "itm_comp_grp_nm"),
				MCItemDef.create("multi_sel_flg", "multi_sel_flg"),
				MCItemDef.create("req_flg", "req_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_comp_grp_nm", "itm_comp_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_comp_grp_nm", "itm_comp_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_ItmCompGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "ItmCompGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_ItmCompGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "ItmCompGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmCompGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlAct_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlAct_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlAct_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlAct_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("jnl_del_flg", "jnl_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlAct_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlAct_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlAct_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("jnl_del_flg", "jnl_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlAct_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlActLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlActLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlActLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlActLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlActLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlActLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlActLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlActLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlActLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlActLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlAct_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlAct_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlAct_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlAct_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlAct_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlAct_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlAct_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlAct_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("jnl_grp_nm", "jnl_grp_nm"),
				MCItemDef.create("ac_bank_flg1", "ac_bank_flg1"),
				MCItemDef.create("ac_bank_flg2", "ac_bank_flg2"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("jnl_grp_nm", "jnl_grp_nm"),
				MCItemDef.create("ac_bank_flg1", "ac_bank_flg1"),
				MCItemDef.create("ac_bank_flg2", "ac_bank_flg2"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_grp_nm", "jnl_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("jnl_grp_nm", "jnl_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0034_JnlGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0034", "JnlGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0034_JnlGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0034", "JnlGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_cd", "jnl_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlGrp_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

