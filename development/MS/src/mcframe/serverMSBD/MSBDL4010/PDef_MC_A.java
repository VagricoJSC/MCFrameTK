package mcframe.serverMSBD.MSBDL4010;

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
 * [MSBDL_PoCrctRsnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL4010.PoCrctRsn_UpdChk01.UP.BLOCK0")){
			return MS_MSBDL4010_PoCrctRsn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.PoCrctRsn_Upd01.UP.BLOCK0")){
			return MS_MSBDL4010_PoCrctRsn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.PoCrctRsn_DelChk01.UP.BLOCK0")){
			return MS_MSBDL4010_PoCrctRsn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.PoCrctRsn_Del01.UP.BLOCK0")){
			return MS_MSBDL4010_PoCrctRsn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.Srch01.UP.BLOCK0")){
			return MS_MSBDL4010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL4010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.Upd01.UP.BLOCK0")){
			return MS_MSBDL4010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL4010.Del01.UP.BLOCK0")){
			return MS_MSBDL4010_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBDL4010_PoCrctRsn_UpdChk01_INFO = new MCOperationInfo("MS", "MSBDL4010", "PoCrctRsn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_PoCrctRsn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "PoCrctRsn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("po_crct_rsn_nm", "po_crct_rsn_nm"),
				MCItemDef.create("po_crct_rsn_rmrks", "po_crct_rsn_rmrks"),
				MCItemDef.create("upri_mod_typ", "upri_mod_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PoCrctRsn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_PoCrctRsn_Upd01_INFO = new MCOperationInfo("MS", "MSBDL4010", "PoCrctRsn_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_PoCrctRsn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "PoCrctRsn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("po_crct_rsn_nm", "po_crct_rsn_nm"),
				MCItemDef.create("po_crct_rsn_rmrks", "po_crct_rsn_rmrks"),
				MCItemDef.create("upri_mod_typ", "upri_mod_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PoCrctRsn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_PoCrctRsn_DelChk01_INFO = new MCOperationInfo("MS", "MSBDL4010", "PoCrctRsn_DelChk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_PoCrctRsn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "PoCrctRsn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PoCrctRsn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_PoCrctRsn_Del01_INFO = new MCOperationInfo("MS", "MSBDL4010", "PoCrctRsn_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_PoCrctRsn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "PoCrctRsn_Del01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PoCrctRsn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_Srch01_INFO = new MCOperationInfo("MS", "MSBDL4010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("po_crct_rsn_nm", "po_crct_rsn_nm"),
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


	public static MCContainerDef MS_MSBDL4010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("po_crct_rsn_nm", "po_crct_rsn_nm"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("po_crct_rsn_rmrks", "po_crct_rsn_rmrks"),
				MCItemDef.create("upri_mod_typ", "upri_mod_typ"),
				MCItemDef.create("upri_mod_typ_nm", "upri_mod_typ_nm"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_Upd01_INFO = new MCOperationInfo("MS", "MSBDL4010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("po_crct_rsn_nm", "po_crct_rsn_nm"),
				MCItemDef.create("po_crct_rsn_rmrks", "po_crct_rsn_rmrks"),
				MCItemDef.create("upri_mod_typ", "upri_mod_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL4010_Del01_INFO = new MCOperationInfo("MS", "MSBDL4010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL4010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL4010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_crct_rsn_cd", "po_crct_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

