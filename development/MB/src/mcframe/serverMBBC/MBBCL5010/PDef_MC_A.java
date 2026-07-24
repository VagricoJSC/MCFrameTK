package mcframe.serverMBBC.MBBCL5010;

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
 * [MBBCL_EdiCsvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBCL5010.EdiCsv_Chk01.UP.BLOCK0")){
			return MB_MBBCL5010_EdiCsv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5010.EdiCsv_Chk01.UP.BLOCK1")){
			return MB_MBBCL5010_EdiCsv_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBCL5010.EdiCsv_Chk01.DOWN.BLOCK0")){
			return MB_MBBCL5010_EdiCsv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5010.EdiCsv_Chk01.DOWN.BLOCK1")){
			return MB_MBBCL5010_EdiCsv_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MB.MBBCL5010.EdiCsv_Prnt01.UP.BLOCK0")){
			return MB_MBBCL5010_EdiCsv_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5010.EdiCsv_Prnt01.UP.BLOCK1")){
			return MB_MBBCL5010_EdiCsv_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBCL5010_EdiCsv_Chk01_INFO = new MCOperationInfo("MB", "MBBCL5010", "EdiCsv_Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5010_EdiCsv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Chk01_Dtl1")
		);
	}

	public static MCContainerDef MB_MBBCL5010_EdiCsv_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Chk01_Dtl2")
		);
	}


	public static MCContainerDef MB_MBBCL5010_EdiCsv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Chk01_Dtl1")
		);
	}
	public static MCContainerDef MB_MBBCL5010_EdiCsv_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5010_EdiCsv_Prnt01_INFO = new MCOperationInfo("MB", "MBBCL5010", "EdiCsv_Prnt01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5010_EdiCsv_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Prnt01_Dtl1")
		);
	}

	public static MCContainerDef MB_MBBCL5010_EdiCsv_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5010", "EdiCsv_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10")
			}
			,
			MCBlockDef.create("EdiCsv_Prnt01_Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

