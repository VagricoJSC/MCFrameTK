package mcframe.serverMSBE.MSBEL5710;

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
 * [MSBEL_ExActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5710.ExAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL5710_ExAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL5710_ExAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Del01.UP.BLOCK0")){
			return MS_MSBEL5710_ExAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Upd02.UP.BLOCK0")){
			return MS_MSBEL5710_ExAct_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5710_ExAct_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Chk02.UP.BLOCK0")){
			return MS_MSBEL5710_ExAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5710.ExAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5710_ExAct_Chk02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL5710_ExAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5710", "ExAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5710_ExAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("ExAct_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5710_ExAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks")
			}
			,
			MCBlockDef.create("ExAct_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5710_ExAct_Del01_INFO = new MCOperationInfo("MS", "MSBEL5710", "ExAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5710_ExAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("ExAct_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5710_ExAct_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5710", "ExAct_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5710_ExAct_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg")
			}
			,
			MCBlockDef.create("ExAct_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5710_ExAct_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ExAct_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5710_ExAct_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5710", "ExAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5710_ExAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg")
			}
			,
			MCBlockDef.create("ExAct_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5710_ExAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5710", "ExAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExAct_Chk02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

