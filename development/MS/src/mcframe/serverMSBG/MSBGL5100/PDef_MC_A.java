package mcframe.serverMSBG.MSBGL5100;

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
 * [MSBGL_ArDtlApplService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5100.ArDtlAppl_Chk01.UP.BLOCK0")){
			return MS_MSBGL5100_ArDtlAppl_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5100.ArDtlAppl_Chk01.DOWN.BLOCK0")){
			return MS_MSBGL5100_ArDtlAppl_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5100.ArDtlAppl_Upd01.UP.BLOCK0")){
			return MS_MSBGL5100_ArDtlAppl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5100.ArDtlAppl_Upd02.UP.BLOCK0")){
			return MS_MSBGL5100_ArDtlAppl_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBGL5100_ArDtlAppl_Chk01_INFO = new MCOperationInfo("MS", "MSBGL5100", "ArDtlAppl_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5100_ArDtlAppl_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5100", "ArDtlAppl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("ar_appl_flg", "ar_appl_flg"),
				MCItemDef.create("un_dtl_appl_flg", "un_dtl_appl_flg")
			}
			,
			MCBlockDef.create("ArDtlAppl_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL5100_ArDtlAppl_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5100", "ArDtlAppl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("ar_appl_flg", "ar_appl_flg"),
				MCItemDef.create("un_dtl_appl_flg", "un_dtl_appl_flg")
			}
			,
			MCBlockDef.create("ArDtlAppl_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5100_ArDtlAppl_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5100", "ArDtlAppl_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5100_ArDtlAppl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5100", "ArDtlAppl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("ar_appl_flg", "ar_appl_flg"),
				MCItemDef.create("un_dtl_appl_flg", "un_dtl_appl_flg"),
				MCItemDef.create("no_upd_ar_bal_flg", "no_upd_ar_bal_flg")
			}
			,
			MCBlockDef.create("ArDtlAppl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5100_ArDtlAppl_Upd02_INFO = new MCOperationInfo("MS", "MSBGL5100", "ArDtlAppl_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5100_ArDtlAppl_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5100", "ArDtlAppl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("appl_tgt_amt", "appl_tgt_amt")
			}
			,
			MCBlockDef.create("ArDtlAppl_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5100_ArDtlAppl_Upd03_INFO = new MCOperationInfo("MS", "MSBGL5100", "ArDtlAppl_Upd03", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

