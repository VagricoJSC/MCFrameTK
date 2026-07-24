package mcframe.serverMABG.MABGL0060;

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
 * [MABGL_GrpCtgReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0060.GrpCtg_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0060_GrpCtg_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.GrpCtg_Upd01.UP.BLOCK0")){
			return MA_MABGL0060_GrpCtg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.GrpCtg_DelChk01.UP.BLOCK0")){
			return MA_MABGL0060_GrpCtg_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.GrpCtg_Del01.UP.BLOCK0")){
			return MA_MABGL0060_GrpCtg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.Srch01.UP.BLOCK0")){
			return MA_MABGL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.Upd01.UP.BLOCK0")){
			return MA_MABGL0060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0060.Del01.UP.BLOCK0")){
			return MA_MABGL0060_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABGL0060_GrpCtg_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0060", "GrpCtg_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_GrpCtg_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "GrpCtg_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("ctg_prio", "ctg_prio"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GrpCtg_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_GrpCtg_Upd01_INFO = new MCOperationInfo("MA", "MABGL0060", "GrpCtg_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_GrpCtg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "GrpCtg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("ctg_prio", "ctg_prio"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GrpCtg_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_GrpCtg_DelChk01_INFO = new MCOperationInfo("MA", "MABGL0060", "GrpCtg_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_GrpCtg_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "GrpCtg_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GrpCtg_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_GrpCtg_Del01_INFO = new MCOperationInfo("MA", "MABGL0060", "GrpCtg_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_GrpCtg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "GrpCtg_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GrpCtg_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_Srch01_INFO = new MCOperationInfo("MA", "MABGL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("ctg_prio", "ctg_prio"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_Upd01_INFO = new MCOperationInfo("MA", "MABGL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("ctg_prio", "ctg_prio"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABGL0060_Del01_INFO = new MCOperationInfo("MA", "MABGL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_ctg_typ", "calc_ctg_typ"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

