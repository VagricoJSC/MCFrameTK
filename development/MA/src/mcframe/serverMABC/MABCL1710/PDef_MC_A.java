package mcframe.serverMABC.MABCL1710;

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
 * [MABCL_ReportFileNmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1710.ReportFileNm_UpdChk01.UP.BLOCK0")){
			return MA_MABCL1710_ReportFileNm_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.ReportFileNm_Upd01.UP.BLOCK0")){
			return MA_MABCL1710_ReportFileNm_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.ReportFileNm_DelChk01.UP.BLOCK0")){
			return MA_MABCL1710_ReportFileNm_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.ReportFileNm_Del01.UP.BLOCK0")){
			return MA_MABCL1710_ReportFileNm_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.Srch01.UP.BLOCK0")){
			return MA_MABCL1710_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1710_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.Upd01.UP.BLOCK0")){
			return MA_MABCL1710_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1710.Del01.UP.BLOCK0")){
			return MA_MABCL1710_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABCL1710_ReportFileNm_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL1710", "ReportFileNm_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_ReportFileNm_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "ReportFileNm_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("rpt_nm_elm_typ1", "rpt_nm_elm_typ1"),
				MCItemDef.create("rpt_nm_elm_typ2", "rpt_nm_elm_typ2"),
				MCItemDef.create("rpt_nm_elm_typ3", "rpt_nm_elm_typ3"),
				MCItemDef.create("rpt_nm_elm_typ4", "rpt_nm_elm_typ4"),
				MCItemDef.create("rpt_nm_elm_typ5", "rpt_nm_elm_typ5"),
				MCItemDef.create("rpt_nm_elm_typ6", "rpt_nm_elm_typ6"),
				MCItemDef.create("rpt_nm_elm_typ7", "rpt_nm_elm_typ7"),
				MCItemDef.create("rpt_nm_elm_typ8", "rpt_nm_elm_typ8"),
				MCItemDef.create("rpt_nm_elm_typ9", "rpt_nm_elm_typ9"),
				MCItemDef.create("rpt_nm_elm_typ10", "rpt_nm_elm_typ10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReportFileNm_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_ReportFileNm_Upd01_INFO = new MCOperationInfo("MA", "MABCL1710", "ReportFileNm_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_ReportFileNm_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "ReportFileNm_Upd01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("rpt_nm_elm_typ1", "rpt_nm_elm_typ1"),
				MCItemDef.create("rpt_nm_elm_typ2", "rpt_nm_elm_typ2"),
				MCItemDef.create("rpt_nm_elm_typ3", "rpt_nm_elm_typ3"),
				MCItemDef.create("rpt_nm_elm_typ4", "rpt_nm_elm_typ4"),
				MCItemDef.create("rpt_nm_elm_typ5", "rpt_nm_elm_typ5"),
				MCItemDef.create("rpt_nm_elm_typ6", "rpt_nm_elm_typ6"),
				MCItemDef.create("rpt_nm_elm_typ7", "rpt_nm_elm_typ7"),
				MCItemDef.create("rpt_nm_elm_typ8", "rpt_nm_elm_typ8"),
				MCItemDef.create("rpt_nm_elm_typ9", "rpt_nm_elm_typ9"),
				MCItemDef.create("rpt_nm_elm_typ10", "rpt_nm_elm_typ10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReportFileNm_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_ReportFileNm_DelChk01_INFO = new MCOperationInfo("MA", "MABCL1710", "ReportFileNm_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_ReportFileNm_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "ReportFileNm_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReportFileNm_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_ReportFileNm_Del01_INFO = new MCOperationInfo("MA", "MABCL1710", "ReportFileNm_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_ReportFileNm_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "ReportFileNm_Del01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReportFileNm_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_Srch01_INFO = new MCOperationInfo("MA", "MABCL1710", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
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


	public static MCContainerDef MA_MABCL1710_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("biz_typ_nm", "biz_typ_nm"),
				MCItemDef.create("rpt_nm_elm_typ1", "rpt_nm_elm_typ1"),
				MCItemDef.create("rpt_nm_elm_typ_nm1", "rpt_nm_elm_typ_nm1"),
				MCItemDef.create("rpt_nm_elm_typ2", "rpt_nm_elm_typ2"),
				MCItemDef.create("rpt_nm_elm_typ_nm2", "rpt_nm_elm_typ_nm2"),
				MCItemDef.create("rpt_nm_elm_typ3", "rpt_nm_elm_typ3"),
				MCItemDef.create("rpt_nm_elm_typ_nm3", "rpt_nm_elm_typ_nm3"),
				MCItemDef.create("rpt_nm_elm_typ4", "rpt_nm_elm_typ4"),
				MCItemDef.create("rpt_nm_elm_typ_nm4", "rpt_nm_elm_typ_nm4"),
				MCItemDef.create("rpt_nm_elm_typ5", "rpt_nm_elm_typ5"),
				MCItemDef.create("rpt_nm_elm_typ_nm5", "rpt_nm_elm_typ_nm5"),
				MCItemDef.create("rpt_nm_elm_typ6", "rpt_nm_elm_typ6"),
				MCItemDef.create("rpt_nm_elm_typ_nm6", "rpt_nm_elm_typ_nm6"),
				MCItemDef.create("rpt_nm_elm_typ7", "rpt_nm_elm_typ7"),
				MCItemDef.create("rpt_nm_elm_typ_nm7", "rpt_nm_elm_typ_nm7"),
				MCItemDef.create("rpt_nm_elm_typ8", "rpt_nm_elm_typ8"),
				MCItemDef.create("rpt_nm_elm_typ_nm8", "rpt_nm_elm_typ_nm8"),
				MCItemDef.create("rpt_nm_elm_typ9", "rpt_nm_elm_typ9"),
				MCItemDef.create("rpt_nm_elm_typ_nm9", "rpt_nm_elm_typ_nm9"),
				MCItemDef.create("rpt_nm_elm_typ10", "rpt_nm_elm_typ10"),
				MCItemDef.create("rpt_nm_elm_typ_nm10", "rpt_nm_elm_typ_nm10"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_Upd01_INFO = new MCOperationInfo("MA", "MABCL1710", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("rpt_nm_elm_typ1", "rpt_nm_elm_typ1"),
				MCItemDef.create("rpt_nm_elm_typ2", "rpt_nm_elm_typ2"),
				MCItemDef.create("rpt_nm_elm_typ3", "rpt_nm_elm_typ3"),
				MCItemDef.create("rpt_nm_elm_typ4", "rpt_nm_elm_typ4"),
				MCItemDef.create("rpt_nm_elm_typ5", "rpt_nm_elm_typ5"),
				MCItemDef.create("rpt_nm_elm_typ6", "rpt_nm_elm_typ6"),
				MCItemDef.create("rpt_nm_elm_typ7", "rpt_nm_elm_typ7"),
				MCItemDef.create("rpt_nm_elm_typ8", "rpt_nm_elm_typ8"),
				MCItemDef.create("rpt_nm_elm_typ9", "rpt_nm_elm_typ9"),
				MCItemDef.create("rpt_nm_elm_typ10", "rpt_nm_elm_typ10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABCL1710_Del01_INFO = new MCOperationInfo("MA", "MABCL1710", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1710_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1710", "Del01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

