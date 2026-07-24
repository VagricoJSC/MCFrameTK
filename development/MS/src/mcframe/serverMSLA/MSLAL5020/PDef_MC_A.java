package mcframe.serverMSLA.MSLAL5020;

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
 * [MSLAL_PoSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5020.PoSendIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5020_PoSendIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5020.PoSendIf_Upd01.UP.BLOCK1")){
			return MS_MSLAL5020_PoSendIf_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5020.PoSendIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5020_PoSendIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5020.PoSendIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5020_PoSendIf_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSLAL5020_PoSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5020", "PoSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5020_PoSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5020", "PoSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("bef_aprv_sts_typ", "bef_aprv_sts_typ"),
				MCItemDef.create("is_src_aprvaf_srv_flg", "is_src_aprvaf_srv_flg")
			}
			,
			MCBlockDef.create("PoSendIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5020_PoSendIf_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5020", "PoSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("PoSendIf_Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5020_PoSendIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5020", "PoSendIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5020_PoSendIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5020", "PoSendIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("PoSendIf_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5020_PoSendIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5020", "PoSendIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PoSendIf_Upd02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

