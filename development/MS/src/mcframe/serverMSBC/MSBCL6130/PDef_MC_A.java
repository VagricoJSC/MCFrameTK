package mcframe.serverMSBC.MSBCL6130;

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
 * [MSBCL_OutSrcActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6130.OutSrcAct_Chk01.UP.BLOCK0")){
			return MS_MSBCL6130_OutSrcAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6130.OutSrcAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6130_OutSrcAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6130.OutSrcAct_Upd01.UP.BLOCK0")){
			return MS_MSBCL6130_OutSrcAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6130.OutSrcAct_Sprt02.UP.BLOCK0")){
			return MS_MSBCL6130_OutSrcAct_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6130.OutSrcAct_Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL6130_OutSrcAct_Sprt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL6130_OutSrcAct_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6130", "OutSrcAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6130_OutSrcAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6130", "OutSrcAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd_abort_flg", "arr_schd_abort_flg"),
				MCItemDef.create("arr_schd_abort_can_flg", "arr_schd_abort_can_flg"),
				MCItemDef.create("st_act_dt", "st_act_dt")
			}
			,
			MCBlockDef.create("OutSrcAct_Chk01_ActD")
		);
	}


	public static MCContainerDef MS_MSBCL6130_OutSrcAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6130", "OutSrcAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OutSrcAct_Chk01_ActD")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6130_OutSrcAct_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6130", "OutSrcAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6130_OutSrcAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6130", "OutSrcAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("OutSrcAct_Upd01_ActD")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6130_OutSrcAct_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL6130", "OutSrcAct_Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6130_OutSrcAct_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6130", "OutSrcAct_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no")
			}
			,
			MCBlockDef.create("OutSrcAct_Sprt02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL6130_OutSrcAct_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6130", "OutSrcAct_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("OutSrcAct_Sprt02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

