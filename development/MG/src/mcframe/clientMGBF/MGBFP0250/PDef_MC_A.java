package mcframe.clientMGBF.MGBFP0250;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBFP_CostIoListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0250.Srch01.UP.BLOCK0")){
			return MG_MGBFL0250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0250.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0250.Upd01.UP.BLOCK0")){
			return MG_MGBFL0250_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0250.Del01.UP.BLOCK0")){
			return MG_MGBFL0250_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0250.Del01.DOWN.BLOCK0")){
			return MG_MGBFL0250_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBFL0250_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0250", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0250_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no_p" + ".calc_no", "calc_no"),
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("cost_io_nm", "cost_io_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("unmake_flg", "unmake_flg"),
				MCItemDef.create("made_flg", "made_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0250_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("made_flg", "made_flg"),
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("cost_io_nm", "cost_io_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("prod_flg", "prod_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("other_flg", "other_flg"),
				MCItemDef.create("in_flg", "in_flg"),
				MCItemDef.create("out_flg", "out_flg"),
				MCItemDef.create("auto_flg", "auto_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0250_Upd01_INFO = new MCOperationInfo("MG", "MGBFL0250", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0250_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0250", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("cost_io_id", "cost_io_id")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0250_Del01_INFO = new MCOperationInfo("MG", "MGBFL0250", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0250_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0250", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("cost_io_id", "cost_io_id")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBFL0250_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0250", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

