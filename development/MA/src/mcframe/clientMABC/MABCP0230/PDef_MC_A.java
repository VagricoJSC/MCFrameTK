package mcframe.clientMABC.MABCP0230;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_CalWkTimeSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0230.Srch01.UP.BLOCK0")){
			return MA_MABCL0230_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0230.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0230_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0230.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0230_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0230.Upd01.UP.BLOCK0")){
			return MA_MABCL0230_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABCL0230_Srch01_INFO = new MCOperationInfo("MA", "MABCL0230", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0230_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("year", "year")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0230_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sun_off_flg", "sun_off_flg"),
				MCItemDef.create("mon_off_flg", "mon_off_flg"),
				MCItemDef.create("tue_off_flg", "tue_off_flg"),
				MCItemDef.create("wed_off_flg", "wed_off_flg"),
				MCItemDef.create("thu_off_flg", "thu_off_flg"),
				MCItemDef.create("fri_off_flg", "fri_off_flg"),
				MCItemDef.create("sat_off_flg", "sat_off_flg")
			}
			,
			MCBlockDef.create("WkCal")
		);
	}
	public static MCContainerDef MA_MABCL0230_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("off_flg", "off_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCalExt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0230_Upd01_INFO = new MCOperationInfo("MA", "MABCL0230", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0230_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("off_flg", "off_flg"),
				MCItemDef.create("cal_ext", "cal_ext"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RegCalExt")
		);
	}


	//FMCB DEF_CLASSES END
}

