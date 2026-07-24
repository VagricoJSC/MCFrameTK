package mcframe.serverMBBE.MBBEL0050;

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
 * [MBBEL_BizDatDLHstSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0050.Srch01.UP.BLOCK0")){
			return MB_MBBEL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Srch01.DOWN.BLOCK0")){
			return MB_MBBEL0050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Upd01.UP.BLOCK0")){
			return MB_MBBEL0050_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Chk01.UP.BLOCK0")){
			return MB_MBBEL0050_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Chk01.DOWN.BLOCK0")){
			return MB_MBBEL0050_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Del01.UP.BLOCK0")){
			return MB_MBBEL0050_Del01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0050.Del01.DOWN.BLOCK0")){
			return MB_MBBEL0050_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MB_MBBEL0050_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0050_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("running_flg", "running_flg"),
				MCItemDef.create("success_flg", "success_flg"),
				MCItemDef.create("download_flg", "download_flg"),
				MCItemDef.create("error_flg", "error_flg"),
				MCItemDef.create("excel_flg", "excel_flg"),
				MCItemDef.create("csv_flg", "csv_flg"),
				MCItemDef.create("report_flg", "report_flg"),
				MCItemDef.create("screen_flg", "screen_flg"),
				MCItemDef.create("proc_st_tm_fr", "proc_st_tm_fr"),
				MCItemDef.create("proc_st_tm_to", "proc_st_tm_to"),
				MCItemDef.create("proc_end_tm_fr", "proc_end_tm_fr"),
				MCItemDef.create("proc_end_tm_to", "proc_end_tm_to"),
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("dl_tm_fr", "dl_tm_fr"),
				MCItemDef.create("dl_tm_to", "dl_tm_to"),
				MCItemDef.create("dl_file_nm", "dl_file_nm"),
				MCItemDef.create("file_size_fr", "file_size_fr"),
				MCItemDef.create("file_size_to", "file_size_to"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("biz_dat_dl_cond", "biz_dat_dl_cond")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0050_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_dl_hst_no", "biz_dat_dl_hst_no"),
				MCItemDef.create("biz_dat_file_typ", "biz_dat_file_typ"),
				MCItemDef.create("biz_dat_file_typ_nm", "biz_dat_file_typ_nm"),
				MCItemDef.create("biz_dat_dl_sts_typ", "biz_dat_dl_sts_typ"),
				MCItemDef.create("biz_dat_dl_sts_typ_nm", "biz_dat_dl_sts_typ_nm"),
				MCItemDef.create("proc_st_tm", "proc_st_tm"),
				MCItemDef.create("proc_end_tm", "proc_end_tm"),
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("biz_dat_dl_cond", "biz_dat_dl_cond"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("file_bin", "file_bin"),
				MCItemDef.create("file_size", "file_size"),
				MCItemDef.create("data_cnt", "data_cnt"),
				MCItemDef.create("dl_tm", "dl_tm"),
				MCItemDef.create("dl_file_path", "dl_file_path"),
				MCItemDef.create("dl_file_nm", "dl_file_nm"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0050_Upd01_INFO = new MCOperationInfo("MB", "MBBEL0050", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0050_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_dl_hst_no", "biz_dat_dl_hst_no"),
				MCItemDef.create("dl_file_path", "dl_file_path")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0050_Chk01_INFO = new MCOperationInfo("MB", "MBBEL0050", "Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0050_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("biz_dat_dl_hst_no", "biz_dat_dl_hst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBEL0050_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("biz_dat_dl_hst_no", "biz_dat_dl_hst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0050_Del01_INFO = new MCOperationInfo("MB", "MBBEL0050", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0050_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_dl_hst_no", "biz_dat_dl_hst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBEL0050_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

