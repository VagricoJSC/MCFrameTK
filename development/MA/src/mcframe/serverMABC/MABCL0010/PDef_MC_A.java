package mcframe.serverMABC.MABCL0010;

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
 * [MABCL_MstCtlSet]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0010.MstCtl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0010_MstCtl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0010.MstCtl_Upd01.UP.BLOCK0")){
			return MA_MABCL0010_MstCtl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0010.Srch01.UP.BLOCK0")){
			return MA_MABCL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0010.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0010.Upd01.UP.BLOCK0")){
			return MA_MABCL0010_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0010_MstCtl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0010", "MstCtl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0010_MstCtl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0010", "MstCtl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_set_typ", "mst_set_typ"),
				MCItemDef.create("lcl_flg", "lcl_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("MstCtl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0010_MstCtl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0010", "MstCtl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0010_MstCtl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0010", "MstCtl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_set_typ", "mst_set_typ"),
				MCItemDef.create("lcl_flg", "lcl_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("MstCtl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0010_Srch01_INFO = new MCOperationInfo("MA", "MABCL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_nm_nm", "mst_nm_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("match_typ1", "match_typ1")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_nm_nm", "mst_nm_nm"),
				MCItemDef.create("mst_set_typ", "mst_set_typ"),
				MCItemDef.create("mst_set_typ_nm", "mst_set_typ_nm"),
				MCItemDef.create("lcl_flg", "lcl_flg"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL0010_Upd01_INFO = new MCOperationInfo("MA", "MABCL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_set_typ", "mst_set_typ"),
				MCItemDef.create("lcl_flg", "lcl_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

