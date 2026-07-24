package mcframe.serverMBBA.MBBAL5010;

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
 * [MBBAL_AprvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBAL5010.Aprv_Chk01.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk01.DOWN.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Upd01.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Upd01.DOWN.BLOCK0")){
			return MB_MBBAL5010_Aprv_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk02.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk02.DOWN.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Upd02.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk03.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk03.DOWN.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Upd03.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk04.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Chk04.DOWN.BLOCK0")){
			return MB_MBBAL5010_Aprv_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBAL5010.Aprv_Del01.UP.BLOCK0")){
			return MB_MBBAL5010_Aprv_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Chk01_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("biz_usr_cd", "biz_usr_cd"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Aprv_Chk01_Rslt1")
		);
	}


	public static MCContainerDef MB_MBBAL5010_Aprv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Aprv_Chk01_Rslt1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Upd01_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("biz_usr_cd", "biz_usr_cd"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Aprv_Upd01_Cnd1")
		);
	}


	public static MCContainerDef MB_MBBAL5010_Aprv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_flg", "aprv_flg")
			}
			,
			MCBlockDef.create("Aprv_Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Chk02_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Chk02", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Aprv_Chk02_Rslt1")
		);
	}


	public static MCContainerDef MB_MBBAL5010_Aprv_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Aprv_Chk02_Rslt1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Upd02_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Upd02", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Upd02",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no")
			}
			,
			MCBlockDef.create("Aprv_Upd02_Cnd1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Chk03_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Chk03", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk03",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Aprv_Chk03_Rslt1")
		);
	}


	public static MCContainerDef MB_MBBAL5010_Aprv_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk03",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Aprv_Chk03_Rslt1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Upd03_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Upd03", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Upd03",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no")
			}
			,
			MCBlockDef.create("Aprv_Upd03_Cnd1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Chk04_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Chk04", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk04",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Aprv_Chk04_Rslt1")
		);
	}


	public static MCContainerDef MB_MBBAL5010_Aprv_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Aprv_Chk04_Rslt1")
		);
	}
	
	static final MCOperationInfo MB_MBBAL5010_Aprv_Del01_INFO = new MCOperationInfo("MB", "MBBAL5010", "Aprv_Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBAL5010_Aprv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBAL5010", "Aprv_Del01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no")
			}
			,
			MCBlockDef.create("Aprv_Del01_Cnd1")
		);
	}


	//FMCB DEF_CLASSES END
}

