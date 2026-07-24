package mcframe.serverMSBG.MSBGL0280;

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
 * [MSBGL_CredDtlSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0280.Srch01.UP.BLOCK0")){
			return MS_MSBGL0280_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0280_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0280", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0280_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", "cur_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cred_nm", "cred_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("cred_limit", "cred_limit"),
				MCItemDef.create("ttl_cred_amt", "ttl_cred_amt"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("ttl_ym", "ttl_ym"),
				MCItemDef.create("ttl_ym_ap", "ttl_ym_ap"),
				MCItemDef.create("ttl_end_bal", "ttl_end_bal"),
				MCItemDef.create("ttl_init_bal", "ttl_init_bal"),
				MCItemDef.create("ttl_sls", "ttl_sls"),
				MCItemDef.create("ttl_rcv", "ttl_rcv"),
				MCItemDef.create("ttl_adv", "ttl_adv"),
				MCItemDef.create("ttl_init_bal_ap", "ttl_init_bal_ap"),
				MCItemDef.create("ttl_purc", "ttl_purc"),
				MCItemDef.create("ttl_pay", "ttl_pay"),
				MCItemDef.create("ttl_adv_pay", "ttl_adv_pay"),
				MCItemDef.create("not_appl_note", "not_appl_note"),
				MCItemDef.create("not_appl_adv_note", "not_appl_adv_note"),
				MCItemDef.create("ttl_backord", "ttl_backord"),
				MCItemDef.create("ttl_qtn", "ttl_qtn"),
				MCItemDef.create("ttl_po_backord", "ttl_po_backord")
			}
			,
			MCBlockDef.create("Srch01_HdrRslt")
		);
	}
	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("init_bal", "init_bal"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("cash_amt", "cash_amt"),
				MCItemDef.create("note_amt", "note_amt"),
				MCItemDef.create("xfr_amt", "xfr_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("end_bal", "end_bal"),
				MCItemDef.create("not_appl_note", "not_appl_note"),
				MCItemDef.create("backord_amt", "backord_amt"),
				MCItemDef.create("cred_amt", "cred_amt"),
				MCItemDef.create("qtn_amt", "qtn_amt")
			}
			,
			MCBlockDef.create("Srch01_DtlRslt")
		);
	}
	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("init_bal", "init_bal"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("cash_amt", "cash_amt"),
				MCItemDef.create("note_amt", "note_amt"),
				MCItemDef.create("xfr_amt", "xfr_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("end_bal", "end_bal"),
				MCItemDef.create("backord_amt", "backord_amt"),
				MCItemDef.create("cred_amt", "cred_amt")
			}
			,
			MCBlockDef.create("Srch01_DtlApRslt")
		);
	}
	//FMCB DEF_CLASSES END
}

