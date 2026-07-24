package mcframe.clientMBBB.MBBBP0400;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBBP_CopyMaster]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0400.Upd01.UP.BLOCK0")){
			return MB_MBBBL0400_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL0400_Upd01_INFO = new MCOperationInfo("MB", "MBBBL0400", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0400_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("master_imp_typ", "master_imp_typ"),
				MCItemDef.create("account_flg", "account_flg"),
				MCItemDef.create("sub_account_flg", "sub_account_flg"),
				MCItemDef.create("ac_dpt_flg", "ac_dpt_flg"),
				MCItemDef.create("bac_ac_flg", "bac_ac_flg"),
				MCItemDef.create("bank_flg", "bank_flg"),
				MCItemDef.create("bank_branch_flg", "bank_branch_flg"),
				MCItemDef.create("bank_ac_flg", "bank_ac_flg"),
				MCItemDef.create("cur_xrate_flg", "cur_xrate_flg"),
				MCItemDef.create("ac_tax_flg", "ac_tax_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

